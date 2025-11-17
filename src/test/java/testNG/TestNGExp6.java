package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGExp6 {
	
	@Test(groups={"sanity"})
	public void PaymentTest() {

		System.out.println("Payment Method");

	}

	@Test(groups={"smoke"})
	public void loginTest() {

		System.out.println("Login Method");
//		Assert.assertTrue(false);

	}

	@Test(groups= {"sanity"})
	public void BillingTest() {

		System.out.println("Billing Method");

	}

	@Test(groups= {"smoke,Regression"})
	public void RegistrationTest() {

		System.out.println("Registration Method");

	}
}
