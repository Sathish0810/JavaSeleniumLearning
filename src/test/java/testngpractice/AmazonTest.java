package testngpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonTest {
    WebDriver driver;
    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://www.amazon.in/");

    }
    @Test
    public void loginTest() {
    String Title=driver.getTitle();
    System.out.println(Title);
    Assert.assertEquals(Title,"11Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");


    }
}
