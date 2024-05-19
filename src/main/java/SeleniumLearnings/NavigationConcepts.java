package SeleniumLearnings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationConcepts {

	public static void main(String[] args) {
	    WebDriver driver=new ChromeDriver();
	    driver.navigate().to("https://www.google.com");
	    driver.get("https://www.amazon.in");
	    driver.navigate().back();
	    driver.navigate().forward();
	    driver.navigate().refresh();
	    

	}

}
