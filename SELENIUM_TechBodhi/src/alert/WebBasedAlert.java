package alert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebBasedAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions ch= new ChromeOptions();
		ch.setBinary("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Abhishek\\OneDrive\\Desktop\\JAVA_JARS\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver(ch);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//get command to invoke
		driver.get("https://chandanachaitanya.github.io/selenium-practice-site/");
		driver.findElement(By.xpath("//button[@id='confirmBox']")).click();
		
		Alert al= driver.switchTo().alert();
		System.out.println(al.getText());
		al.accept();
		al.sendKeys("abc");
		driver.close();

	}

}
