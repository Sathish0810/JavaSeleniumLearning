package SeleniumLearnings;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollUsingActions {

	public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.amazon.in/");
    Actions act=new Actions(driver);
    act.keyDown(Keys.CONTROL).sendKeys(Keys.END).build().perform();
    act.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).build().perform();

	}

}
