package dropDown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MultipleSelect {

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
		
		Select s= new Select(driver.findElement(By.xpath("//select[@id='selenium_suite']")));
		
		s.selectByVisibleText("Selenium RC");
		Thread.sleep(2000);
		
		s.selectByValue("Grid");
		Thread.sleep(2000);//thread will compulsary wait
		
		/*List<WebElement> a= s.getOptions();
		for(int i=0; i<a.size();i++) {
			System.out.println(a.get(i).getText());
			
		}*/
		
		//explicitely wait conditions
		WebDriverWait wait = new WebDriverWait(driver, 10);
	 //   WebElement element = wait.until(ExpectedConditions.elementToBeClickable(null));
	    driver.close();

	}

}
