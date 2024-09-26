package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttonenable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/sravani/Downloads/chromedriver-mac-x64/chromedriver");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.target.com/");
		Boolean x=driver.findElement(By.xpath("//*[@id=\"utilityNav-circle\"]")).isDisplayed();
		System.out.println(x);
		
		/*Boolean x=driver.findElement(By.xpath("//*[@id=\"plans\"]/li[1]/ul/li[4]/a")).isEnabled();
		if(x) {
			System.out.println("the button is enabled");
		}
		else {
			System.out.println("the button is disabled");
		}
		driver.close();*/
		
	}

}
