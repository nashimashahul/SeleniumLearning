package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadFile {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_training\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.java2s.com/Code/Jar/o/Downloadojdbc14jar.htm");
		
	//maximize the window here
		driver.manage().window().maximize();
		
		//WebElement partialLink=driver.findElement(By.partialLinkText("ojdbc14"));
		//partialLink.click();
		
		
		//LinkText code
		WebElement downloadLink=driver.findElement(By.linkText("ojdbc14/ojdbc14.jar.zip( 1,454 k)"));
		
		//this line is to bring the download link to view	
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", downloadLink);
		
		 Thread.sleep(2000);
		 downloadLink.click();
	}

}
