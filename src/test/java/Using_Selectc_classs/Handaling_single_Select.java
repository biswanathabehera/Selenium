package Using_Selectc_classs;


import java.time.Duration;
//import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Handaling_single_Select {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.amazon.in/");
		
		WebElement Dropdown = driver.findElement(By.id("searchDropdownBox"));

		Select ss = new Select(Dropdown);
		
		//ss.selectByIndex(5);
		
		  //ss.selectByVisibleText("Baby");
	
		//Thread.sleep(3000);
		
		List<WebElement> options = ss.getOptions();
	
	for (WebElement ele:options) {
			System.out.println(ele.getText());
		}
	
	System.out.println("Multiple selectt DD = "+ ss.isMultiple());
	
	Thread.sleep(2000);
	
	WebElement options1 =ss.getFirstSelectedOption();
	System.out.println("First selected Option ="+ options1.getText());
	
	List<WebElement> seleted = ss.getAllSelectedOptions();
	for(WebElement ele:seleted) {
		System.out.print("all select Options ="+ ele.getText());
	}
	 
	
		driver.quit();
	}

	
}
