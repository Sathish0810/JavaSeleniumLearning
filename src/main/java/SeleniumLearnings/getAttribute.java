package SeleniumLearnings;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getAttribute {
	static WebDriver driver;
	public static void main(String[] args) {
    driver=new ChromeDriver();
    //driver.get("https://www.amazon.in/");
    driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
   // By linkList=By.tagName("a");
    By btnPri=By.cssSelector("#content > div > div:nth-child(1) > div > a");
    String attribute=getElementAtribute(btnPri, "href");
    System.out.println(attribute);
	}
	public static WebElement getElement(By Locator)
	{
		return driver.findElement(Locator);
	}
	
	public static String getElementAtribute(By Locator, String name)
	{
		return getElement(Locator).getAttribute(name);
	}

}
