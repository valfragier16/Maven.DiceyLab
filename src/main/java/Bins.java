
public class Bins {

    private int[] numTallies;

    //constructor
    public Bins(int size){
        this.numTallies = new int[size];
    }

    public void increment(int index){
        numTallies[index]+= 1;
    }

    public int getNum(int num){
       return numTallies[num];

    }
}
