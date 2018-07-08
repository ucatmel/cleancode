package de.thorstendiekhof.kurs.entwurfsmuster.zustand.motivation.erweiterung;

import java.util.concurrent.TimeUnit;

public class KaffeeAutomat {

    private int bohnen;
    private static int maxBohnen = 5;
    private Zustand zustand = Zustand.WARTEN_AUF_AUSWAHL;
    
    public KaffeeAutomat(){
        this.bohnen = maxBohnen;
    }
    

    public void kaffeeAuswaehlen(){
        switch (zustand) {
            case WARTEN_AUF_AUSWAHL:
                System.out.println("Sie haben einen Kaffee als Getränke gewählt.");
                zustand = Zustand.KAFFEE_ZUBEREITEN;
                kaffeeBereiten();
                break;       
            case KAFFEE_ZUBEREITEN:
                System.out.println("Bitte warten Sie. Ein Kaffee wird aktuell zubereitet.");
                break;       
            case ESPRESSO_ZUBEREITEN:
                System.out.println("Bitte warten Sie. Ein Espresso wird aktuell zubereitet.");
                break;       
            case BOHNEN_LEER:
                System.out.println("Die Bohnen müssen aufgefüllt werden.");
                break;            
            default:
                break;
        }
    }

    public void kaffeeBereiten() {
        switch (zustand) {
            case WARTEN_AUF_AUSWAHL:
                System.out.println("Bitte wählen Sie ein Getränk.");
                break;       
            case KAFFEE_ZUBEREITEN:
                this.bohnen --;
                System.out.println("Bereite Kaffee zu...");
                simuliereHardware();
                System.out.println("Bitte sehr! Kaffee zubereitet.");
			    bohnenPruefen();
                break;       
            case ESPRESSO_ZUBEREITEN:
                System.out.println("Bitte warten Sie. Ein Espresso wird aktuell zubereitet.");
                break;       
            case BOHNEN_LEER:
                System.out.println("Die Bohnen müssen aufgefüllt werden.");
                break;            
            default:
                break;
        }
	}

	public void espressoAuswaehlen(){
        switch (zustand) {
            case WARTEN_AUF_AUSWAHL:
                System.out.println("Sie haben einen Espresso als Getränke gewählt.");
                zustand = Zustand.ESPRESSO_ZUBEREITEN;
                espressoBereiten();
                break;       
            case KAFFEE_ZUBEREITEN:
                System.out.println("Bitte warten Sie. Ein Kaffee wird aktuell zubereitet.");
                break;       
            case ESPRESSO_ZUBEREITEN:
                System.out.println("Bitte warten Sie. Ein Espresso wird aktuell zubereitet.");
                break;       
            case BOHNEN_LEER:
                System.out.println("Die Bohnen müssen aufgefüllt werden.");
                break;            
            default:
                break;
        }
    }

	public void espressoBereiten()  {
        switch (zustand) {
            case WARTEN_AUF_AUSWAHL:
                System.out.println("Bitte wählen Sie ein Getränk.");
                break;       
            case KAFFEE_ZUBEREITEN:
                System.out.println("Bitte warten Sie. Ein Espresso wird aktuell zubereitet.");
                break;       
            case ESPRESSO_ZUBEREITEN:
                this.bohnen --;
                System.out.println("Bereite Espresso zu...");
                simuliereHardware();
                System.out.println("Bitte sehr! Espresso zubereitet.");
			    bohnenPruefen();
                break;       
            case BOHNEN_LEER:
                System.out.println("Die Bohnen müssen aufgefüllt werden.");
                break;            
            default:
                break;
        }
    }

	private void bohnenPruefen() {
		if(this.bohnen < 1) { 
            zustand = Zustand.BOHNEN_LEER;
            System.out.println("Bitte Bohnen nachfüllen!");
        } 
        else zustand = Zustand.WARTEN_AUF_AUSWAHL;
	}

    public void bohnenAuffuellen(){
        this.bohnen = maxBohnen;
        System.out.println("Bohnen sind wieder voll.");
        if(this.zustand == Zustand.BOHNEN_LEER)
            this.zustand = Zustand.WARTEN_AUF_AUSWAHL;
    }
  
    private void simuliereHardware(){
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