package dao;

import ba.unsa.etf.rpr.Laptop;

import java.io.*;
import java.util.ArrayList;

public class LaptopDaoSerializableFile extends AbstractLaptopDaoFile{

    public LaptopDaoSerializableFile() {
        this.file = new File("binary.dat");
        this.laptopi = new ArrayList<>();
    }

    @Override
    protected void save() {
        try {
            ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(this.file));
            output.writeObject(this.laptopi);
            output.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Laptop dodajLaptopUFile(Laptop laptop) throws IOException {
        this.dodajLaptopUListu(laptop);
        save();
        return laptop;
    }

    @Override
    public ArrayList<Laptop> vratiPodatkeIzDatoteke() {
        try {
            ObjectInputStream input = new ObjectInputStream(new FileInputStream(file));
            ArrayList<Laptop> lista = (ArrayList<Laptop>) input.readObject();
            this.laptopi = lista;
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return laptopi;
    }
}
