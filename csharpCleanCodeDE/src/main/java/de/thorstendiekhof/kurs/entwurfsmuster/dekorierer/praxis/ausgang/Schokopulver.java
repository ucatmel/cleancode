package de.thorstendiekhof.kurs.entwurfsmuster.dekorierer.praxis.ausgang;

public class Schokopulver extends ZutatDekorierer {

    public Schokopulver(Kaffeespezialitaet kaffeespezialitaet){
        super(kaffeespezialitaet);
    }

	@Override
	public String getBeschreibung() {
		return kaffeespezialitaet.getBeschreibung() + ", mit Schokopulver";
	}

	@Override
	int getPreis() {
		return kaffeespezialitaet.getPreis() + 30;
	}

}