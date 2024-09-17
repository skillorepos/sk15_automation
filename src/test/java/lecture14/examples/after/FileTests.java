package lecture14.examples.after;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class FileTests {

    @AfterMethod
    public void clearTempFiles() {
        System.out.println("Clearing temporary files");
        // Code to clear temporary files
    }

    @Test
    public void testFileProcessing1() {
        System.out.println("Executing file processing test 1");
        // Code to test file processing 1
    }

    @Test
    public void testFileProcessing2() {
        System.out.println("Executing file processing test 2");
        // Code to test file processing 2
    }
}
