package packOne;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameThree {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\eclipse-standard-kepler-SR2-win32-x86_64\\Jars\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://docs.oracle.com/javase/7/docs/api/");
		driver.manage().window().maximize();
		WebElement total = driver.findElement(By.xpath("/html/frameset"));
		
		List<WebElement> countframe= total.findElements(By.tagName("frame"));
		System.out.println(countframe.size());
		
		
		WebElement frame1=driver.findElement(By.xpath("/html/frameset/frameset/frame[1]"));
		List<WebElement> FirstFrame=driver.switchTo().frame(frame1).findElements(By.tagName("a"));
		
		//= frame1.findElements(By.tagName("a"));
		
		System.out.println("Total links in this first frame " + FirstFrame.size());
		int i;
		for(i=1;i<FirstFrame.size();i++){
			System.out.println(FirstFrame.get(i).getText());
		}
		
		///html/body/div[5]/table/tbody[2]
		driver.switchTo().parentFrame();
		WebElement frame2=driver.findElement(By.xpath("/html/frameset/frameset/frame[2]"));
		List<WebElement> SecondFrame=driver.switchTo().frame(frame2).findElements(By.tagName("a"));
		System.out.println("Total links in this second frame " + SecondFrame.size());
		int j;
		for(j=1;j<SecondFrame.size();j++){
			System.out.println(SecondFrame.get(j).getText());
		}
		
		driver.switchTo().parentFrame();
	//	WebElement Frame3 = driver.findElement(By.xpath("/html/body/div[5]/table/tbody[2]"));
		WebElement Frame3 = driver.findElement(By.xpath("/html/frameset/frame"));
		System.out.println("pass");
		List<WebElement> Store = driver.switchTo().frame(Frame3).findElements(By.tagName("tr"));
		System.out.println("Total links in this third frame or first table " + Store.size());
		int k;
		for (k=1;k<Store.size();k++){
			System.out.println(Store.get(k).getText());
			
			
			
		}

	}

}
