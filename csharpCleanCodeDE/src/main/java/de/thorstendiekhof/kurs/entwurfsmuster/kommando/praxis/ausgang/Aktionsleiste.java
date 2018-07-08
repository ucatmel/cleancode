package de.thorstendiekhof.kurs.entwurfsmuster.kommando.praxis.ausgang;

import java.util.HashMap;
import java.util.Map;

public class Aktionsleiste {
    private Map<String,Aktion> aktionen = new HashMap<String,Aktion>();

    public void setAktion(String taste, Aktion aktion){
        aktionen.put(taste, aktion);
    }

    public void klickButton(String taste){
        Aktion aktion = aktionen.get(taste);
        if(aktion != null)
            aktion.ausfuehren();
    }
}