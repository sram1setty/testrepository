package selenium_Practice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Openthelinkinnewtab {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/sravani/Downloads/chromedriver-mac-x64/chromedriver");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.nopcommerce.com/");
		
		driver.manage().window().maximize();
		WebElement reglink=driver.findElement(By.xpath("//a[normalize-space()='Register']"));
		Actions act=new Actions(driver);
		act.keyDown(Keys.COMMAND).click(reglink).keyUp(Keys.COMMAND).build().perform();
		
		//get windowids
		//Set<String> winids=driver.getWindowHandles();
		
		//List<String> winlist=new ArrayList<String>(winids);
		//String Parentid=winlist.get(0);
		//String childid=winlist.get(1);
		
		List<String> ids=new ArrayList<String>(driver.getWindowHandles());
		
		
		
		//switching to registration page
		//driver.switchTo().window(childid);
		driver.switchTo().window(ids.get(1));
		
		 //driver.switchTo().window(Parentid);
		driver.switchTo().window(ids.get(0));
		
		driver.get("https://www.opencart.com/");
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("https://www.orangehrm.com/");
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.orangehrm.com/");
		
		
		
		
		
		
		
	}

}
