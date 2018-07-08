package de.thorstendiekhof.kurs.entwurfsmuster.dekorierer.motivation.erweiterung;

public class KaffeeMitMilchUndZucker implements Kaffeespezialitaet {

	public String getBeschreibung() {
		return "Ein Kaffee mit Milch und mit Zucker";
	}

	public int getPreis() {
		return 130;
	}

}