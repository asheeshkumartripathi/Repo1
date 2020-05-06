package packOne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice73 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\eclipse-standard-kepler-SR2-win32-x86_64\\Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.findElement(By.xpath("//a[@href='http://register.rediff.com/register/register.php?FormName=user_details']")).click();
		driver.findElement(By.xpath(""));
		

	}

}
