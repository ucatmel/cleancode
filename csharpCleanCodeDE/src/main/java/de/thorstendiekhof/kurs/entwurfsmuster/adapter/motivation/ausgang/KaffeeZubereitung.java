package de.thorstendiekhof.kurs.entwurfsmuster.adapter.motivation.ausgang;



public class KaffeeZubereitung {

    Kaffeemaschine maschine;

    public KaffeeZubereitung(Kaffeemaschine maschine){
        this.maschine = maschine;
    }

    public void bereiteKaffeeZu(){
        maschine.stelleBecherBereit(Kaffeemaschine.KLEINER_BECHER);
        maschine.mahleBohnen(12);
        maschine.brueheAuf(200);
        maschine.entsorgeTrester();
    }


}