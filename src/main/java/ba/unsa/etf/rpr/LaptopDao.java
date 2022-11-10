package ba.unsa.etf.rpr;

import java.io.IOException;
import java.util.ArrayList;

public interface LaptopDao {

    Laptop dodajLaptopUListu(Laptop laptop) throws IOException;
    Laptop dodajLaptopUFile(Laptop laptop) throws  IOException;
    Laptop getLaptop(String procesor);
    Laptop napuniListu(ArrayList<Laptop> laptopi) throws IOException;
    void vratiPodatkeIzDatoteke();
}
