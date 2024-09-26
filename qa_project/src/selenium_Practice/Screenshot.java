package selenium_Practice;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Screenshot {

	public static void main(String[] args) {
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--headless=new");
		options.addArguments("--incognito");//opens incognito browser
		
		System.setProperty("webdriver.chrome.driver", "/Users/sravani/Downloads/chromedriver-mac-x64/chromedriver");
		ChromeDriver driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		//full page screenshot
		/*TakesScreenshot ts=(TakesScreenshot)driver;
		File sourcefile= ts.getScreenshotAs(OutputType.FILE);
		File targetfile=new File(System.getProperty("user.dir")+"/Screenshots/fullpage.png");
		sourcefile.renameTo(targetfile);*/
		
		//capture the screenshot of specific section
		WebElement webtables=driver.findElement(By.xpath("//div[@id='HTML1']"));
		File sourcefile=webtables.getScreenshotAs(OutputType.FILE);
		File targetfile=new File(System.getProperty("user.dir")+"/Screenshots/webtablesection.png");
		sourcefile.renameTo(targetfile);
		
		
		
	}

}
