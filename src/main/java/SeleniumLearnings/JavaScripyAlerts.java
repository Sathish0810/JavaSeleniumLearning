package SeleniumLearnings;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScripyAlerts {

	public static void main(String[] args) throws InterruptedException {
    WebDriver driver=new ChromeDriver();
    driver.get("https://testpages.eviltester.com/styled/alerts/alert-test.html");
    //driver.findElement(By.id("alertexamples")).click();
    Thread.sleep(4000);
    //Alert alert=driver.switchTo().alert();
    //String text=alert.getText();
   // System.out.println(text);
    //alert.accept();
    
    //Prompt
    driver.findElement(By.id("promptexample")).click();
    Alert alert=driver.switchTo().alert();
    String text=alert.getText();
    System.out.println(text);

    alert.sendKeys("sathish");
    alert.accept();
    
	}

}
