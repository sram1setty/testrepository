package selenium_Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboardactions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/sravani/Downloads/chromedriver-mac-x64/chromedriver");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://text-compare.com/");
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//textarea[@id='inputText1']")).sendKeys("Welcome");
		Actions act=new Actions(driver);
		
		//ctrl+A - selects the text
		act.keyDown(Keys.COMMAND).sendKeys("A").keyUp(Keys.COMMAND).build().perform();
		
		//ctrl+C - copy text into clipboard
		act.keyDown(Keys.COMMAND).sendKeys("C").keyUp(Keys.COMMAND).build().perform();
		
		//tab - shift to 2nd box
		act.keyDown(Keys.TAB).keyUp(Keys.TAB).build().perform();
		
		//ctrl+V - past the text
		act.keyDown(Keys.COMMAND).sendKeys("v").keyUp(Keys.COMMAND).build().perform();
		
		
		
	}

}
