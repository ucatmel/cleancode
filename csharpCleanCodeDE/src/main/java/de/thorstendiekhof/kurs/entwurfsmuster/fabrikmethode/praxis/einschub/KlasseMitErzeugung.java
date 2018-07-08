package de.thorstendiekhof.kurs.entwurfsmuster.fabrikmethode.praxis.einschub;

public class KlasseMitErzeugung {
    public void hierWirdEinNeuesObjektBenoetigt(){
        System.out.println("Algorithmus...");
        Klasse klasse = createKlasse();
        klasse.machWas();
    }
    protected Klasse createKlasse(){
        return new Klasse();
    }
}