package SeleniumLearnings;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDom {

	public static void main(String[] args) throws InterruptedException {
    WebDriver driver=new ChromeDriver();
    driver.get("https://selectorshub.com/iframe-in-shadow-dom/");
    Thread.sleep(5000);
    
    JavascriptExecutor js=(JavascriptExecutor)driver;
    WebElement shadowDom=(WebElement)js.executeScript("return document.querySelector(\"#userName\").shadowRoot.querySelector(\"#app2\").shadowRoot.querySelector(\"#pizza\")");
    shadowDom.sendKeys("Sathish");
    
	}

}
