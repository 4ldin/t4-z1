package dao;

import ba.unsa.etf.rpr.Laptop;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class LaptopDaoJSONFile extends  AbstractLaptopDaoFile{

    private final ObjectMapper mapper;

    public LaptopDaoJSONFile() {
        file = new File("laptopi.json");
        this.mapper = new ObjectMapper();
        laptopi = new ArrayList<>();
    }

    @Override
    protected void save() {
        try {
            this.mapper.writeValue(this.file, this.laptopi);
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
    public ArrayList<Laptop> vratiPodatkeIzDatoteke() throws IOException {

        this.laptopi = this.mapper.readValue(this.file, new TypeReference<ArrayList<Laptop>>() {});
        return laptopi;
    }
}
