package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/sravani/Downloads/chromedriver-mac-x64/chromedriver");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://training.qaonlinetraining.com/testPage.php");
		driver.findElement(By.name("name")).sendKeys("Sravani");
		driver.findElement(By.id("eml")).sendKeys("sravaniramisetty@gmail.com");
		driver.findElement(By.name("website")).sendKeys("www.google.com");
		driver.findElement(By.name("comment")).sendKeys("test");
		
		driver.findElement(By.xpath("/html/body/form/input[4]")).click();
		driver.findElement(By.name("bike")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("car")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("boat")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("horse")).click();


		WebElement cn = driver.findElement(By.name("country"));
		Select conrty= new Select(cn);
		conrty.selectByVisibleText("France");
		
		List<WebElement> options=conrty.getOptions();
		System.out.println("Number of options in adrop down:"+options.size());
		
		//printing the options
		for(int i=0;i<options.size();i++) {
			System.out.println(options.get(i).getText());
			
		}
		
		for(WebElement option:options) {
			System.out.println(option.getText());
		}
		
		

		WebElement skill=driver.findElement(By.name("skill"));
		Select a=new Select(skill);
		a.selectByVisibleText("Quality Assurance");
		Thread.sleep(5000);
		a.selectByVisibleText("Database");
		
		driver.findElement(By.name("submit")).submit();
		
	}

}
