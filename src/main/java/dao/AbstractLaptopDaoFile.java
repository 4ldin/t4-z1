package dao;

import ba.unsa.etf.rpr.Laptop;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public abstract class AbstractLaptopDaoFile implements LaptopDao {
    protected File file;
    protected ArrayList<Laptop> laptopi;

    protected abstract  void save();

    @Override
    public Laptop dodajLaptopUFile(Laptop laptop) throws IOException {
        return null;
    }

    @Override
    public ArrayList<Laptop> vratiPodatkeIzDatoteke() throws IOException {
        return null;
    }

    @Override
    public Laptop dodajLaptopUListu(Laptop laptop) throws IOException {
        this.laptopi.add(laptop);
        return laptop;
    }


    @Override
    public Laptop getLaptop(String procesor) throws NeodgovarajuciProcesorException {
        for(Laptop l : this.laptopi)
            if(l.getProcesor().equals(procesor)) return l;
        throw new NeodgovarajuciProcesorException("Nema laptopa sa tim procesorom!");
    }

    @Override
    public void napuniListu(ArrayList<Laptop> laptopi){
        laptopi.addAll(this.laptopi);
    }

    public static class NeodgovarajuciProcesorException extends Exception{
        NeodgovarajuciProcesorException(String error) {
            super(error);
        }

    }
}
