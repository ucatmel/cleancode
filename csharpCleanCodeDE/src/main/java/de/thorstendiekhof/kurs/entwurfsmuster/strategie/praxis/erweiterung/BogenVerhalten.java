package de.thorstendiekhof.kurs.entwurfsmuster.strategie.praxis.erweiterung;

public class BogenVerhalten implements Angriffsverhalten {

	public void angreifen() {
		System.out.println("Greift mit einem Bogen auf Entfernung an.");
	}

}