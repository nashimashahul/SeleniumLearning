package seleniumBasicWithTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OpenGoogleWithTestNG {

	@Test
	 public  void openGoogle(){
		
	System.setProperty("webdriver.chrome.driver", "D:\\selenium_training\\chromedriver.exe");
	
	//System.setProperty("webdriver.gecko.driver", "path where u stored\\geckodriver.exe");  
    WebDriver driver = new ChromeDriver();
    driver.navigate().to("http://www.google.com");
    driver.navigate().refresh();
    driver.navigate().back();
    driver.navigate().forward();
	driver.quit();
}
}