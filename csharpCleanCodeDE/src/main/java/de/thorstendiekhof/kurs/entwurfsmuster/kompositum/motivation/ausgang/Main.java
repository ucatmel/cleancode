package de.thorstendiekhof.kurs.entwurfsmuster.kompositum.motivation.ausgang;

import de.thorstendiekhof.kurs.entwurfsmuster.kompositum.motivation.ausgang.Truppe.Gattung;

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

       offizier.zeigeAufstellung();
    }
}