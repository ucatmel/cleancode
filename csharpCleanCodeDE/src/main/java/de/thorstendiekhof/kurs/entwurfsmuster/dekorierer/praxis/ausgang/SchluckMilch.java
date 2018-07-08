package de.thorstendiekhof.kurs.entwurfsmuster.dekorierer.praxis.ausgang;


public class SchluckMilch extends ZutatDekorierer {

    public SchluckMilch(Kaffeespezialitaet kaffeespezialitaet){
        super(kaffeespezialitaet);
    }

	@Override
	public String getBeschreibung() {
		return kaffeespezialitaet.getBeschreibung() + ", mit Milch";
	}

	@Override
	int getPreis() {
		return kaffeespezialitaet.getPreis() + 20;
	}

}