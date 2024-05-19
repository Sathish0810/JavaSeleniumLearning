package SeleniumLearnings;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementException {

	public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.freshworks.com/");
    List<WebElement>linkList1=driver.findElements(By.xpath("//div[text()='Company']//parent::div//li"));
    for(int i=0;i<linkList1.size();i++)
    {
    	linkList1.get(i).click();
        List<WebElement>linkList2=driver.findElements(By.xpath("//div[text()='Company']//parent::div//li"));

    }
	}

}
