package de.thorstendiekhof.kurs.entwurfsmuster.schablonenmethode.praxis.erweiterung;



public abstract class Kaffeespezialitaet {
    void bereiteZu() {
        mahleBohnen();
        kocheWasser();
        bereiteMilschschaum();
        brueheKaffee();
        reinigeMaschine();
    }

    abstract void mahleBohnen();

    void mahleBohnen(int gramm){
        System.out.println(gramm + " Gramm Bohnen werden gemahlen.");
    }

    void kocheWasser(){
        System.out.println("Wasser wird aufgekocht.");
    }

    abstract void bereiteMilschschaum();

    void bereiteMilchschaum(int sekunden){
        System.out.println("Milchschaum wird " + sekunden + " Sekunden ausgegeben.");
    }

    abstract void brueheKaffee();

    void brueheKaffee(int ml){
        System.out.println("Kaffee wird mit " + ml + "ml Wasser aufgebrüht.");
    }

    abstract void reinigeMaschine();

    void entsorgeTrester(){
        System.out.println("Trester wird entsorgt.");
    }

    void reinigeMilchduese(){
        System.out.println("Milchdüse wird gesäubert.");
    }
}