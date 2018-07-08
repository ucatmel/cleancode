package de.thorstendiekhof.kurs.entwurfsmuster.zustand.praxis.erweiterung;

public interface Zustand {
    void kaffeeAuswaehlen();
    void espressoAuswaehlen();
    void kaffeeBereiten();
    void espressoBereiten();
    void bohnenAuffuellen();
    
    void geldEinwerfen();
}