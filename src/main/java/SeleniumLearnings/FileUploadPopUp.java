package SeleniumLearnings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUp {

	public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
    driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
    driver.findElement(By.xpath("//input[@name='upfile']")).sendKeys("\"C:\\Users\\sathi\\Downloads\\stylish-indian-flag-design_1394-725.avif\"");
	}

}
