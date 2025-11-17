package testNG;

import org.testng.annotations.Test;

public class testNGExp5 {
  @Test(invocationCount=5)
  public void paymentTest() {
	  System.out.println("Payment Test");
  }
  
  @Test(timeOut=2000)
  public void BillingTest() throws InterruptedException {
	  System.out.println("Billing Test");
	  Thread.sleep(3000);
  }
}
