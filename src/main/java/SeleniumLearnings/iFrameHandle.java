package SeleniumLearnings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrameHandle {

	public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.formsite.com/templates/resgistration-form-templates/vehicle-registration-form/");
    driver.findElement(By.xpath("//div[@id='imageTemplateContainer']/img")).click();
    
	}

}
