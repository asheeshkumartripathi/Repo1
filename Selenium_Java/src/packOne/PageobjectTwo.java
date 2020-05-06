package packOne;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import jxl.Sheet;
import jxl.Workbook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class PageobjectTwo {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "F:\\eclipse-standard-kepler-SR2-win32-x86_64\\Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		FileInputStream fi=new FileInputStream("C:\\Users\\ASHEESH\\Documents\\Book1.xls");
		Workbook wb= Workbook.getWorkbook(fi);
		Sheet sht= wb.getSheet("Sheet1");
		//sht.getCell(0, 0);
		driver.get(sht.getCell(0, 0).getContents());
		driver.manage().window().maximize();
		
		
		PageobjectClass2 ob= PageFactory.initElements(driver, PageobjectClass2.class);
		ob.id.sendKeys(sht.getCell(0, 2).getContents());
		
		
		ob.pwd.sendKeys(sht.getCell(0, 4).getContents());
		ob.login.click();
		
	
		
	}

}
