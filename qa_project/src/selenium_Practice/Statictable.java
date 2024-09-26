package selenium_Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Statictable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/sravani/Downloads/chromedriver-mac-x64/chromedriver");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		//find total number of rows in a table
		int rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		//int rows=driver.findElements(By.tagName("tr")).size();
		
		System.out.println("Number of rows:"+rows);
		
		//find total number of columns in a table
		int cols=driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		//int cols=driver.findElements(By.tagName("th")).size()
		System.out.println("Number of columns is:"+cols);
		
		//Read data from specific row and column
		String bookname=driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText();
		System.out.println(bookname);
		
		String subject=driver.findElement(By.xpath("//table[@name='BookTable']//tr[4]//td[3]")).getText();
		System.out.println(subject);
		
		//Read data from all the rows and cols
		
		/*System.out.println("BookName"+"\t"+"Author"+"\t"+"Subject"+"\t"+"Price");
		for(int r=2;r<=rows;r++) {
			for(int c=1;c<=cols;c++) {
				String value=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
				System.out.print(value+"\t");
			}
			System.out.println();
		}
		*/
		
		//print book names whose author is Mukesh
		/*for(int r=2;r<=rows;r++) {
			String authorname=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();

			//System.out.println(authorname);
			if(authorname.equals("Mukesh")) {
				String bookname1=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();

				System.out.println(bookname1+"\t"+authorname);
			}
		}
		
		*/
		
		//Find total price of all books
		int total=0;
		for(int r=2;r<=rows;r++) {
			String price=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
			//System.out.println(price);
			total=total+Integer.parseInt(price);
			
		}
		System.out.println("total price of the books:"+total);
		
		
		
	}

}
