package packOne;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.java.swing.plaf.windows.resources.windows;

public class Method {
	public void methodlogin(String url){
		
		System.setProperty("webdriver.chrome.driver", "F:\\eclipse-standard-kepler-SR2-win32-x86_64\\Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("url");
		driver.manage().window().maximize();
	}

	public static void main(String[] args) {
		Method driver = new Method();
		driver.methodlogin("https://www.rediff.com/");
		
	}
}
