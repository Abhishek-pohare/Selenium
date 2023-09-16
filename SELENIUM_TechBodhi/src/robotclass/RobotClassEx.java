package robotclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RobotClassEx {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		ChromeOptions ch= new ChromeOptions();
		ch.setBinary("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Abhishek\\OneDrive\\Desktop\\JAVA_JARS\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver(ch);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//get command to invoke
		driver.get("https://www.naukri.com/registration/createAccount");
		
		//specify the file location
		StringSelection sl= new StringSelection("C:\\Users\\Abhishek\\OneDrive\\Documents\\AbhishekDoc\\MyResume.pdf");
		
		//copy to clipboard
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sl, null);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='uploadResume resman-btn-primary resman-btn-small']")).click();
		Thread.sleep(1000);
		
		//create object of robot class
		Robot robot= new Robot();
		Thread.sleep(1000);
	
		//press enter
		robot.keyPress(KeyEvent.VK_ENTER);
		//release key
		robot.keyRelease(KeyEvent.VK_ENTER);
		//press ctrl+v
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		//release ctrl+v
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		Thread.sleep(1000);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		driver.findElement(By.xpath("//i[@class='resman-icon resman-icon-delete']")).click();
		Thread.sleep(1000);
		driver.close();
		

	}

}
