package seleniumBasics;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_training\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.filehosting.org/");
		
	//maximize the window here
		driver.manage().window().maximize();
		
		
		//find the upload button
		WebElement chooseFile=driver.findElement(By.name("upload_file"));
		
		//click the chooseFile button
		chooseFile.click();
		
		uploadFile("C:\\AiOLog.txt");
		
	}

	/*
     * This method uses String selection and uses clipboard.
     * Clip board is the location where windows stores the copied files temporarily until
     * it is pasted.  
     */
    private static void setClipboardData(String string) {
        // TODO Auto-generated method stub
        //StringSelection is a class that can be used for copy and paste operations.

           StringSelection stringSelection = new StringSelection(string);
           Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
        }
	
	
	/*
     * This method is written using Robot class.
     * This will simulate the control+c and control+v operations
     * You can see, we are using key press and key release actions.
     */

    private static void uploadFile(String fileLocation) {
        // TODO Auto-generated method stub
        try {
            //Setting clip board with file location
            setClipboardData(fileLocation);
            //native key strokes for CTRL, V and ENTER keys
            Robot robot = new Robot();
            robot.delay(1000);
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.delay(1000);
        } catch (Exception exp) {
            exp.printStackTrace();
        }
    }

}
