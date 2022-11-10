package dao;

import ba.unsa.etf.rpr.Laptop;

import java.io.IOException;
import java.util.ArrayList;

public interface LaptopDao {

    public Laptop dodajLaptopUListu(Laptop laptop) throws IOException;
    Laptop dodajLaptopUFile(Laptop laptop) throws  IOException;
    public Laptop getLaptop(String procesor) throws AbstractLaptopDaoFile.NeodgovarajuciProcesorException;
    public void napuniListu(ArrayList<Laptop> laptopi);
    public ArrayList<Laptop> vratiPodatkeIzDatoteke() throws IOException;
}
