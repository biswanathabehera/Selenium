package TestNG_Program;

import org.testng.annotations.Test;

public class Depend_On_Method {

	@Test(priority=1 , groups = "System Testing")
	public void School() {
		System.out.println("School");
	}
	@Test( priority=2 , dependsOnMethods = "School" , groups = "Functionality Testing")
	public void College() {
		System.out.println("College");
	}
//	@Test(dependsOnMethods = "College" , enabled = false)
//	@Test(dependsOnMethods = "College"  , threadPoolSize = 2 )
	//if you give threadPoolSize is 2 it is creating 2 thread but it's execute  
	@Test(dependsOnMethods = "College" , threadPoolSize = 2 , invocationCount = 2 , groups = "Smoke Testing")
	public void Company() {
		System.out.println("Company");
	}
	
}
