package Using_java_Script_Ex;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handalling_Scroll_Bar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.amazon.in/");
		
		//handle scroll bar using coded coordinates
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(100,1000)");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile " + Keys.ENTER);
		WebElement deliver = driver.findElement(By.xpath("//span[text()='Pay On Delivery']"));
		
//		int x_axis=deliver.getLocation().getX();
//		int y_axis= deliver.getLocation().getY();
//		js.executeScript("window.scrollBy("+x_axis+","+y_axis+")");
		
     	//scroll webpage using element referance
		
		js.executeScript("arguments[0].scrollIntoView(true)",deliver);
		Thread.sleep(3000);
		
		//scroll till button of the element
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(3000);
		
		//scroll till top of the webpage
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		Thread.sleep(3000);
		
		driver.quit();
	}

}
