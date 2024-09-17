package lecture14.examples.assertions;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

// Demo Soft Assertions
public class UserManagementTests {

    @Test
    public void testUserCreation() {
        SoftAssert softAssert = new SoftAssert();

        String actualUsername = "john_doe";
        String expectedUsername = "john_doe";
        softAssert.assertEquals(actualUsername, expectedUsername, "Username is incorrect!");

        int actualAge = 30;
        int expectedAge = 30;
        softAssert.assertEquals(actualAge, expectedAge, "Age is incorrect!");

        softAssert.assertAll();
    }

    @Test
    public void testUserPermissions() {
        SoftAssert softAssert = new SoftAssert();

        boolean isAdmin = true;
        softAssert.assertTrue(isAdmin, "User should be an admin!");

        boolean hasWriteAccess = false;
        softAssert.assertFalse(hasWriteAccess, "User should not have write access!");

        softAssert.assertAll();
    }
}
