//øving 1, Oppgave 2

import java.util.Scanner;

public class Oppgave2 {
    public static void main(String[] args) {
        System.out.println("Dette programmet regner ut hvor mange totale sekunder det er i et samlet antall timer, minutter og sekunder!");

        Scanner scanner = new Scanner (System.in);
        System.out.println("Skriv inn antall timer, minutter og sekunder du vil konvertere under:");
        System.out.print("Antall timer: ");
        int timer = scanner.nextInt();
        System.out.print("Antall minutter: ");
        int minutter = scanner.nextInt();
        System.out.print("Antall sekunder: ");
        int sekunder = scanner.nextInt();
        scanner.close();

        int timerISekunder = timer * 60 * 60;
        int minutterISekunder = minutter * 60;

        int totalleAntallSekunder = timerISekunder + minutterISekunder + sekunder;
        System.out.println(timer + " timer, " + minutter + " minutter og " + sekunder + " sekunder blir tilsammen " + totalleAntallSekunder + " sekunder.");
    }
}