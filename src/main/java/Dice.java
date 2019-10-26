import java.util.Random;

public class Dice {

    int numberOfDice = 0;

    // Constructor - creates objects/ sets initial properties
    public Dice(int numberOfDice){
        this.numberOfDice = numberOfDice;
    }

    public int roll() {
        Integer sum = 0;
        for(int i = 0; i < numberOfDice; i++) {
            Integer die = (int) (Math.random() * 6) + 1;
            // System.out.print(die + " " + "\n");
            sum += die;

        }
        return sum;

    }

}

