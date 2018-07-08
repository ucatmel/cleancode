package de.thorstendiekhof.kurs.entwurfsmuster.fassade.praxis.ausgang;

public class Fassade{
    private Beleuchtung beleuchtung = new Beleuchtung();
    private Fenster fenster = new Fenster();
    private Getraenkemaschine getraenkemaschine = new Getraenkemaschine();
    private Heizung heizung = new Heizung();
    private Herd herd = new Herd();
    private Klimaanlage klimaanlage = new Klimaanlage();

    public void aufstehen(){
        System.out.println("Guten Morgen! Ich bereite das Haus für einen tollen Morgen vor!");
        
        beleuchtung.an();
        fenster.rolloAuf();
        getraenkemaschine.kaffeeKochen();
        
        herd.eierKochen();
        herd.milchErwaermen();

        heizung.heizen();
    }

    public void zurArbeit(){
        System.out.println("Viel Spaß bei der Arbeit!");
        
        beleuchtung.aus();
        fenster.fensterToenen(50);
        getraenkemaschine.saeubern();
        
        herd.reinigen();

        heizung.aus();

        klimaanlage.temperaturHalten();
    }

    public void kinoAbend(){
        System.out.println("Entertainment wird vorbereitet!");
        beleuchtung.an();
        beleuchtung.dimmen();
        beleuchtung.farbeAendern("bläulich");

        fenster.zu();
        fenster.rolloZu();

        getraenkemaschine.bierBereitstellen();

        klimaanlage.temperaturHalten();
    }
}