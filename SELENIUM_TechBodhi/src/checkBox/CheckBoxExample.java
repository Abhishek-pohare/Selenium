package checkBox;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CheckBoxExample {

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
		driver.get("https://chandanachaitanya.github.io/selenium-practice-site/");
		
		//just to check is it selected or not== true/false value
		//CB variable is a boolean just true or false values...to check element is selected or not
		//isSelected method is used.
		boolean CB=driver.findElement(By.xpath("//*[contains(@name,'vehicle')]")).isSelected();
		System.out.println(CB);
		
		//we are using findElements here because of collection of elements i.e more than one element.
		//and store into variable checkB-- return type of this variable is List
		List<WebElement> CheckB= driver.findElements(By.xpath("//*[contains(@name,'vehicle')]"));
		//contains is used in above line because value=vehicle has little changes  
		System.out.println(CheckB.size());
		
		// for loop is to get all elements .
		for(int i=0;i<CheckB.size();i++) {
			System.out.println(CheckB.get(i).getAttribute("value"));
			CheckB.get(i).click();
		}
		driver.close();

	}

}
