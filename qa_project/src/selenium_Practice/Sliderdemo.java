package selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sliderdemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/sravani/Downloads/chromedriver-mac-x64/chromedriver");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		
		//min slider
		WebElement minslider=driver.findElement(By.xpath("//*[@id=\"slider-range\"]/span[1]"));
		System.out.println("Location of the min slider"+minslider.getLocation());
		act.dragAndDropBy(minslider, 100, 250).build().perform();
		System.out.println("Location of the min slider after moving"+minslider.getLocation());
		
		//max slider
		WebElement maxslider=driver.findElement(By.xpath("//*[@id=\"slider-range\"]/span[2]"));
		System.out.println("lLocation of max slider"+maxslider.getLocation());
		act.dragAndDropBy(maxslider, -100, 289).build().perform();
		System.out.println("Location of max slider"+maxslider.getLocation());
		
		
	}

}
