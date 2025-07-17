package Using_java_Script_Ex;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handalling_disabled_Element {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("file:///C:/Users/Lenovo/OneDrive/Desktop/login1.html");
		//handling disabled element
		WebElement Us_TF = driver.findElement(By.id("user"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].value=arguments[1]", Us_TF, "selenium");
		Thread.sleep(3000);
		
		//handling disabled Button
	     WebElement login = driver.findElement(By.id("login"));
	     js.executeScript("arguments[0].disabled=false",login);
	     login.click();
	     
	     
		
		
		Thread.sleep(3000);
		driver.quit();
		

	}

}
