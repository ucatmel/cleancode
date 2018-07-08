package de.thorstendiekhof.kurs.entwurfsmuster.fabrikmethode.praxis.einschub;

public class Main {
    public static void main(String[] args) {
        KlasseMitErzeugung testKlasseMitErzeugung = new KlasseMitErzeugung() {
            protected Klasse createKlasse(){
				return new Klasse(){
                    public void machWas() {
                        System.out.println("Hier macht die Mock-Klasse was");
                    }    
                };  
            };
        };
        testKlasseMitErzeugung.hierWirdEinNeuesObjektBenoetigt();
    }
}