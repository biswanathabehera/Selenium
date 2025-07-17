package POM_Utilization;

import java.time.Duration;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import POM_Pages.FaceBookLoginPOM_page;

public class FaceBookLoginTest {

	//private static final Object WebDriver = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.facebook.com/");
		
		//>>>after refreshing if try to execute same webElement variable with  deferment input 
		//>>it throwing StaleElement reference exception   So, avoid that we are using pom method
		
//	  WebElement un = driver.findElement(By.id("email"));
//	  WebElement pswd = driver.findElement(By.id("pass"));
//	  un.sendKeys("bishalnaya343@gmail.com");
//	  pswd.sendKeys("diga@123");
//	   
//	  driver.navigate().refresh();
//
//	  un.sendKeys("bishalnaya343@gmail.com");
//	  pswd.sendKeys("diga@123");
	
	
		FaceBookLoginPOM_page fbl= new FaceBookLoginPOM_page(driver);
		fbl.getUn(null);
		fbl.getPswd(null);
		
		//working
//		fbl.getPswd().sendkey("dafaf23");
//		fbl.getun().sendkey("dafa");
		
		
	//	String print = fbl.getHeader().getText();
		//System.out.println(print);  
		
		driver.navigate().refresh();
		//System.out.println(print);  
		fbl.getUn(null);
		fbl.getPswd(null);
		
		fbl.getflogin().click();
		driver.quit();
		
		
	}

}
