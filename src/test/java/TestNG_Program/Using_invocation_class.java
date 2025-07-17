package TestNG_Program;

import org.testng.annotations.Test;

public class Using_invocation_class {

		// TODO Auto-generated method stub

		@Test(priority=1 , groups = "System Testing")
		public void animal() {
		}
		@Test(priority=2 ,invocationCount=3 , groups = "Functionality Testing")
		public void tiger() {
			System.out.println("Tiger");
		}
		@Test(priority=3 , groups = "Smoke Testing")
		public void cat() {
			System.out.println("cat");
		}
	}


