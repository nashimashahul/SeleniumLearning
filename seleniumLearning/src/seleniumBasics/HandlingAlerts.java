package seleniumBasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_training\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.javascriptkit.com/javatutors/alert2.shtml");
		
	//maximize the window here
		driver.manage().window().maximize();
			
		//click the first alert box 
		WebElement firstAlertBox=driver.findElement(By.name("B2"));
		firstAlertBox.click();
		
		Thread.sleep(2000);
		//press ok on the first alert box
		Alert alert= driver.switchTo().alert();
        alert.accept();
		
        
        //finding the second alert box
        
        WebElement secondAlertBox=driver.findElement(By.name("B3"));
        secondAlertBox.click();
        
        Thread.sleep(2000);
        //pressing cancel button
        Alert alert2 = driver.switchTo().alert();
        alert2.dismiss();
        Thread.sleep(2000);
        alert2.accept();
        
        
        //finding the third alert box
        WebElement thirdAlertBox=driver.findElement(By.name("B4"));
        thirdAlertBox.click();
        Thread.sleep(2000);
        
        Alert alert3 = driver.switchTo().alert();
        alert3.sendKeys("Agni");
        Thread.sleep(2000);
        alert3.accept();
        Thread.sleep(2000);
        alert3.accept();
	}

}
