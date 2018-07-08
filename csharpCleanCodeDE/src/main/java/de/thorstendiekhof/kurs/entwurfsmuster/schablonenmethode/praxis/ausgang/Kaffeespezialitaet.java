package de.thorstendiekhof.kurs.entwurfsmuster.schablonenmethode.praxis.ausgang;



public abstract class Kaffeespezialitaet {
    void bereiteZu() {
        mahleBohnen();
        System.out.println("Wasser wird aufgekocht.");
        bereiteMilschschaum();
        brueheKaffee();
        System.out.println("Trester wird entsorgt.");
        reinigeMaschine();
    }

	abstract void mahleBohnen();

    abstract void bereiteMilschschaum();

    abstract void brueheKaffee();

    abstract void reinigeMaschine();
}