public class terningspill{
    public static void main(String[] args) {
        int runde = 0;
            Spiller spillerA = new Spiller  (0);
            Spiller spillerB = new Spiller ( 0);
        
            while (!spillerA.erFerdig() && !spillerB.erFerdig()) {
                spillerA.kastTerning();
                if (spillerA.erFerdig()){
                    System.out.println("Spiller A vant spillet");
                    return;
                }
                spillerB.kastTerning();
                if (spillerB.erFerdig()){
                    System.out.println("Spiller A vant spillet");
                    return;
                }
                runde += 1;
                System.out.printf("Dette er runde nr. " + runde + ". Spiller A har " + spillerA.getSumPoeng() + " og spiller B har " + spillerB.getSumPoeng() + " poeng. \n");
        }
    }
}



 
