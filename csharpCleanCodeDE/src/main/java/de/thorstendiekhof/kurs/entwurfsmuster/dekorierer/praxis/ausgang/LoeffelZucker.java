package de.thorstendiekhof.kurs.entwurfsmuster.dekorierer.praxis.ausgang;

public class LoeffelZucker extends ZutatDekorierer {

    public LoeffelZucker(Kaffeespezialitaet kaffeespezialitaet){
        super(kaffeespezialitaet);
    }

	@Override
	public String getBeschreibung() {
		return kaffeespezialitaet.getBeschreibung() + ", mit Zucker";
	}

	@Override
	int getPreis() {
		return kaffeespezialitaet.getPreis() + 10;
	}

}