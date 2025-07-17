package Handle_Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Handling_login_frame {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.zomato.com/india");
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		
		
		
		driver.switchTo().frame("auth-login-ui");
		
		driver.findElement(By.xpath("//input[@placeholder='Phone']")).sendKeys("1234567898");
		Thread.sleep(3000); 
		
		//driver.switchTo().parentFrame();
		//driver.findElement(By.xpath("//span[@class='sc-grYksN kQjhUz']")).click();
		
		//click on back button
		driver.findElement(By.xpath("//i[@aria-label='close Modal']")).click();
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Add restaurant']")).click();
		Thread.sleep(3000);
		driver.quit();
		
		
		
		
		

	}

}
