import java.util.Scanner;
public class Klientprogram {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);   
    int valg;

        do{
            System.out.println("Dette programmet kan forkorte eller fjerne tegn fra en gitt setning.");
            System.out.println("Tast inn 1 for å forkorte, 2 for å fjerne tegn og 0 for å avslutte programmet!");
            valg = sc.nextInt();
            sc.nextLine(); //Tømmer bufferen

            if (valg == 0){
                break;
            }

            else if(valg == 1){
                System.out.println("Du har valgt å forkorte! Programmet forkorter setningen du skriver inn til bare første bokstaven i hvert ord.");
                System.out.println("Skriv inn teksten du vil forkorte:");
                
                String inputTekst = sc.nextLine();
                Nystring tekst= new Nystring(inputTekst);
                
                String resultat = tekst.forkortelse();
                System.out.println("Forkortelsen din er " + resultat);
            }

            else if(valg == 2){
                System.out.println("Du har valgt å fjerne tegn! Programmet fjerner det tegnet du skriver inn fra teksten din");
                System.out.println("Skriv først inn teksten din så skriver du inn tegnet du vil fjerne");
                
                String inputTekst = sc.nextLine();
                String tegn = sc.nextLine();

                Nystring tekst= new Nystring(inputTekst);

                String resultat = tekst.fjerningAvTegn(tegn);
                System.out.println("Teksten din etter å fjernet tegnene er:\n " + resultat);
                
            }

            else{
                System.out.println("Vennligst velg et tall som er i menyen.");
                continue;
            }
        }
        while(valg != 0);

        System.out.println("Programmet avslutter");
        sc.close();
    }
}
