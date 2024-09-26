package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/sravani/Downloads/chromedriver-mac-x64/chromedriver");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		
		WebElement a;
		a=wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Gmail")));
		a.click();
	}

}
