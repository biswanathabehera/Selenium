package Data_provider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Fetching_data_provider {
	@Test
	public void testLogin(String UserNmae, String passward) {
		System.out.println("username:" + UserNmae + "passward :" + passward);

	}

	@DataProvider(name = "testLogin")
	public Object[][] getdata() {
		return new Object[][] { { "biswajit", "jit123" }, { "biswajit", "jit123" }, { "biswajit", "jit123" }

		};
	}
}