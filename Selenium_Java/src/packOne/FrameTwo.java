package packOne;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameTwo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\eclipse-standard-kepler-SR2-win32-x86_64\\Jars\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://docs.oracle.com/javase/7/docs/api/");
		driver.manage().window().maximize();
		
		WebElement frametwo = driver.findElement(By.xpath("/html/frameset/frameset/frame[2]"));
		List<WebElement> links = driver.switchTo().frame(frametwo).findElements(By.tagName("a"));
		
		
		//WebElement frametwo = driver.findElement(By.xpath("/html/body/h1"));
		//Not working-"//*[contains(@href,'allclasses-frame.html')]" || //a[@href='allclasses-frame.html']  || will ask to Kishore tomorrow
		
		//List<WebElement> links =driver.switchTo().frame(frametwo).findElements(By.tagName("a"));
		int i;
		for(i=1;i<links.size();i++){
			System.out.println(links.get(i).getText());
			
		}
		
	}

}
