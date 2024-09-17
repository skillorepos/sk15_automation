package lecture14.examples.parallel;

import org.testng.annotations.Test;

public class NetworkTests {

    @Test
    public void testApiCall() throws InterruptedException {
        System.out.println("NetworkTests - testApiCall: Simulating API call...");
        Thread.sleep(2000); // 2 seconds delay
        System.out.println("NetworkTests - testApiCall: Simulating API call: Completed!");
    }

    @Test
    public void testFileUpload() throws InterruptedException {
        System.out.println("NetworkTests - testFileUpload: Simulating file upload...");
        Thread.sleep(9000); // 9 seconds delay
        System.out.println("NetworkTests - testFileUpload: Simulating file upload: Completed!");
    }
}
