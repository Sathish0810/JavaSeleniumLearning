package testngpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class OpenCartLoginSearchTest extends BaseTest {

    @Test(priority = 1)
    public void doTitleTest()
    {
        String Title=driver.getTitle();
        Assert.assertEquals(Title, "Your Store");

    }
    @Test(priority = 2)
    public void isSearchExists()
    {
        boolean flag=driver.findElement(By.name("search")).isDisplayed();
        Assert.assertTrue(flag);
    }
}
