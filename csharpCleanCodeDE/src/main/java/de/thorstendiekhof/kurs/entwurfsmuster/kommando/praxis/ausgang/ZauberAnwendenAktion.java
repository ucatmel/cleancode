package de.thorstendiekhof.kurs.entwurfsmuster.kommando.praxis.ausgang;

import java.util.concurrent.TimeUnit;

public class ZauberAnwendenAktion implements Aktion {

	private Zauber zauber;

	public ZauberAnwendenAktion(Zauber zauber){
		this.zauber = zauber;
	}

	public void ausfuehren() {
		try {
			System.out.println("Du zauberst " + zauber.name);
			TimeUnit.SECONDS.sleep(1);
			zauber.zaubere();
		} catch (InterruptedException e) {
			System.out.println("Irgendwas ist enorm schief gelaufen! Du wirst in einen Dimensionsriss geworfen und verschwindest für immer!");
		}
	}

}