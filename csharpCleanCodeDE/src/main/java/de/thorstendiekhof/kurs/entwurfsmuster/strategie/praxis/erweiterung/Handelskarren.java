package de.thorstendiekhof.kurs.entwurfsmuster.strategie.praxis.erweiterung;

public class Handelskarren extends Einheit {

	public Handelskarren(){
		bewegungsverhalten = new ReitVerhalten();
	}

}