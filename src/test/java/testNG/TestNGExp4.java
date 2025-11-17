package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGExp4 {
	@Test(dependsOnMethods= {"loginTest"})
	public void PaymentTest() {

		System.out.println("Payment Method");

	}

	@Test
	public void loginTest() {

		System.out.println("Login Method");
		Assert.assertTrue(false);

	}

	@Test
	public void BillingTest() {

		System.out.println("Billing Method");

	}

	@Test
	public void RegistrationTest() {

		System.out.println("Registration Method");

	}
}