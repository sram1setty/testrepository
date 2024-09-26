package selenium_Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicPaginationtable2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/sravani/Downloads/chromedriver-mac-x64/chromedriver");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement ele=driver.findElement(By.xpath("//h2[normalize-space()='Pagination Table']"));
		js.executeScript("arguments[0].scrollIntoView()", ele);
		
		int rows=driver.findElements(By.xpath("//table[@id='productTable']//tbody//tr")).size();
		
		int cols=driver.findElements(By.xpath("//table[@id='productTable']//th")).size();
		
		for(int p=1;p<=4;p++) {
			if(p>1) {
				WebElement active_page=driver.findElement(By.xpath("//ul[@class='pagination']//*[text()="+p+"]"));
				active_page.click();
				Thread.sleep(3000);
				
			}
			for(int r=1;r<=rows;r++) {
				String id=driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr["+r+"]//td[1]")).getText();
				String name=driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr["+r+"]//td[2]")).getText();
				String price=driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr["+r+"]//td[3]")).getText();
				driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr["+r+"]//td[4]")).click();

				System.out.println(id+"\t"+name+"\t"+price);
			}
		}
		
	
		
		
		/*for(int r=1;r<=rows;r++) {
			for(int c=1;c<=cols;c++) {
				
				String value=driver.findElement(By.xpath("//table[@id='productTable']//tr["+r+"]//td["+c+"]")).getText();
				
				WebElement checkbox=driver.findElement(By.xpath(".//input[@type='checkbox']"));
				if(checkbox != null && !checkbox.isSelected()) {
					checkbox.click();
					
				}
				
				
			
				System.out.print(value+"\t");
			}
			System.out.println(); */
		}
			
		
	}



