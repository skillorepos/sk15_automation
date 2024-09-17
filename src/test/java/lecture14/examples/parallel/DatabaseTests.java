package lecture14.examples.parallel;

import org.testng.annotations.Test;

public class DatabaseTests {

    @Test
    public void testDatabaseConnection() throws InterruptedException {
        System.out.println("DatabaseTests - testDatabaseConnection: Simulating database connection...");
        Thread.sleep(4000); // 4 second delay
        System.out.println("DatabaseTests - testDatabaseConnection: Simulating database connection: Connected!");
    }

    @Test
    public void testDataProcessing() throws InterruptedException {
        System.out.println("DatabaseTests - testDataProcessing: Simulating data processing...");
        Thread.sleep(6000); // 6 seconds delay
        System.out.println("DatabaseTests - testDataProcessing: Simulating data processing: Completed!");
    }
}
