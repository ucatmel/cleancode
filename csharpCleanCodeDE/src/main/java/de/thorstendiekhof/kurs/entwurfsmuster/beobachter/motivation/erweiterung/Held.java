package de.thorstendiekhof.kurs.entwurfsmuster.beobachter.motivation.erweiterung;

public class Held{

    private int lebenspunkte;
    private int maxLebenspunkte;
	private Lebensbalken lebensbalken;
	private EreignisAnzeige ereignisAnzeige;
	private Animation animation;
	private Sonderfertigkeiten sonderfertigkeiten;

    public Held(Lebensbalken lebensbalken, EreignisAnzeige ereignisAnzeige, Animation animation, Sonderfertigkeiten sonderfertigkeiten, int maxLebenspunkte){
        this.lebensbalken = lebensbalken;
        this.ereignisAnzeige = ereignisAnzeige;
        this.animation = animation;
        this.sonderfertigkeiten = sonderfertigkeiten;
        this.lebenspunkte = maxLebenspunkte;
        this.maxLebenspunkte = maxLebenspunkte;
    }

    public void bekommeSchaden(int schaden){
        lebenspunkte -= schaden;
        ereignisAnzeige.zeigSchaden(schaden);
        if(lebenspunkte <= 0){
            lebenspunkte = 0;
            ereignisAnzeige.gestorben();
            animation.animierSterben();;
        } else {
            animation.animierSchaden();
            if(lebenspunkte < maxLebenspunkte / 3){
                sonderfertigkeiten.starteBerserkerrausch();
            }
        }
        lebensbalken.zeigeLeben(lebenspunkte, maxLebenspunkte);
    }

    public void bekommeHeilund(int heilung){
        lebenspunkte += heilung;
        ereignisAnzeige.zeigHeilung(heilung);
        if(lebenspunkte > maxLebenspunkte){
            lebenspunkte = maxLebenspunkte;
        } 
        if( lebenspunkte >= maxLebenspunkte / 3){
            sonderfertigkeiten.stoppeBerserkerrausch();
        }
        animation.animierHeilung();
        lebensbalken.zeigeLeben(lebenspunkte, maxLebenspunkte);
    }

}