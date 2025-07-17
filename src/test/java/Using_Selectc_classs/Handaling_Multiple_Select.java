package Using_Selectc_classs;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handaling_Multiple_Select {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
		
		WebElement DropD = driver.findElement(By.id("select-multiple-native"));
		
		Select ss= new Select(DropD);
		ss.selectByIndex(4);
		ss.selectByValue("Mens Casual Slim Fit");
		ss.selectByVisibleText("Solid Gold Petite Mi...");
		
		List<WebElement> option = ss.getAllSelectedOptions();
		for(WebElement ele:option) {
			System.out.println("select all option =" + ele.getText());
		}
		
		driver.quit();
	}

}
