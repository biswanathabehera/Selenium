package Using_java_Script_Ex;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_ToAn_App_using_JSE {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		String url= "https://www.facebook.com/";
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.location= arguments[0]",url);
		
		Thread.sleep(2000);
		
		//fetch the title of the Webpage
		System.out.println(js.executeScript("return document.title"));
		
		@Nullable
		Object url_obj = js.executeScript("return document.title");
		System.out.println(url_obj.toString());
		
		
		System.out.println(js.executeScript("return document.URL"));
		
		//refresh the webpage
		js.executeScript("history.go(0)");
		Thread.sleep(3000);

		
		 driver.quit();
		

	}

}
