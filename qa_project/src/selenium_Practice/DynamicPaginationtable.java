package selenium_Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicPaginationtable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/sravani/Downloads/chromedriver-mac-x64/chromedriver");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.ecomdeveloper.com/demo/admin/index.php");
		
		driver.manage().window().maximize();
		WebElement username=driver.findElement(By.xpath("//input[@id='input-username']"));
		username.clear();
		username.sendKeys("demoadmin");
		
		WebElement password=driver.findElement(By.xpath("//input[@id='input-password']"));
		password.clear();
		password.sendKeys("demopass");
		
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		driver.findElement(By.xpath("//a[@class='parent collapsed'][normalize-space()='Customers']")).click();
		driver.findElement(By.xpath("//ul[@id='collapse9']//a[contains(text(),'Customers')]")).click();
		
		
		//Showing 1 to 20 of 872 (44 Pages)
		String text=driver.findElement(By.xpath("//div[contains(text(),'Pages')]")).getText();
		
		int total_pages=Integer.parseInt((text).substring(text.indexOf("(")+1,text.indexOf("Pages")-1));
		
		//navigating the pages
		for(int p=1;p<=5;p++) {
			if(p>1) {
				WebElement active_page=driver.findElement(By.xpath("//ul[@class='pagination']//*[text()="+p+"]"));
				active_page.click();
				Thread.sleep(3000);
				
				
			}
		}
		
		//Read the data from table
		int rows=driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr")).size();
		
		for(int r=1;r<=rows;r++) {
			String customer_name=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[2]")).getText();
			String Email=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr[\"+r+\"]//td[3]")).getText();
			String status=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr[\"+r+\"]//td[5]")).getText();
			System.out.println(customer_name+"\t"+Email+"\t"+status);
		}
		
	}

}
