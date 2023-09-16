package screenshot;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions ch= new ChromeOptions();
		ch.setBinary("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Abhishek\\OneDrive\\Desktop\\JAVA_JARS\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver(ch);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://google.co.in/");
		
		TakesScreenshot ss= ((TakesScreenshot)driver);
		File cf=ss.getScreenshotAs(OutputType.FILE);
		
		//take current date and time
		SimpleDateFormat df= new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date= new Date();
		String abc= df.format(date).toString().replace("/", "");
		String newfile= abc.replace(" ", "").replace(":", "");
		System.out.println(newfile);
		
		String CapturePath= "C:\\Users\\Abhishek\\OneDrive\\Desktop\\TestSS\\"+newfile+".png";
		
		try {
			//save the screenshot in destination path
			FileHandler.copy(cf, new File(CapturePath));
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			
		}
		

	}

}
