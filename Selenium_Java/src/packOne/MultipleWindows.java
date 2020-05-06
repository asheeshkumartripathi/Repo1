package packOne;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class MultipleWindows {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "F:\\eclipse-standard-kepler-SR2-win32-x86_64\\Jars\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
	//	System.out.println("First window title" + driver.getTitle());
	//	List<WebElement> coun= driver.findElements(By.tagName("a"));
	//	System.out.println("Total links in first page >>>" + coun.size());
		
		
	
	//System.out.println("Second window title" + driver.getTitle());
//	List<WebElement> coun1= driver.findElements(By.tagName("a"));
//	System.out.println("Total links in first page >>>" + coun1.size());
	
	
	//	System.out.println(driver.getWindowHandle());
		driver.findElement(By.xpath("//a[@id='privacy-link']")).click();
	driver.findElement(By.xpath("//a[@id='cookie-use-link']")).click();
	Set<String> ref=driver.getWindowHandles();
	//in above statement it will store the session id but this session id won't be in sequence order so i will create one array to store it in a sequence order.
	ArrayList store = new ArrayList(ref);
	driver.switchTo().window((String)store.get(0)).findElement(By.xpath("//input[@id='email']")).sendKeys("deartripathi0127@gmail.com");
	Thread.sleep(3000);
	driver.switchTo().window((String)store.get(1)).findElement(By.id("id=pass")).sendKeys("Test@123");
	Thread.sleep(3000);
	driver.switchTo().window((String)store.get(2)).findElement(By.id("id='u_0_b")).click();
	
	//driver.findElement(By.id("//input[@id='pass']")).sendKeys("Test@123");
	//driver.findElement(By.id("//input[@id='u_0_b']")).click();
	
	
	
	/*int i;
	for (i=0;i<store.size();i++){
		System.out.println(driver.switchTo().window((String)store.get(i)).getTitle());
		List<WebElement> totallinks=driver.findElements(By.tagName("a"));
		System.out.println(totallinks.size());
		
		
		
		//above line-->application>>go to window and convert the ith value to string and store and get the title of that one
		
		
		
		
	}
	
	//System.out.println(store.size());
	
	
	driver.quit();
		
		
		*/

	}

	}
