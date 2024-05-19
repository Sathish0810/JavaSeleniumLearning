package SeleniumLearnings;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getSpecificListOfElements {
	static WebDriver driver;
	public static void main(String[] args) {
    driver=new ChromeDriver();
    List<String>arr=new ArrayList<String>();
    driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
    By specificElementList= By.xpath("//aside[@id='column-right']//a");
    
    getSpecificElementsList(specificElementList);
    System.out.println(getSpecificElementsList(specificElementList));
    List<WebElement>linkList=driver.findElements(specificElementList);
//    
//    for(WebElement e : linkList)
//    {
//    	String Text=e.getText();
//    	arr.add(Text);
//    	System.out.println(Text);
//    }
//    
    
    
    }
	public static List<WebElement> getElements(By Locator)
    {
    	return driver.findElements(Locator);
    }
	public static List<String> getSpecificElementsList(By Locator)
	{
		List<WebElement>linkList=getElements(Locator);
		List<String>linkImgList=new ArrayList<String>();
		for(WebElement e : linkList)
		{
			String text=e.getTagName();
			linkImgList.add(text);
		
		}
		return linkImgList;
		
	}

}
