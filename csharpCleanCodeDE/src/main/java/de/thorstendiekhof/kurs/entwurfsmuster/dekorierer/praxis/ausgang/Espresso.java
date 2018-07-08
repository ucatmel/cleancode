package de.thorstendiekhof.kurs.entwurfsmuster.dekorierer.praxis.ausgang;

public class Espresso extends Kaffeespezialitaet {

    public Espresso(){
        beschreibung = "Ein Espresso";
    }

	@Override
	int getPreis() {
		return 50;
	}

}