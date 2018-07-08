package de.thorstendiekhof.kurs.entwurfsmuster.kompositum.praxis.ausgang;

import java.util.ArrayList;
import java.util.List;

public class Offizier extends Einheit {
    private String name;
    private String beschreibung;

    private List<Einheit> einheiten = new ArrayList<Einheit>();

    public Offizier(String name, String beschreibung){
        this.name = name;
        this.beschreibung = beschreibung;
    }

    public void gliederEinheitAn(Einheit einheit){
        einheiten.add(einheit);
    }

    public void gliederEinheitAus(Einheit einheit){
        einheiten.remove(einheit);
    }

    @Override
    public void zeigeAufstellung(String prefix){
        System.out.println("\n"+ prefix + name + ", " + beschreibung);
        System.out.println(prefix + "---------------------");
        for (Einheit einheit : einheiten) {
            einheit.zeigeAufstellung(prefix + "   ");
        }
    }

}