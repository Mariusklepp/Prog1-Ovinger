import java.util.Scanner;
public class Meny {
    public static void main(String[] args) {
    
    int valg;
    Scanner sc = new Scanner(System.in);

    Person p1 = new Person("Marius", "Klepp", 2005);
    ArbTaker ansatt = new ArbTaker(p1, 101, 2023, 45000, 31.5);


        do{
            System.out.println("\nHei. Gjør et valg:\n" +
                                "1: Se nåværende data\n" +
                                "2: Endre månedslønn\n" +
                                "3: Endre skatteprosenten\n" +
                                "0: Avslutt programmet\n");
            valg = sc.nextInt();

            if(valg == 1){
                System.out.println("\nNavn: " + ansatt.fulltNavn());
                System.out.println("Alder: " + ansatt.alder());
                System.out.println("Ansattnr: " + ansatt.getArbtakernr());
                System.out.println("Ansatt i " + ansatt.antallÅrAnsatt() + " år");
                System.out.println(ansatt.ansattaMerEnGittAntallÅr(5)); 
                System.out.println("Månedslønn: " + ansatt.getMånedslønn());
                System.out.println("Skattetrekk per måned: " + ansatt.skattetrekkPerMåned());
                System.out.println("Bruttolønn: " + ansatt.bruttoLønn());
                System.out.println("Skattetrekk per år: " + ansatt.skattetrekkPerÅr());

            }
            else if(valg == 2){
                System.out.println("Hva skal den nye månedslønnen være?");
                int nyMånedslønn = sc.nextInt();
                ansatt.setMånedslønn(nyMånedslønn);
                System.out.println("Månedslønnen er endret til " + ansatt.getMånedslønn());
            }
            else if(valg == 3){
                System.out.println("Hva er den nye skatteprosenten?");
                int nySkatteprosent = sc.nextInt();
                ansatt.setSkatteprosent(nySkatteprosent);
                System.out.println("Skatteprosenten er endret til " + ansatt.getSkatteprosent());
            }
            else if(valg == 0){
                continue;
            }
            else{
                System.out.println("Venligst skriv inn et tall som korresponderer med menyen.");
            }
        }
        while(valg != 0);
        System.out.println("Avslutter programmet");
        sc.close();
    }
}
