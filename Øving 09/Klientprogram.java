import java.util.Scanner;
public class Klientprogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Oppgaveoversikt oversikt = new Oppgaveoversikt();
        int valg;

        do{
            System.out.println("Hva vil du gjøre?\n"+
                                "1: Registrere en ny student\n" +
                                "2: Finne antall studenter som er registrert\n" +
                                "3: Finne antall oppgaver en bestemt student har løst\n" +
                                "4: øke antall oppgaver som er godkjent for en bestemt student\n" +
                                "0: Avslutte programmet\n");
            valg = sc.nextInt();
            sc.nextLine();

            if(valg == 1){
                System.out.println("\nSkriv inn navnet på studenten du vil registrere:");
                String inputNavn = sc.nextLine();
                oversikt.nyStudent(inputNavn);
                System.out.println("Det er nå registrert en ny student!\n");
            }
            else if(valg == 2){
                System.out.println("\nDet er registrert " + oversikt.antallStudenter() + " student/er\n");
            }
            else if(valg == 3){
                System.out.println("\nHvilken student vil du sjekke?");
                String navn = sc.nextLine();
                int antall = oversikt.antallOppgaver(navn);
                System.out.println("\nStudenten " + navn + " har løst " + antall + " oppgaver\n");
            }
            else if(valg == 4){
                System.out.println("\nHvilken student skal du øke godkjente oppgaver for?");
                String navn = sc.nextLine();
                System.out.println("\nHvor mange flere oppgaver har blitt godkjent?");
                int flereGodkjente = sc.nextInt();
                oversikt.økOppgaver(navn, flereGodkjente);

            }
            else if(valg == 0){
                continue;
            }
            else{
                System.out.println("Vennligst skriv inn et av tallene i menyen");
            }

        }
        while(valg != 0);
        sc.close();
    }
}
