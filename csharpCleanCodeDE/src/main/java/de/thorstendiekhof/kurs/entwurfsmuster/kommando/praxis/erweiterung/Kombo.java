package de.thorstendiekhof.kurs.entwurfsmuster.kommando.praxis.erweiterung;

import java.util.ArrayList;
import java.util.List;

import de.thorstendiekhof.kurs.entwurfsmuster.kommando.praxis.ausgang.Aktion;

public class Kombo implements Aktion {

    private List<Aktion> aktionen = new ArrayList<Aktion>();

	public void ausfuehren() {
		for(Aktion a : aktionen){
            a.ausfuehren();
        }
    }

    
    public void addAktion(Aktion akiton){
        this.aktionen.add(akiton);
    }

}