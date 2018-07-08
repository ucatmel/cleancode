package de.thorstendiekhof.kurs.entwurfsmuster.dekorierer.praxis.ausgang;

public class Kaffee extends Kaffeespezialitaet {

    public Kaffee(){
        beschreibung = "Ein Kaffee";
	}
	
	@Override
	int getPreis() {
		return 100;
	}

}