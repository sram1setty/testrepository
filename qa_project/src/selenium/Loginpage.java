package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginpage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/sravani/Downloads/chromedriver-mac-x64/chromedriver");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.itlearn360.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id=\"loginlabel\"]")).click();
		driver.findElement(By.id("user_login")).sendKeys("Demo12");
		driver.findElement(By.id("user_pass")).sendKeys("Test123456$");
		driver.findElement(By.id("wp-submit")).submit();
		
	}

}
