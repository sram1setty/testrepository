package selenium_Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker {
	
	//select month & year
	static void selectFutureDate(WebDriver driver, String month,String year,String date) 
	{
				while(true)
				{
					String currentmonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
					String currentyear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
					
					if(currentmonth.equals(month) && currentyear.equals(year)) {
						
						break;
					}
					driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();//Next for future date
				}
				List<WebElement> alldates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td/a"));
				
				for(WebElement dt:alldates) 
				{
					if(dt.getText().equals(date)) 
					{
						dt.click();
						break;
						
					}
				}
	}
	
	static void selectPastDate(WebDriver driver, String month,String year,String date) 
	{
				while(true)
				{
					String currentmonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
					String currentyear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
					
					if(currentmonth.equals(month) && currentyear.equals(year)) {
						
						break;
					}
					driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();//previous for past date
				}
				List<WebElement> alldates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td/a"));
				
				for(WebElement dt:alldates) 
				{
					if(dt.getText().equals(date)) 
					{
						dt.click();
						break;
						
					}
				}
	}
	
	
	
	

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/sravani/Downloads/chromedriver-mac-x64/chromedriver");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/datepicker/");
		
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		
		//driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("04/05/2024");
		
		//Using date picker
		//expected data
		//String year="2025";
		//String month="May";
		//String date="20";
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		//selectFutureDate(driver,"May","2025","20");
		selectPastDate(driver,"May","2023","15");
		
		
		
		
	}

}
