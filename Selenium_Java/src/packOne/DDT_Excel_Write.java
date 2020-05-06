package packOne;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DDT_Excel_Write {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "F:\\eclipse-standard-kepler-SR2-win32-x86_64\\Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		int a=10;
		int b=200;
		int c;
		c=a+b;
		
		//location to create the excel
		FileOutputStream file= new FileOutputStream("C:\\Users\\ASHEESH\\Documents\\Book2.xls");
		//create the file
		WritableWorkbook workb=Workbook.createWorkbook(file);
		System.out.println("test2");
		//create the sheet in excel
		WritableSheet worksh=workb.createSheet("Result1", 1);
		System.out.println("test");
		//create cells in a excel>>sheet.
		Label l=new Label(0, 0, "the value of d is ");
		worksh.addCell(l);
		Label l1=new Label(0, 1, "value in second column is" + c);
		worksh.addCell(l1);
		workb.write();workb.close();
		
		
	}

}
