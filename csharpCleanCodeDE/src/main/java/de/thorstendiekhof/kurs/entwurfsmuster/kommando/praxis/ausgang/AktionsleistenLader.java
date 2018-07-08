package de.thorstendiekhof.kurs.entwurfsmuster.kommando.praxis.ausgang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AktionsleistenLader {


    public Aktionsleiste aktionsLeisteLaden(){
        Aktionsleiste leiste = new Aktionsleiste();
        TrankTrinkenAktion heilTrankAktion = new TrankTrinkenAktion(Trank.HEILTRANK);
        TrankTrinkenAktion kroetenTrankAtkion = new TrankTrinkenAktion(Trank.KROETENSCHLEIM);
        WaffeNutzenAktion schwertNutzenAktion = new WaffeNutzenAktion(Waffe.SCHWERT);
        ZauberAnwendenAktion fireWaveAktion = new ZauberAnwendenAktion(Zauber.INTERKONTINENTAL_FIREWAVE);
        leiste.setAktion("1", schwertNutzenAktion);
        leiste.setAktion("2", fireWaveAktion);
        leiste.setAktion("3", heilTrankAktion);
        leiste.setAktion("4", kroetenTrankAtkion);
        return leiste;
    }



    public static void main( String[] args )
    {
        AktionsleistenLader lader =new AktionsleistenLader();
        Aktionsleiste leiste = lader.aktionsLeisteLaden();
        boolean end = false;
        while(!end){

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Auswahl:");

            try {
                String auswahl = br.readLine();
                if("q".equals(auswahl)) end = true;
                leiste.klickButton(auswahl);
		    } catch (IOException e) {
                System.out.println("Mit der Eingabe kann ich Nichts anfangen.");
		    }
        }

    }

}