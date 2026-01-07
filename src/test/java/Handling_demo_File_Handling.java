import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Handling_demo_File_Handling {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// StringSelection str = new
		// StringSelection("C:\\Users\\Lenovo\\OneDrive\\Desktop\\Labrador_Retriever_portrait.jpg");
		StringSelection str = new StringSelection("‪C:\\Users\\Lenovo\\OneDrive\\Desktop\\dog.webp");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);

		driver.get("https://demoapps.qspiders.com/ui/fileUpload?sublist=0");
		WebElement upload = driver.findElement(By.id("resume"));

		Actions act = new Actions(driver);
		act.moveToElement(upload).click(upload).build().perform();

		Thread.sleep(2000);

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);

		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(3000);

		driver.findElement(By.id("fullName")).sendKeys("bishal Nayak");
		driver.findElement(By.id("emailId")).sendKeys("biswajit290@gmai.com");
		driver.findElement(By.id("password")).sendKeys("biswa123");
		driver.findElement(By.id("mobile")).sendKeys("1234567896");

		WebElement clk = driver.findElement(By.id("city"));
		Select s = new Select(clk);
		s.selectByVisibleText("Hyderabad");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[text()='Create Profile']")).click();
		driver.quit();
	}

}
