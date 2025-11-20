import java.util.Scanner;

public class oppgave2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int tall; 

        do{
            System.out.println("Skriv inn et tall nedenfor for å sjekke om det er et primtall. (Skriv 0 for å avslutte programmet)");
            tall = scanner.nextInt();

            if (tall == 0){
                System.out.println("Avslutter programmet");
            } 
            else if (tall < 2){
                System.out.println("Dette er ikke et primtall. Tallet 1 eller et negativt tall kan ikke være et primtall \n");
            } 
            else {

                int sjekk = 2;
                boolean primtall = true;

                while (sjekk <= Math.sqrt(tall)){
                    if (tall % sjekk == 0){
                        primtall = false;
                        break;
                    }
                    sjekk++;
                }
                if(primtall)
                    System.out.println("Dette er et primtall \n");
                else
                    System.out.println("Dette er ikke et primtall \n");
            }        
        }   
        while (tall != 0);
        

    scanner.close();
    }
}

