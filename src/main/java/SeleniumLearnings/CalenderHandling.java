package SeleniumLearnings;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CalenderHandling {
    static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
    driver=new ChromeDriver();
    driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
    driver.findElement(By.cssSelector("input#datepicker")).click();
    //driver.findElement(By.xpath("//a[text()='25']")).click();
   // selectDay("10");
    
    //Date picket pagination
    String expectedHead="August 2025";
   String calHeadText= driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
   
   while(!calHeadText.equalsIgnoreCase(expectedHead))
   {
	   driver.findElement(By.xpath("//span[text()='Next']")).click();
	   calHeadText= driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
	   
   }
   selectDay("10");
   //System.out.println(calHeadText);
    
	}
	
	public static void selectDay(String day)
	{
		List<WebElement>datePick=driver.findElements(By.cssSelector("table.ui-datepicker-calendar td:not(.ui-state-disabled)"));
		WebElement dayClick=driver.findElement(By.xpath("//a[text()='"+day+"']"));
		dayClick.click();
	    System.out.println(datePick.size());
//	    for(WebElement e : datePick)
//	    {
//	    	String Day=e.getText();
//	    	System.out.println(Day);
//	    	if(Day.contains("26"))
//	    	{
//	    		e.click();
//	    		break;
//	    	}
//	    }
	}

}
