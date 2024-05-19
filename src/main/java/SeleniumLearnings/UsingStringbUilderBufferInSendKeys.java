package SeleniumLearnings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingStringbUilderBufferInSendKeys {

	public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.google.com/");
    
    
    StringBuilder text=new StringBuilder().append("Sathish").append(" ").append("is");
    String space =" ";
    StringBuffer text1=new StringBuffer().append("Sathish").append(" ").append("is");
    driver.findElement(By.id("APjFqb")).sendKeys(text,text1,space);
	}

}
