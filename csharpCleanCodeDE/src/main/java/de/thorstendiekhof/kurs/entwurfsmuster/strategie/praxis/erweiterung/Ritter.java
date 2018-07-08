package de.thorstendiekhof.kurs.entwurfsmuster.strategie.praxis.erweiterung;

public class Ritter extends Einheit {

	public Ritter(){
		bewegungsverhalten = new ReitVerhalten();
		angriffsverhalten = new SchwertVerhalten();
	}

}