package de.thorstendiekhof.kurs.entwurfsmuster.beobachter.praxis.ausgang;

public class EreignisAnzeige implements Beobachter {

    public void aktualisiere(int alteLebenspunkte, int neueLebenspunkte, int maxLebenspunkte) {
        if(neueLebenspunkte <= 0){
            gestorben();
        } else if(alteLebenspunkte < neueLebenspunkte){
            int schaden = alteLebenspunkte - neueLebenspunkte;
           zeigSchaden(schaden);
        } else if(alteLebenspunkte > neueLebenspunkte){
            int heilung = neueLebenspunkte - alteLebenspunkte;
            zeigHeilung(heilung);
        }    
	}
    
    private void zeigSchaden(int schaden){
        System.out.println("Du erhälst " + schaden + " Schaden!");
    }

    private void zeigHeilung(int heilung){
        System.out.println("Du wirst " + heilung + " Punkte geheilt!");
    }

    private void gestorben(){
        System.out.println("Du bist gestorben! RIP!");
    }
}