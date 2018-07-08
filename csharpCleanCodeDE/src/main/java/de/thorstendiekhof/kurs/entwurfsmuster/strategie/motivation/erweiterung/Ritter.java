package de.thorstendiekhof.kurs.entwurfsmuster.strategie.motivation.erweiterung;

public class Ritter implements Einheit {

	public enum Waffe {
		SCHWERT, LANZE, STREITKOLBEN, ARMBRUST;
	}
	
	private Waffe waffe = Waffe.SCHWERT;

	public void angreifen() {
		switch (waffe) {
			case SCHWERT:
				System.out.println("Greift mit einem Schwert im Nahkampf an.");
				break;
			case LANZE:
				System.out.println("Greift mit einer Lanze im Nahkampf an.");
				break;
			case STREITKOLBEN:
				System.out.println("Greift mit einem Streitkolben im Nahkampf an.");
				break;
			case ARMBRUST:
				System.out.println("Greift mit einer Armbrust im Fernkampf an.");
				break;
			default:
				break;
		}	
	}
	public void setWaffe(Waffe waffe){
		this.waffe = waffe;
	}

	public void bewegen() {
		System.out.println("Bewegt sich beritten.");
	}

}