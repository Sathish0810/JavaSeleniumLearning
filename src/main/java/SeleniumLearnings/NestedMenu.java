package SeleniumLearnings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NestedMenu {

	public static void main(String[] args) throws InterruptedException {
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.bigbasket.com/");
    Thread.sleep(3000);
    WebElement categoryElement=driver.findElement(By.id("headlessui-menu-button-:R5bab6:"));
    Actions action=new Actions(driver);
    action.moveToElement(categoryElement).click().build().perform();
    Thread.sleep(3000);
    WebElement categoryElement1=driver.findElement(By.xpath("(//a[text()='Beverages'])[position()=2]"));
    action.moveToElement(categoryElement1).build().perform();
    Thread.sleep(3000);
    WebElement categoryElement2=driver.findElement(By.xpath("//a[text()='Tea']"));
    action.moveToElement(categoryElement2).build().perform();
    Thread.sleep(3000);
    WebElement categoryElement3=driver.findElement(By.xpath("//a[text()='Green Tea']"));
    action.moveToElement(categoryElement3).build().perform();
    Thread.sleep(3000);
    categoryElement3.click();

    



    
	}

}
