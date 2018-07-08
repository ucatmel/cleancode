package de.thorstendiekhof.kurs.entwurfsmuster.kompositum.motivation.ausgang;

import java.util.ArrayList;
import java.util.List;

public class Offizier {

    private String name;
    private String beschreibung;

    private List<Truppe> truppen = new ArrayList<Truppe>();

    public Offizier(String name, String beschreibung){
        this.name = name;
        this.beschreibung = beschreibung;
    }

    public void heuerTruppeAn(Truppe truppe){
        truppen.add(truppe);
    }

    public void entlasseTruppe(Truppe truppe){
        truppen.remove(truppe);
    }

    public void zeigeAufstellung(){
        System.out.println("\n" + name + ", " + beschreibung);
        System.out.println("---------------------");
        for (Truppe truppe : truppen) {
            truppe.zeigeAufstellung();
        }
    }


}