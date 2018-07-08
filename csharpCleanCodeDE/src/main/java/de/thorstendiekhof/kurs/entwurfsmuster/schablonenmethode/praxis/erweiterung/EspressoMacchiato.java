package de.thorstendiekhof.kurs.entwurfsmuster.schablonenmethode.praxis.erweiterung;



public class EspressoMacchiato extends Kaffeespezialitaet{

	@Override
	void mahleBohnen() {
		mahleBohnen(9);
	}

	@Override
	void bereiteMilschschaum() {
		bereiteMilchschaum(3);
	}

	@Override
	void brueheKaffee() {
        	brueheKaffee(30);
	}

	@Override
	void reinigeMaschine() {
		entsorgeTrester();
		reinigeMilchduese();
	}
    
}