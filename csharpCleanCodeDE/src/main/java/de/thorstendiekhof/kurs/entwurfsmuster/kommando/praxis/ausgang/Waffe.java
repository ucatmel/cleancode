package de.thorstendiekhof.kurs.entwurfsmuster.kommando.praxis.ausgang;

public enum Waffe implements Gegenstand {
    SCHWERT("Schwert",2),
    DOLCH("Dolch",1),
    BOGEN("Kurzbogen",1);

    String name;
    int schaden;

    private Waffe(String name, int schaden){
        this.name = name;
        this.schaden = schaden;
    }

	public String getName() {
		return name;
    }

    public void machSchaden(){
        System.out.println(name + " trifft den Gegner und verursacht " + schaden + " Schaden!");
    }

}