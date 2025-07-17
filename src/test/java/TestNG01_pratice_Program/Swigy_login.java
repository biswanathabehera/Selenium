package TestNG01_pratice_Program;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Swigy_login {

	@Test(groups = "Smoke Testing")
	public void S_login() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.swiggy.com/restaurants");
		
		driver.findElement(By.xpath("//span[text()='Sign In']")).click();
		driver.findElement(By.name("mobile")).sendKeys("1234567890");
		
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		Reporter.log(" Swigy login successfully" , true);
		driver.quit();
		
	}
}
