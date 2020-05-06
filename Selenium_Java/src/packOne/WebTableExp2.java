package packOne;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableExp2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\eclipse-standard-kepler-SR2-win32-x86_64\\Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://money.rediff.com/sectors/bse/fin");
		driver.manage().window().maximize();
		WebElement table = driver.findElement(By.xpath("/html/body/div[2]/div[5]/div[2]/div[2]/table/tbody"));
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		System.out.println(rows.size());
		
		int i;
		for (i=1;i<rows.size();i++){
		//	System.out.println(table.findElement(By.xpath("tr[i]/td[1]/a")).getText());
		//	"tr[" +i  + "]/td[1]/a"
			System.out.println(table.findElement(By.xpath("tr[" +i  + "]/td[1]/a")).getText()); 
			//why like that? and if we have to check all the links having in more than 1 page.
			
			
			
			
			
		}

	}

}
