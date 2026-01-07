import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authontification_handlig {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//direct throught the URL
		//driver.get("https://admin:admin@demoapps.qspiders.com/ui/auth?sublist=0");
		
		//Using find element 
		driver.get("https://demoapps.qspiders.com/ui/auth?sublist=0");
		driver.findElement(By.id("AuthLink")).click();
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("passward")).sendKeys("admin123");
		driver.findElement(By.id("AuthLink")).click();
     
     	
     	Thread.sleep(2000);
     	 driver.quit();

	}

}
