package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

//import net.bytebuddy.implementation.FieldAccessor.FieldLocation.Relative;

public class UsingTorightAndleftMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//launch the broswer
		WebDriver driver=new ChromeDriver();
		//maxime 
		driver.manage().window().maximize();
		//naviagate application
		driver.get("https://www.flipkart.com/");
		
		//identify cart link
		WebElement cart=driver.findElement(By.linkText("cart"));
		
		// using cart click on the cart
		driver.findElement(RelativeLocator.with(By.tagName("a")).toRightOf(cart)).click();
		
		//navigate to privious back page 
		driver.navigate().back();
		
		//identify cross button o the login dialogue box (close the suggetion )
		//driver.findElement(By.xpath("").click();
		
		//agai identify cart link to avoid atale reference exception
		//WebElement cart1=driver.findElement(By.linkText("cart"));
		
		//using cart link click on login button 
		//driver.findElement(RelativeLocator.with(By.tagName("a")).toLeftOf(cart1));
		
		//Thread.sleep(4000);
		
		//driver.quit();
				}

}
