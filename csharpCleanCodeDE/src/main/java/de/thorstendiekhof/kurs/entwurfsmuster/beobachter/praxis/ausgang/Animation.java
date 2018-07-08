package de.thorstendiekhof.kurs.entwurfsmuster.beobachter.praxis.ausgang;

public class Animation implements Beobachter{
    
    public void aktualisiere(int alteLebenspunkte, int neueLebenspunkte, int maxLebenspunkte) {
        if(neueLebenspunkte <= 0){
            animierSterben();
        } else if(alteLebenspunkte < neueLebenspunkte){
            animierSchaden();
        } else if(alteLebenspunkte > neueLebenspunkte){
            animierHeilung();
        }    
	}

    private void animierSchaden(){
        System.out.println("*Blut spritzt!*");
    }

    private void animierHeilung(){
        System.out.println("*güldenes Licht leuchtet*");
    }

    private void animierSterben(){
        System.out.println("*Held krümmt sich vor Schmerz und stirbt*");
    }
}