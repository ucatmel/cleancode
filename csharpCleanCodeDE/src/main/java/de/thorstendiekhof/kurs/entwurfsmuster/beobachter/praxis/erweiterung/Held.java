package de.thorstendiekhof.kurs.entwurfsmuster.beobachter.praxis.erweiterung;

import java.util.Observable;

public class Held extends Observable{

    private int lebenspunkte;
    private int maxLebenspunkte;

    public Held(int maxLebenspunkte){
        this.lebenspunkte = maxLebenspunkte;
        this.maxLebenspunkte = maxLebenspunkte;
    }

    public void bekommeSchaden(int schaden){
        lebenspunkte -= schaden;
        if(lebenspunkte <= 0){
            lebenspunkte = 0;
        } 
        setChanged();
        notifyObservers();
    }

    public void bekommeHeilund(int heilung){
        lebenspunkte += heilung;
        if(lebenspunkte > maxLebenspunkte){
            lebenspunkte = maxLebenspunkte;
        } 
        setChanged();
        notifyObservers();
    }

	public int getLebenspunkte() {
		return this.lebenspunkte;
	}

	public int getMaxLebenspunkte() {
		return this.maxLebenspunkte;
	}

}