package Handling_Popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Confrom {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		
		Alert can = driver.switchTo().alert();
		can.accept();
		 
		WebElement ress = driver.findElement(By.id("result"));
		System.out.println(ress.getText());
		
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		//confrom
	     driver.findElement(By.id("//button[text()='Click for JS Prompt']")).click();
		
		
		Alert alt1 = driver.switchTo().alert();
		alt1.sendKeys("Hey Im testing You Brother");
		alt1.accept();
		
		WebElement ress1 = driver.findElement(By.id("result"));
		System.out.println(ress1.getText());
		System.out.println(ress.getText());
		
		 driver.quit();

	}

}
