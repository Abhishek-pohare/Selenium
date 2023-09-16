package browserCommands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NavigateCommand {

	public static void main(String[] args) throws InterruptedException {
		//
		ChromeOptions ch= new ChromeOptions();
		ch.setBinary("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
		
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\Abhishek\\OneDrive\\Desktop\\JAVA_JARS\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver(ch);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
		//navigate command
		driver.navigate().to("https://www.google.co.in/");
		
		//back command
		//
		Thread.sleep(5000);
		driver.navigate().back();
		
		//refresh command
		Thread.sleep(5000);
		driver.navigate().refresh();
		
		//forward command
		Thread.sleep(5000);
		driver.navigate().forward();
		
		driver.close();
		driver.quit();
		
		

	}

}
