package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByclass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/sravani/Downloads/chromedriver-mac-x64/chromedriver");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
	//driver.findElement(By.className("gLFyf")).sendKeys("Python");
		driver.findElement(By.cssSelector("textarea#APjFqb")).sendKeys("Selenium tutorial");
	//	driver.close();
		
	}

}
