package Using_Action_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_And_Drop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(83));

		driver.get("https://demo.guru99.com/test/drag_drop.html");

		Actions act = new Actions(driver);
		act.scrollByAmount(0, 3000).perform();

		WebElement drag_ele1 = driver.findElement(By.id("credit2"));
		WebElement drop_ele1 = driver.findElement(By.id("bank"));

		WebElement drag_ele2 = driver.findElement(By.id("fourth"));
		WebElement drop_ele2 = driver.findElement(By.id("amt7"));

		WebElement drag_ele3 = driver.findElement(By.id("credit1"));
		WebElement drop_ele3 = driver.findElement(By.id("loan"));

		WebElement drag_ele4 = driver.findElement(By.id("fourth"));
		WebElement drop_ele4 = driver.findElement(By.id("amt8"));

		Actions act1 = new Actions(driver);
		act1.dragAndDrop(drag_ele4, drop_ele4).dragAndDrop(drag_ele2, drop_ele2).dragAndDrop(drag_ele1, drop_ele1)
				.dragAndDrop(drag_ele3, drop_ele3).build().perform();

		Thread.sleep(3000);

		WebElement perfect = driver.findElement(By.xpath("//div[@class='table4_result']"));

		System.out.print(perfect.getText());
		driver.quit();
	}

}
