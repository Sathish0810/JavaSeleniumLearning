package SeleniumLearnings;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverBasics3 {

	public static void main(String[] args) {
    
		WebDriver driver=null;
		
		String browser="IE";
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		
		else if(browser.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
		}
		else
		{
			System.out.println("Browser not found");
		}
		
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
