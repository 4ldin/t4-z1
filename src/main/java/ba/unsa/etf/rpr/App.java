package ba.unsa.etf.rpr;

import dao.LaptopDao;
import dao.LaptopDaoJSONFile;
import dao.LaptopDaoSerializableFile;
import dao.LaptopDaoXMLFile;

import java.io.IOException;


public class App 
{
    public static void main( String[] args ) throws IOException {
        Laptop laptop = new Laptop();
        laptop.setModel("Asus");
        laptop.setProcesor("i5");
        laptop.setCijena(1000.50);
        LaptopDao laptopDao = new LaptopDaoSerializableFile();
        laptopDao.dodajLaptopUFile(laptop);
        System.out.println(laptopDao.vratiPodatkeIzDatoteke());
        LaptopDao laptopDao_2 = new LaptopDaoJSONFile();
        laptopDao_2.dodajLaptopUFile(laptop);
        System.out.println(laptopDao_2.vratiPodatkeIzDatoteke());
        LaptopDao laptopDao_3 = new LaptopDaoXMLFile();
        laptopDao_3.dodajLaptopUFile(laptop);
        System.out.println(laptopDao_3.vratiPodatkeIzDatoteke());
    }
}
