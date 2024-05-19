package SeleniumLearnings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrames {

	public static void main(String[] args) throws InterruptedException {
    WebDriver driver=new ChromeDriver();
    driver.get("https://selectorshub.com/iframe-scenario/");
    Thread.sleep(3000);
    driver.switchTo().frame(driver.findElement(By.cssSelector("iframe#pact1")));
    driver.findElement(By.id("inp_val")).sendKeys("My name is sathish");
    driver.switchTo().frame(driver.findElement(By.cssSelector("iframe#pact2")));
    driver.findElement(By.cssSelector("input#jex")).sendKeys("How are you");
    driver.switchTo().frame(driver.findElement(By.cssSelector("iframe#pact3")));
    driver.findElement(By.cssSelector("input#glaf")).sendKeys("How are you");
    driver.switchTo().parentFrame();
    driver.findElement(By.cssSelector("input#jex")).sendKeys("How are you!!!!");
    driver.switchTo().parentFrame();
    driver.findElement(By.id("inp_val")).sendKeys("My name is sathish...");
    driver.switchTo().defaultContent();
    driver.findElement(By.id("inp_val")).sendKeys("My name is sathish...1	");

    

	}

}
