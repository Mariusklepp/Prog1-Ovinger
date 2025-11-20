import java.util.Scanner;

public class Oppgave1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dette programmet sjekker om et år er skuddår eller ikke! Vennligst skriv inn året du vil sjekke:");
        int år = scanner.nextInt();
        scanner.close(); 
        
        if(år % 400 == 0){

            System.out.println("Dette er et skuddår");
        } 
        else {
            if(år % 100 == 0){
                System.out.println("Dette er ikke et skuddår");
            }
            else if(år % 4 == 0)
            System.out.println("Dette er et skuddår");
            else{
            System.out.println("Dette er ikke et skuddår");
            }
        }
    }
}
