package selenium;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Downloadfile {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/sravani/Downloads/chromedriver-mac-x64/chromedriver");
		ChromeOptions opt=new ChromeOptions();
		Map<String, Object> pref= new HashMap<String,Object>();
		pref.put("download.default_directory", "/Users/sravani/Downloads");
		opt.setExperimentalOption("prefs", pref);
		
		
		ChromeDriver driver=new ChromeDriver(opt);
		driver.get("https://storage.googleapis.com/chrome-for-testing-public/128.0.6613.137/mac-x64/chromedriver-mac-x64.zip");
		
		driver.manage().window().maximize();
		
		
		
	}

}
