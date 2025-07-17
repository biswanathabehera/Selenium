package Using_Action_class;

import java.awt.RenderingHints.Key;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoard_action {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.flipkart.com/");
		
		 WebElement Search = driver.findElement(By.name("q"));
		// Search.sendKeys("computer");
		 Actions act = new Actions(driver);
		 
		 act.moveToElement(Search).click(Search)
		 .keyDown(Keys.SHIFT).sendKeys("computer")
		 .keyUp(Keys.SHIFT).build().perform();
		 
		  Thread.sleep(3000);
		  
		  act.keyDown(Keys.ENTER).keyUp(Keys.ENTER).build().perform() ;
		  
		  Thread.sleep(3000);
		  
		  driver.quit();
		  }

}
