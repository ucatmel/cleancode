package de.thorstendiekhof.kurs.entwurfsmuster.strategie.motivation.erweiterung2;

public class Zauberer implements Einheit, Zaubernd, Bewegend {

	public void bewegen() {
		System.out.println("Bewegt sich zu Fuß.");
	}
    
    public void zauber(){
        System.out.println("Verwandelt einen Feind in ein Schaf.");
    }

}