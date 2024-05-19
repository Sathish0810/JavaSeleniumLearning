package SeleniumLearnings;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TotalNumberOfImage {

	public static void main(String[] args) {
    WebDriver driver=new FirefoxDriver();
    driver.get("https://www.amazon.in/");
    List<WebElement>imageList=driver.findElements(By.tagName("img"));
    int imageCount=imageList.size();
    System.out.println(imageCount);
    
    for(int i=0;i<imageCount;i++)
    {
    	//System.out.println(imageList.get(i));
    	String s=imageList.get(i).getText();
    	System.out.println(s);
    }
    
	}

}
