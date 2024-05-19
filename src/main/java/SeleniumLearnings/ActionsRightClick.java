package SeleniumLearnings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsRightClick {

	public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
    Actions action=new Actions(driver);
    driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
    action.contextClick(driver.findElement(By.xpath("//span[text()='right click me']"))).build().perform();
		
		

	}

}
