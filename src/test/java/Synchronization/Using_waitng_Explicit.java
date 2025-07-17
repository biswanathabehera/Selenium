package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Using_waitng_Explicit {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.titleContains("DemoApps | Qspiders | Text Box"));
		
		WebElement nameTF= driver.findElement(By.id("name"));
		wait.until(ExpectedConditions.visibilityOf(nameTF));
		nameTF.sendKeys("selenim");
		
		driver.findElement(By.id("email")).sendKeys("banti346@gmail.com");
		driver.findElement(By.id("password")).sendKeys("bih234");
		
		WebElement register = driver.findElement(By.xpath("//button[text()='Register']"));
		wait.until(ExpectedConditions.elementToBeClickable(register));
		register.click();
		Thread.sleep(2000);
				
		driver.quit();
	}

}
