package Data_Driven_testing;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FatchDataFromPropertyfile {

	public static void main(String[] args) throws IOException {
		
        //converting physical property file to java object
		FileInputStream fis=  new FileInputStream("./src/test/java/CommonData.propertices");
        //crate an object of property		
		Properties p =new Properties();
	    //load the property object	
		p.load(fis);
		//fetch the data
		String data= p.getProperty("Username");
		System.out.println(data);
		String data1=p.getProperty("passward");
		System.out.println(data1);
		String data2=p.getProperty("timeout");
		System.out.println(data2);
		
	}

}
