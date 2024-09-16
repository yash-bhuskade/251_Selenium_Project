package BasePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	
	WebDriver driver;
	LoginPage lp;
	
	@BeforeMethod
	void setUp(){
		driver = new ChromeDriver();
		driver.get("file:///D:/Selenium%20Data/Offline%20Website/index.html");
		
		LoginPage lp = new LoginPage();
	}
	
	@AfterMethod
	void tearDown() {
		driver.close();
		driver.quit();
	}
}
