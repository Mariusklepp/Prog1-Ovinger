import java.util.Scanner;

public class Klientprogram1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tekst;

        do {
            System.out.println("Hei! Skriv inn teksten du vil analysere (eller skriv '0' for å avslutte):");
            tekst = sc.nextLine();

            if (!tekst.equals("0")) {   // stopper kun hvis teksten er nøyaktig "avslutt"
                Tekstanalyse klient = new Tekstanalyse(tekst);
                klient.antallBokstaver();
                klient.forskjelligeBokstaver();
                klient.prosentIkkeBokstaver();
                klient.forekomstAvBokstav('e');
                klient.vanligsteBokstaver();
            }

        } while (!tekst.equals("0"));  // løkka stopper kun på "avslutt"

        System.out.println("Program avsluttet.");
        sc.close();
    }
}

