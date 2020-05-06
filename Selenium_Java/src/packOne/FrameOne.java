package packOne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameOne {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\eclipse-standard-kepler-SR2-win32-x86_64\\Jars\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://docs.oracle.com/javase/7/docs/api/");
		driver.manage().window().maximize();
		
		
		// To work on different frames of a single page , we have to folow below points-:
		// 1- Find in which frame this element is present.
		// 2- Create webelement for this frame.
		// 3- Use step-2 webelement for switch purpose 
		
		WebElement Frame1 = driver.findElement(By.xpath("//*[contains(@title,'Package')]"));
		
		
		/* Differenet xpath doesnot work-1- //*[contains(@title,'Package')]-
		 * //*[contains(@title,'Package')]--worked

		 */
		
		// Now turn to switch to turn the focus into this frame, use "SWITCHTO() --> method to do the same 
		
		driver.switchTo().frame(Frame1).findElement(By.xpath("/html/body/div[2]/ul[1]/li[2]/a")).click();
		
		

	}

}
