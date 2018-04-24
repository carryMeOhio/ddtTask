import org.testng.Assert;
import org.testng.annotations.Test;

import static java.lang.System.out;

public class FactoryTest {

    private int firstNUmber;
    private int secondNUmber;
    private int result;

    public FactoryTest(int firstNUmber, int secondNUmber, int result) {
        this.firstNUmber = firstNUmber;
        this.secondNUmber = secondNUmber;
        this.result = result;
    }

    @Test
    public void verifySum() {
        out.println("Verify sum of " + firstNUmber + " and " + secondNUmber);
        Assert.assertEquals(firstNUmber + secondNUmber, result);
    }



}
