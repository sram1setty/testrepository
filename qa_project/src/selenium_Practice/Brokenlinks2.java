package selenium_Practice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brokenlinks2 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "/Users/sravani/Downloads/chromedriver-mac-x64/chromedriver");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.deadlinkcity.com/");
		
		driver.manage().window().maximize();
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Total number of links:"+links.size());
		int noofbrokenlinks=0;
		for(WebElement link:links) {
			
			String hrefattvalue=link.getAttribute("href");
			
			if(hrefattvalue==null && hrefattvalue.isEmpty()) {
				System.out.println("href attribute value is null or empty. So not possible to check");
				continue;
			}
			
		
				
			
			URL linkURL=new URL(hrefattvalue);
			HttpURLConnection httpconn=(HttpURLConnection)linkURL.openConnection(); //open connection to the server
			httpconn.connect();
			
			if(httpconn.getResponseCode()>=400) {
				System.out.println("Broken link"+hrefattvalue);
				noofbrokenlinks++;
			}
			else {
				System.out.println("Not a broken link"+hrefattvalue);
			}
		}
		System.out.println("number of broken links:"+noofbrokenlinks);
		
	}

}
