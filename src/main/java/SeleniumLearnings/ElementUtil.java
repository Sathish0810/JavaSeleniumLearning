package SeleniumLearnings;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ElementUtil {

	public WebDriver driver;

	public ElementUtil(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getElement(By Locator) {
		WebElement elements = driver.findElement(Locator);
		return elements;

	}

	public List<WebElement> getElements(By Locator) {
		return driver.findElements(Locator);
	}

	public void doSendKeys(By Locator, String Value) {
		getElement(Locator).sendKeys(Value);
	}

	public void doClick(By Locator) {
		getElement(Locator).click();
	}

	public String doGetText(By Locator) {
		return getElement(Locator).getText();
	}

	public boolean doElementIsDisplayed(By Locator) {
		return getElement(Locator).isDisplayed();

	}

	public String getElementAtribute(By Locator, String name) {
		return getElement(Locator).getAttribute(name);
	}

	public void getElementsAttributes(By Locator, String attrbtValue) {
		List<WebElement> ListLinkElement = getElements(Locator);
		for (WebElement e : ListLinkElement) {
			String AttributeValues = e.getAttribute(attrbtValue);
			System.out.println(AttributeValues);

		}

	}

	public int getLinkImageCount(By Locator) {
		List<WebElement> linkImgCount = getElements(Locator);
		return linkImgCount.size();
	}

	public List<String> getSpecificElementsList(By Locator) {
		List<WebElement> linkList = getElements(Locator);
		List<String> linkImgList = new ArrayList<String>();
		for (WebElement e : linkList) {
			String text = e.getTagName();
			linkImgList.add(text);

		}
		return linkImgList;

	}

	// ......Methods for the select Dropdown by Select Class
	public void doSelectByValue(By Locator, String Value) {
		Select select = new Select(getElement(Locator));
		select.selectByValue(Value);
	}

	public void doSelectByIndex(By Locator, int Value) {
		Select select = new Select(getElement(Locator));
		select.selectByIndex(Value);
	}

	public void doSelectByVisibleText(By Locator, String Value) {
		Select select = new Select(getElement(Locator));
		select.selectByVisibleText(Value);
	}
}
