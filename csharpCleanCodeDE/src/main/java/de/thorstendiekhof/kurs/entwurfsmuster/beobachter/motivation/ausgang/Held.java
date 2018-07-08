package de.thorstendiekhof.kurs.entwurfsmuster.beobachter.motivation.ausgang;

public class Held {

    private int lebenspunkte;
    private int maxLebenspunkte;
	private Lebensbalken lebensbalken;
	private EreignisAnzeige ereignisAnzeige;

    public Held(Lebensbalken lebensbalken, EreignisAnzeige ereignisAnzeige, int maxLebenspunkte){
        this.lebensbalken = lebensbalken;
        this.ereignisAnzeige = ereignisAnzeige;
        this.lebenspunkte = maxLebenspunkte;
        this.maxLebenspunkte = maxLebenspunkte;
    }

    public void bekommeSchaden(int schaden){
        lebenspunkte -= schaden;
        ereignisAnzeige.zeigSchaden(schaden);
        if(lebenspunkte <= 0){
            lebenspunkte = 0;
            ereignisAnzeige.gestorben();
        } 
        lebensbalken.zeigeLeben(lebenspunkte, maxLebenspunkte);
    }

    public void bekommeHeilund(int heilung){
        lebenspunkte += heilung;
        ereignisAnzeige.zeigHeilung(heilung);
        if(lebenspunkte > maxLebenspunkte){
            lebenspunkte = maxLebenspunkte;
        } 
        lebensbalken.zeigeLeben(lebenspunkte, maxLebenspunkte);
    }

}