package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightclick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/sravani/Downloads/chromedriver-mac-x64/chromedriver");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		Actions rc=new Actions(driver);
		WebElement button=driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));
		rc.contextClick(button).build().perform();
		
		driver.findElement(By.xpath("/html/body/ul/li[1]/span")).click();
		Alert a=driver.switchTo().alert();
		Thread.sleep(5000);
		a.accept();
		
		
		
	}

}
