package de.thorstendiekhof.kurs.entwurfsmuster.schablonenmethode.praxis.ausgang;



public class EspressoMacchiato extends Kaffeespezialitaet{
	@Override
	void mahleBohnen() {
		System.out.println("9 Gramm Bohnen werden gemahlen.");
	}

	@Override
	void bereiteMilschschaum() {
        	System.out.println("Milchschaum wird 3 Sekunden ausgegeben.");
	}

	@Override
	void brueheKaffee() {
        	System.out.println("Kaffee wird mit 30ml Wasser aufgebrüht.");
	}

	@Override
	void reinigeMaschine() {
        	System.out.println("Milchdüse wird gesäubert.");
	}
}