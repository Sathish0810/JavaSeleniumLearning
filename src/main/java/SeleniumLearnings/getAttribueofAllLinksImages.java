package SeleniumLearnings;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getAttribueofAllLinksImages {
    static WebDriver driver;
	public static void main(String[] args) {
    driver=new ChromeDriver();
    driver.get("https://www.amazon.in/");
    By linksElement=By.tagName("a");
    By imgElement=By.tagName("img");
    List<WebElement>linkList=getFindElements(linksElement);
    List<WebElement>linkList1=getFindElements(imgElement);

//    for(WebElement e : linkList1)
//    {
//    	String linkHref=e.getAttribute("src");
//    	System.out.println(linkHref);
//    }
    
    getElementsAttributes(linksElement, "href");
    

	}
	public static List<WebElement> getFindElements(By Locator)
	{
		return driver.findElements(Locator);
	}
	
	public static void getElementsAttributes(By Locator, String attrbtValue)
	{
		List<WebElement>ListLinkElement=getFindElements(Locator);
		for(WebElement e : ListLinkElement)
		{
			String AttributeValues=e.getAttribute(attrbtValue);
			System.out.println(AttributeValues);

		}

	}
	public int getLinkImageCount(By Locator)
	{
	List<WebElement>linkImgCount=getFindElements(Locator);
	return linkImgCount.size();
	}
	
	

}
