package SeleniumLearnings;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MonkeyTesting {

	public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.amazon.in/");
    List<WebElement>footerList=driver.findElements(By.xpath("//div[@class='navFooterVerticalRow navAccessibility']//li"));
    int footerLinkCount=footerList.size();

    for(int i=0;i<footerList.size();i++)
    {
    	int footerLinkIndex=(int)Math.floor(Math.random() * footerLinkCount);
    	WebElement e=footerList.get(footerLinkIndex);
    	e.click();
    	driver.navigate().back();
    	footerList=driver.findElements(By.xpath("//div[@class='navFooterVerticalRow navAccessibility']//li"));
    }
    }

}
