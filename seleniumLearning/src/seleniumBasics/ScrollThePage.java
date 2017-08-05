package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollThePage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//launch the browser and hit the URL
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_training\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.echoecho.com/htmlforms11.htm");
		
	//maximize the window here
		driver.manage().window().maximize();
		
		  ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
		  
		  Thread.sleep(2000);
		
		  WebElement previousButton = driver.findElement(By.className("boxprevnext"));
		  
	        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", previousButton);

		
	}

}
