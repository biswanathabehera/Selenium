package Using_Action_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hover_and_Hold {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapps.qspiders.com/ui/clickHold?sublist=0");
		
		WebElement hold =  driver.findElement(By.id("circle"));
		Actions act= new Actions(driver);
		act.clickAndHold(hold).perform();
		
		Thread.sleep(2000);
		
		act.release(hold).perform();
		
		Thread.sleep(2000);
		
		driver.quit();
	}

}
