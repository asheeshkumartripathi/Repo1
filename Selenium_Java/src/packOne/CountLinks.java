package packOne;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountLinks {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\eclipse-standard-kepler-SR2-win32-x86_64\\Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
		List<WebElement> Elem =driver.findElements(By.tagName("a"));
		int i;
		// System.out.println(Elem.size());
		for (i=0;i<Elem.size();i++){
			System.out.println(Elem.get(i).getText() );		
					
		}
		
		driver.close();

	}

}
