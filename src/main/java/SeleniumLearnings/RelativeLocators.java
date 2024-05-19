package SeleniumLearnings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeLocators {

	public static void main(String[] args) throws InterruptedException {
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.aqi.in/dashboard/canada");
    Thread.sleep(3000);
    WebElement element=driver.findElement(By.xpath("(//p[@class='card-live-text2'])[position()=2]/a"));
    String rightOfText=driver.findElement(RelativeLocator.with(By.tagName("p")).toRightOf(element)).getText();
    System.out.println(rightOfText);
    String leftOfText=driver.findElement(RelativeLocator.with(By.tagName("p")).toLeftOf(element)).getText();
    System.out.println(leftOfText);
    String aboveText=driver.findElement(RelativeLocator.with(By.tagName("p")).above(element)).getText();
    System.out.println(aboveText);
    String belowText=driver.findElement(RelativeLocator.with(By.tagName("p")).below(element)).getText();
    System.out.println(belowText);

	}

}
