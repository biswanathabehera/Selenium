package Data_Driven_testing;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Multiple_data_fetching_from_excelFile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		
		//convert physical file to java object file
		FileInputStream fis=new FileInputStream("./src/test/java/Book1.xlsx");
		
		//Create workbook
		Workbook wb = WorkbookFactory.create(fis);
		
		//fetch the sheet
		Sheet s = wb.getSheet("data");
		
		//fetch the all the data from the sheet
		for(int i=0; i<s.getLastRowNum();i++) {
			for(int j=0; j<s.getRow(i).getLastCellNum(); j++) {
			//	Cell value = s.getRow(i).getCell(j);
			//	System.out.print(value +"    ");
				System.out.print(s.getRow(i).getCell(j)+ "   ");
			}
			System.out.println();
		}
		wb.close();
	}	
}