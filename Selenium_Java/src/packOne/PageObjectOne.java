package packOne;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageObjectOne {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\eclipse-standard-kepler-SR2-win32-x86_64\\Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		PageObject_Class1 po=new PageObject_Class1();
		driver.findElement(po.id).sendKeys("deartripathi0127@gmail.com");
		driver.findElement(po.pwd).sendKeys("Papa@2017");
		driver.findElement(po.login).click();
		
		
	}

}
