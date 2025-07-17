package TestNG_Program;
import org.testng.annotations.Test;

public class Demotestng {


@Test (priority=2 , groups = "Functionality Testing")
	public void create() {
		System.out.println("create");
	}
@Test(priority=1 , groups = "System Testing")
public void register() {
	System.out.println("register");
	
}
@Test(priority=2 , groups = "Smoke Testing")
public void login() {
	System.out.println("Login");
}
}
