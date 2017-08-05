package seleniumBasicWithTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class MultipleTests {
	
	@Test
	public void openGoogle(){
        long startTime = System.currentTimeMillis();

		System.setProperty("webdriver.chrome.driver", "D:\\selenium_training\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		    driver.navigate().to("http://www.google.com");	  
		    driver.quit();
		    long endTime   = System.currentTimeMillis();
	        long totalTime = endTime - startTime;
	        System.out.println(totalTime/1000.0+" seconds");
	        driver.quit();
	}

	@Test (enabled=false)
	public void openYahoo(){
        long startTime = System.currentTimeMillis();

		System.setProperty("webdriver.chrome.driver", "D:\\selenium_training\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		    driver.navigate().to("http://www.yahoo.com");	  
		    driver.quit();
		    long endTime   = System.currentTimeMillis();
	        long totalTime = endTime - startTime;
	        System.out.println(totalTime/1000.0+" seconds");
driver.quit();
	}
	
	@Test
	public void openBing(){
        long startTime = System.currentTimeMillis();

		System.setProperty("webdriver.chrome.driver", "D:\\selenium_training\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		    driver.navigate().to("http://www.bing.com");	  
		    driver.quit();
		    long endTime   = System.currentTimeMillis();
	        long totalTime = endTime - startTime;
	        System.out.println(totalTime/1000.0+" seconds");
	        driver.quit();
	}
	

}
