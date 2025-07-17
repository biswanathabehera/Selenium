package Takes_ScreenShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Takes_ss1_WE {
 public static void main(String []args) throws IOException {
	// TODO Auto-generated method stub
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.amazon.in/");

	WebElement tss = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	
	File src = tss.getScreenshotAs(OutputType.FILE);
	
	File dest= new File("./ss/amazon.png");
	
	FileUtils.copyFile(src, dest);
	
	driver.quit();
	
	
	
	
	
	
	
	 
}
}
