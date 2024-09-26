package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linktextclass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/sravani/Downloads/chromedriver-mac-x64/chromedriver");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement a=driver.findElement(By.linkText("Gmail"));
		if(a.isDisplayed()) {
			System.out.println("the text is in form of hyperlink");
			}
		else {
			System.out.println("the text is not hyperlinked");
			
		}
		driver.close();
		
	}

}
