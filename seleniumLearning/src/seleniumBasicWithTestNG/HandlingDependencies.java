package seleniumBasicWithTestNG;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandlingDependencies {

	 static WebDriver driver;
	static String openedWebsite;
	
	@Test (dependsOnMethods = { "launchBrowser" })      
	public void maximizeAndGet(){
		driver.manage().window().maximize();    
		driver.get("http://www.bing.com");
		openedWebsite=driver.getTitle();		
	}
	@Test
	public void launchBrowser(){
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_training\\chromedriver.exe");
		driver = new ChromeDriver();
		//driver.quit();
	}


	@Test (dependsOnMethods={"maximizeAndGet"})
	public void searchGoogle(){
		if(openedWebsite.equalsIgnoreCase("google")){
			driver.findElement(By.name("q")).sendKeys("Facebook");
		}
		else{
			System.out.println("Google is not opened. Opened website is "+ openedWebsite);
			
		}

	}
}
