package de.thorstendiekhof.kurs.entwurfsmuster.strategie.motivation.ausgang;

public class Ritter implements Einheit {
	public void bewegen() {
		System.out.println("Bewegt sich beritten.");
	}
	public void angreifen() {
		System.out.println("Greift mit einem Schwert im Nahkampf an.");
	}
}