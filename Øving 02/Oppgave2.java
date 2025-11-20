public class Oppgave2 {
    public static void main(String[] args) {
        double KjøttdeigA = 0.450;
        double KjøttdeigB = 0.5;
        double prisA = 35.90;
        double prisB = 39.50;
        double kgPrisA = (prisA/KjøttdeigA);
        double kgPrisB = (prisB/KjøttdeigB); 

        if(kgPrisA<kgPrisB){
            System.out.printf("Det er Kjøttdeigen av merke A, den som koster 35.90 for 450 gram som er den billigste kjøttdeigen. Dette pga kilosprisen som blir %.2f kr iforhold til kiloprisen på merke B som blir %.2f kr.", kgPrisA, kgPrisB);
        }
         else{
            System.out.printf("Det er Kjøttdeigen av merke B, den som koster 39.50 for 500 gram som er den billigste kjøttdeigen. Dette pga kilosprisen som blir %.2f kr iforhold til kiloprisen på merke A som blir %.2f kr.", kgPrisB, kgPrisA);
        }
    }
}
