package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class usingxpathfindelement {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =  new ChromeDriver();
		
		driver.manage().window().minimize();
		
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//input)[1]")).sendKeys("biswanatha");
		
		driver.findElement(By.xpath("(//input)[2]")).sendKeys("biswa@123.gmail.com");

		driver.findElement(By.xpath("(//input)[3]")).sendKeys("biwa123");
		
		driver.findElement(By.xpath("(//button)[2]")).click();
		
		Thread.sleep(2000);
		
	}

}
