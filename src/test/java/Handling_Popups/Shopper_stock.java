package Handling_Popups;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Shopper_stock {

	public static void main(String[] args) throws InterruptedException, IOException  {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://shoppersstack.com/");
		Thread.sleep(6000);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Kids']")));
		
		Actions act = new Actions(driver);
		WebElement hover = driver.findElement(By.xpath("//a[text()='Kids']"));
		act.moveToElement(hover).perform();
		
		
       Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[text()='T-Shirts']")).click();
	    driver.findElement(By.xpath("//span[text()='us polo kids '] ")).click();
		
	
		//driver.get("https://shoppersstack.com/products_page/27");
	    
	    
	    driver.findElement(By.id("compare")).click();
	    
	  String pwid = driver.getWindowHandle();
	  
	  Set<String> allwin = driver.getWindowHandles();
	  for(String ss : allwin) {
		  driver.switchTo().window(ss);
		  if(driver.getTitle().contains("Amazon")) {
			  break;
		  }
		  
	  }
	  
	  driver.manage().window().maximize();
	  
	  TakesScreenshot tk=(TakesScreenshot)driver;
	  File src= tk.getScreenshotAs(OutputType.FILE);
	  File dest= new File("./screenshot/amazon.png");
	  FileUtils.copyFile(src, dest);
	  
	  driver.close();
	  
	  driver.switchTo().window(pwid);
	  driver.quit();
	}

}
