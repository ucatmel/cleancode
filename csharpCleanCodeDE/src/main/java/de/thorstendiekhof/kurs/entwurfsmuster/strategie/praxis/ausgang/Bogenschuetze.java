package de.thorstendiekhof.kurs.entwurfsmuster.strategie.praxis.ausgang;

public class Bogenschuetze extends Einheit {

	public Bogenschuetze(){
		bewegungsverhalten = new ZuFussVerhalten();
		angriffsverhalten = new BogenVerhalten();
	}

}