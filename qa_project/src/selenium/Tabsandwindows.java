package selenium;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tabsandwindows {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/sravani/Downloads/chromedriver-mac-x64/chromedriver");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://training.qaonlinetraining.com/testPage.php");
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.walmart.com/");
		System.out.println(driver.getTitle());
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.navigate().to("https://www.target.com/");
		System.out.println(driver.getTitle());
		
		
		
	}

}
