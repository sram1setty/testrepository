package selenium_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/sravani/Downloads/chromedriver-mac-x64/chromedriver");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		
		driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();
		driver.findElement(By.xpath("//input[@value='Java']")).click();
		
		List<WebElement> options=driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label"));
		System.out.println("Number of options:"+options.size());
		
		for(WebElement option:options) {
			System.out.println(option.getText());
			
			String op=option.getText();
			if(op.equals("Java") || op.equals("Python") || op.equals("MySQL")) {
				option.click();
				
			}
		}
		
		
	}

}
