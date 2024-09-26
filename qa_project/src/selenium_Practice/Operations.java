package selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Operations {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/sravani/Downloads/chromedriver-mac-x64/chromedriver");
		ChromeDriver driver=new ChromeDriver();
		//driver.get("https://demo.opencart.com/");
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		
		

		
		//Right click
		//driver.switchTo().frame("iframeResult");

		Actions rc=new Actions(driver);
		/*WebElement button=driver.findElement(By.xpath("//*[@id=\"top\"]/div/div[2]/ul/li[2]/div/a/span"));
		rc.contextClick(button).build().perform();*/
		
		//Mouse hover
		/*WebElement b2=driver.findElement(By.xpath("//*[@id=\"narbar-menu\"]/ul/li[1]/a"));
		rc.moveToElement(b2).build().perform();
		driver.findElement(By.xpath("//*[@id=\"narbar-menu\"]/ul/li[1]/div/div/ul/li[2]/a")).click();*/
		
		//double click
		/*WebElement box1=driver.findElement(By.xpath("//*[@id=\"field1\"]"));
		WebElement box2=driver.findElement(By.xpath("//*[@id=\"field2\"]"));
		WebElement b3=driver.findElement(By.xpath("/html/body/button"));
		box1.clear();
		box1.sendKeys("Welcome");
		
		rc.doubleClick(b3).build().perform();
		
		String text=box2.getAttribute("value");
		System.out.println("captured value is:"+text);
		
		if(text.equals("Welcome")) {
			System.out.println("text copied.");
		}
		else {
			System.out.println("text not copied");
		} 
		*/
		
		//drag and drop
		WebElement rome=driver.findElement(By.id("box6"));
		WebElement italy=driver.findElement(By.id("box106"));
		rc.dragAndDrop(rome,italy).build().perform();
		
		
		
				
		
	}

}
