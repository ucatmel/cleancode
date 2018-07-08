package de.thorstendiekhof.kurs.entwurfsmuster.beobachter.praxis.erweiterung;

import java.util.Observable;
import java.util.Observer;

public class Lebensbalken implements Observer {

    public void aktualisiere(int alteLebenspunkte, int neueLebenspunkte, int maxLebenspunkte) {
        System.out.println("Leben: " + neueLebenspunkte + "/" + maxLebenspunkte);
	}

	public void update(Observable o, Object arg) {
        if(o instanceof Held){
            Held held = (Held) o;
            System.out.println("Leben: " + held.getLebenspunkte() + "/" + held.getMaxLebenspunkte());
        }
	}
}