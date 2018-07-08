package de.thorstendiekhof.kurs.entwurfsmuster.strategie.praxis.erweiterung;

public class Krieger extends Einheit {

	public Krieger(){
		bewegungsverhalten = new ZuFussVerhalten();
		angriffsverhalten = new SchwertVerhalten();
	}

}