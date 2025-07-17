package Using_Action_class;

//import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_action_scroll_Method {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     WebDriver driver =new EdgeDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
     
     driver.get("https://www.amazon.in/");
     
        Actions act = new Actions(driver);
		act.scrollByAmount(0, 2000).perform();
		
		Thread.sleep(3000);
		
		WebElement help= driver.findElement(By.linkText("Help"));
		act.scrollToElement(help).perform();
		
		driver.quit();
		
	}

}
