package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_training\\chromedriver.exe");
	
		//System.setProperty("webdriver.gecko.driver", "path where u stored\\geckodriver.exe");  
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://www.google.com");
       String title=driver.getTitle();
        System.out.println(title);
        
        if(title.equals("google")){
        	System.out.println("PASS");
        }else{
        	System.out.println("FAIL");
        }
        
        driver.navigate().refresh();
        driver.navigate().back();
        driver.navigate().forward();
       driver.quit();
	
	}

}
