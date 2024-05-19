package SeleniumLearnings;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CopyPasteUsingKeyboardActions {

	public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.facebook.com/");
    driver.findElement(By.id("email")).sendKeys("sathish");
    Actions act=new Actions(driver);
    act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
    act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
    driver.findElement(By.id("pass")).click();
    act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();


    
	}

}
