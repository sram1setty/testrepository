package selenium_Practice;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getmethods {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		System.setProperty("webdriver.chrome.driver", "/Users/sravani/Downloads/chromedriver-mac-x64/chromedriver");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.get("https://testautomationpractice.blogspot.com/");
		//Thread.sleep(5000);
		
		
		
		/*System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		
		String windowid=driver.getWindowHandle();
		System.out.println("Window ID:"+windowid);
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Set<String> windowids=driver.getWindowHandles();
		
		System.out.println(windowids);*/
		
		//WebElement logo=driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[2]/div[1]/a/img"));
		//System.out.println("Display status of logo:"+logo.isDisplayed());
		//boolean status=driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[2]/div[1]/a/img")).isDisplayed();
		//System.out.println("Display status:"+status);
		
		//boolean status=driver.findElement(By.xpath("//*[@id=\"FirstName\"]")).isEnabled();
		//System.out.println("Enable status:"+status);
		
		/*WebElement male_rd=driver.findElement(By.xpath("//*[@id=\"gender-male\"]"));
		WebElement female_rd=driver.findElement(By.xpath("//*[@id=\"gender-female\"]"));
		
		System.out.println("Before selection....");
		System.out.println(male_rd.isSelected());
		System.out.println(female_rd.isSelected());
		
		
		male_rd.click();
		System.out.println("After selection....");
		System.out.println(male_rd.isSelected());
		System.out.println(female_rd.isSelected());
		
		boolean newsletterstatus=driver.findElement(By.xpath("//*[@id=\"Newsletter\"]")).isSelected();
		System.out.println("newsletter checkbox status is:"+newsletterstatus);*/
		
		
		/*URL myurl=new URL("https://demo.nopcommerce.com");
		driver.navigate().to("myurl");
		
		driver.navigate().to("https://demo.nopcommerce.com/");
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().refresh();*/
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Set<String> windowIDs=driver.getWindowHandles();
		
		List<String> windowlist=new ArrayList<String>(windowIDs);
		String parentID=windowlist.get(0);
		String childID=windowlist.get(1);
		

		driver.switchTo().window(childID);
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(parentID);
		System.out.println(driver.getTitle());
		
		for(String winID:windowIDs) 
		{
			String title=driver.switchTo().window(winID).getTitle();
			System.out.println(title);
			if(title.equals("OrangeHRM")) {
				System.out.println(driver.getCurrentUrl());
				driver.close();
			}
		}
		
		
		
	}

}
