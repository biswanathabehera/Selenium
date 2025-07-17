package TestNG01_pratice_Program;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Amazon_Login {

	@Test
	public void A_login() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//button[text()='Continue shopping']")).click();
		
		WebElement hover = driver.findElement(By.id("nav-link-accountList"));
		Actions act= new Actions(driver);
		act.moveToElement(hover).perform();
		
		driver.findElement(By.xpath("//span[text()='Sign in']")).click();
		driver.findElement(By.id("ap_email_login")).sendKeys("digambar123@gmail.com");
		driver.findElement(By.id("continue")).click();
		Reporter.log("login amazon successfully" , true);
		driver.quit();
  }
}
