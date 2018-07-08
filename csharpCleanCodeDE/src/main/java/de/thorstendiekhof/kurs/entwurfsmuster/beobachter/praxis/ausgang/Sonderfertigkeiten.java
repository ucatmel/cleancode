package de.thorstendiekhof.kurs.entwurfsmuster.beobachter.praxis.ausgang;

public class Sonderfertigkeiten implements Beobachter {

    public boolean berserkerrausch = false;

    public void starteBerserkerrausch(){
        berserkerrausch = true;
        System.out.println("UUUAAAAARRRRGGGGG!!!!!111");
    }

	public void stoppeBerserkerrausch() {
        berserkerrausch = false;
        System.out.println("Puhhh... ");
	}

	public void aktualisiere(int alteLebenspunkte, int neueLebenspunkte, int maxLebenspunkte) {
        int berserkerSchwelle = maxLebenspunkte / 3;
		if(neueLebenspunkte > 0 && neueLebenspunkte < berserkerSchwelle && berserkerrausch == false){
            starteBerserkerrausch();
        } else if(neueLebenspunkte >= berserkerSchwelle && berserkerrausch == true){
            stoppeBerserkerrausch();
        }
	}

}