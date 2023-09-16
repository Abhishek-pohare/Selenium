package javascriptExecuter;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class JSExecuter {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions ch= new ChromeOptions();
		ch.setBinary("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Abhishek\\OneDrive\\Desktop\\JAVA_JARS\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver(ch);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://chandanachaitanya.github.io/selenium-practice-site/");
		Thread.sleep(3000);
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		//vertical scroll-down by 500
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(1000);
		//horizontal
		js.executeScript("window.scrollBy(500,0)");
		Thread.sleep(1000);
		//go till last
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(1000);
		
		//enter text
		js.executeScript("document.getElementById('enterText').value='abhi';");
		Thread.sleep(1000);
		
		//refresh
		/*js.executeScript("history.go(0)");
		js.executeScript("location.reload()"); */
		
		System.out.println(js.executeScript("return window.innerHeight;"));
		System.out.println(js.executeScript("return window.innerWidth;"));
		

	}

}
