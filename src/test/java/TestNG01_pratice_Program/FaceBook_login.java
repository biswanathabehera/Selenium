package TestNG01_pratice_Program;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FaceBook_login {

	@Test (groups = "smoke Testing")
	public void f_login() {
		WebDriver driver=  new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://www.facebook.com/");
		 
		 driver.findElement( By.id("email")).sendKeys("biswanatha");
		 driver.findElement(By.id("pass")).sendKeys("khji@123");
		 
		// driver.findElement(By.name("login")).click();
		 
		WebElement mesg = driver.findElement(By.id("reg_pages_msg"));
		Reporter.log("confirm message from facebook :" +mesg.getText(), true);
		  driver.quit();
	}
}
