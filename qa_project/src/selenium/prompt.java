package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class prompt {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/sravani/Downloads/chromedriver-mac-x64/chromedriver");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://training.qaonlinetraining.com/testPage.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("alert")).click();
		Alert a=driver.switchTo().alert();
		a.accept();
		Thread.sleep(5000);
		
		driver.findElement(By.id("confirm")).click();
		Alert b=driver.switchTo().alert();
		b.dismiss();
		Thread.sleep(5000);
		
		driver.findElement(By.id("prompt")).click();
		Alert c=driver.switchTo().alert();
		c.sendKeys("Sravani");
		c.accept();
		Thread.sleep(5000);
		
		

		driver.close();
	}

}
