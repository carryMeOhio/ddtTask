import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static java.lang.System.out;

public class ParametersTest {

    @Test
    @Parameters({"firstNumber", "secondNumber", "result"})
    public void verifySum(String firstNumber, String secondNumber, String result) {
        out.println("Verify sum of " + firstNumber + " and " + secondNumber);
        Assert.assertEquals(Integer.parseInt(firstNumber) +
            Integer.parseInt(secondNumber), Integer.parseInt(result));
    }

}
