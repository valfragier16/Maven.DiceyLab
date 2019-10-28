import org.junit.Test;
import org.junit.Assert;
import java.util.Arrays;
import org.junit.runners.JUnit4;
import static org.junit.Assert.*;

public class TestBin {

    @Test
    public void incrementTest() {

        Bins firstBin = new Bins(13);

        firstBin.increment(5);
        firstBin.increment(5);

        Integer expected = 2;
        Integer actual = firstBin.getNum(5);

        Assert.assertEquals(expected, actual);
    }
}