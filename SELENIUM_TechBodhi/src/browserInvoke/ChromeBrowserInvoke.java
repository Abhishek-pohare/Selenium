package browserInvoke;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeBrowserInvoke {

	public static void main(String[] args) {
		// 
		ChromeOptions ch= new ChromeOptions();
		ch.setBinary("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
		
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\Abhishek\\OneDrive\\Desktop\\JAVA_JARS\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver(ch);
		driver.get("https://www.google.co.in/");

	}

}
