package POM_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class FaceBookLoginPOM_page  {
		//declaration
		@FindBy(xpath = "//h2")
		private WebElement header;
		
		@FindBy(id = "email")
		private WebElement un;
		
		@FindBy(id = "pass")
		private WebElement pswd;

		@FindBy(id = "login")
		private WebElement flogin;
		
		public WebElement getHeader() {
			return header;
		}

		public void getUn(WebElement String) {
			un.sendKeys("bisfa@gmail.com");
		}
		

		public void getPswd(WebElement String) {
		 	pswd.sendKeys("adfa@1212");
		}

		public WebElement getflogin() {
			return flogin;
			
		}


		public FaceBookLoginPOM_page(WebDriver  driver) {
			PageFactory.initElements(driver, this);
		}
	}