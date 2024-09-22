package lecture16;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class BasicCommandsTests {
    @Test
    public void testBrowserCommands() {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        //Open the browser and navigate to the page
        driver.get("http://training.skillo-bg.com:4300/posts/all");

        //Get the title of the page
        String title = driver.getTitle();
        System.out.println("The title of the page is: " + title);

        //Get the URL of the page
        String url = driver.getCurrentUrl();
        System.out.println("The URL of the page is: " + url);

        //Maximize the browser window
        driver.manage().window().maximize();
    }

    @Test
    public void testCloseAndQuit() {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Open the first URL
        driver.get("http://training.skillo-bg.com:4300/posts/all");
        System.out.println("First URL opened in the first window");

        // Open a second browser window
        openNewWindow(driver, "http://training.skillo-bg.com:4300/users/login");
        System.out.println("Second URL opened in the second window");

        // Open a third browser window
        openNewWindow(driver, "http://training.skillo-bg.com:4300/users/register");
        System.out.println("Third URL opened in the third window");

        // Close the third browser window
        driver.close();
        System.out.println("Third window closed");

        // Quit the browser session - all windows are closed
        driver.quit();
        System.out.println("All windows are closed");
    }

    private void openNewWindow(ChromeDriver driver, String url) {
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get(url);
    }

    @Test
    public void testFindElement() {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://training.skillo-bg.com:4200/posts/all");
        driver.manage().window().maximize();
        WebElement login = driver.findElement(By.id("nav-link-login"));
        driver.quit();
    }

    @Test
    public void testFindElement1() {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://training.skillo-bg.com:4300/posts/all");

        //Finds Login link which you can use to interact with on a later stage
        WebElement loginElement = driver.findElement(By.id("nav-link-login"));

        //Finds Home link which you can use to interact with on a later stage
        WebElement homeElement = driver.findElement(By.linkText("Home"));

        driver.quit();
    }

    @Test
    public void testFindElements() {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://training.skillo-bg.com:4300/posts/all");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Finds all posts elements
        List<WebElement> posts = driver.findElements(By.xpath("//*[@class='post-feed-img']"));
        System.out.println("The number of post elements is: " + posts.size());
        driver.quit();
    }

    @Test
    public void testGetText() {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("http://training.skillo-bg.com:4300/posts/all");

        WebElement login = driver.findElement(By.id("nav-link-login"));

        String loginText = login.getText();
        System.out.println("The text of the login element is: " + loginText);

        driver.quit();
    }

    @Test
    public void testClick() {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("http://training.skillo-bg.com:4300/posts/all");

        WebElement login = driver.findElement(By.id("nav-link-login"));

        login.click();

        driver.quit();
    }

    @Test
    public void testSendKeys() {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("http://training.skillo-bg.com:4300/posts/all");

        WebElement login = driver.findElement(By.id("nav-link-login"));
        login.click();
        WebElement username = driver.findElement(By.id("defaultLoginFormUsername"));

        //type in username field
        username.sendKeys("test");
        driver.quit();
    }

    @Test
    public void testClear() {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("http://training.skillo-bg.com:4300/posts/all");

        WebElement login = driver.findElement(By.id("nav-link-login"));
        login.click();
        WebElement username = driver.findElement(By.id("defaultLoginFormUsername"));

        //type in username field
        username.sendKeys("test");
        username.clear();

        driver.quit();
    }
}