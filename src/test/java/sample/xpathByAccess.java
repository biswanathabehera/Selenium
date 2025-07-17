package sample;

import org.openqa.selenium.By; 
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class xpathByAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new EdgeDriver();
		
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.amazon.com/");
		 
		 driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("laptop"+Keys.ENTER);
		 
		 WebElement price = driver.findElement(By.xpath("//span[contains(text(),'Lenovo V14')]/ancestor::div[contains(@class,'a-section a-spacing-s')]/descendant::span[@class=\"a-price-whole\"]"));
		 
		 System.out.println(price.getText());
		
	}

}
