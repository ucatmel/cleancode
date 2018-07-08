package de.thorstendiekhof.kurs.entwurfsmuster.schablonenmethode.praxis.ausgang;



public class Espresso extends Kaffeespezialitaet{

	@Override
	void mahleBohnen() {
        System.out.println("9 Gramm Bohnen werden gemahlen.");
	}

	@Override
	void bereiteMilschschaum() {
		
	}

	@Override
	void brueheKaffee() {
        System.out.println("Kaffee wird mit 30ml Wasser aufgebrüht.");
	}

	@Override
	void reinigeMaschine() {
	}
    
}