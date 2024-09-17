package lecture14.examples.before;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DataTests {

    @BeforeMethod
    public void resetTestData() {
        System.out.println("Resetting test data");
        // Code to reset test data
    }

    @Test
    public void testDataProcessing1() {
        System.out.println("Executing data processing test 1");
        // Code to test data processing 1
    }

    @Test
    public void testDataProcessing2() {
        System.out.println("Executing data processing test 2");
        // Code to test data processing 2
    }
}
