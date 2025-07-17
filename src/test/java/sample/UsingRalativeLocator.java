package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class UsingRalativeLocator {
 
	public static void main(String []args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		//indentify passward and base element
		WebElement pass= driver.findElement(By.id("pass"));
		
		//identify Un tf and enter username
		WebElement un=driver.findElement(RelativeLocator.with(By.tagName("input")).above(pass));
		un.sendKeys("biswanatha");
		pass.sendKeys("adb234");
		
		//indentify login button
		 driver.findElement(RelativeLocator.with(By.tagName("button")).below(pass)).click();
		 
		
		Thread.sleep(3000);
		
		driver.quit();
		
	}
}
