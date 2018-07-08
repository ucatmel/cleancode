package de.thorstendiekhof.kurs.entwurfsmuster.schablonenmethode.praxis.ausgang;



public class Milchkaffee extends Kaffeespezialitaet {

	@Override
	void mahleBohnen() {
        System.out.println("12 Gramm Bohnen werden gemahlen.");
	}

	@Override
	void bereiteMilschschaum() {
        System.out.println("Milchschaum wird 10 Sekunden ausgegeben.");
	}

	@Override
	void brueheKaffee() {
        System.out.println("Kaffee wird mit 200ml Wasser aufgebrüht.");
	}

	@Override
	void reinigeMaschine() {
        System.out.println("Milchdüse wird gesäubert.");
	}

}