package SeleniumLearnings;

public class AmazonTest {

	public static void main(String[] args) {
		BrowserUtil bu=new BrowserUtil();
		bu.initDriver("edge");
		bu.launchUrl("https://amazon.com");
		String ActualText=bu.getPageTitle();
		System.out.println(ActualText);
		if(ActualText.contains("Amazon"))
		{
			System.out.println("Test PASSED");
		}
		else
		{
			System.out.println("Test FAILED");
			
			
		}
		String ActualUrl=bu.getPageUrl();
		if(ActualUrl.contains("amazon"))
		{
			System.out.println("Test PASSED");
		}
		else
		{
			System.out.println("Test FAILED");
		}
		bu.closeBrowser();
		
	}

}
