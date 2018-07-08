package de.thorstendiekhof.kurs.entwurfsmuster.adapter.motivation.ausgang;

public class Kaffeemaschine {

	public static final String KLEINER_BECHER = "Kleiner Becher";

	public void stelleBecherBereit(String becher) {
        	System.out.println(becher + " wird bereitgestellt.");
	}

	public void mahleBohnen(int gramm) {
        	System.out.println("Es werden " + gramm + " Gramm Bohnen gemahlen.");
	}

	public void brueheAuf(int ml) {
        	System.out.println("Der Kaffee wird mit " + ml + "ml heißem Wasser aufgebrüht.");
	}

	public void entsorgeTrester() {
        	System.out.println("Der Trester wird entsorgt.");
	}


}