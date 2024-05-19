package SeleniumLearnings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.amazon.com");
    driver.manage().window().maximize();
    //driver.manage().window().fullscreen();
    driver.manage().deleteAllCookies();
    String Url=driver.getCurrentUrl();
    System.out.println(Url);
	}

}
