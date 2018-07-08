package de.thorstendiekhof.kurs.entwurfsmuster.schablonenmethode.praxis.erweiterung;



public class Kaffee extends Kaffeespezialitaet {


	@Override
	void mahleBohnen() {
		mahleBohnen(12);
	}

	@Override
	void bereiteMilschschaum() {
		
	}

	@Override
	void brueheKaffee() {
		brueheKaffee(200);
	}

	@Override
	void reinigeMaschine() {
		entsorgeTrester();
	}

}