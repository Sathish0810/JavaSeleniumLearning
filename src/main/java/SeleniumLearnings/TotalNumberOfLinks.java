package SeleniumLearnings;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TotalNumberOfLinks {

	public static void main(String[] args) {
    WebDriver driver=new FirefoxDriver();
    driver.get("https://www.amazon.in/");
    List<WebElement>linkList=driver.findElements(By.tagName("a"));
    int linksCount=linkList.size();
    System.out.println(linksCount);
    int count=0;
    for (int i=0;i<linksCount;i++)
    	
    {
    	String Text=linkList.get(i).getText();
    	if(Text.length()<=0)
    	{
    		count++;
    		//System.out.println(Text);
    	}
    	
    }
	System.out.println(count);

	}

}
