import java.util.GregorianCalendar;

public class ArbTaker {
    private Person personalia;
    private int arbtakernr;
    private int ansettelsesår;
    private int månedslønn;
    private double skatteprosent;

    GregorianCalendar kalender = new java.util.GregorianCalendar();
    int år = kalender.get(GregorianCalendar.YEAR);

public ArbTaker(Person personalia, int arbtakernr, int ansettelsesår, int månedslønn, double skatteprosent){
    this.personalia = personalia; 
    this.arbtakernr = arbtakernr;
    this.ansettelsesår = ansettelsesår;
    this.månedslønn = månedslønn;  //Endres
    this. skatteprosent = skatteprosent; //Endres

}

public Person getPersonalia() {
    return personalia;
}
public int getArbtakernr() {
    return arbtakernr;
}
public int getAnsettelsesår() {
    return ansettelsesår;
}
public int getMånedslønn() {
    return månedslønn;
}
public double getSkatteprosent() {
    return skatteprosent;
}

public double skattetrekkPerMåned(){
    double månedstrekk = månedslønn * (skatteprosent /100);
    return månedstrekk;
}
public int bruttoLønn(){
    return månedslønn * 12;
}
public double skattetrekkPerÅr(){
    double årstrekk = skattetrekkPerMåned() * 10.5;
    return årstrekk;
}
public String fulltNavn(){
    return personalia.getEtternavn() + ", " + personalia.getFornavn();
}
public int alder(){
    return år - personalia.getFødselsår();
}
public int antallÅrAnsatt(){
    return år - ansettelsesår;
}
public String ansattaMerEnGittAntallÅr(int i){
    if(antallÅrAnsatt() > i){
        return "Den ansatte har vært ansatt lengre  enn " + i + " år";
    }
    else if(antallÅrAnsatt() == i){
        return "Den ansatte har vært ansatt i akkurat " + i + " år";
    }
    else{
        return "Den ansatte har ikke vært ansatt i  " + i + " år";
    }
}
public void setMånedslønn(int nyMånedslønn){
    månedslønn = nyMånedslønn;
}
public void setSkatteprosent(double nySkatteprosent){
    skatteprosent = nySkatteprosent;
}
}

