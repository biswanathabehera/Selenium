package Data_Driven_testing;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Write_back_data_ExcelFile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException   {
		// TODO Auto-generated method stub

		FileInputStream fis = new FileInputStream("C:\\Users\\Lenovo\\OneDrive\\Desktop\\Book1.xlsx");
		Workbook wbf = WorkbookFactory.create(fis);
         Sheet s=wbf.getSheet("data");
		
		//fetch the row
		Row r = s.createRow(7);
		//create the cell
		Cell c = r.createCell(2);
		//set the data
		c.setCellValue("selenium");
		//converting java object to physical file
		FileOutputStream fos= new FileOutputStream("C:\\Users\\Lenovo\\OneDrive\\Desktop\\Book1.xlsx");
		wbf.write(fos);
		wbf.close();
		
	}

}
