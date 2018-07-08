package de.thorstendiekhof.kurs.entwurfsmuster.beobachter.praxis.ausgang;

public interface Beobachter {
    void aktualisiere(int alteLebenspunkte, int neueLebenspunkte, int maxLebenspunkte);
}