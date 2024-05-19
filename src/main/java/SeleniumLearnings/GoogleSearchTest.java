package SeleniumLearnings;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {

	private static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
     driver=new ChromeDriver();
    driver.get("https://www.google.com");
    driver.findElement(By.id("APjFqb")).sendKeys("naveen automationlabs");
    Thread.sleep(5000);
   List<WebElement>searchList= driver.findElements(By.xpath("//li[@role='presentation']//div[@class='wM6W7d']"));
//   System.out.println(searchList.size());
   for(WebElement e : searchList)
   {
	  String Options= e.getText();
	  if(Options.length()>0)
	  {
		 
		  System.out.println(Options);  
	  }
	  
//	  if(Options.equals("naveen automationlabs reviews"))
//	  {
//		  e.click();
//		  break;
//	  }
   }
	}

}
