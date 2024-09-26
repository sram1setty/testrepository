package selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Uploadfile {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/sravani/Downloads/chromedriver-mac-x64/chromedriver");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		
		driver.manage().window().maximize();
		
		//single file upload
		/*driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("/Users/sravani/Downloads/Sravani_QA.docx");
		driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText();
		if(driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText().equals("Sravani_QA.docx")) {
			System.out.println("File is succesfully uploaded");
		}
		else {
			System.out.println("upload failed");
		}
		*/
		
		//multiple file upload
		String file1="/Users/sravani/Downloads/Sravani_QA.docx";
		String file2="/Applications/Sravani_UAT_QA.docx";
		
		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(file1+"\n"+ file2);
		int nooffilesuploaded=driver.findElements(By.xpath("//ul[@id='fileList']//li")).size();
		
		//validation1 - no of files
		if(nooffilesuploaded==2) {
			System.out.println("All files are uploaded");
		}
		else {
			System.out.println("Files are not uploaded or incorrect files uploaded");
		}
		
		//validation2 - file names
		if(driver.findElement(By.xpath("//ul[@id='fileList']//li[1]")).getText().equals("Sravani_QA.docx") 
				&& driver.findElement(By.xpath("//ul[@id='fileList']//li[2]")).getText().equals("Sravani_UAT_QA.docx")){
			System.out.println("file names matching");
			
		}
		else {
			System.out.println("file are not matching");
		}
		
	}

}
