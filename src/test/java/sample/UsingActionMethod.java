package sample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingActionMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(23));
		
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement search = driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		 
		search.sendKeys("computer");
		
		Thread.sleep(3000);
		search.clear();
		
	 Thread.sleep(3000);
	 search.sendKeys("mobile");
	 
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//input[@value='Search']")).submit();
	 
	 Thread.sleep(3000);
	 
	 driver.quit();		
	}

}
