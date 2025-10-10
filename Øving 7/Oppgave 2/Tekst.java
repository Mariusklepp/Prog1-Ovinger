public class Tekst {

    private String tekst;

    public Tekst(String tekst){
        this.tekst = tekst;
    }

    public int antallOrd(){
        String renTekst = tekst.replaceAll("[^\\p{L}\\p{Nd}]+", " ").trim();
        if (renTekst.length() == 0){
            return 0;
        }
        String[] ordliste = renTekst.split("\\s+");
        return ordliste.length;
    }

    public double gjennomsnittligOrdlengde(){
        String renTekst = tekst.replaceAll("[^\\p{L}\\p{Nd}]+", " ").trim();
        String[] ordliste = renTekst.split("\\s+");

        if (ordliste.length == 0){
            return 0;
        }

        int sumBokstaver = 0;
        for (String ord : ordliste) {
            sumBokstaver += ord.length();
        }

        double gjennomsnittet = (double) sumBokstaver / ordliste.length;
        return gjennomsnittet;
    }
    
    public double gjennomsnittligOrdPerPeriode(){
        int periode = 0;
        for(int i = 0; i < tekst.length(); i++ ){
            char c = tekst.charAt(i);
            if (c == '.' || c == ':' || c == '!' || c == '?'){
               periode += 1;
            }
        }
        String renTekst = tekst.replaceAll("[^\\p{L}\\p{Nd}]+", " ").trim();
        String[] antallOrd = renTekst.split("\\s+");

        double gjennomsnitligPerPeriode = (double) antallOrd.length / periode;
        return gjennomsnitligPerPeriode;
    }

    public String erstatteOrd(String bytteOrd, String inputOrd){
        String[] ordliste = tekst.split("\\s+");
            for(int i = 0; i > ordliste.length; i++){
                if(ordliste[i].equals(bytteOrd)){
                    ordliste[i] = inputOrd;
                }
            }
        String nyTekst = String.join(" ", ordliste);
        return nyTekst;
    }   
    public String tekstenUtenEndringer(){
        return tekst;

    }

    public String tekstenMedStoreBokstaver(){
        tekst = tekst.toUpperCase();
        return tekst;
    }
}
