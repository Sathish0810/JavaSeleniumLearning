package SeleniumLearnings;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CricBuzzScoreCard {
    static WebDriver driver;
	public static void main(String[] args) {
    driver=new ChromeDriver();
    driver.get("https://www.cricbuzz.com/live-cricket-scorecard/92156/ire-vs-pak-3rd-t20i-pakistan-tour-of-ireland-2024");
//    String WicketTaket=driver.findElement(By.xpath("//a[text()=' Balbirnie ']/parent::div/following-sibling::div/span"))
//    		.getText();
//    System.out.println(WicketTaket);
    
    ////a[text()='"+name+"']/parent::div//following-sibling::div
//    String names=getWicketTakerNae(" Ross Adair ");
//    System.out.println(names);
    List<String> outputList=getBatsmanDetails(" Ross Adair ");
    System.out.println(outputList);
    
	}
	
	public static String getWicketTakerNae(String name)
	{
		return driver.findElement(By.xpath("//a[text()='"+name+"']/parent::div/following-sibling::div/span")).getText();
		
	}
	public static List<String> getBatsmanDetails(String name)
	{ List<String>finalList=new ArrayList<String>();
      List<WebElement>batsmanList=driver.findElements(By.xpath("//a[text()='"+name+"']/parent::div//following-sibling::div"));
      for(WebElement e : batsmanList)
      {
    	String listBatsman=e.getText();
    	finalList.add(listBatsman);
    	 
      }
      return finalList;
		
	}

}
