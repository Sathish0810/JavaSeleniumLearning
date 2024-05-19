package SeleniumLearnings;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandle {

	public static void main(String[] args) throws InterruptedException {
    WebDriver driver=new ChromeDriver();
    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    Thread.sleep(4000);
    driver.manage().window().maximize();
    String parentWindowId=driver.getWindowHandle();
    driver.findElement(By.xpath("//a[contains(@href,'linkedin')]")).click();
    driver.findElement(By.xpath("//a[contains(@href,'facebook')]")).click();
    driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();
    driver.findElement(By.xpath("//a[contains(@href,'youtube')]")).click();
//    WebElement linkedinEle=driver.findElement(By.xpath("//a[contains(@href,'linkedin')]"));
//    WebElement facebooknEle=driver.findElement(By.xpath("//a[contains(@href,'facebook')]"));
//    WebElement instaEle=driver.findElement(By.xpath("//a[contains(@href,'instagram')]n"));
//    WebElement youtubeEle=driver.findElement(By.xpath("//a[contains(@href,'youtube')]"));
//    
//    linkedinEle.click();
//    facebooknEle.click();
//    instaEle.click();
//    youtubeEle.click();
//    
    Set<String>handles=driver.getWindowHandles();
    
    Iterator<String>it=handles.iterator();
    while(it.hasNext())
    {
    	String WindowUIf=it.next();
    	driver.switchTo().window(WindowUIf);
    	if(!WindowUIf.equals(parentWindowId))
    	{
    		driver.close();
    	}
    	
    }
    
    
    
	}

}
