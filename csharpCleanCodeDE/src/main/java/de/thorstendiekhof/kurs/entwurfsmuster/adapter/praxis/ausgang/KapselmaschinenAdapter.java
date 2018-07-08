package de.thorstendiekhof.kurs.entwurfsmuster.adapter.praxis.ausgang;

import de.thorstendiekhof.kurs.entwurfsmuster.adapter.praxis.ausgang.extern.Kapselmaschine;
import de.thorstendiekhof.kurs.entwurfsmuster.adapter.praxis.ausgang.extern.Kapselmaschine.Becher;
import de.thorstendiekhof.kurs.entwurfsmuster.adapter.praxis.ausgang.extern.Kapselmaschine.Kapsel;

public class KapselmaschinenAdapter implements ZubereitungsMaschine {

    private Kapselmaschine kapselmaschine;

	public KapselmaschinenAdapter(Kapselmaschine kapselmaschine){
        this.kapselmaschine = kapselmaschine; 
    }

	public void stelleBecherBereit(String becher) {
		if(KLEINER_BECHER.equals(becher))
			kapselmaschine.stelleBecherBereit(Becher.KLEIN);
	}

	public void mahleBohnen(int gramm) {
		if(gramm > 10 && gramm < 14 )
			kapselmaschine.legeKapselEin(Kapsel.KAFFEE);
		if(gramm <= 10)
			kapselmaschine.legeKapselEin(Kapsel.ESPRESSO);
	}

	public void brueheAuf(int ml) {
		kapselmaschine.brueheAuf();
	}

	public void entsorgeTrester() {
		kapselmaschine.entsorgeKapsel();
	}

}