package iframe;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IFrameExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions ch= new ChromeOptions();
		ch.setBinary("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Abhishek\\OneDrive\\Desktop\\JAVA_JARS\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver(ch);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://selenium08.blogspot.com/2019/11/selenium-iframe.html");
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@name='iframe_a']")));
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h2[text()='Jobs in India']//following::a[1]")).click();
		
		driver.switchTo().defaultContent();
		
		System.out.println("hi");
		
		//driver.switchTo().defaultContent();

	}

}
