package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathfunctonusingName {
  
	public static void main(String[]args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		//identify search TF and pass the test
		driver.findElement(By.name("q")).sendKeys("laptop");
		
		driver.findElement(By.xpath("//*[name()='svg'][@viewBox='0 0 17 18']")).click();
		
		Thread.sleep(30000);
		
		driver.quit();
	}
}
