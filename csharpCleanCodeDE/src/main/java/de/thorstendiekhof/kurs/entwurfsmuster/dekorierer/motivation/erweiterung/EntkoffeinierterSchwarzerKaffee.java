package de.thorstendiekhof.kurs.entwurfsmuster.dekorierer.motivation.erweiterung;

public class EntkoffeinierterSchwarzerKaffee implements Kaffeespezialitaet {

	public String getBeschreibung() {
		return "Ein Kaffee, ohne Koffein";
	}

	public int getPreis() {
		return 110;
	}

}