package SeleniumLearnings;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectUsingFindElements {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
    driver=new ChromeDriver();
    driver.manage().deleteAllCookies();
    Actions action=new Actions(driver);
    driver.get("https://www.orangehrm.com/en/contact-sales/");
    By.xpath("//span[@id=\"u_4_l_++\"]//select");
    List<WebElement>linkList=driver.findElements(By.xpath("//select[@id='Form_getForm_Country']"));
    //List<String>ar=new ArrayList<String>();
    for(WebElement e : linkList)
    {
    	String Text=e.getText();
    	System.out.println(Text);
    	if(Text.equals("Turkmenistan")){
    		Thread.sleep(3000);
    		action.click(e);
    		break;
    	}
    }
    	
	}

}
