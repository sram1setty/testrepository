package selenium_Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationLinks {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/sravani/Downloads/chromedriver-mac-x64/chromedriver");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("links:"+links.size());
		
		for(WebElement link:links) {
			
			String url=link.getAttribute("href");
			System.out.println(url);
		}
		

	}

}
