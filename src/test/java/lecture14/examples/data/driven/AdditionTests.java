package lecture14.examples.data.driven;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AdditionTests {

    @DataProvider(name = "additionData")
    public Object[][] createAdditionData() {
        return new Object[][]{
                {1, 2, 3},
                {-1, 1, 0},
                {0, 0, 0},
                {100, 200, 300}
        };
    }

    @Test(dataProvider = "additionData")
    public void testAddition(int a, int b, int expectedSum) {
        int actualSum = a + b;
        Assert.assertEquals(expectedSum, actualSum, "Expected " + expectedSum + " but got " + actualSum);
    }
}
