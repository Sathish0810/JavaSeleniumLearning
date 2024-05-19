package SeleniumLearnings;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownWithoutUsingSelect {
	static WebDriver driver;
	public static void main(String[] args) {
    driver=new ChromeDriver();
    driver.get("https://www.orangehrm.com/en/contact-sales/");
    By counteyEle=By.id("Form_getForm_Country");
    Select select=new Select(driver.findElement(counteyEle));
    List<WebElement>optionsList=select.getOptions();
    int lengthc=optionsList.size();
    System.out.println(lengthc);
    

	}
	
	

}
