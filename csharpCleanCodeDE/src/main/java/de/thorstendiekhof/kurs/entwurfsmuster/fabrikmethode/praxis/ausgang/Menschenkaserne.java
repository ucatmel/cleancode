package de.thorstendiekhof.kurs.entwurfsmuster.fabrikmethode.praxis.ausgang;

public class Menschenkaserne extends Kaserne {
	@Override
	public Einheit rekrutiere() {
        	return new Ritter();       
	}
}