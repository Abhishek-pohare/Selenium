package browserInvoke;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class MSEdgeInvoke {

	public static void main(String[] args) {
		// 
		//EdgeOptions eo= new EdgeOptions();
		//eo.setBinary("C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge.exe");
		
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\Abhishek\\OneDrive\\Desktop\\JAVA_JARS\\driver\\msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		driver.get("https://google.co.in");
		driver.close();//will close the last instance of driver
		driver.quit();//will quite all the instances of this driver.

	}

}
