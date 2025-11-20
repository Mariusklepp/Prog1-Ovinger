public class Nystring {
    
    private String tekst;


    public Nystring(String tekst){
        this.tekst = tekst;
    }   

    public String forkortelse(){

        StringBuilder resultat = new StringBuilder();

        String[] ordliste = tekst.split(" ");
            for (String ord : ordliste){
                if (ord.length() > 0){
                    char førsteBokstav = ord.charAt(0);
                    resultat.append(førsteBokstav);
                }
            }
    return resultat.toString();
    }   

    public String fjerningAvTegn(String tegn){  //kunne også brukt stringbuilder her men velger å ikke gjøre det siden det står spesifikt i oppgaven at vi skal bruke indexof og substring.
        while(tekst.indexOf(tegn) != -1){
            int pos = tekst.indexOf(tegn);
            tekst = tekst.substring(0, pos) + tekst.substring(pos + tegn.length());
        }
    return tekst;
    }

}
