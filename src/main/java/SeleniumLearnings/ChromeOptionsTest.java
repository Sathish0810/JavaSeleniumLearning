package SeleniumLearnings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptionsTest {

	public static void main(String[] args) {
    ChromeOptions co=new ChromeOptions();
    //co.setHeadless(true);
    co.addArguments("--incognito");
    WebDriver driver=new ChromeDriver(co);
    driver.get("https://www.google.com");
    System.out.println(driver.getCurrentUrl());
    System.out.println(driver.getTitle());
    driver.close();
    
	}

}
