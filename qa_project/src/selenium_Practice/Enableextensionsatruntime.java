package selenium_Practice;

import java.io.File;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Enableextensionsatruntime {

	public static void main(String[] args) {
		
		
		ChromeOptions options=new ChromeOptions();
		//File file=new File("/Users/sravani/Downloads/SelectorsHub.crx");
		File file=new File("/Users/sravani/Downloads/uBlock-Origin.crx");
		options.addExtensions(file);
		
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://text-compare.com/");
	}

}
