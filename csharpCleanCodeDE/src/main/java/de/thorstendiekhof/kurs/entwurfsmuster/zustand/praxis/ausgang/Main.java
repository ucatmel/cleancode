package de.thorstendiekhof.kurs.entwurfsmuster.zustand.praxis.ausgang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main( String[] args )
    {
        KaffeeAutomat automat = new KaffeeAutomat();
        while(automat != null){
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Auswahl:");
            System.out.println("1: Kaffee zubereiten");
            System.out.println("2: Espresso zubereiten");
            System.out.println("3: Bohnen auffüllen");
            System.out.println("4: Maschine ausschalten");
            try{
                int auswahl = Integer.parseInt(br.readLine());
                if(auswahl == 1) automat.kaffeeAuswaehlen();
                if(auswahl == 2) automat.espressoAuswaehlen();
                if(auswahl == 3) automat.bohnenAuffuellen();
                if(auswahl == 4) automat = null;
            }catch(IOException e){
                System.out.println("Mit dieser Auswahl kann ich Nichts anfangen.");
            } 
        }
    }      
}