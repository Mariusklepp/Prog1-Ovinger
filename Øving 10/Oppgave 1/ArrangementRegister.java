import java.util.Scanner;

public class ArrangementRegister{
    Scanner sc = new Scanner(System.in);
    private Arrangement[] Arrangementer;
    private int antall;
    private int kapasitet;
    private int arrangementNr;

    public ArrangementRegister(){
        Arrangementer = new Arrangement[100];
        antall = 0;
    }

    public Arrangement ArrangementInfo(){
        arrangementNr ++;

        System.out.print("Skriv inn navnet på arrangementet: ");
        String inputNavn = sc.nextLine();

        System.out.print("Skriv inn hvor arrangementet skal holdes: ");
        String inputSted = sc.nextLine();

        System.out.print("Skriv inn arrangøren for arrangementet: ");
        String inputArrangør = sc.nextLine();

        System.out.print("Skriv inn hvilken type arrangement det er (Konsert, foredrag, teater, osv): ");
        String inputTypeArrangement = sc.nextLine();

        System.out.print("Skriv inn klokkeslett og dato arragnementet skal holdes på (i et tall på formen :YYYYMMDDHHMM) :");
        Long inputDatoOgTid = sc.nextLong();
        sc.nextLine();

        return new Arrangement(arrangementNr, inputNavn, inputSted, inputArrangør, inputTypeArrangement, inputDatoOgTid);

    }
    
    public void registrereArrangement(Arrangement a){
        if (kapasitet >= Arrangementer.length){
            System.out.println("\nRegisteret er fullt");
        }
        Arrangementer[antall] = a;
        antall ++;
        System.out.println("\nArrangementet ditt er registrert");
        System.out.println(a + "\n");
    }

    public void arrangementerPåEtSted(){
        System.out.print("\nSkriv inn hvilket sted du vil sjekke for arrangementer: ");
        String inputSted = sc.nextLine();

        boolean fantNoe = false;

        for (int i=0; i < antall; i++){
            Arrangement a = Arrangementer[i];
           if(a.getSted().equalsIgnoreCase(inputSted)){
                if (!fantNoe){
                    System.out.println("Her er alle arrangementene på " + inputSted + ": \n");
                    fantNoe = true;
                }
                System.out.println(a + "\n");
           }
        }
        if (!fantNoe){
            System.out.println("Det er ingen arrangementer i " + inputSted +"\n");
        }
    }

    public void arrangementerPåEnDato(){
        System.out.print("\nSkriv inn hvilken dato du vil sjekke for arrangementer: ");
        int inputDato = sc.nextInt();
        sc.nextLine();

        boolean fantNoe = false;

        for (int i=0; i < antall; i++){
            Arrangement a = Arrangementer[i];
            int dato = (int)(a.getTidspunkt() / 10000);
        
           if(dato == inputDato){
                if (!fantNoe){
                    System.out.println("Her er alle arrangementene på " + inputDato + ": \n");
                    fantNoe = true;
                }
                System.out.println(a + "\n");
           }
        }
        if (!fantNoe){
            System.out.println("Det er ingen arrangementer på datoen " + inputDato +"\n");
        }
    }

    public void arrangementerInnenforTidsrom(){
        System.out.println("Skriv inn startdato og sluttdato for tidsrommet du ønsker å undersøke arrangementer i (YYYYMMDD)");
        System.out.print("Startdato: ");
        int startdato = sc.nextInt();
        sc.nextLine();
        System.out.print("Sluttdato: ");
        int sluttdato = sc.nextInt();
        sc.nextLine();

        int teller = 0;
        for (int i = 0; i < antall; i++) {
            Arrangement a = Arrangementer[i];
            int dato = (int)(a.getTidspunkt() / 10000);
            if (startdato <= dato && dato <= sluttdato) {
                teller++;
            }
        }

        if (teller == 0) {
            System.out.println("\nDet er ingen arrangement mellom " + startdato + " og " + sluttdato + "\n");
            return;
        }

        Arrangement[] treff = new Arrangement[teller];
        int indeks = 0;

        for (int i=0; i < antall; i++){
            Arrangement a = Arrangementer[i];
            int dato = (int)(a.getTidspunkt() / 10000);
            if (startdato <= dato && dato <= sluttdato){
                treff [indeks] = a;
                indeks ++;
            }          
        }
  
        for(int i = 0; i < treff.length-1;i++){
            for(int j = 0; j < treff.length-1-i; j++){
                if(treff[j].getTidspunkt() > treff[j+1].getTidspunkt()){
                    Arrangement temp = treff[j];
                    treff[j] = treff[j+1];
                    treff[j+1] = temp;
                }
            }
        }
        if(teller != 0){
            System.out.println("Arrangementene som er mellom " + startdato + " og " + sluttdato + " er:\n");
            for(int i = 0; i < treff.length; i++){
                System.out.println(treff[i] + "\n");
            }
        }
    }


    public void alleArrangementer(){
        System.out.println("Vil du liste opp arrangementene etter sted, type eller tidspunkt?");
        String valg = sc.nextLine();
            switch (valg) {
                case "sted":
                    alleArrangementerSted();
                    break;
                
                case "type":
                    alleArrangementerType();
                    break;

                case "tidspunkt":
                    alleArrangementerDato();
                    break;

                default:
                    break;
            }
    }

    public void alleArrangementerSted(){
        if (antall == 0){
            System.out.println("Det er ingen registrerte arrangementer");
            return;
        }
        
        Arrangement[] kopi = new Arrangement[antall];
        for(int i = 0; i < antall; i++){
            kopi[i] = Arrangementer [i];
        }  

        for(int i = 0; i < kopi.length - 1 ; i++){
            for(int j = 0; j < kopi.length - 1 -i; j++){
                String sted1 = kopi[j].getSted();
                String sted2 = kopi[j+1].getSted();
                if (sted1.compareToIgnoreCase(sted2)>0){
                    Arrangement temp = kopi[j];
                    kopi[j] = kopi[j+1];
                    kopi[j+1] = temp;
                }
            }
        }
        
        System.out.println("Alle arrangementer rangert etter sted: \n");
        for(int i = 0; i < kopi.length; i++){
            System.out.println(kopi[i] + "\n");
        }

    }

    public void alleArrangementerType(){
            if (antall == 0){
            System.out.println("Det er ingen registrerte arrangementer");
            return;
        }
        
        Arrangement[] kopi = new Arrangement[antall];
        for(int i = 0; i < antall; i++){
            kopi[i] = Arrangementer [i];
        }  

        for(int i = 0; i < kopi.length - 1 ; i++){
            for(int j = 0; j < kopi.length - 1 -i; j++){
                String sted1 = kopi[j].getTypeArrangement();
                String sted2 = kopi[j+1].getTypeArrangement();
                if (sted1.compareToIgnoreCase(sted2)>0){
                    Arrangement temp = kopi[j];
                    kopi[j] = kopi[j+1];
                    kopi[j+1] = temp;
                }
            }
        }
        
        System.out.println("Alle arrangementer rangert etter type arrangement: \n");
        for(int i = 0; i < kopi.length; i++){
            System.out.println(kopi[i] + "\n");
        }

    }


    public void alleArrangementerDato(){
        if (antall == 0){
            System.out.println("Det er ingen registrerte arrangementer");
            return;
        }

        Arrangement[] kopi = new Arrangement[antall];
        for(int i = 0; i < antall; i++){
            kopi[i] = Arrangementer [i];
        }  
 
        for(int i = 0; i < kopi.length-1;i++){
            for(int j = 0; j < kopi.length-1-i; j++){
                if(kopi[j].getTidspunkt() > kopi[j+1].getTidspunkt()){
                    Arrangement temp = kopi[j];
                    kopi[j] = kopi[j+1];
                    kopi[j+1] = temp;
                }
            }
        }
        
        System.out.println("Alle arrangementer etter dato:\n");
            for(int i = 0; i < kopi.length; i++){
                System.out.println(kopi[i] + "\n");
            }
    }


}