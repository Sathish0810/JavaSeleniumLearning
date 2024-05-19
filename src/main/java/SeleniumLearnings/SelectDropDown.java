package SeleniumLearnings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {
    static WebDriver driver;
	public static void main(String[] args) {
    driver=new ChromeDriver();
    driver.get("https://www.orangehrm.com/en/contact-sales/");
    By counteyEle=By.id("Form_getForm_Country");
    Select select=new Select(driver.findElement(counteyEle));
    //select.selectByIndex(1);
    //select.selectByValue("Algeria");
    //select.selectByVisibleText("Australia");
    //doSelectByValue(counteyEle, "Algeria");
    //doSelectByVisibleText(counteyEle, "Australia");
    doSelectByIndex(counteyEle, 100);
	}
	public static void doSelectByValue(By Locator, String Value)
	{
		Select select=new Select(getElement(Locator));
		select.selectByValue(Value);
	}
	public static void doSelectByIndex(By Locator, int Value)
	{
		Select select=new Select(getElement(Locator));
		select.selectByIndex(Value);
	}
	public static void doSelectByVisibleText(By Locator, String Value)
	{
		Select select=new Select(getElement(Locator));
		select.selectByVisibleText(Value);
	}
	public static WebElement getElement(By Locator)
	{
		return driver.findElement(Locator);
	}
	

}
