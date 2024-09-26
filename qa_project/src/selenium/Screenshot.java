package selenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "/Users/sravani/Downloads/chromedriver-mac-x64/chromedriver");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.itlearn360.com/");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id=\"loginlabel\"]")).click();
		driver.findElement(By.id("user_login")).sendKeys("Demo1234");
		driver.findElement(By.id("user_pass")).sendKeys("Test123456$");
		driver.findElement(By.id("wp-submit")).submit();
		
		File sc= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(sc, new File("/Users/sravani/eclipse-workspace/qa_project/Sample/username.jpg"));
		
	}

}
