package packOne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "F:\\eclipse-standard-kepler-SR2-win32-x86_64\\Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Asheesh@gmail.com");
		driver.findElement(By.xpath("//*[starts-with(@id,'pass')]")).sendKeys("Infy@123");
		driver.findElement(By.xpath("//*[starts-with(@id,'day')]")).sendKeys("1");		
		driver.findElement(By.xpath("//select[@id='month']")).sendKeys("Feb"); 
		driver.findElement(By.xpath("//*[contains (@id,'year')]")).sendKeys("1996");
		
		
	}

}
