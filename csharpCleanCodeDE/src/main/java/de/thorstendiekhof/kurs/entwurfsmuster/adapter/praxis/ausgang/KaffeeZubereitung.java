package de.thorstendiekhof.kurs.entwurfsmuster.adapter.praxis.ausgang;

public class KaffeeZubereitung {

    private ZubereitungsMaschine maschine;

    public KaffeeZubereitung(ZubereitungsMaschine maschine){
        this.maschine = maschine;
    }

    public void bereiteKaffeeZu(){
        maschine.stelleBecherBereit(Kaffeemaschine.KLEINER_BECHER);
        maschine.mahleBohnen(12);
        maschine.brueheAuf(200);
        maschine.entsorgeTrester();
    }
}