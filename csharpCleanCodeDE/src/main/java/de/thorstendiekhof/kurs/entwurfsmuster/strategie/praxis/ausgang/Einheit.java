package de.thorstendiekhof.kurs.entwurfsmuster.strategie.praxis.ausgang;

public abstract class Einheit{
    Bewegungsverhalten bewegungsverhalten;
    Angriffsverhalten angriffsverhalten;

    void bewegen(){
        bewegungsverhalten.bewegen();
    }
    void angreifen(){
        angriffsverhalten.angreifen();
    }
    public void wechselBewegungsVerhalten(Bewegungsverhalten bewegungsverhalten){
        this.bewegungsverhalten = bewegungsverhalten;
    }
    public void wechselAngriffsVerhalten(Angriffsverhalten angriffsverhalten){
        this.angriffsverhalten = angriffsverhalten;
    }
}