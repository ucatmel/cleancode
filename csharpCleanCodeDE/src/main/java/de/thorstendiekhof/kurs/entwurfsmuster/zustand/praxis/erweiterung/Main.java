package de.thorstendiekhof.kurs.entwurfsmuster.zustand.praxis.erweiterung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main( String[] args )
    {
        KaffeeAutomat automat = new KaffeeAutomat();
        while(automat != null){
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("1: Geld einwerfen");
            System.out.println("2: Kaffee zubereiten");
            System.out.println("3: Espresso zubereiten");
            System.out.println("4: Bohnen auffüllen");
            System.out.println("5: Maschine ausschalten");
            try{
                int auswahl = Integer.parseInt(br.readLine());
                if(auswahl == 1) automat.geldEinwerfen();
                if(auswahl == 2) automat.kaffeeAuswaehlen();
                if(auswahl == 3) automat.espressoAuswaehlen();
                if(auswahl == 4) automat.bohnenAuffuellen();
                if(auswahl == 5) automat = null;
            }catch(IOException e){
                System.out.println("Mit dieser Auswahl kann ich Nichts anfangen.");
            } 
        }
    }        
}