package de.thorstendiekhof.kurs.entwurfsmuster.zustand.praxis.ausgang;

public interface Zustand {
    void kaffeeAuswaehlen();
    void espressoAuswaehlen();
    void kaffeeBereiten();
    void espressoBereiten();
    void bohnenAuffuellen();
}