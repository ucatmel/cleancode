package de.thorstendiekhof.kurs.entwurfsmuster.kompositum.praxis.ausgang;

import de.thorstendiekhof.kurs.entwurfsmuster.kompositum.praxis.ausgang.Truppe.Gattung;

public class Main {
    public static void main(String[] args) {
        Offizier offizier = new Offizier("Eusebius von Gallenstein", "Feldherr und Marshal der heiligen gömischen Liga.");
        Truppe tomparsen = new Truppe("Die Tomparsen", Gattung.REITEREI, 20);
        Truppe greusen = new Truppe("Die Geusen", Gattung.REITEREI, 10);
        Truppe doerfler = new Truppe("Bergefurter Spießgesellen", Gattung.FUSSKAEMPFER, 50);
        Truppe schleuder = new Truppe("Die alte Emma", Gattung.BELAGERUNGSGERAET, 1);
 
        offizier.gliederEinheitAn(tomparsen);
        offizier.gliederEinheitAn(greusen);
        offizier.gliederEinheitAn(doerfler);
        offizier.gliederEinheitAn(schleuder);

        Offizier dreisam = new Offizier("Dr. Dreisam", "Medikus, Belagerungsexperte und Priester");
        Truppe leibgarde = new Truppe("Leibgarde", Gattung.FUSSKAEMPFER, 5);
        Truppe bombarden = new Truppe("Bombarden", Gattung.BELAGERUNGSGERAET, 3);
        dreisam.gliederEinheitAn(leibgarde);
        dreisam.gliederEinheitAn(bombarden);
 
        offizier.gliederEinheitAn(tomparsen);
        offizier.gliederEinheitAn(greusen);
        offizier.gliederEinheitAn(doerfler);
        offizier.gliederEinheitAn(schleuder);
        offizier.gliederEinheitAn(dreisam);
 
        Offizier knut = new Offizier("Knut", "Assistent von Dr.Dreisam");
        Truppe hugo = new Truppe("Hund Hugo", Gattung.BESTIE,1);
        knut.gliederEinheitAn(hugo);
        dreisam.gliederEinheitAn(knut);


        offizier.zeigeAufstellung("");
    }
}