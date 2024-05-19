package SeleniumLearnings;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class ZoomInZoomOut {

	public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
    driver.get("https://naveenautomationlabs.com/opencart/");
    JavascriptExecutor js=(JavascriptExecutor)driver;
    js.executeScript("document.body.style.zoom = '5';");
	}

}
