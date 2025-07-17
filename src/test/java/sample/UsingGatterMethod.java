package sample;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingGatterMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/login");
		
		WebElement login = driver.findElement(By.linkText("Log in"));
		
	String text = login.getText();
	System.out.println("text : "+text);
	 
	String tag =login.getTagName();
	System.out.println("tag :"+ tag);
	
	String AttributeV= login.getAttribute("class");
	System.out.println("Attribute Value : "+ AttributeV);
	
	Dimension size =login.getSize();
	System.out.println("Dimention :"+ size);
	System.out.println("width :"+ size.getWidth());
	System.out.print("height :"+ size.getHeight());
	
Point location= login.getLocation();	
	System.out.println("location :"+ location);
	System.out.println("location :"+ location.getY());
	System.out.println("location :"+ location.getX());
	
	Rectangle rect =login.getRect();
	System.out.println("rect :"+ rect);
	System.out.println("rect :"+ rect.getHeight());
	System.out.println("rect :"+ rect.getWidth());
	System.out.println("rect :"+ rect.getX());
	System.out.println("rect :"+ rect.getY());
	
	String cssvalue = login.getCssValue("padding-left");
	System.out.println("cssvalue :" + cssvalue);
	
	
	driver.quit();
	}

}
