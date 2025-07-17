package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindXpathByOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy' and  @id='email']")).sendKeys("biswantha");
		
		driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy _9npi' or  @name='login_source']")).sendKeys("biswa123");
		
		driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy' or  @type='type=\"submit\"']")).click();
		
		driver.quit();	}

}
