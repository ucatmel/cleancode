package de.thorstendiekhof.kurs.entwurfsmuster.kompositum.motivation.erweiterung;

import de.thorstendiekhof.kurs.entwurfsmuster.kompositum.motivation.erweiterung.Truppe.Gattung;

public class Main {
    public static void main(String[] args) {
        Offizier offizier = new Offizier("Eusebius von Gallenstein", "Feldherr und Marshal der heiligen gömischen Liga.");
        Truppe tomparsen = new Truppe("Die Tomparsen", Gattung.REITEREI, 20);
        Truppe greusen = new Truppe("Die Geusen", Gattung.REITEREI, 10);
        Truppe doerfler = new Truppe("Bergefurter Spießgesellen", Gattung.FUSSKAEMPFER, 50);
        Truppe schleuder = new Truppe("Die alte Emma", Gattung.BELAGERUNGSGERAET, 1);
 
        offizier.heuerTruppeAn(tomparsen);
        offizier.heuerTruppeAn(greusen);
        offizier.heuerTruppeAn(doerfler);
        offizier.heuerTruppeAn(schleuder);

        Offizier dreisam = new Offizier("Dr. Dreisam", "Medikus, Belagerungsexperte und Priester");
        Truppe leibgarde = new Truppe("Leibgarde", Gattung.FUSSKAEMPFER, 5);
        Truppe bombarden = new Truppe("Bombarden", Gattung.BELAGERUNGSGERAET, 3);
        dreisam.heuerTruppeAn(leibgarde);
        dreisam.heuerTruppeAn(bombarden);
 
        offizier.heuerTruppeAn(tomparsen);
        offizier.heuerTruppeAn(greusen);
        offizier.heuerTruppeAn(doerfler);
        offizier.heuerTruppeAn(schleuder);
        offizier.unterstelle(dreisam);


        Offizier knut = new Offizier("Knut", "Assistent von Dr.Dreisam");
        Truppe hugo = new Truppe("Hund Hugo", Gattung.BESTIE,1);
        knut.heuerTruppeAn(hugo);
        dreisam.unterstelle(knut);

 
        offizier.zeigeAufstellung("");
    }
}