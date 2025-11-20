public class Dish{
    private String navn;
    private String type;
    private int pris;
    private String oppskrift;

    public Dish(String navn, String type, int pris, String oppskrift){
        this.navn = navn;
        this.type = type;
        this.pris = pris;
        this.oppskrift = oppskrift;
    }

    public String getName(){
        return navn;
    }
    public String getType(){
        return type;
    }
    public int getPris(){
        return pris;
    }
    public String getOppskrift(){
        return oppskrift;
    }

    public String toString(){
        return "\nRett: " + navn +
             "\nType: " + type +
             "\nPris: " + pris +
             "\nOppskriften: " + oppskrift;
    }
}