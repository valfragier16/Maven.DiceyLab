
public class Bins {

    Integer[] numTallies;

    //constructor
    public Bins(int size){
        this.numTallies = new Integer[size];
        for(int i = 0; i < numTallies.length; i++){
            numTallies[i] = 0;
        }
    }

    public void increment(int index){
        numTallies[index]+= 1;
    }

    public int getNum(int num){
       return numTallies[num];

    }
}
