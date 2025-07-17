package TestNG01_pratice_Program;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flipkart {
	@Test (groups = "Smoke Testing")
	public void fli_login() {
	WebDriver driver=  new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 driver.get("https://www.flipkart.com/account/login?ret=/");
	 
	WebElement number =  driver.findElement( By.xpath("//input[@class='r4vIwl BV+Dqf']"));
	number.sendKeys("7894561235");
	
	WebElement mesg= driver.findElement(By.xpath("//a[contains(text(),'Terms of Use')]"));
	
   Reporter.log( " confirm login message flipkart :" +mesg.getText() , true);
   
   
	driver.quit();
	
	}
}
