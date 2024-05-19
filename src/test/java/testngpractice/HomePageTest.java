package testngpractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomePageTest {

    @BeforeSuite
    public void startDbConnection() {
        System.out.println("Start DB Connection");
    }

    @BeforeTest
    public void createUser() {
        System.out.println("Start DB Connection");
    }

    @BeforeClass
    public void openBrowser() {
        System.out.println("Start DB Connection");
    }

    @BeforeMethod
    public void loginto() {
        System.out.println("Start DB Connection");
    }

    @Test
    public void homepageTitleTest() {
        System.out.println("homepageTitleTest");
    }

    @Test
    public void homepageUrlTest() {
        System.out.println("homepageUrlTest");
    }

    @Test
    public void homepageHeaderTest() {
        System.out.println("homepageHeaderTest");
    }

    @AfterMethod
    public void logOut() {
        System.out.println("Logout");
    }

    @AfterClass
    public void closeBrowser() {
        System.out.println("closeBrowser");
    }

    @AfterTest
    public void deleteUser() {
        System.out.println("deleteUser");
    }

    @AfterSuite
    public void disconnectDB() {
        System.out.println("disconnectDB");
    }


}
