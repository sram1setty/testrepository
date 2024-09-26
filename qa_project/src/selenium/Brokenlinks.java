package selenium;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
 import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;


public class Brokenlinks {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/sravani/Downloads/chromedriver-mac-x64/chromedriver");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.itlearn360.com/");
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		int count=0;
		for(WebElement link:links)
		{
			String url=link.getAttribute("href");
			count++;
			System.out.println(url);
			verifylink(url);
		}
		
		System.out.println("The number of links "+count);
		
		
	}
	public static void verifylink(String url1) {
		try {
			URL link=new URL(url1);
			
			HttpURLConnection httpurlconn=(HttpURLConnection) link.openConnection();
			httpurlconn.setConnectTimeout(3000);
			httpurlconn.connect();
			
			
			if(httpurlconn.getResponseCode() == 200)
			{
				System.out.println( httpurlconn.getResponseMessage());
			}
			else
			{
				System.out.println(httpurlconn.getResponseMessage()+"The link is broken");
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("The link is broken");
		}
		
	}

}
