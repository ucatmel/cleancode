package de.thorstendiekhof.kurs.entwurfsmuster.strategie.praxis.ausgang;

public class Krieger extends Einheit {

	public Krieger(){
		bewegungsverhalten = new ZuFussVerhalten();
		angriffsverhalten = new SchwertVerhalten();
	}

}