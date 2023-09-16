package facebook_button;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Facebook {

	public static void main(String[] args) {
		// 
		ChromeOptions ch= new ChromeOptions();
		ch.setBinary("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Abhishek\\OneDrive\\Desktop\\JAVA_JARS\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver(ch);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//get command to invoke
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//input[@data-testid='royal_email']")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//input[@data-testid='royal_pass']")).sendKeys("1234");
		driver.findElement(By.xpath("//button[@name='login']")).click();

	}

}
