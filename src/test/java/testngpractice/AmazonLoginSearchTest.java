package testngpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class AmazonLoginSearchTest extends BaseTest {

    @Test(priority = 1)
    public void doTitleTest()
    {
        String Title=driver.getTitle();
        Assert.assertEquals(Title, "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");

    }
    @Test(priority = 2)
    public void isSearchExists()
    {
        boolean flag=driver.findElement(By.id("twotabsearchtextbox")).isDisplayed();
        Assert.assertTrue(flag);
    }

}
