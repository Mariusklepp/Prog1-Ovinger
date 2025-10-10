import java.util.Random;

public class Tabell {
    private int[] tabell; //forteller bare at den finns, har ikke laget eller brukt enda
    private Random random; //forteller at vi også skal ha et objekt som heter random

    public Tabell(){       //konstruktøren er liksom planen på hvordan dette objktet over skal lages. når denne kjøres vil "tabell" bli laget. konstruktøren MÅ ha samme navn som klassen. brukes til å sette opp startverdier for klassen
        tabell = new int [10];      //her sier vi at tabellen, som vi har sagt ovenfor skal finnes, at skal bli laget og at den skal være et array med 10 ledige plasser
        random = new Random();
    }
    
    public void kjorSimulering(int n){ //lager en method for å kjøre løkken og putte tallene inn i tabellen
        for(int i = 0; i < n; i++){ //en for løkke for løkke som går helt til det tallet "n" man velger å bruke
            int tall = random.nextInt(10); //bestemmer et random tall fra 0 til 9 hver gang løkken går
            tabell[tall]++; //legger tallet inn i tabellen vi har definert tidligere
        }
    }
    public void skrivUtTabell(){        //lager en method som skriver ut tabekllen
        for (int i = 0; i < tabell.length; i++){        //for løkkke for å gå gjennom hele tabellen
            System.out.println("Tallet " + i + " ble trukket ut " + tabell[i] + " ganger av tilfeldighetsgeneratoren."); //skriver ut hvert enkelt tall i tabellen.
        }
    }
}
