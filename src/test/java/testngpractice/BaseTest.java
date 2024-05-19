package testngpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.time.Duration;

public class BaseTest {

    WebDriver driver;
    @Parameters({"url", "browser"})
    @BeforeTest
    public void setUp(String url, String browser)
    {
        if(browser.equalsIgnoreCase("chrome"))
        {
            driver=new ChromeDriver();
        }
        else if(browser.equalsIgnoreCase("firefox"))
        {
            driver=new FirefoxDriver();
        }
        else if(browser.equalsIgnoreCase("edge"))
        {
            driver=new EdgeDriver();
        }
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get(url);
    }
    @AfterTest
    public void tearDown()
    {
        driver.quit();
    }
}
