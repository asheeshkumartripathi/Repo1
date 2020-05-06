package packOne;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Page68 {

	public static void main(String[] args) {
		
		System.setProperty("driver.chrome.driver", "C:\\Users\\ASHEESH\\Desktop\\SelJava\\Jars\\chromedriver.exe");
		WebDriver driver2 = new ChromeDriver();
		driver2.get("http:\\facebook.com");
		driver2.manage().window().maximize();
		driver2.close();
			
			
		}
		
	}
	




