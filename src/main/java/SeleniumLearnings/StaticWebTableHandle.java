package SeleniumLearnings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebTableHandle {

	public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.w3schools.com/html/html_tables.asp");
    int numberOfHeader=driver.findElements(By.xpath("//table[@id='customers']//th")).size();
    System.out.println(numberOfHeader);
    int numberOfRows=driver.findElements(By.xpath("//table[@id='customers']//tr")).size()-1;
    System.out.println(numberOfRows);
	}

}
