package Using_Action_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActIon_context_Click {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		 
		 WebElement RightClick = driver.findElement(By.xpath("//span[text()='right click me']"));
		 
		 Actions act = new Actions(driver);
		 act.contextClick(RightClick).perform();
		 
		 Thread.sleep(2000);
		 
		 driver.navigate().refresh();
		 
		 WebElement DoubleClick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		 act.doubleClick(DoubleClick).perform();
		 
		 Thread.sleep(2000);
		 
		 driver.quit();
		 
		 
	}

}
