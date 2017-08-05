package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_training\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.echoecho.com/htmlforms11.htm");
		
	//maximize the window here
		driver.manage().window().maximize();
		
		//Select selectValue= new Select(dropDown);
	WebElement dropDown=driver.findElement(By.name("dropdownmenu"));
		
		Select selectMilk = new Select(dropDown);
		selectMilk.selectByVisibleText("Milk");
		Thread.sleep(2000);
		selectMilk.selectByIndex(0);
		Thread.sleep(2000);
		selectMilk.selectByValue("Cheese");
	}

}
