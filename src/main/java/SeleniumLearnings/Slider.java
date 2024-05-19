package SeleniumLearnings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) {
    WebDriver driver = new ChromeDriver();
    driver.get("https://jqueryui.com/resources/demos/slider/default.html");
    WebElement Slider=driver.findElement(By.cssSelector("div#slider"));
    System.out.println(Slider);
//    Slider.click();
//    int width=Slider.getSize().getWidth();
//    System.out.println(width);
//    Actions act=new Actions(driver);
//    act.moveToElement(Slider, (width/2)-40, 0).click().build().perform();
	}

}
