package browserInvoke;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FirefoxInvoke {

	public static void main(String[] args) {
		FirefoxOptions fo= new FirefoxOptions();
		fo.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		
		System.setProperty("webdriver.gecko.driver", 
				"C:\\Users\\Abhishek\\OneDrive\\Desktop\\JAVA_JARS\\driver\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver(fo);
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in");
		driver.close();

	}

}
