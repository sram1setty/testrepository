package selenium_Practice;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestiondropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/sravani/Downloads/chromedriver-mac-x64/chromedriver");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("selenium");
		List<WebElement> options=driver.findElements(By.xpath("//ul[@role='listbox']//li//div[@role='option']"));
		System.out.println(options.size());
		for(WebElement option:options) {
			System.out.println(option.getText());
			if(option.getText().equals("selenium")) {
				option.click();
				break;
				
			}
		}
		
		
		
	}

}
