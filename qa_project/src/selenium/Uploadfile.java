package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Uploadfile {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/sravani/Downloads/chromedriver-mac-x64/chromedriver");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://nervgh.github.io/pages/angular-file-upload/examples/simple/");
		
		WebElement file=driver.findElement(By.xpath("//*[@id=\"ng-app\"]/body/div/div[2]/div[1]/input[2]"));
		file.sendKeys("/Users/sravani/Downloads/Sravani_QA.docx");
		driver.findElement(By.xpath("//*[@id=\"ng-app\"]/body/div/div[2]/div[2]/table/tbody/tr/td[5]/button[1]")).click();
		
		
		
	}

}
