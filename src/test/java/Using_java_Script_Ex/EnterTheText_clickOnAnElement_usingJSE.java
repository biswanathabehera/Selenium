package Using_java_Script_Ex;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterTheText_clickOnAnElement_usingJSE {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.facebook.com/");
		WebElement us_Tf = driver.findElement(By.id("email"));
		WebElement pswd = driver.findElement(By.id("pass"));
		WebElement login = driver.findElement(By.name("login"));

		// pass the text to TF
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='selenium'", us_Tf);
		js.executeScript("arguments[0].value=arguments[1]", pswd, "abcd@1323");
		js.executeScript("arguments[0].click()", login);

		Thread.sleep(3000);
		driver.quit();

	}

}
