
public class Tekstanalyse{
    private int[] antallTegn = new int[30];

    public Tekstanalyse(String tekst){
        tekst = tekst.toLowerCase();

        for(int i = 0; i < tekst.length(); i++){
            char c = tekst.charAt(i);

            int indeks;
            if (c>='a' && c<='z'){
                indeks = c - 'a';}
            else if(c == 'æ'){
                indeks = 26;
            }
            else if(c == 'ø'){
                indeks = 27;
            }
            else if(c == 'å'){
                indeks = 28;
            }
            else{
                indeks = 29;
            }
            antallTegn[indeks]++;
                
        }
    }
    public void forskjelligeBokstaver(){
        int forskjellige = 0;
        for (int i = 0; i <= 28; i++) {
            if (antallTegn[i] > 0) {
                forskjellige++;
            }
       }
    System.out.println("I denne teksten er det " + forskjellige + " forskjellige bokstaver.");
    }

    public void antallBokstaver(){
        int sum = 0;
        for (int i = 0; i < 29; i++){
            sum = sum + antallTegn[i];
        }
        System.out.println("I denne teksten er det " + sum + " bokstaver.");
    }

    public void prosentIkkeBokstaver() {
    int total = 0;
    for (int i = 0; i < antallTegn.length; i++) {
        total += antallTegn[i];
    }
    double prosent = 100.0 * antallTegn[29] / total;
    System.out.printf("Ikke-bokstaver utgjør %.2f%% av teksten.%n", prosent);
    }

    public void forekomstAvBokstav(char bokstav) {
    bokstav = Character.toLowerCase(bokstav);
    int indeks;
    if (bokstav >= 'a' && bokstav <= 'z') {
        indeks = bokstav - 'a';
    } else if (bokstav == 'æ') {
        indeks = 26;
    } else if (bokstav == 'ø') {
        indeks = 27;
    } else if (bokstav == 'å') {
        indeks = 28;
    } else {
        indeks = 29;
    }
    System.out.println("Bokstaven '" + bokstav + "' forekommer " + antallTegn[indeks] + " ganger.");
    }


    public void vanligsteBokstaver() {
    int maks = 0;
    for (int i = 0; i <= 28; i++) {
        if (antallTegn[i] > maks) {
            maks = antallTegn[i];
        }
    }
    System.out.print("Mest brukte bokstav(er): ");
    for (int i = 0; i <= 28; i++) {
        if (antallTegn[i] == maks && maks > 0) {
            char bokstav;
            if (i < 26) bokstav = (char) ('a' + i);
            else if (i == 26) bokstav = 'æ';
            else if (i == 27) bokstav = 'ø';
            else bokstav = 'å';
            System.out.print(bokstav + " ");
        }
    }
    System.out.println("(forekommer " + maks + " ganger)");
    }
}