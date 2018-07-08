package de.thorstendiekhof.kurs.entwurfsmuster.strategie.motivation.erweiterung;

public class Krieger implements Einheit {

	public void bewegen() {
		System.out.println("Bewegt sich zu Fuß.");
	}

	public void angreifen() {
		System.out.println("Greift mit einem Schwert im Nahkampf an.");
	}

}