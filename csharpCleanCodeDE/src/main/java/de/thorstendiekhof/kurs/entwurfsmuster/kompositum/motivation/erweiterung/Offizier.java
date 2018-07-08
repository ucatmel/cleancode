package de.thorstendiekhof.kurs.entwurfsmuster.kompositum.motivation.erweiterung;

import java.util.ArrayList;
import java.util.List;

public class Offizier {
    
    
    private String name;
    private String beschreibung;

    private List<Truppe> truppen = new ArrayList<Truppe>();
    private List<Offizier> offiziere = new ArrayList<Offizier>(); 


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

    public void unterstelle(Offizier offizier){
        offiziere.add(offizier);
    }

    public void enzieheKommando(Offizier offizier){
        offiziere.remove(offizier);
    }

    public void zeigeAufstellung(String prefix){
        System.out.println("\n"+ prefix + name + ", " + beschreibung);
        System.out.println(prefix + "---------------------");
        for (Truppe truppe : truppen) {
            truppe.zeigeAufstellung(prefix + "   ");
        }
        for (Offizier offizier : offiziere) {
            offizier.zeigeAufstellung(prefix + "   ");
        }
    }

}