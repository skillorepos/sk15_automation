package lecture14.examples.after;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

/**
 * Demo AfterClass annotation
 */
public class APITests {

    private String authToken;

    @AfterClass
    public void logout() {
        System.out.println("Logging out and invalidating auth token");
        // Code to log out and invalidate auth token
        authToken = null;
    }

    @Test
    public void testGetEndpoint() {
        System.out.println("Executing GET endpoint test with auth token: " + authToken);
        // Code to test GET endpoint
    }

    @Test
    public void testPostEndpoint() {
        System.out.println("Executing POST endpoint test with auth token: " + authToken);
        // Code to test POST endpoint
    }
}
