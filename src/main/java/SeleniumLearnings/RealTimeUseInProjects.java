package SeleniumLearnings;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RealTimeUseInProjects {

	public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
    driver.get("https://saucedemo.com/v1/index.html");
    driver.findElement(By.id("user-name")).sendKeys("standard_user");
    driver.findElement(By.id("password")).sendKeys("secret_sauce");
    driver.findElement(By.id("login-button")).click();
    
//    //To get all the price
    List<WebElement>PriceList=driver.findElements(By.xpath("//div[@class='inventory_container']//div[@class='inventory_item_price']"));
    PriceList.stream().forEach(e -> System.out.println(e.getText()));
//    
//    To remove the dollar and store as double
       List<Double> sortedPrice=PriceList.stream().map(e ->Double.parseDouble(e.getText().substring(1)))
                       .sorted().collect(Collectors.toList());
       System.out.println(sortedPrice);
//    //Descending order
//    PriceList.stream().map(e ->Double.parseDouble(e.getText().substring(1)))
//    .sorted(Comparator.reverseOrder()).collect(Collectors.toList());
//    
//    //To get the first product
//    PriceList.stream().map(e ->Double.parseDouble(e.getText().substring(1)))
//    .findFirst().get();
//    
//    //To get the last product
//    PriceList.stream().map(e ->Double.parseDouble(e.getText().substring(1)))
//    .reduce((a,b) -> b).get();
//    
//    //To get the maximum pricede product
//    PriceList.stream().map(e ->Double.parseDouble(e.getText().substring(1)))
//    .max(Double::compareTo).get();
//    //To get the Minimum
//    PriceList.stream().map(e ->Double.parseDouble(e.getText().substring(1)))
//    .min(Double::compareTo).get();
	}

}
