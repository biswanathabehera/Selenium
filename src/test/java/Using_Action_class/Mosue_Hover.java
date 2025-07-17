package Using_Action_class;

import java.awt.Desktop.Action;
import java.awt.event.ActionEvent;
import java.sql.DriverAction;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mosue_Hover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.amazon.in/");
		
		Actions act = new Actions(driver);
		WebElement prime = driver.findElement(By.xpath("//span[text()='Prime']"));
	act.moveToElement(prime).perform();
	
	}

}
