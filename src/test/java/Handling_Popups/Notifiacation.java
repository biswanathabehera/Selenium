package Handling_Popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notifiacation {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions opts= new ChromeOptions();
		opts.addArguments("--disable-notifications");
		// opts.addArguments("--disable-GeoLocation");
		WebDriver driver= new ChromeDriver(opts);
		
		//maximize
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		driver.get("https://demoapps.qspiders.com/ui/browserNot?sublist=0");
		
		driver.findElement(By.xpath("//button[text()='Notification']")).click();
		Thread.sleep(2000);
		driver.quit();
		
		

	}

}
