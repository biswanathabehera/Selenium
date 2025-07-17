package Pratice_Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Tset_Ajio_App {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(23));
		driver.get("https://www.flipkart.com/");
		
		
		WebElement hover = driver.findElement(By.xpath("//span[text()='Fashion']"));
    	Actions act = new Actions(driver);
		act.moveToElement(hover).perform();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[text()='Women Footwear']")).click();
		 Thread.sleep(2000);
		 
		 Actions act1 = new Actions(driver);
	     act1.scrollByAmount(0, 1300).perform();
		//WebElement price = driver.findElement(By.xpath("//div[text()='Occasion']"));
		//act1.scrollToElement(price);
		
		 
	//	WebElement ClickDD = driver.findElement(By.xpath("//div[@class='suthUA']"));
	//	Select ss= new Select(ClickDD);
	//  ss.selectByValue("1500");
	 //  ss.deselectByVisibleText("₹1500");
	     
	     
	     driver.findElement(By.xpath("//div[@class='suthUA']")).click();
	     driver.findElement(By.xpath("//option[text()='₹1500']")).click();
	      
	     Thread.sleep(2000);
	     
	     WebElement click = driver.findElement(By.xpath("//div[@class='tKgS7w']"));
	     Select sm= new Select(click);
	     sm.selectByValue("₹3000");
	     
	     
		Thread.sleep(2000);
		
	    WebElement print = driver.findElement(By.xpath("//div[@data-id='SHOH44BEYFTG66PJ']/descendant::div[text()='₹1,658']"));
	    System.out.println(" price : " +print.getText());
		
		driver.quit();
		
	}

}
