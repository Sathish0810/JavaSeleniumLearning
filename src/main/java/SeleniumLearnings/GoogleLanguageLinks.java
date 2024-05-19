package SeleniumLearnings;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLanguageLinks {
    private static WebDriver driver;
	public static void main(String[] args) {
     driver=new ChromeDriver();
    driver.get("https://www.google.com");
    List<WebElement>linksele=driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
    System.out.println(linksele.size());
//    for(WebElement e : linksele)
//    {
//    	String language=e.getText();
//    	System.out.println(language);
//    	if(language.equals("தமிழ்"))
//    	{
//    		e.click();
//    		break;
//    	}
//    }
    By linkElement=By.xpath("//div[@id='SIvCob']/a");
    getSpecificLinksFromPage(linkElement, "मराठी");
  
    
	}
    public static List<WebElement> getElements(By Locator)
    {
    	return driver.findElements(Locator);
    }
    
    public static void getSpecificLinksFromPage(By Locator, String Name)
    {
    	List<WebElement>linksele=getElements(Locator);
    	for(WebElement e :linksele)
    	{
    		String Text=e.getText();
    		if(Text.equals(Name))
    		{
    			e.click();
    			break;
    		}
    	}
    }


}
