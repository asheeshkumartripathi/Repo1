package packOne;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.Sheet;
import jxl.Workbook;
import sun.font.CreatedFontTracker;

public class DDT_Excel {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "F:\\eclipse-standard-kepler-SR2-win32-x86_64\\Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		FileInputStream file1= new FileInputStream("C:\\Users\\ASHEESH\\Documents\\Book1.xls");
		Workbook wb1=Workbook.getWorkbook(file1);
		Sheet sht=wb1.getSheet("Sheet2");
		Sheet sht1=wb1.getSheet("Sheet3");
		int i;
		int col=sht1.getColumns();
		for(i=0;i<col;i++){
			System.out.println(sht1.getCell(i, 0).getContents());
			
		}
		
		/*int row=sht.getRows();
		int column=sht.getColumns();
		int i;
		int j;
		for(i=0;i<row;i++){
			for(j=0;j<column;j++){
				System.out.println(sht.getCell(i, j).getContents());
			}
		}
		*/
		
		
		
		

	}

}
