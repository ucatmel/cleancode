package de.thorstendiekhof.kurs.entwurfsmuster.beobachter.motivation.erweiterung;

public class Animation{

    public void animierSchaden(){
        System.out.println("*Blut spritzt!*");
    }

    public void animierHeilung(){
        System.out.println("*güldenes Licht leuchtet*");
    }

    public void animierSterben(){
        System.out.println("*Held krümmt sich vor Schmerz und stirbt*");
    }
}