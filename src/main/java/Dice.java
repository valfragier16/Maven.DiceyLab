import java.util.Random;

public class Dice {

    int numberOfDice = 0;

    // Constructor - creates objects/ sets initial properties
    public Dice(int numberOfDice){

        this.numberOfDice = numberOfDice;
    }

    public int roll() {
        return (int) (Math.random() * 6) + 1;

    }

}

