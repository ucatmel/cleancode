package de.thorstendiekhof.kurs.entwurfsmuster.kommando.motivation.ausgang;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Aktionsleiste aktionsleiste = new Aktionsleiste();
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Was soll passieren? ");
        String input = scanner.nextLine();
        aktionsleiste.klickButton(input);
        scanner.close();

    }
}