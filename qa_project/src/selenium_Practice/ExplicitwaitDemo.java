package selenium_Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitwaitDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/sravani/Downloads/chromedriver-mac-x64/chromedriver");
		ChromeDriver driver=new ChromeDriver();
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		WebElement txtusername=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
		txtusername.sendKeys("Admin");
		
		WebElement txtpassword=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
		txtpassword.sendKeys("admin123");
		
		WebElement loginbtn=mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")));
		loginbtn.click();
		 		
	
		
		
		
	} 

}
