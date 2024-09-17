package lecture14.examples.before;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Demo of using @BeforeClass annotation
 */
public class APITests {

    private String authToken;

    @BeforeClass
    public void authenticate() {
        System.out.println("Authenticating and obtaining auth token");
        // Code to authenticate and obtain auth token
        authToken = "sampleAuthToken";
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
