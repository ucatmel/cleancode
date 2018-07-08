package de.thorstendiekhof.kurs.entwurfsmuster.adapter.praxis.ausgang;



public interface ZubereitungsMaschine{

     static final String KLEINER_BECHER = "Kleiner Becher";

	 void stelleBecherBereit(String becher);

	 void mahleBohnen(int gramm);

	 void brueheAuf(int ml);

	 void entsorgeTrester();

}