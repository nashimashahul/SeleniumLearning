package seleniumBasicWithTestNG;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class DecideBrowserAtRunTime {

	WebDriver driver;


	@BeforeSuite
	@Parameters ("browser")
	public void launchBrowser(String ChosenBrowser){
		if(ChosenBrowser.equalsIgnoreCase("Firefox")){
			System.out.println("You have chosen "+ ChosenBrowser);
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Elcot\\Desktop\\drivers\\gecko\\geckodriver.exe");  
			// Launch the FireFox browser.
			driver = new FirefoxDriver();

		} else if (ChosenBrowser.equalsIgnoreCase("Chrome")) {
			System.out.println("You have chosen "+ ChosenBrowser);
			System.setProperty("webdriver.chrome.driver", "D:\\selenium_training\\chromedriver.exe");  
			// Launch the FireFox browser.
			driver = new ChromeDriver();

		} else if (ChosenBrowser.equalsIgnoreCase("IE")) {
			System.out.println("You have chosen "+ ChosenBrowser);
			System.out.println("May God bless You! I prefer Firefox only");
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Elcot\\Desktop\\drivers\\gecko\\geckodriver.exe");  
			// Launch the FireFox browser.
			driver = new FirefoxDriver();
		}

		driver.manage().window().maximize();
	}
}


