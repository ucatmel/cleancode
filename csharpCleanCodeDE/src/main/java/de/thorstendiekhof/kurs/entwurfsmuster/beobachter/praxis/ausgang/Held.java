package de.thorstendiekhof.kurs.entwurfsmuster.beobachter.praxis.ausgang;

import java.util.ArrayList;
import java.util.List;

public class Held implements Subjekt{

    private int lebenspunkte;
    private int maxLebenspunkte;

    private List<Beobachter> beobachters = new ArrayList<Beobachter>();

    public Held(int maxLebenspunkte){
        this.lebenspunkte = maxLebenspunkte;
        this.maxLebenspunkte = maxLebenspunkte;
    }

    public void bekommeSchaden(int schaden){
        int alteLebenspunkte = lebenspunkte;
        lebenspunkte -= schaden;
        if(lebenspunkte <= 0){
            lebenspunkte = 0;
        } 
        aktualisiereBeobachter(alteLebenspunkte, lebenspunkte, maxLebenspunkte);
    }

    public void bekommeHeilund(int heilung){
        int alteLebenspunkte = lebenspunkte;
        lebenspunkte += heilung;
        if(lebenspunkte > maxLebenspunkte){
            lebenspunkte = maxLebenspunkte;
        } 
        aktualisiereBeobachter(alteLebenspunkte, lebenspunkte, maxLebenspunkte);
    }

	public void registriereBeobachter(Beobachter beobachter) {
		beobachters.add(beobachter);
	}

	public void entferneBeobachter(Beobachter beobachter) {
		beobachters.remove(beobachter);
	}

	public void aktualisiereBeobachter(int alteLebenspunkte, int neueLebenspunkte, int maxLebenspunkte) {
		for (Beobachter beobachter : beobachters) {
            beobachter.aktualisiere(alteLebenspunkte, neueLebenspunkte, maxLebenspunkte);
        }
	}
}