package dropDown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class DropDown1 {

	public static void main(String[] args) throws InterruptedException {
		// 
		ChromeOptions ch= new ChromeOptions();
		ch.setBinary("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Abhishek\\OneDrive\\Desktop\\JAVA_JARS\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver(ch);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//get command to invoke
		driver.get("https://chandanachaitanya.github.io/selenium-practice-site/");
		
		//select class is imported from opeq selenium.
		//created instance oselect of class select
		Select oselect= new Select(driver.findElement(By.xpath("//select[@id='programming-languages']")));
		
		//methods of Select class
		oselect.selectByIndex(2);
		Thread.sleep(3000);
		
		oselect.selectByValue("Python");
		Thread.sleep(3000);
		
		oselect.selectByVisibleText("JavaScript");
		Thread.sleep(3000);
		
		List<WebElement> a= oselect.getOptions();
		for(int i=0; i<a.size();i++) {
			System.out.println(a.get(i).getText());
			
		}
		driver.close();

	}

}
