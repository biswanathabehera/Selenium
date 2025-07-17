package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class launchBrowser {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("(//input)[1]")).sendKeys("biswajit");
		
		driver.findElement(By.xpath("(//input)[2]")).sendKeys("bisa598f@gmail.com");
	}

}
