package de.thorstendiekhof.kurs.entwurfsmuster.schablonenmethode.praxis.erweiterung;



public class Milchkaffee extends Kaffeespezialitaet {

	@Override
	void mahleBohnen() {
		mahleBohnen(12);
	}

	@Override
	void bereiteMilschschaum() {
		bereiteMilchschaum(10);
	}

	@Override
	void brueheKaffee() {
		brueheKaffee(200);
	}

	@Override
	void reinigeMaschine() {
		entsorgeTrester();
		reinigeMilchduese();
	}

}