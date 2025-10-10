//Øving 1, Oppgave 3

import java.util.Scanner;

public class Oppgave3 {
    public static void main(String[] args) {
        System.out.println("Dette programmet regner ut timer, minutter og sekunder basert på et samlet antall sekunder.");
        Scanner scanner = new Scanner(System.in); 
        System.out.print("hvor mange sekunder vil du vi skal konvertere? ");
        int sekunder = scanner.nextInt();
        scanner.close();
        
        int timer = sekunder / 3600;
        int restTimer = sekunder % 3600;
        int minutter = restTimer / 60;
        int restMinutter = restTimer % 60;
        int sekunderIgjen = restMinutter % 60;

        if (timer>0 && minutter==0 && sekunderIgjen==0) {
             System.out.println(sekunder + " sekunder blir til " + timer + " timer");
        }
        else{
            if (timer>0 && minutter>0 && sekunderIgjen==0) {
                System.out.println(sekunder + " sekunder blir til " + timer + " timer og " + minutter + " minutter");  
            }
            else{
                System.out.println(sekunder + " sekunder blir til " + timer + " timer, " + minutter + " minutter og " + sekunderIgjen + " sekunder.");
            }
        }
    }
}