package browserCommands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserCommands {

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
		driver.get("http://www.seleniumframework.com/Practiceform/");
		
		//command to take title of page
		String PageTitle=driver.getTitle();
		System.out.println(PageTitle);
		
		//command to take current url
		String pageurl= driver.getCurrentUrl();
		System.out.println(pageurl);
		
		//close and quite
		driver.findElement((By.xpath("//button[text()='New Browser Tab']"))).click();
		//driver.close();
		driver.quit();

	}

}
