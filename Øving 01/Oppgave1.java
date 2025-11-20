// Øving 1, Oppgave 1

import java.util.Scanner;

public class Oppgave1 {
    public static void main(String[] args) {
        System.out.println("Dette programmet konverterer fra tommer til centimeter.");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Hvor mange tommer vil du konvertere? ");
        double tommer = scanner.nextDouble();
        double centimeter = tommer * 2.54;
        
        if (tommer < 0) {
            System.out.println("Feil, tommen kan ikke være negativ");
        }
        else {
            if (tommer == 1) {
          System.out.println(tommer + " tomme er det samme som " + centimeter + "cm");   
        }
        else{
           System.out.println(tommer + " tommer er det samme som " + centimeter + "cm"); 
        }
        }
        scanner.close();
    }
}
