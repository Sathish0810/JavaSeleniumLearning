package SeleniumLearnings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDragAndDrop {

	public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
    Actions act=new Actions(driver);
    driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
    WebElement sourceEle=driver.findElement(By.cssSelector("div#draggable"));
    WebElement destEle=driver.findElement(By.cssSelector("div#droppable"));

    act.clickAndHold(sourceEle).moveToElement(destEle).release().build().perform();
	}

}
