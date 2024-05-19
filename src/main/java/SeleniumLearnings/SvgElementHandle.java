package SeleniumLearnings;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SvgElementHandle {

	public static void main(String[] args) throws InterruptedException {
    WebDriver driver=new ChromeDriver();
    //Keys.chord(Keys.CONTROL, Keys.RETURN)
    driver.get("https://petdiseasealerts.org/forecast-map#/");
    Thread.sleep(5000);
    
    driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]")));
    
    String xpath="//*[local-name()='svg' and @id='map-svg']//*[name()='g' and @id='regions']//*[name()='path']";
    List<WebElement>stateList=driver.findElements(By.xpath(xpath));
    System.out.println(stateList.size());
    for(WebElement e : stateList)
    {
    	String stateName=e.getAttribute("name");
    	System.out.println(stateName);
    	if(stateName.equals("California"))
    	{
    		e.click();
    		break;
    	}
    }
	}

}
