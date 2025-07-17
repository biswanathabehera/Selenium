package Handling_Popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Canlender_popups {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		 driver.get("https://www.makemytrip.com/");
		 
		 driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
		 //From
		driver.findElement(By.xpath("//span[text()='From']")).click();         
	    driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("hyderabad");
		driver.findElement(By.xpath("//span[text()='Hyderabad']")).click();
		// To
	    driver.findElement(By.xpath("//span[text()='To']")).click();
	    driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("berhampur");
	    driver.findElement(By.xpath("//p[text()='Bhubaneswar, India']")).click();
	    
	    Thread.sleep(3000);
	    //departure
	    driver.findElement(By.xpath("//div[@class='RangeExample oneWay']//ancestor::div[@class='DayPicker-Month']/descendant::p[text()='30']")).click();
	    //return
	    driver.findElement(By.xpath("//div[@class='flt_fsw_inputBox dates reDates inactiveWidget  ']")).click();
	    driver.findElement(By.xpath("//div[@class='DayPicker-Month'][2]//descendant::p[text()='22']")).click();
	    //Traveler
	    driver.findElement(By.xpath("//div[@data-cy='flightTraveller']")).click();
	    
	    
	    
	}

}
