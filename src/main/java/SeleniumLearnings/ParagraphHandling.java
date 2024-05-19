package SeleniumLearnings;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParagraphHandling {

	public static void main(String[] args) {
	    WebDriver driver=new ChromeDriver();
        driver.get("https://classic.crmpro.com");
        List<WebElement>list=driver.findElements(By.cssSelector("section#details p"));
       String allNames= list.stream().map(e -> e.getText()).collect(Collectors.joining("\n"));
       System.out.println(allNames);
        
        
	}

}
