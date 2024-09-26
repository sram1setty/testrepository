package selenium_Practice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zoominzoomout {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/sravani/Downloads/chromedriver-mac-x64/chromedriver");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(5000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.body.style.zoom='50%'");
		Thread.sleep(5000);
		
		js.executeScript("document.body.style.zoom='80%'");
		Thread.sleep(5000);
		
		
		
		
	}

}
