import java.util.Scanner;

public class Valuta {
    String navn;
    double kurs;
    

    Valuta(String navn, double kurs){
        this.navn = navn;
        this.kurs = kurs;
    }


    public static void main(String[] args) {
        Valuta dollar = new Valuta("Dollar", 9.84);
        Valuta euro = new Valuta("Euro", 11.56);
        Valuta danskeKroner = new Valuta("Danske Kroner", 1.55);
        
        Scanner scanner = new Scanner(System.in);
        int valg;

        do{
            System.out.println("Velg valuta: \n");
            System.out.println("1: Dollar \n");
            System.out.println("2: Euro \n");
            System.out.println("3: Danske Kroner \n");
            System.out.println("4: Avslutt \n ");
            valg = scanner.nextInt();
            
            switch(valg){
                case 1:
                    System.out.println("Du har valgt Dollar. Hvor mye NOK vil du konvertere?");
                    int dollarbelop = scanner.nextInt();
                    kursKalkulator(dollar, dollarbelop);
                    break;
                case 2:
                    System.out.println("Du har valgt Euro. Hvor mye NOK vil du konvertere?");
                    int eurobelop = scanner.nextInt();
                    kursKalkulator(euro, eurobelop);
                    break;
                case 3:
                    System.out.println("Du har valgt Danske Kroner. Hvor mye NOK vil du konvertere?");
                    int danskbelop = scanner.nextInt();
                    kursKalkulator(danskeKroner, danskbelop);
                    break;
                case 4:
                    System.out.println("Programmet avslutter");
                    System.out.println("Ha en fin dag");
                    break;
                default:
            }
        } while (valg != 4);
    scanner.close();
        
    }
    static void kursKalkulator(Valuta v, int belop){
        double resultat = belop / v.kurs;
        System.out.printf("Dine " + belop + " Norske kroner blir %.1f" + " " + v.navn + "\n", resultat);
        
    }
}
