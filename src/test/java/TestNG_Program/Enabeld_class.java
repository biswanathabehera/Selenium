package TestNG_Program;

import org.testng.annotations.Test;

public class Enabeld_class {
//priority Start from Zero
	@Test(priority=1 , groups = "System Testing")
	public void father() {
		System.out.println("Father");
	}
	@Test(priority=2 , invocationCount = 2 , groups = "Functionality Testing")
	public void mother() {
		System.out.println("Father--Mother");
	}
	@Test(enabled=false , groups = "Smoke Testing")
	public void Child() {
		System.out.println("Father--Mother--Child");
	}
	
}
