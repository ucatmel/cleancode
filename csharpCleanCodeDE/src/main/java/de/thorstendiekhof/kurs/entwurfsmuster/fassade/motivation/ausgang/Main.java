package de.thorstendiekhof.kurs.entwurfsmuster.fassade.motivation.ausgang;

public class Main {
    public static void main(String[] args) {
        Beleuchtung beleuchtung = new Beleuchtung();
        Fenster fenster = new Fenster();
        Getraenkemaschine getraenkemaschine = new Getraenkemaschine();
        Heizung heizung = new Heizung();
        Herd herd = new Herd();
        Klimaanlage klimaanlage = new Klimaanlage();
        
        System.out.println("Guten Morgen! Ich bereite das Haus für einen tollen Morgen vor!");
        
        beleuchtung.an();
        fenster.rolloAuf();
        getraenkemaschine.kaffeeKochen();
        
        herd.eierKochen();
        herd.milchErwaermen();

        heizung.heizen();


        System.out.println("Viel Spaß bei der Arbeit!");
        
        beleuchtung.aus();
        fenster.fensterToenen(50);
        getraenkemaschine.saeubern();
        
        herd.reinigen();

        heizung.aus();

        klimaanlage.temperaturHalten();

    }    
}