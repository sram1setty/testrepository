package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Openwebsite {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/sravani/Downloads/chromedriver-mac-x64/chromedriver");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
	}

}
