import java.util.Scanner;
public class Tekstklient {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);  
    int valg;

    do{
    System.out.println("Skriv inn teksten du vil få info om:");
    String inputTekst = sc.nextLine();
    Tekst tekst= new Tekst(inputTekst);   

    do{
    System.out.println(
    "Hva vil du gjøre med denne teksten?\n" +
    "1: Finne antall ord i teksten\n" +
    "2: Finne gjennomsnittlig ordlengde\n" +
    "3: Finne gjennomsnittlig antall ord per periode\n" +
    "4: Skifte ut et ord med et annet\n" +
    "5: Hente ut teksten slik den står\n" +
    "6: Hente ut teksten med store bokstaver\n" +
    "9: Skriv inn en ny tekst\n" +
    "0: Avslutte programmet\n");

    valg = sc.nextInt();
    sc.nextLine();
    
    if (valg == 1){
        int resultat = tekst.antallOrd();
        System.out.println("\nI denne teksten er det " + resultat + " antall ord.\n");
    }
    else if (valg ==2) {
        double resultat = tekst.gjennomsnittligOrdlengde();
        System.out.println("\nI denne teksten er gjenommsnittet for hvert ord " + resultat + " bokstaver.\n");
    } 
    else if (valg == 3) {
        double resultat = tekst.gjennomsnittligOrdPerPeriode();
        System.out.println("\nI denne teksten er det i gjennomsnitt " + resultat + " ord per periode.\n");
    } 
    else if (valg == 4) {
        System.out.println("\nSkriv inn hvilket ord du vil bytte ut:");
        String bytteOrd = sc.nextLine();
        System.out.println("\nSkriv så inn hvillket ord du vil erstatte det med:");
        String inputOrd = sc.nextLine();
        String resultat = tekst.erstatteOrd(bytteOrd, inputOrd);
        System.out.println("\nDen nye teksten din er:\n" + resultat + "\n");

    } 
    else if (valg == 5) {
        String resultat = tekst.tekstenUtenEndringer();
        System.out.println("\nTeksten din uten endringer er:\n" + resultat + "\n");        
    } 
    else if (valg == 6) {
        String resultat = tekst.tekstenMedStoreBokstaver();
        System.out.println("\nTeksten din med bare store bokstaver er:\n" + resultat + "\n");  
    } 
    else if (valg == 0) {
        System.out.println("Programmet avslutter");
    } 

    } 
    while (valg != 0 && valg != 9);

    }
    while (valg != 0);
    sc.close();
    }
}
