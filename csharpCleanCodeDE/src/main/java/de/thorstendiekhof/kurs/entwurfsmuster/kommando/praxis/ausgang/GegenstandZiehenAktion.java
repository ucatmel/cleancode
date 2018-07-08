package de.thorstendiekhof.kurs.entwurfsmuster.kommando.praxis.ausgang;

public class GegenstandZiehenAktion implements Aktion {
    private Gegenstand gegenstand;

	public GegenstandZiehenAktion(Gegenstand gegenstand){
        this.gegenstand = gegenstand;
    }
	public void ausfuehren() {
		System.out.println("Du ziehst " + gegenstand.getName());
	}
}