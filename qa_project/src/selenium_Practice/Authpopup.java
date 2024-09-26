package selenium_Practice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Authpopup {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "/Users/sravani/Downloads/chromedriver-mac-x64/chromedriver");
		ChromeDriver driver=new ChromeDriver();
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
		//driver.get("https://training.qaonlinetraining.com/testPage.php");
		
		/*driver.findElement(By.id("alert")).click();
		Thread.sleep(5000);
		
		Alert a=mywait.until(ExpectedConditions.alertIsPresent());
		a.accept();*/
		
		//Authentication popup
		
		driver.get("Https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		
		
		
	}

}