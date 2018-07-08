package de.thorstendiekhof.kurs.entwurfsmuster.schablonenmethode.praxis.ausgang;



public class Kaffee extends Kaffeespezialitaet {
	@Override
	void mahleBohnen() {
		System.out.println("12 Gramm Bohnen werden gemahlen.");
	}

	@Override
	void bereiteMilschschaum() {	}

	@Override
	void brueheKaffee() {
        	System.out.println("Kaffee wird mit 200ml Wasser aufgebrüht.");
	}

	@Override
	void reinigeMaschine() {	}
}