package Synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_Imclicitly_Waitng {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("bishal");
		driver.findElement(By.id("email")).sendKeys("bisa123@gamil.com");
		driver.findElement(By.id("password")).sendKeys("nsa123sa");
		driver.findElement(By.xpath("//button[text()='Register']")).click();
		
		driver.quit();		
	}

}
