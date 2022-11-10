package ba.unsa.etf.rpr;

import java.io.Serializable;
import java.util.Objects;

public class Laptop implements Serializable {
    private String brend;
    private String model;
    private double cijena;
    private int ram;
    private int hdd;
    private int sdd;
    private String procesor;
    private String grafickaKartica;
    private double velicinaEkrana;

    public Laptop() {

    }
    public void setProcesor(String procesor){
        this.procesor = procesor;
    }

    public void setCijena(double cijena){
        this.cijena = cijena;
    }

    public void setModel(String model){
        this.model = model;
    }

    public double getCijena(){return cijena;};

    public String getModel(){return model;};

    public String getProcesor(){return this.procesor;};


    public Laptop(String brend, String model, double cijena, int ram, int hdd, int sdd, String procesor, String grafickaKartica, double velicinaEkrana) {
        this.brend = brend;
        this.model = model;
        this.cijena = cijena;
        this.ram = ram;
        this.hdd = hdd;
        this.sdd = sdd;
        this.procesor = procesor;
        this.grafickaKartica = grafickaKartica;
        this.velicinaEkrana = velicinaEkrana;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return Double.compare(laptop.cijena, cijena) == 0 && ram == laptop.ram && hdd == laptop.hdd && sdd == laptop.sdd && Double.compare(laptop.velicinaEkrana, velicinaEkrana) == 0 && Objects.equals(brend, laptop.brend) && Objects.equals(model, laptop.model) && Objects.equals(procesor, laptop.procesor) && Objects.equals(grafickaKartica, laptop.grafickaKartica);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brend, model, cijena, ram, hdd, sdd, procesor, grafickaKartica, velicinaEkrana);
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "brend='" + brend + '\'' +
                ", model='" + model + '\'' +
                ", cijena=" + cijena +
                ", ram=" + ram +
                ", hdd=" + hdd +
                ", sdd=" + sdd +
                ", procesor='" + procesor + '\'' +
                ", grafickaKartica='" + grafickaKartica + '\'' +
                ", velicinaEkrana=" + velicinaEkrana +
                '}';
    }

}
