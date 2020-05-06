package packOne;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Poi_Jar {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "F:\\eclipse-standard-kepler-SR2-win32-x86_64\\Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		FileInputStream fb=new FileInputStream("C:\\Users\\ASHEESH\\Documents\\Book1.xls");
		Thread.sleep(3000);
		HSSFWorkbook workbook=new HSSFWorkbook(fb);
		HSSFSheet sht=workbook.getSheet("Sheet1");
		driver.get(sht.getRow(0).getCell(0).getStringCellValue());
		driver.manage().window().maximize();
		driver.findElement(By.id(sht.getRow(1).getCell(0).getStringCellValue())).sendKeys(sht.getRow(2).getCell(0).getStringCellValue());
		driver.findElement(By.id(sht.getRow(3).getCell(0).getStringCellValue())).sendKeys(sht.getRow(4).getCell(0).getStringCellValue());
		driver.findElement(By.xpath(sht.getRow(5).getCell(0).getStringCellValue())).click();
		
		
		
		
		
		
		
		
		
		
		

	}

}
