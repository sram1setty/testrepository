package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseover {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/Users/sravani/Downloads/geckodriver");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.com/");
		
		Actions M=new Actions(driver);
		WebElement button=driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]"));
		M.moveToElement(button).build().perform();
		
		
	}

}
