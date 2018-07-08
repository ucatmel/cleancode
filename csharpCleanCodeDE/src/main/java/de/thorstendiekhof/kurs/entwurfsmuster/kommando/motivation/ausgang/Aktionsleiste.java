package de.thorstendiekhof.kurs.entwurfsmuster.kommando.motivation.ausgang;

public class Aktionsleiste {
    public void klickButton(String taste){
      if("1".equals(taste)){
        System.out.println("Schwert trifft den Gegner und verursacht 2 Schaden!");
      }
      else if("2".equals(taste)){
        System.out.println("Du wirst unsichtbar.");
      }
      else if("3".equals(taste)){
        System.out.println("Du fühlst dich wieder fit!");
      }
      else if("4".equals(taste)){
        System.out.println("Ein starkes Gift lässt dein Gesicht anschwellen.");
      }
      else if("w".equals(taste)){
        System.out.println("Du bewegst dich nach vorne.");
      }
      else if("a".equals(taste)){
        System.out.println("Du bewegst dich nach links.");
      }
      else if("s".equals(taste)){
        System.out.println("Du bewegst dich nach hinten.");
      }
      else if("d".equals(taste)){
        System.out.println("Du bewegst dich nach rechts.");
      }
    }
}