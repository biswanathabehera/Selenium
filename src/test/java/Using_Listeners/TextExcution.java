package Using_Listeners;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Baseclass_utility.BaseClass;

@Listeners(Listeners_Utility.Listeners.class)
public class TextExcution extends BaseClass {
	@Test
	public void demo() {
		System.out.println("Test Script");
		Assert.fail();
	}

	@Test
	public void demo2() {
		System.out.println("Test script2");
	}

}
