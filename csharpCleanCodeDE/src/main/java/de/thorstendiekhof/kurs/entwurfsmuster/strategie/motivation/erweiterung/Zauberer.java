package de.thorstendiekhof.kurs.entwurfsmuster.strategie.motivation.erweiterung;

public class Zauberer implements Einheit {

	public void bewegen() {
		System.out.println("Bewegt sich zu Fuß.");
	}

	public void angreifen() {
		throw new UnsupportedOperationException();
    }
    
    public void zauber(){
        System.out.println("Verwandelt einen Feind in ein Schaf.");
    }

}