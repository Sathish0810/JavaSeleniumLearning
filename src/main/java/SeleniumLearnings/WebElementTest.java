package SeleniumLearnings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementTest {

	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		// First Approach
//		driver.findElement(By.id("input-firstname")).sendKeys("Sathish");
//		driver.findElement(By.id("input-lastname")).sendKeys("N");
//		driver.findElement(By.id("input-email")).sendKeys("neelasathish8@gmail.com");
//		driver.findElement(By.id("input-telephone")).sendKeys("9361646532");
//		driver.findElement(By.id("input-password")).sendKeys("Clinique$5");
//		driver.findElement(By.id("input-confirm")).sendKeys("Clinique$5");
		// Second Approach
//		WebElement firstName = driver.findElement(By.id("input-firstname"));
//		WebElement lastName = driver.findElement(By.id("input-lastname"));
//		WebElement emailAdress = driver.findElement(By.id("input-email"));
//		WebElement mobileNum = driver.findElement(By.id("input-telephone"));
//		WebElement password = driver.findElement(By.id("input-password"));
//		WebElement confirmPassword = driver.findElement(By.id("input-confirm"));

//		firstName.sendKeys("Sathish");
//		lastName.sendKeys("N");
//		emailAdress.sendKeys("neelasathish8@gmail.com");
//		mobileNum.sendKeys("9361646532");
//		password.sendKeys("Clinique$5");
//		confirmPassword.sendKeys("Clinique$5");

		// 3rd Approach
//		By firstName= By.id("input-firstname");
//		By lastName= By.id("input-lastname");
//		By emailAdress= By.id("input-email");
//		By mobileNum= By.id("input-telephone");
//		By password= By.id("input-password");
//		By confirmPassword= By.id("input-confirm");
//		
//		WebElement eFirstName=driver.findElement(firstName);
//		WebElement eLastName=driver.findElement(lastName);
//		WebElement eEmailAddress=driver.findElement(emailAdress);
//		WebElement eMobileNum=driver.findElement(mobileNum);
//		WebElement ePassword=driver.findElement(password);
//		WebElement eConfirmPassword=driver.findElement(confirmPassword);
//		
//		eFirstName.sendKeys("Sathish");
//		eLastName.sendKeys("N");
//		eEmailAddress.sendKeys("neelasathish8@gmail.com");
//		eMobileNum.sendKeys("9361646532");
//		ePassword.sendKeys("Clinique$5");
//		eConfirmPassword.sendKeys("Clinique$5");

		// 4th approach

//		By firstName= By.id("input-firstname");
//		By lastName= By.id("input-lastname");
//		By emailAdress= By.id("input-email");
//		By mobileNum= By.id("input-telephone");
//		By password= By.id("input-password");
//		By confirmPassword= By.id("input-confirm");
//		
//		WebElementTest.getElement(firstName).sendKeys("Sathish");
//		WebElementTest.getElement(lastName).sendKeys("N");
//		WebElementTest.getElement(emailAdress).sendKeys("neelasathish8@gmail.com");
//		WebElementTest.getElement(mobileNum).sendKeys("9361646532");
//		WebElementTest.getElement(password).sendKeys("Clinique$5");
//		WebElementTest.getElement(confirmPassword).sendKeys("Clinique$5");

		// 5th Approach
		By firstName = By.id("input-firstname");
		By lastName = By.id("input-lastname");
		By emailAdress = By.id("input-email");
		By mobileNum = By.id("input-telephone");
		By password = By.id("input-password");
		By confirmPassword = By.id("input-confirm");
		doSendKeys(firstName, "Sathish");
		doSendKeys(lastName, "N");
		doSendKeys(emailAdress, "neelasathish8@gmail.com");
		doSendKeys(mobileNum, "9361646532");
		doSendKeys(password, "Clinique$5");
		doSendKeys(confirmPassword, "Clinique$5");

	}

	public static WebElement getElement(By Locator) {
		WebElement elements = driver.findElement(Locator);
		return elements;

	}

	public static void doSendKeys(By Locator, String Value) {
		getElement(Locator).sendKeys(Value);
	}

}
