package packOne;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synch {

	public static void main(String[] args) throws Exception {
		/* 	There are three types of synchronization.
		 * 1. Explicit Sync.
		 * 2. Implicit Sync.
		 * 3. Webdriver Wait*/
		System.setProperty("webdriver.chrome.driver", "F:\\eclipse-standard-kepler-SR2-win32-x86_64\\Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(5000);
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		WebDriverWait ww=new WebDriverWait(driver, 30);
		ww.until(ExpectedConditions.urlContains("recover"));
		
		
	}

}
