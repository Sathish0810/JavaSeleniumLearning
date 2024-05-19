package SeleniumLearnings;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ShiftKeyBoardAction {

	public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.google.com/");
    Actions action=new Actions(driver);
    action.keyDown(driver.findElement(By.id("APjFqb")), Keys.SHIFT).sendKeys("sathish").build().perform();
;	}

}
