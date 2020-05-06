package packOne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\eclipse-standard-kepler-SR2-win32-x86_64\\Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		/*driver.get("https://money.rediff.com/sectors/bse/bankex");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("/html/body/div[2]/div[9]/div[4]/a[22]/div[1]")).click();
		WebElement xp=driver.findElement(By.xpath("/html/body/div[2]/div[5]/div[2]/div[2]/table/tbody/tr[5]/td[1]/a"));
		System.out.println(xp.getText());*/
		
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='fldLoginUserId']")).sendKeys("123456");
		
		//driver.close();

	}

}
