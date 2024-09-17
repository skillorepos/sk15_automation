package lecture14.examples.assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Demo Hard assertions
 */
public class CalculatorTests {

    @Test
    public void testAddition() {
        int actualSum = 10 + 5;
        int expectedSum = 15;
        Assert.assertEquals(actualSum, expectedSum, "Sum is incorrect!");
        System.out.println("testAddition passed.");
    }

    @Test
    public void testSubtraction() {
        int actualDifference = 10 - 5;
        int expectedDifference = 5;
        Assert.assertEquals(actualDifference, expectedDifference, "Difference is incorrect!");
        System.out.println("testSubtraction passed.");
    }

    @Test
    public void testMultiplication() {
        int actualProduct = 10 * 5;
        int expectedProduct = 50;
        Assert.assertEquals(actualProduct, expectedProduct, "Product is incorrect!");
        System.out.println("testMultiplication passed.");
    }

    @Test
    public void testDivision() {
        int actualQuotient = 10 / 5;
        int expectedQuotient = 2;
        Assert.assertEquals(actualQuotient, expectedQuotient, "Quotient is incorrect!");
        System.out.println("testDivision passed.");
    }

    @Test
    public void testNonEquality() {
        int actualValue = 10;
        int unexpectedValue = 5;
        Assert.assertNotEquals(actualValue, unexpectedValue, "Values should not be equal!");
        System.out.println("testNonEquality passed.");
    }

    @Test
    public void testPositiveCondition() {
        boolean condition = (10 > 5);
        Assert.assertTrue(condition, "Condition is not true!");
        System.out.println("testPositiveCondition passed.");
    }

    @Test
    public void testNegativeCondition() {
        boolean condition = (5 > 10);
        Assert.assertFalse(condition, "Condition is not false!");
        System.out.println("testNegativeCondition passed.");
    }
}
