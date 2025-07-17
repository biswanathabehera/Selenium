package Baseclass_utility;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {

	@BeforeSuite
	public void bs() {
		System.out.println("bs-coneection with database");
	}
	@AfterSuite
	public void as() {
		System.out.println("bs-disconnect with the data base");
	}
	@BeforeTest
	public void bt() {
		System.out.println("bt-parallel executions");
	}
	@AfterTest
	public void at() {
		System.out.println("bt-parallel executions stop");
	}
	@BeforeClass
	public void bc() {
		System.out.println("bc-launch the browser");
	}
	@AfterClass
	public void ac() {
		System.out.println("ac-close the browser");
	}
	@BeforeMethod
	public void bm() {
		System.out.println("bm-login");
	}
	@AfterMethod
	public void am() {
		System.out.println("am-logout");
	}
}
