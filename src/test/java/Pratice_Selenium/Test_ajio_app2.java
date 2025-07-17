package Pratice_Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test_ajio_app2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     WebDriver driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
     
     driver.get("https://www.ajio.com");
     
     driver.findElement(By.id("closeBtn")).click();
     Thread.sleep(2000);
     WebElement hover =  driver.findElement(By.xpath("//span[text()='MEN']"));
     Actions act=new Actions(driver);
     act.moveToElement(hover).perform();
      Thread.sleep(3000);
      
      
	}

}
