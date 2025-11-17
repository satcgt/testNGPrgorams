package testNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class TestNGListenerExp1 implements ITestListener{
  @Test
  public void onTestSuccess(ITestResult result) {
	  System.out.println("Test passed");
  }
  
  @Test
  public void onTestFailure(ITestResult result) {
	  System.out.println("Test Failed");
  }
  
  @Test
  public void onTestSkipped(ITestResult result) {
	  System.out.println("Test Skipped");
  }
  
  @Test
  public void onTestStart(ITestContext result) {
	  System.out.println("Test start");
  }
  
  
  
  
  
}
