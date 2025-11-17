package testNG;



import static org.testng.Assert.assertFalse;

import org.testng.annotations.Test;

public class TestNGExp11 {
  @Test
  public void PaymentMethod() {
	  System.out.println("Payment Method");
  }
  
  @Test
  public void LoginMethod() {
	  assertFalse(false);
	  System.out.println("Login Method");
  }
  
  @Test
  public void BillingMethod() {
	  System.out.println("Billing Method");
  }
  
  @Test
  public void RegistrationMethod() {
	  System.out.println("Registration Method");
  }
  
  
}
