package de.thorstendiekhof.kurs.entwurfsmuster.strategie.praxis.erweiterung;

public class SchwertVerhalten implements Angriffsverhalten {

	public void angreifen() {
		System.out.println("Greift mit einem Schwert im Nahkampf an.");
	}

}