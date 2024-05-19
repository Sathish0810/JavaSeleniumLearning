package SeleniumLearnings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathBreaking {

	public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.w3schools.com/html/html_tables.asp");
    
    ////table[@id="customers"]/tbody/tr[2]/td[1]
    /////table[@id="customers"]/tbody/tr[3]/td[1]
    /////table[@id="customers"]/tbody/tr[4]/td[1]
    //////table[@id="customers"]/tbody/tr[6]/td[1]
    //////table[@id="customers"]/tbody/tr[5]/td[1]
    //////table[@id="customers"]/tbody/tr[6]/td[1]
    ////////table[@id="customers"]/tbody/tr[7]/td[1]
    
    String s1="//table[@id=\"customers\"]/tbody/tr[";
    String s2="]/td[1]";
    for(int i=2;i<=7;i++)
    {
    	String xpath=s1+i+s2;
    	//System.out.println(xpath);
    	String Row=driver.findElement(By.xpath(xpath)).getText();
    	System.out.println(Row);
    }
	}

}
