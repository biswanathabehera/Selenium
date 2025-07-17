package Auto_Selected_Method;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Auto_Suggetion_Found {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("comp");
		//Thread.sleep(3000);
		
		List<WebElement> auto = driver.findElements(By.xpath("//span[text()='comp']"));
	for (WebElement ele:auto) {
		
		System.out.println(ele.getText());
	}
	
	 
	
	//driver.findElement(By.xpath("(//span[text()='comp'])[3]")).click();
	
	
		driver.quit();
	}

}
