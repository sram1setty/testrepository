package selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/sravani/Downloads/chromedriver-mac-x64/chromedriver");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		WebElement frame1=driver.findElement(By.xpath("/html/frameset/frame[1]"));
		
		driver.switchTo().frame(frame1);
		driver.findElement(By.name("mytext1")).sendKeys("Welcome");
		
		driver.switchTo().defaultContent();
		
		WebElement frame2=driver.findElement(By.xpath("/html/frameset/frameset/frame[1]"));
		
		driver.switchTo().frame(frame2);
		driver.findElement(By.name("mytext2")).sendKeys("Welcome");



		
	}

}
