package SeleniumLearnings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionMoveToElement {

	public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
    Actions act=new Actions(driver);
    driver.get("http://mrbool.com/");
    WebElement menuElement=driver.findElement(By.xpath("//a[@class='menulink']"));
    act.moveToElement(menuElement).build().perform();
	}

}
