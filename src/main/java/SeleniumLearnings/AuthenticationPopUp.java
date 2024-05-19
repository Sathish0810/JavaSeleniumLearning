package SeleniumLearnings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopUp {

	public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
    driver.get("https://authorized:password001@testpages.eviltester.com/styled/auth/basic-auth-test.html");
	}

}
