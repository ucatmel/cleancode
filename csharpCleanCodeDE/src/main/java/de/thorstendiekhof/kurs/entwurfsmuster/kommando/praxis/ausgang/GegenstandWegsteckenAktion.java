package de.thorstendiekhof.kurs.entwurfsmuster.kommando.praxis.ausgang;

public class GegenstandWegsteckenAktion implements Aktion {

    private Gegenstand gegenstand;

	public GegenstandWegsteckenAktion(Gegenstand gegenstand){
        this.gegenstand = gegenstand;
    }

	public void ausfuehren() {
		System.out.println("Du steckst " + gegenstand.getName() + " weg.");
	}

}