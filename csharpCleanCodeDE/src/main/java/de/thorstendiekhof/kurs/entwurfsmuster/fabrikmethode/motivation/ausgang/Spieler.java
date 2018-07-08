package de.thorstendiekhof.kurs.entwurfsmuster.fabrikmethode.motivation.ausgang;

public class Spieler{

    String name;
    String volk;

    public Spieler(String name, String volk){
        this.name = name;
        this.volk = volk;
    }

    public void erstellePartei(){
        System.out.println("\n" + name + " hat folgende Starteinheit:");
        if("Ork".equals(volk)){
            Wildschweinreiter starteinheit = new Wildschweinreiter();
            System.out.println("   " + starteinheit.anzeigen());
        } else if("Mensch".equals(volk)){
            Ritter starteinheit = new Ritter();
            System.out.println("   " + starteinheit.anzeigen());
        }
    }


}