public class Arrangement{
    private int arrangementNr;
    private String name;
    private String sted;
    private String arrangør;
    private String typeArrangement;
    private long tidspunkt;
 
    public Arrangement(int arrangementNr, String name, String sted, String arrangør, String typeArrangement, long tidspunkt){
        this.arrangementNr = arrangementNr;
        this.name = name;
        this.sted = sted;
        this.arrangør = arrangør;
        this.typeArrangement = typeArrangement;
        this.tidspunkt = tidspunkt;
    }

    public int getArrangementNr(){
        return arrangementNr;
    }
    public String getName(){
        return name;
    }
    public String getSted(){
        return sted;
    }
    public String getArrangør(){
        return arrangør;
    }
    public String getTypeArrangement(){
        return typeArrangement;
    }
    public long getTidspunkt(){
        return tidspunkt;
    }

    public String toString(){
        return "Arrangement Nr: " + arrangementNr +
               "\n " + name +
               "\n | Sted: " + sted +
               "\n | Arrangør: " + arrangør +
               "\n | Type: " + typeArrangement +
               "\n | Tidspunkt: " + tidspunkt;
    }
}