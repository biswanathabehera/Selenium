package Handling_Popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sopper_stack2 {

	public static void main(String []args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(29));
		
		driver.get("https://shoppersstack.com/products_page/27");
		 
	    driver.findElement(By.id("compare")).click();
		
	}
}
