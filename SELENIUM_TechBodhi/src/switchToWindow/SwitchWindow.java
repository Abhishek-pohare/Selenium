package switchToWindow;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SwitchWindow {

	public static void main(String[] args) throws InterruptedException {
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
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='win1']")).click();
		
		//get handles
		String mainwindow= driver.getWindowHandle();
		System.out.println(mainwindow);
		Set<String> allwindow= driver.getWindowHandles();
		System.out.println(allwindow);
		
		Iterator<String> iterator= allwindow.iterator();
		while(iterator.hasNext()) {
			String childwindow= iterator.next();
			if(!mainwindow.equals(childwindow)) {
				driver.switchTo().window(childwindow);
				System.out.println(driver.switchTo().window(childwindow).getTitle());
				driver.close();
			}
			//switch to parent window
			driver.switchTo().window(mainwindow);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@value='Sedan']")).click();
			Thread.sleep(1000);
		System.out.println(driver.getTitle());
			//driver.close();
		}

	}

}
