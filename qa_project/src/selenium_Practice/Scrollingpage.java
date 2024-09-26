package selenium_Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollingpage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/sravani/Downloads/chromedriver-mac-x64/chromedriver");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//scroll down page by pixel number
		//js.executeScript("window.scrollBy(0,1500)","");
		//System.out.println(js.executeScript("return window.pageYoffset;"));
		
		//scroll the page till element is visible
		//WebElement ele=driver.findElement(By.xpath("//h2[normalize-space()='Pagination Table']"));
		//js.executeScript("arguments[0].scrollIntoView()",ele );
		//System.out.println(js.executeScript("return window.pageYoffset;"));

		//scroll page till end of the page
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYoffset;"));
		Thread.sleep(5000);
		
		//scrolling up to initial position
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYoffset;"));

		
		
	}

}
