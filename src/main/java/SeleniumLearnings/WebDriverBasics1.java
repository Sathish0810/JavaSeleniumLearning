package SeleniumLearnings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverBasics1 {

	public static void main(String[] args) {
    WebDriverManager.chromiumdriver().setup();
    ChromeOptions co=new ChromeOptions();
	co.addArguments("--remote-allow-origins=*");
	WebDriver driver=new ChromeDriver(co);
	
	driver.get("https://www.amazon.in/");
	String Title=driver.getTitle();
	System.out.println(Title);
	if(driver.getTitle().contains("Amazon"))
	{
		System.out.println("Test case got passed");
	}
	else
	{
		System.out.println("Test case got failed");
	}
	driver.quit();
	}

}
