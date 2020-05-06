package packOne;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import jxl.Sheet;
import jxl.Workbook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDrivenTesting {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "F:\\eclipse-standard-kepler-SR2-win32-x86_64\\Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		FileInputStream file = new FileInputStream("C:\\Users\\ASHEESH\\Documents\\Book1.xls");
		Workbook wb=Workbook.getWorkbook(file);
		Sheet sheet=wb.getSheet("Sheet1");
		driver.get(sheet.getCell(0, 0).getContents());
		driver.manage().window().maximize();
		
		//driver.findElement(By.id(sheet.getCell(0, 1).getContents())).sendKeys(sheet.getCell(0, 2));
		//driver.findElement(By.id("email")).sendKeys("asheesh");
		driver.findElement(By.id(sheet.getCell(0, 1).getContents())).sendKeys(sheet.getCell(0, 2).getContents());
		driver.findElement(By.id(sheet.getCell(0, 3).getContents())).sendKeys(sheet.getCell(0, 4).getContents());
		driver.findElement(By.xpath(sheet.getCell(0, 5).getContents())).click();
		
		
		// System.out.println(s.getCell(0, 0).getContents());
		
		
		
		

	}

}
