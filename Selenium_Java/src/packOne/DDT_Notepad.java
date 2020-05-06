package packOne;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.stream.Stream;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.corba.se.spi.ior.Writeable;

public class DDT_Notepad {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "F:\\eclipse-standard-kepler-SR2-win32-x86_64\\Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		FileReader notepadfile=new FileReader("C:\\Users\\ASHEESH\\Desktop\\New Text Document (2).txt");
		BufferedReader readdata=new BufferedReader(notepadfile);
		System.out.println("working till here");
		 System.out.println(readdata.readLine());
		// Reading from multiple rows in a textfile
		 
		 FileReader file=new FileReader("C:\\Users\\ASHEESH\\Desktop\\Sel.txt");
		 BufferedReader read=new BufferedReader(file);
		 String a;
		 while((a=read.readLine())!=null){
			 System.out.println(a);
			 
		 }
		 
		 // Writing data on notepad
		 
		 FileWriter writ = new FileWriter("C:\\Users\\ASHEESH\\Desktop\\Sel2.txt");
		 BufferedWriter rt=new BufferedWriter(writ);
		 rt.write("This is the test example for writing the data on notepad");
		 rt.newLine();
		 rt.write("test 31032020");
		 
		 rt.close();
		 //rt.write("This is the test example to test the details of notepad on new line");
		 
		 
		 
		 
		

	}

}
