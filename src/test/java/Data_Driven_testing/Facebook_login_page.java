package Data_Driven_testing;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_login_page {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream fis = new FileInputStream("./src/test/java/FaceBookData.propertices");
		Properties p= new Properties();
		p.load(fis);
		String url= p.getProperty("url");
		String usergmail=p.getProperty("usergmail");
		String passward= p.getProperty("passward");
		String duration=p.getProperty("duration");
		Long waittime= Long.parseLong(duration);
		
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(waittime));
		
		driver.get(url);
		
		driver.findElement(By.id("email")).sendKeys(usergmail);
		driver.findElement(By.id("pass")).sendKeys(passward);
		
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		
		
		
	}

}
