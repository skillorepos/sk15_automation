package lecture14.examples.after;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

/**
 * Demo AfterSuite annotation
 */
public class DatabaseTests {

    @AfterSuite
    public void tearDownDatabase() {
        System.out.println("Database Tests: Closing database connection");
        // Code to close database connection
    }

    @Test
    public void testDatabaseQuery1() {
        System.out.println("Database Tests: Executing database query 1");
        // Code to execute database query 1
    }

    @Test
    public void testDatabaseQuery2() {
        System.out.println("Database Tests: Executing database query 2");
        // Code to execute database query 2
    }
}
