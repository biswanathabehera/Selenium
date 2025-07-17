package Handle_Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Handling_Using_index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("http://the-internet.herokuapp.com/iframe");
		
		driver.switchTo().frame(0);
		String text= driver.findElement(By.xpath("//p")).getText();
		System.out.println(text);
		
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//span[text()='Paragraph']")).click();
		
		driver.quit();
	}

}
