package testngpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HandleNegativeTestCases {

    static WebDriver driver;

    @BeforeTest
    public void setup() {
        driver = new ChromeDriver();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

    }
    public boolean doLogin(String userName, String password)
    {
        driver.findElement(By.id("input-email")).clear();
        driver.findElement(By.id("input-email")).sendKeys(userName);
        driver.findElement(By.id("input-password")).clear();
        driver.findElement(By.id("input-password")).sendKeys(password);
        driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
        String alertMessage=driver.findElement(By.cssSelector("div.alert.alert-danger.alert-dismissible")).getText();
        if(alertMessage.contains("Warning: Your account has exceeded allowed"))
        {
            return true;
        }

            return false;

    }
    @DataProvider
    public Object[][] negativeTestDataSet()
    {
        return new Object[][]{
                {"Sathish1", "Sathish"},
                {"Neela", "Neela"},
                {"Test", "Test"},

        };
    }

    @Test (dataProvider="negativeTestDataSet")
    public void validateNegativeTest(String userName, String pwd)
    {
        boolean flag=doLogin("test","test");
        Assert.assertTrue(flag);
    }
    @AfterTest
    public void teatDown()
    {
        //driver.quit();
    }




}
