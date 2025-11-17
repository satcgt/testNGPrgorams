package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGEX12 {
	
  @Test(retryAnalyzer=IRetryClass.class)
  public void login() {
	  System.out.println("Login Test");
	  Assert.assertTrue(false);
  }
}
