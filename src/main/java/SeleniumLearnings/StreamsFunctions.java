package SeleniumLearnings;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StreamsFunctions {

	public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.flipkart.com/");
    List<WebElement> list=driver.findElements(By.tagName("a"));
    //To print all the text
    //list.stream().forEach(e -> System.out.println(e.getText()));
    
    //To print only the Text which is not empty
    //list.stream().filter(e -> !e.getText().isEmpty()).forEach(e -> System.out.println(e.getText()));
    
    //To print the text starts with poco
//    list.stream().filter(e -> !e.getText().isEmpty())
//                            .filter(e -> e.getText().startsWith("poco"))
//                            .forEach(e -> System.out.println(e.getText()));
    
    //To collect as list
    list.stream().filter(e -> !e.getText().isEmpty()) 
                  .filter(e -> e.getText().startsWith("poco"))
                  .collect(Collectors.toList());
   
    
	}

}
