package seleniumBasicWithTestNG;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;



public class ParallelExecution {

	public static ExtentReports reports;
	public static ExtentTest test;

	@BeforeSuite
	public void setUp(){
		reports = new ExtentReports("D:\\selenium_training\\testreport.html",true);
		reports.loadConfig(new File("D:\\selenium_training\\config.xml"));	
	}


	@Test
	public void openGoogle(){
		try{
			test=reports.startTest("openGoogle");
			System.setProperty("webdriver.chrome.driver", "D:\\selenium_training\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			test.log(LogStatus.INFO, "Browser Launched");
			driver.get("http://www.google.com");

			String title= driver.getTitle();

			driver.findElement(By.name("abcd")).sendKeys("this wont work");



			if(title.equalsIgnoreCase("google")){
				test.log(LogStatus.PASS, "google title matched");
			}
			else{
				test.log(LogStatus.FAIL, "google is not opened");
			}
			driver.quit();
		}
		catch (Exception e){
			test.log(LogStatus.ERROR, e);
			reports.flush();
		}


	}


	@Test
	public void openBing(){
		test=reports.startTest("openBing");
		//System.setProperty("webdriver.gecko.driver", "D:\\selenium_training\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_training\\chromedriver.exe");
		test.log(LogStatus.INFO, "Browser Launched");
		WebDriver	driver = new ChromeDriver();
		driver.get("http://www.bing.com");

		String title= driver.getTitle();

		if(title.equalsIgnoreCase("bing")){
			test.log(LogStatus.PASS, "bing title matched");
		}
		else{
			test.log(LogStatus.FAIL, "bing title not matched");
		}
		driver.quit();
	}

	@AfterSuite
	public void afterSuite(){
		reports.flush();
	}



}
