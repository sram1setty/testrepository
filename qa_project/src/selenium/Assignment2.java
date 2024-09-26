package selenium;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.List;


public class Assignment2 {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "/Users/sravani/Downloads/chromedriver-mac-x64/chromedriver");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("number of link:"+links.size());
		for(WebElement link:links) {
			String url=link.getAttribute("href");
			System.out.println(url);
			verifylink(url);
			
	

	
		
		public static void verifylink(String url) {
			try {
				
		
				
		
			URL link=new URL(url);
			
			HttpURLConnection httpconn=(HttpURLConnection)link.openConnection();
			httpconn.setConnectTimeout(3000);
			httpconn.connect();
			
			if(httpconn.getResponseCode()==200) {
				System.out.println(httpconn.getResponseMessage());
			}
			else {
				System.out.println(httpconn.getResponseMessage()+"the link is broken");
			}
			
				
			
		
		
		
		/*WebElement a=driver.findElement(By.linkText("Images"));
		if(a.isDisplayed()) {
			System.out.println("the text is in form of hyperlink");
		}
		else {
			System.out.println("the text is not in form of hyperlink");
		}
		
		/*driver.findElement(By.id("name")).sendKeys("Sravani");
		driver.findElement(By.id("email")).sendKeys("sravaniramisetty@gmail.com");
		driver.findElement(By.id("phone")).sendKeys("4089405192");
		driver.findElement(By.xpath("//*[@id=\"male\"]")).click();
		driver.findElement(By.id("sunday")).click();
		driver.findElement(By.id("tuesday")).click();
		driver.findElement(By.id("thursday")).click();
		driver.findElement(By.id("friday")).click();

		WebElement cn=driver.findElement(By.id("country"));
		Select country=new Select(cn);
		country.selectByVisibleText("United Kingdom");
		
		WebElement cl=driver.findElement(By.id("colors"));
		Select colors=new Select(cl);
		colors.selectByVisibleText("Blue");
		colors.selectByVisibleText("Green");
		colors.selectByVisibleText("White");
		colors.selectByVisibleText("Yellow");
		
		driver.findElement(By.xpath("//*[@id=\"HTML9\"]/div[1]/button[1]")).click();
		Alert a=driver.switchTo().alert();
		a.accept();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id=\"HTML9\"]/div[1]/button[2]")).click();
		Alert b=driver.switchTo().alert();
		b.dismiss();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@id=\"HTML9\"]/div[1]/button[3]")).click();
		Alert c=driver.switchTo().alert();
		c.sendKeys("Sravani");
		c.accept();
		Thread.sleep(5000);*/

		/*List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("number of links:"+links.size());
		
		List<WebElement> images=driver.findElements(By.tagName("img"));
		System.out.println("number of images:"+images.size());*/
		
	}

}
