import java.util.Random;

public class Spiller {
    private int sumPoeng;

    public Spiller(int sumPoeng){
        this.sumPoeng = sumPoeng;
    }

    public int getSumPoeng(){
        return sumPoeng;
    }

    public void kastTerning(){
        Random terning = new Random();
        int terningkast = terning.nextInt(6) + 1;
        if (terningkast == 1){
            sumPoeng = 0;
        }
        else{
            if(sumPoeng + terningkast > 100){
                sumPoeng -= terningkast;
            }
            else{
                sumPoeng += terningkast;
            }
        }
    }

    public boolean erFerdig(){
        return sumPoeng == 100;
    }


}
