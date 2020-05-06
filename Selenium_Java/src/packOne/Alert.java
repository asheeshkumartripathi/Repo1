package packOne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\eclipse-standard-kepler-SR2-win32-x86_64\\Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://netbanking.hdfcbank.com/netbanking/?_ga=2.64653800.658368529.1585282645-1927966083.1585282645");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//img[@src='/gif/continue_new1.gif?v=1']")).click();
		// ccc

	}

}
