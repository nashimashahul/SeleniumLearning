package seleniumBasicWithTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class ParametrizationExample {

	WebDriver driver;

	@BeforeSuite
	@Parameters ("testingType")
	public void launchBrowser(String testingType){
		if(testingType.equalsIgnoreCase("Functional")){
			System.out.println("You are "+ testingType);
			System.out.println("Test cases for funtional testing");

		} else if (testingType.equalsIgnoreCase("Regression")) {
			System.out.println("You are "+ testingType);
			System.out.println("Test cases for Regression testing");

		} else if (testingType.equalsIgnoreCase("Performance")) {
			System.out.println("You are "+ testingType);
			System.out.println("Test cases for performace testing");
		}

	}


}
