package Data_Driven_testing;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteBacktoDataPropertyFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis= new FileInputStream("./src/test/java/CommonData.propertices");
		
		Properties p = new Properties();
		p.load(fis);
		//add new data
		p.put("animal" , "ranbir bhai sahab");
		//add the data
		p.put("panchayat", "pulera");
		//remove the data
		p.remove("animal");
		
				
		FileOutputStream fos= new FileOutputStream("./src/test/java/CommonData.propertices");
		
		p.store(fos, "update");
		
		

	}

}
