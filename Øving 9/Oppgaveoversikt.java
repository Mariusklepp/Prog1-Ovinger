public class Oppgaveoversikt {
    private Student[] studenter;
    private int antStud = 0;


    public Oppgaveoversikt(){
        studenter = new Student[antStud];
    }


    public int antallStudenter(){
        return antStud;
    }

    public  int antallOppgaver(String navn){
        for (int i = 0; i < antStud; i++) {
            if (studenter[i].getNavn().equals(navn)) {
                int resultat = studenter[i].getAntOppg();
                return resultat;
            }
        }
        throw new IllegalArgumentException("Fant ikke studenten med navn :"+ navn);
    }

    public void nyStudent(String navn){
        for (int i = 0; i < antStud; i++) {
            if (studenter[i].getNavn().equals(navn)) {
                throw new IllegalArgumentException("Student med navn '" + navn + "' finnes allerede");
            }
        }

        Student[] ny = new Student[antStud + 1];
        for(int i = 0; i < antStud; i++){
            ny [i] = studenter [i];
        }
        ny [antStud] = new Student(navn);
        studenter = ny;

        antStud++;
    }

    public void økOppgaver(String navn, int oppgaver){
        for (int i = 0; i < antStud; i++) {
            if (studenter[i].getNavn().equals(navn)) {
                studenter[i].økAntOppg(oppgaver);
                return;
            }
        }
        throw new IllegalArgumentException("Fant ikke studenten med navn :"+ navn);
    }
}
