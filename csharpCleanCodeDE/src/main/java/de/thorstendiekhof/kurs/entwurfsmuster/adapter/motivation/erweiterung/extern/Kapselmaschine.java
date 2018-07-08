package de.thorstendiekhof.kurs.entwurfsmuster.adapter.motivation.erweiterung.extern;

public class Kapselmaschine {

    static public enum Becher{
        KLEIN("Kleiner Becher"), MITTEL("Becher"), GROSS("Großer Becher");

        String beschreibung;
        Becher(String beschreibung){
            this.beschreibung = beschreibung;
        }
    }

    static public enum Kapsel{
        KAFFEE("Kaffee-Kapsel"), ESPRESSO("Espresso-Kapsel");
        String beschreibung;
        Kapsel(String beschreibung){
            this.beschreibung = beschreibung;
        }
    }

    public void stelleBecherBereit(Becher becher) {
        System.out.println(becher.beschreibung + " wird bereitgestellt.");
	}

	public void legeKapselEin(Kapsel kapsel) {
        System.out.println(kapsel.beschreibung + " wird eingelegt.");
	}

	public void brueheAuf() {
        System.out.println("Kapsel wird aufgebrüht.");
	}

	public void entsorgeKapsel() {
        System.out.println("Kapsel wird entsorgt.");
	}

}