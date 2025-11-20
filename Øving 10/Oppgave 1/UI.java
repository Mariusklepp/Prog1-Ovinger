import java.util.Scanner;

public class UI {
    Scanner sc = new Scanner(System.in);
    ArrangementRegister registrer = new ArrangementRegister();
    int brukervalg;

    public void start(){
         do{
            showMenu();
            brukervalg = getUserchoice();
                switch (brukervalg) {
                case 1:
                    System.out.println("\nRegistrer et nytt arrangement under:");
                    Arrangement nytt = registrer.ArrangementInfo();
                    registrer.registrereArrangement(nytt);
                    break;
            
                case 2:
                    registrer.arrangementerPåEtSted();
                    break;

                case 3:
                    registrer.arrangementerPåEnDato();
                    break;

                case 4:
                    registrer.arrangementerInnenforTidsrom();
                    break;

                case 5:
                    registrer.alleArrangementer();
                    break;

                case 0:
                    System.out.println("\nAvslutter programmet");
                    break;

                default:
                System.out.println("\nUgyldig valg. Vennligst skriv inn tallet korresponderende til valget ditt\n");
                    break;
                
            }
        }while (brukervalg != 0);
    }


    public  void showMenu(){
        System.out.println("Hovedmeny Arrangementregister!");
        System.out.println("1) registrer et nytt arrangement");
        System.out.println("2) Finn alle arrangementer på et gitt sted");   
        System.out.println("3) Finn alle arrangementer gitt på en gitt dato (YYYYMMDD)");
        System.out.println("4) Finn alle arrangementer gitt innenfor et tidsrom mellom to datoer");
        System.out.println("5) Alle arrangementer, sortert etter sted, type eller tidspunkt");
        System.out.println("0) Avslutt programmet\n");
    }
    
    public int getUserchoice(){
        System.out.print("Skriv inn tallet korresponderende til ditt valg: ");
        int valg = sc.nextInt();
        return valg;
    }
}

