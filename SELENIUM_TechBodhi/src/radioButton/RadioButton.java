package radioButton;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RadioButton {

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
		
		boolean RadioButtonSelected= driver.findElement(By.xpath("//input[@value='Novels']")).isSelected();
		System.out.println(RadioButtonSelected);
		
		if(RadioButtonSelected== false) {
			driver.findElement(By.xpath("//input[@value='Novels']")).click();
		}
		
		List<WebElement> RadioButtons= driver.findElements(By.xpath("//input[@name='books']"));
		System.out.println(RadioButtons.size());
		
		for(int i=0;i<RadioButtons.size();i++) {
			String a= RadioButtons.get(i).getAttribute("value");
			System.out.println(a);
		}
		
		driver.close();
	}

}
