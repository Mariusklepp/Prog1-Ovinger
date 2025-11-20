public class Brok {
    private int teller;
    private int nevner;

    public Brok(int teller, int nevner){
            if (nevner == 0) {
        throw new IllegalArgumentException("Nevner kan ikke være 0");}
        this.teller = teller;
        this.nevner = nevner;
    }
    
    public Brok(int teller){
        this.teller = teller;
        this.nevner = 1;
    }
    
    public void skrivUt() {
        System.out.println(teller + "/" + nevner);
    }

    private int sfd(int teller, int nevner){ //største felles divisor
        teller = Math.abs(teller); // gjør tallene positive (vi bryr oss ikke om fortegn)
        nevner = Math.abs(nevner);

        while (nevner != 0) {
            int rest = teller % nevner;
            teller = nevner;
            nevner = rest;
        }
        return teller;
    }

    public void forenkle() {
        int divisor = sfd(teller, nevner);
        teller /= divisor;
        nevner /= divisor;
    }

    public void summer(Brok annen){
        teller = teller *annen.nevner + annen.teller * nevner;
        nevner = nevner * annen.nevner;
        forenkle();
    }

    public void subtraher(Brok annen){
        teller = teller * annen.nevner - annen.teller * nevner;
        nevner = nevner * annen.nevner;
        forenkle();
    }

    public void multipliser(Brok annen){
        teller = teller * annen.teller;
        nevner = nevner * annen.nevner;
        forenkle();
    }

    public void divider(Brok annen){
        teller = teller * annen.nevner;
        nevner = nevner * annen.teller;
        forenkle();
    }
}