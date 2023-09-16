package actionclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Action_More {

	
		// TODO Auto-generated method stub
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			ChromeOptions ch= new ChromeOptions();
			ch.setBinary("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Abhishek\\OneDrive\\Desktop\\JAVA_JARS\\driver\\chromedriver.exe");
			WebDriver driver= new ChromeDriver(ch);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://www.facebook.com/");
			Thread.sleep(3000);
			
			WebElement username= driver.findElement(By.xpath("//input[@id='email']"));
			
			Actions builder= new Actions(driver);
			
			Action series= builder.moveToElement(username).click().keyDown(username,Keys.SHIFT)
					.sendKeys(username,"abhishek").keyUp(username,Keys.SHIFT).doubleClick(username)
					.contextClick().build();
			series.perform();

	}

}
