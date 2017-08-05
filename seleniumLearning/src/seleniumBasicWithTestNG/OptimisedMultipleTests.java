package seleniumBasicWithTestNG;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import org.testng.annotations.Test;

public class OptimisedMultipleTests {
	
	WebDriver driver;
    long startTime;
    long endTime;
    long totalTime;
    
    static Logger log = Logger.getLogger(OptimisedMultipleTests.class);
    
    @BeforeSuite
     public void launchBrowser(){
    	DOMConfigurator.configure("log4j.xml");
        startTime = System.currentTimeMillis();
        
        log.info("Opening Chrome");
        System.setProperty("webdriver.chrome.driver", "D:\\selenium_training\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        log.info("Chrome is opened and maxmised");
    }
    
    @Test
    public void openGoogle(){
    	log.info("Hit the google URL");
        driver.get("http://www.google.com");  
        
        log.info("Google opened");
     //   driver.findElement(By.className("abc")).click();
    }
    
    @Test
    public void openBing(){
    	log.info("Hit the BING URL");
        driver.get("http://www.bing.com");
        log.info("BING opened");
    }
    
   @Test(enabled=false)
    public void openYahoo(){
        driver.get("http://www.yahoo.com");    
    }
    
    @AfterSuite
    public void closeBrowser(){
    	driver.quit();
    	 endTime   = System.currentTimeMillis();
         totalTime = endTime - startTime;
         System.out.println(totalTime/1000.0+" seconds");
         log.info("Test execution done. Browser closed");
    }

}
