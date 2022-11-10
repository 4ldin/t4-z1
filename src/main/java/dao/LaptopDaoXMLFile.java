package dao;

import ba.unsa.etf.rpr.Laptop;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class LaptopDaoXMLFile  extends AbstractLaptopDaoFile{

    private XmlMapper mapper;

    public LaptopDaoXMLFile() {
        file = new File("laptopi.json");
        laptopi = new ArrayList<>();
    }

    @Override
    protected void save() {
        this.mapper = new XmlMapper();
        try {
            this.mapper.writeValue(this.file, this.laptopi);
        }catch (IOException e){
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
        this.mapper = new XmlMapper();
        this.laptopi = mapper.readValue(this.file, new TypeReference<ArrayList<Laptop>>(){});
        return laptopi;
    }
}
