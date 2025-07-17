package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingValidationMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver= new  ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		
		//isDisplyed Method
		WebElement SearchTF = driver.findElement(By.id("small-searchterms"));
		
	 if(SearchTF.isDisplayed()) {
		  
		  SearchTF.sendKeys("selenium");
	  }else {
		  
		  System.out.print("Element isn't displyed");
	  }
	 
	 //isEnabale Method 
	  
		WebElement ButtonSUB= driver.findElement(By.id("newsletter-subscribe-button"));
		
		if (ButtonSUB.isEnabled()) {
			ButtonSUB.click();
		}
		else {
			System.out.print("sub button isn't working");
		}
	  
		//isSelected Method
		
		WebElement select= driver.findElement(By.id("pollanswers-2"));
		
		if(select.isSelected()) {
			select.isSelected();
			}
		else {
			System.out.print("is nott selected");
		}
	  
	  
	  
	  
	  Thread.sleep(3000);
	  driver.quit();
	}

}
