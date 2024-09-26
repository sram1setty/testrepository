package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Windownavigation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/sravani/Downloads/chromedriver-mac-x64/chromedriver");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.navigate().to("https://www.instagram.com/");
		driver.navigate().to("https://x.com/?lang=en");
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().forward();
		
		
	}

}
