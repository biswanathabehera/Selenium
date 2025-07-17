package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class UsingNearMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
 
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		WebElement search = driver.findElement(By.className("Pke_EE"));
		
		driver.findElement(RelativeLocator.with(By.tagName("a")).near(search)).click();
		
		Thread.sleep(3000);
		
		driver.quit();	}

}
