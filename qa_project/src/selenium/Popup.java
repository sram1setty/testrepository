package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/sravani/Downloads/chromedriver-mac-x64/chromedriver");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		
		driver.findElement(By.linkText("Open a popup window")).click();
		
		
		Set<String> win=driver.getWindowHandles();
		
		for(String window :win)
		{
			driver.switchTo().window(window);
			if(driver.getTitle().equals("New Window")) {
				driver.manage().window().maximize();
				
				driver.close();
			}
		}
	}

}
