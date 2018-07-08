package de.thorstendiekhof.kurs.entwurfsmuster.strategie.praxis.erweiterung;

public class Zauberer extends Einheit {

	public Zauberer(){
		bewegungsverhalten = new ZuFussVerhalten();
		zauberverhalten = new SchafzauberVerhalten();
	}
	

}