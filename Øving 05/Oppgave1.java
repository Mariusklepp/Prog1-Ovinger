import java.util.Scanner;
public class Oppgave1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valg;
        int tall1;
        int tall2;
        Brok brok;
        Brok brok2 = new Brok(3, 5);

        do{
        System.out.println( "Dette er et program for å regne ut brøker! velg hvordan du vil lage brøken. \n" +
                            "1: gi verdi til teller og nevner\n" +
                            "2: gi verdi til bare teller (nevner = 1)\n" +
                            "0: avslutt");
        
        valg = sc.nextInt();

        if (valg == 1){
            System.out.print("Skriv inn en verdi for telleren:");
            tall1 = sc.nextInt();
            System.out.print("Skriv inn en verdi for nevneren:");
            tall2 = sc.nextInt();
            
            brok = new Brok(tall1, tall2);
    
        }
        else if(valg == 2){
            System.out.print("Skriv inn en verdi for telleren:");
            tall1 = sc.nextInt();

            brok = new Brok(tall1);
        }
        else if(valg == 0){
             break;
        }
        else {
        System.out.println("Ugyldig valg.");
        continue;
        }


        do{
            System.out.print("Du har nå brøken ");
            brok.skrivUt();
            System.out.println("Vil du: \n"+
            "1: Summere denne brøken\n" +
            "2: subtrahere denne brøken\n" +
            "3: multiplisere denne brøken\n" +
            "4: dividere denne brøken\n" +
            "9: Gå tilbake til hovedmenyen for å lage en ny brøk\n"+
            "0: Avslutte programmet");
            valg = sc.nextInt();

            if (valg == 1){
                brok.summer(brok2);
                System.out.print("Resultatet er ");
                brok.skrivUt();
                System.out.println("\n");
            }
            else if (valg == 2){
                brok.subtraher(brok2);
                System.out.print("Resultatet er ");
                brok.skrivUt();
                System.out.println("\n");
            }
            else if (valg == 3){
                brok.multipliser(brok2);
                System.out.print("Resultatet er ");
                brok.skrivUt();
                System.out.println("\n");
            }
            else if (valg == 4){
                brok.divider(brok2);
                System.out.print("Resultatet er ");
                brok.skrivUt();
                System.out.println("\n");
            }
        }
        while(valg!=9 && valg != 0);
    
    
    }
        while (valg != 0);
        System.out.println("Programmet avslutter");
        sc.close();
    }   
}
