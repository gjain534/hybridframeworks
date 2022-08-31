package BaseLayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	protected static WebDriver driver;
	
	public static void initialization() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\gjain\\Desktop\\New folder\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	
	}
}
