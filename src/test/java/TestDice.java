import org.junit.Assert;
import org.junit.Test;
import java.util.Arrays;
import static org.junit.Assert.*;

//@RunsWith(JunitParamsRunner.class)
public class TestDice {

    @Test
    public void numberOfDiceTest(){
        Integer numberOfDice = 0;

        Integer expected = 0;
        Integer actual = numberOfDice;

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void rollTest(){
        Dice die = new Dice(100);

        die.roll();

    }
}
