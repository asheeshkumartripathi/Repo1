package packOne;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actio {

	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver", "F:\\eclipse-standard-kepler-SR2-win32-x86_64\\Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		/*driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		
		//Importing action class
		Actions a = new Actions(driver);
		
		//
		//WebElement jobs=driver.findElement(By.xpath("//div[@class='mTxt']"));
	//	a.moveToElement(jobs).click().build().perform();;
		a.moveToElement(driver.findElement(By.xpath("//div[@class='mTxt']"))).click().build().perform();
		driver.findElement(By.xpath("//a[@href='https://www.naukri.com/account/createaccount?othersrcp=16201&err=1']")).click();		
*/
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);		
		// refresh the application-import action class
		Actions b=new Actions(driver);	//here this driver is application where i have to perform the action
		b.sendKeys(Keys.F5).build().perform();
		Thread.sleep(3000);	
		System.out.println("done");		
		b.sendKeys(Keys.CONTROL+"t").build().perform();
		b.sendKeys(Keys.CONTROL+"n").build().perform();
		driver.close();
		
		
	}

}



