package SeleniumLearnings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverBasics {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\sathi\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		//WebDriver driver=new ChromeDriver(co);

		//ChromeDriver driver=new ChromeDriver(co);
		//Enter URL
		driver.get("https://www.google.com");
		//getTitle
		String Title=driver.getTitle();
		System.out.println(Title);
		if(Title.equals("Google"))
				{
			System.out.println("Test Passed");
				}
		else
		{
			System.out.println("Test Failed");
		}
		driver.quit();
		
	}

}
