package SeleniumLearnings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplayedText {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=common/home");
		By imgElement = By.className("img-responsive");
		By searchElement = By.cssSelector("#search > input");
		By searchBtn = By.cssSelector("#search > span > button");

//    System.out.println(driver.findElement(By.className("img-responsive")).isDisplayed());
//    System.out.println(driver.findElement(By.cssSelector("#search > input")).isDisplayed());
//    if(driver.findElement(By.cssSelector("#search > input")).isDisplayed())
//    {
//    	driver.findElement(By.cssSelector("#search > input")).sendKeys("macbook");
//    	driver.findElement(By.cssSelector("#search > span > button")).click();
		if (doElementIsDisplayed(imgElement)) {
			System.out.println("Test case PASSED");
		}
		if (doElementIsDisplayed(searchElement)) {
			doSendKeys(searchElement, "macbook");
			doClick(searchBtn);
		}
//    }

	}

	public static boolean doElementIsDisplayed(By Locator) {
		return findElement1(Locator).isDisplayed();

	}

	public static WebElement findElement1(By Locator) {
		return driver.findElement(Locator);
	}

	public static void doSendKeys(By Locator, String Value) {
		findElement1(Locator).sendKeys(Value);
	}

	public static void doClick(By Locator) {
		findElement1(Locator).click();
	}

}
