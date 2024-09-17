package lecture14.examples.before;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class DatabaseTests {

    @BeforeSuite
    public void setUpDatabase() {
        System.out.println("Database Tests: Setting up database connection");
        // Code to set up database connection
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
