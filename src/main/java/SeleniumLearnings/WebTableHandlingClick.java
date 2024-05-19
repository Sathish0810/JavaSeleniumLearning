package SeleniumLearnings;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebTableHandlingClick {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
    driver=new ChromeDriver();
    driver.get("https://selectorshub.com/xpath-practice-page/");
    Thread.sleep(3000);
    
    while(true)
    {
    	if(driver.findElements(By.xpath("//td[text()='India']")).size()>0) {
    		multiplecountrySelect("India");
    }
    	
    		WebElement next=driver.findElement(By.cssSelector("a#tablepress-1_next"));
    		if(next.getAttribute("class").contains("disabled"))
    		{
    			break;
    		}
    		next.click();
    	}
    
//    while(true)
//    {
//    	if(driver.findElements(By.xpath("//td[text()='Russia']")).size()>0) {
//    		singlecountrySelect("Russia");
//    		break;
//    }
//    	else{
//    		WebElement next=driver.findElement(By.cssSelector("a#tablepress-1_next"));
//    		if(next.getAttribute("class").contains("disabled"))
//    		{
//    			break;
//    		}
//    		next.click();
//    	}
//    }
	}
	public static void singlecountrySelect(String country)
	{
		Actions action=new Actions(driver);
		WebElement clickEle=driver.findElement(By.xpath("//td[text()='"+country+"']/preceding-sibling::td/input[@type='checkbox']"));
		action.moveToElement(clickEle).click().build().perform();
	}
	public static void multiplecountrySelect(String country) throws InterruptedException
	{
		Actions action=new Actions(driver);
		List<WebElement>clickele1=driver.findElements(By.xpath("(//td[text()='"+country+"'])/preceding-sibling::td/input[@type='checkbox']"));
		for(WebElement e : clickele1)
		{
			e.click();
		}
	}


}
