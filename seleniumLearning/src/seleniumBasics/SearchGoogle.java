package seleniumBasics;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchGoogle {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_training\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		
		
			Thread.sleep(2000);
		
		
	//WebElement searchBox= 	driver.findElement(By.name("q"));
	
	//searchBox.sendKeys("Smile please");
			
		WebElement	first_Name_TextBox=driver.findElement(By.name("q"));
				first_Name_TextBox.sendKeys("osdh");
		
		Thread.sleep(2000);
		
		WebElement searchIcon=driver.findElement(By.className("sbico-c"));
		searchIcon.click();
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
	}

}
