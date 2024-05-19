package SeleniumLearnings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserUtil {

	private WebDriver driver;

	/**
	 * This method is used to launch the Browser on passing the Browser name
	 * 
	 * @param browser
	 * @return- This will return the Driver and will launch the browser
	 */
	public WebDriver initDriver(String browser) {
		switch (browser.toLowerCase()) {
		case "chrome":
			System.out.println(browser + " browser launched sucessfully");
			driver = new ChromeDriver();
			break;
		case "firefox":
			System.out.println(browser + " browser launched sucessfully");
			driver = new FirefoxDriver();
			break;
		case "edge":
			System.out.println(browser + " browser launched sucessfully");
			driver = new EdgeDriver();
			break;

		default:
			System.out.println("Entered browser name is not a valid one-- Kindly Check");
			break;
		}
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		return driver;
	}

	/**
	 * This method is used to launch the URL in the browser
	 * 
	 * @param url
	 */
	public void launchUrl(String url) {
		if (url==null) {
			System.out.println("URL Cannot be null");
		}
		else if (url.indexOf("https") == 0) {
			driver.get(url);

		}
	}

	/**
	 * This method is used to get the current page Title
	 * 
	 * @return
	 */
	public String getPageTitle() {
		String Title = driver.getTitle();
		return Title;
	}

	/**
	 * THis method is used to get the current page URL
	 * 
	 * @return
	 */
	public String getPageUrl() {
		String Url = driver.getCurrentUrl();
		return Url;
	}

	/**
	 * This method is used to close the browser
	 */
	public void closeBrowser() {
		if (driver != null) {
			driver.close();
		}
	}

}
