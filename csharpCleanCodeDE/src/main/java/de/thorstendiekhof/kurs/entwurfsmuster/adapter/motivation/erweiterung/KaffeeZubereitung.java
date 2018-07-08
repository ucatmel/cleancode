package de.thorstendiekhof.kurs.entwurfsmuster.adapter.motivation.erweiterung;

import de.thorstendiekhof.kurs.entwurfsmuster.adapter.motivation.erweiterung.extern.Kapselmaschine;
import de.thorstendiekhof.kurs.entwurfsmuster.adapter.motivation.erweiterung.extern.Kapselmaschine.Becher;
import de.thorstendiekhof.kurs.entwurfsmuster.adapter.motivation.erweiterung.extern.Kapselmaschine.Kapsel;

public class KaffeeZubereitung {

    private Kaffeemaschine maschine;
	private Kapselmaschine kapselmaschine;

    public KaffeeZubereitung(Kaffeemaschine maschine){
        this.maschine = maschine;
    }

    public KaffeeZubereitung(Kapselmaschine kapselmaschine){
        this.kapselmaschine = kapselmaschine;
    }

    public void bereiteKaffeeZu(){
       if(maschine == null) bereiteKapselkaffeeZu();
       if(kapselmaschine == null) bereiteKaffeemaschinenKaffeeZu();
    }

    private void bereiteKaffeemaschinenKaffeeZu(){
        maschine.stelleBecherBereit(Kaffeemaschine.KLEINER_BECHER);
        maschine.mahleBohnen(12);
        maschine.brueheAuf(200);
        maschine.entsorgeTrester();
    }

    private void bereiteKapselkaffeeZu(){
        kapselmaschine.stelleBecherBereit(Becher.KLEIN);
        kapselmaschine.legeKapselEin(Kapsel.KAFFEE);
        kapselmaschine.brueheAuf();
        kapselmaschine.entsorgeKapsel();
    }


}