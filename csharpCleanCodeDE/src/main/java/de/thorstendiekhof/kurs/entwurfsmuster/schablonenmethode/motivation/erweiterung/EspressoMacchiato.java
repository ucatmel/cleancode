package de.thorstendiekhof.kurs.entwurfsmuster.schablonenmethode.motivation.erweiterung;



public class EspressoMacchiato implements Kaffeespezialitaet{

    public void bereiteZu(){
        System.out.println("9 Gramm Bohnen werden gemahlen.");
        System.out.println("Wasser wird aufgekocht.");
        System.out.println("Milchschaum wird 3 Sekunden ausgegeben.");
        System.out.println("Kaffee wird mit 30ml Wasser aufgebrüht.");
        System.out.println("Trester wird entsorgt.");
        System.out.println("Milchdüse wird gesäubert.");
    }
    
}