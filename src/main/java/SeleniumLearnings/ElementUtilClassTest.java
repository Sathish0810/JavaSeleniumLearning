package SeleniumLearnings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ElementUtilClassTest {

	public static void main(String[] args) {
		String browser = "chrome";
		BrowserUtil bUtil = new BrowserUtil();
		WebDriver driver = bUtil.initDriver(browser);

		bUtil.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		By firstName = By.id("input-firstname");
		By lastName = By.id("input-lastname");
		By emailAdress = By.id("input-email");
		By mobileNum = By.id("input-telephone");
		By password = By.id("input-password");
		By confirmPassword = By.id("input-confirm");
		By privacyPolicyBtn = By.xpath("//*[@id=\"content\"]/form/div/div/input[1]");
		By submitBtn = By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
		By welcome = By.tagName("h1");

		String Title = bUtil.getPageTitle();
		if (Title.contains("Account")) {
			System.out.println(Title + " PASSED");
		} else {
			System.out.println(Title + " FAILED");
		}
		String URL = bUtil.getPageUrl();
		System.out.println(URL);
		ElementUtil eUtil = new ElementUtil(driver);
		eUtil.doSendKeys(firstName, "Sathish");
		eUtil.doSendKeys(lastName, "Neela");
		eUtil.doSendKeys(emailAdress, "neelasathish8180hf1@gmail.com");
		eUtil.doSendKeys(mobileNum, "9361646532");
		eUtil.doSendKeys(password, "Clinique$5");
		eUtil.doSendKeys(confirmPassword, "Clinique$5");
		eUtil.doClick(privacyPolicyBtn);
		eUtil.doClick(submitBtn);
		
		String text=eUtil.doGetText(welcome);
		System.out.println(text);
		if (text.contains("created")) {
			System.out.println("PASSED");
		} else {
			System.out.println("FAILED");

		}

		System.out.println("Execution success");
		bUtil.closeBrowser();

	}

}
