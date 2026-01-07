package Handling_Popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_child_Window {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(23));
		driver.get("https://www.flipkart.com/");

		driver.findElement(By.name("q")).sendKeys("toys");

		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[name()='svg'][@height='24']")).click();

		String pwids = driver.getWindowHandle();
		System.out.println("parent windoew ids :" + pwids);
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[contains(@title,'ARIZON DIY')]")).click();

		Set<String> wids = driver.getWindowHandles();
		System.out.println("All windows :" + wids);

		for (String s : wids) {
			driver.switchTo().window(s);
			if (driver.getTitle().contains("ARIZON DIY")) {
				Thread.sleep(3000);

				driver.findElement(By.xpath("//button[text()='Add to cart']")).click();

			}

		}
		driver.switchTo().window(pwids);
		Thread.sleep(3000);

		driver.quit();

	}

}
