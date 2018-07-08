package de.thorstendiekhof.kurs.entwurfsmuster.kommando.praxis.ausgang;

import java.util.concurrent.TimeUnit;

public class TrankTrinkenAktion implements Aktion {
    private Trank trank;
	public TrankTrinkenAktion(Trank trank){
        this.trank = trank;
    }
	public void ausfuehren() {
        try {
            System.out.println("Du trinkst " + trank.name);
            TimeUnit.SECONDS.sleep(1);
            System.out.println(trank.geraeusch);
            TimeUnit.SECONDS.sleep(1);
            System.out.println(trank.wirkung);
		} catch (InterruptedException e) {
			System.out.println("Du verschluckst dich am Trank! Ohje!");
		}
	}
}