package de.thorstendiekhof.kurs.entwurfsmuster.zustand.praxis.ausgang;

import java.util.concurrent.TimeUnit;

public class KaffeeAutomat {

    WartenAufAuswahlZustand wartenAufAuswahlZustand = new WartenAufAuswahlZustand(this);
    KaffeeZubereitenZustand kaffeeZubereitenZustand = new KaffeeZubereitenZustand(this);
    EspressoZubereitenZustand espressoZubereitenZustand = new EspressoZubereitenZustand(this);
    BohnenLeerZustand bohnenLeerZustand = new BohnenLeerZustand(this);

    Zustand zustand;

    int bohnen;
    int maxBohnen = 5;

    public KaffeeAutomat(){
        this.bohnen = maxBohnen;
        this.zustand = wartenAufAuswahlZustand;
    }

  

    public void espressoAuswaehlen() {
        zustand.espressoAuswaehlen();
        zustand.espressoBereiten();
	}

	public void kaffeeAuswaehlen() {
        zustand.kaffeeAuswaehlen();
        zustand.kaffeeBereiten();
	}

	public void bohnenAuffuellen() {
        zustand.bohnenAuffuellen();
    }
    
    public void simuliereHardware(){
        try {
            TimeUnit.SECONDS.sleep(1);
            System.out.println("zisck...");
            TimeUnit.SECONDS.sleep(1);
            System.out.println("rödel...");
            TimeUnit.SECONDS.sleep(1);
            System.out.println("sprudel...");
            TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			System.out.println("Kaffeemaschine explodiert!");
		}
    }
    
}