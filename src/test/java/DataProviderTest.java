import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static java.lang.System.out;

public class DataProviderTest {

    @DataProvider
    public Object[][] getSum() {
        return new Object[][] {{2, 4, 6}, {5, 6, 11}};
    }

    @Test (dataProvider = "getSum")
    public void verifySum(int firstNumber, int secondNumber, int sum) {
        out.println("Verify sum of " + firstNumber + " and " + secondNumber);
        Assert.assertEquals(firstNumber + secondNumber, sum);
    }
}
