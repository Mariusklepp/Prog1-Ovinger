import java.util.Scanner;

public class oppgave1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Dette programmet skriver ut multiplikasjonstabellen opp til 10-gangen for tallene du ønsker. Vennligst skriv inn to tall så lager vi en tabell ut ifra disse to! (ps, husk og ha mellomrom mellom tallene!)");
        System.out.print("Skriv tallene her: ");
        int tall1 = scanner.nextInt();
        int tall2 = scanner.nextInt();
        
        while(tall1<=tall2){
            System.out.println(tall1 + " gangen");
            System.out.println(tall1 + "*1 = " + tall1 * 1);
            System.out.println(tall1 + "*2 = " + tall1 * 2);
            System.out.println(tall1 + "*3 = " + tall1 * 3);
            System.out.println(tall1 + "*4 = " + tall1 * 4);
            System.out.println(tall1 + "*5 = " + tall1 * 5);
            System.out.println(tall1 + "*6 = " + tall1 * 6);
            System.out.println(tall1 + "*7 = " + tall1 * 7);
            System.out.println(tall1 + "*8 = " + tall1 * 8);
            System.out.println(tall1 + "*9 = " + tall1 * 9);
            System.out.println(tall1 + "*10 = " + tall1 * 10 + "\n");
            tall1 += 1;
        }
        scanner.close();
    }
}
