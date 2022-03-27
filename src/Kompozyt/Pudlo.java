package Kompozyt;

import java.util.ArrayList;
import java.util.List;

public class Pudlo {
    private String rodzajp;
    private String rozmiarp;

    private List<Pudlo> zamowienie;

    // constructor
    public Pudlo(String rodzajp, String rozmiarp) {
        this.rodzajp = rodzajp;
        this.rozmiarp = rozmiarp;
        zamowienie = new ArrayList<Pudlo>();
    }

    public void add(Pudlo p) {
        zamowienie.add(p);
    }

    public void remove(Pudlo p) {
        zamowienie.remove(p);
    }

    public List<Pudlo> getZamowienie(){
        return zamowienie;
    }

    public String toString(){
        return ("Pudła : Rodzaj - " + rodzajp + ", Rozmiar - " + rozmiarp + " ;");
    }
}