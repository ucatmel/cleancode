package de.thorstendiekhof.kurs.entwurfsmuster.fabrikmethode.praxis.ausgang;

public class Orkhoehle extends Kaserne {

	@Override
	public Einheit rekrutiere() {
		return new Wildschweinreiter();
	}

}