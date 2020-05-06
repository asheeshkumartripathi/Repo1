package packOne;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableExp3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\eclipse-standard-kepler-SR2-win32-x86_64\\Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://money.rediff.com/sectors/bse/bankex");
		driver.manage().window().maximize();
		WebElement table = driver.findElement(By.xpath("/html/body/div[2]/div[5]/div[2]/div[2]/table/tbody"));
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		int i;
		
		for(i=1;i<rows.size();i++){
			//System.out.println(i);
			String a= table.findElement(By.xpath("tr[" +i + "]/td[1]/a")).getText();
			//System.out.println(a);
			
			if(a.contains("HDFC Bank Ltd.")==true){
				//String j = table.findElement(By.xpath("tr[i]/td[5]")).getText();
		//		System.out.println("The row number is " +i  + " and the percentage change is "  +  j);

			System.out.println("The row number is " +i  + " and the percentage change is "  +  table.findElement(By.xpath("tr[" +i + "]/td[5]")).getText());
			System.out.println("PAHLI BAR CHALO KUCHH TO HUA :) ");
			
			
				
				
			
			
				
				
			
		
				
			}
			
		}

	}

}
