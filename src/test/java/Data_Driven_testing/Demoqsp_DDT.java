package Data_Driven_testing;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.bytebuddy.asm.Advice.Return;


public class Demoqsp_DDT {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		// TODO Auto-generated method stub

		FileInputStream fis= new FileInputStream("C:\\Users\\Lenovo\\OneDrive\\Desktop\\Book02.xlsx");
		
		Workbook wbf = WorkbookFactory.create(fis);
		 org.apache.poi.ss.usermodel.Sheet sh = wbf.getSheet("input");
		 
		  Row r = sh.getRow(0);
		 Cell c = r.getCell(0);
		 String username= c.getStringCellValue();
		 
		  Row r2 = sh.getRow(3);
			 Cell c2 = r2.getCell(2);
			 String emailid= c2.getStringCellValue();
			 
			 Row r3 = sh.getRow(2);
				 Cell c3 = r3.getCell(2);
				 String pass= c3.getStringCellValue();
				 
				 
//				  Row r4 = sh.getRow(0);
//					 Cell c4 = r4.getCell(3);
//					 double waittime= c4.getNumericCellValue(); 
//					 
				 
				 //fetch url link
				 
				  Row r5 = sh.getRow(5);
				 Cell c5 = r5.getCell(0);
					String url= c5.toString();
					
//					 if(url.getCellType()==CellType.STRING) {
//						 url.getStringCellValue();
//				 }else {
//					 System.out.println("call is not String");
//					 url.toString();
//							 return;
//				 }		
						 
						 
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 //WebDriverWait wait= new WebDriverWait(driver, java.time.Duration.ofSeconds((long) waittime));
		 
		 
		 
		driver.get(url);
		driver.findElement(By.id("name")).sendKeys(username);
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys(emailid);
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys(pass);
		
		Thread.sleep(2000);
		wbf.close();
	}

}
