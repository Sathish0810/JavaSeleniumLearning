package SeleniumLearnings;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PseudoElements {

	public static void main(String[] args) {
    WebDriver driver=new FirefoxDriver();
    JavascriptExecutor js=(JavascriptExecutor)driver;
    driver.get("https://www.opencart.com/index.php?route=account/login");
    String script="return window.getComputedStyle(document.querySelector(\"label[for='input-firstname']\"), '::before').getPropertyValue('content')\r\n"
    		+ "";
    String name=js.executeScript(script).toString();
    System.out.println(name);
	}

}
