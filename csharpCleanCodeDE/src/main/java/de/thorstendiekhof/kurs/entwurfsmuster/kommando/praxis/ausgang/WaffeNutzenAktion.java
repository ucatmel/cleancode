package de.thorstendiekhof.kurs.entwurfsmuster.kommando.praxis.ausgang;

public class WaffeNutzenAktion implements Aktion {

	private Waffe waffe;

	public WaffeNutzenAktion(Waffe waffe){
		this.waffe = waffe;
	}

	public void ausfuehren() {
		waffe.machSchaden();
	}

}