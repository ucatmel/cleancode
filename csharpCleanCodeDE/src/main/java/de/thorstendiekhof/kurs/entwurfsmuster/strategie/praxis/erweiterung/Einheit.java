package de.thorstendiekhof.kurs.entwurfsmuster.strategie.praxis.erweiterung;

public abstract class Einheit{

    Bewegungsverhalten bewegungsverhalten = new KeinBewegunsVerhalten();
    Angriffsverhalten angriffsverhalten = new KeinAngriffVerhalten();
    Zauberverhalten zauberverhalten = new KeinZauberverhalten();

    void bewegen(){
        bewegungsverhalten.bewegen();
    }

    void angreifen(){
        angriffsverhalten.angreifen();
    }

    void zaubere(){
        zauberverhalten.zaubere();
    }

    public void wechselBewegungsVerhalten(Bewegungsverhalten bewegungsverhalten){
        this.bewegungsverhalten = bewegungsverhalten;
    }

    public void wechselAngriffsVerhalten(Angriffsverhalten angriffsverhalten){
        this.angriffsverhalten = angriffsverhalten;
    }

    public void wechselZauberVerhalten(Zauberverhalten zauberverhalten){
        this.zauberverhalten = zauberverhalten;
    }
    
}