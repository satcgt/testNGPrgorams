package extentReport;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class TestNGExtentReprot {
  @Test
  public void f() {
	  ExtentSparkReporter reporter =new ExtentSparkReporter("./Reports/TestReport.html");
		reporter.config().setReportName("Äutomation Test Report");
		reporter.config().setDocumentTitle("Test Execution Report");
		
		ExtentReports report=new ExtentReports();
		report.attachReporter(reporter);
		report.setSystemInfo("Tester", "Srishti Raturi");
		report.setSystemInfo("Environment", "QA");
		report.setSystemInfo("Browser", "Chrome");
		
		ExtentTest test=report.createTest("LoginTest","Verify login functionality");
		
		
		test.log(Status.PASS,"Registration link clicked");
		test.log(Status.PASS, "UserName entered");
		
		ExtentTest test1=report.createTest("Registration Test","Verify Registration functionality");
		test.log(Status.FAIL,"Registration Failed");
		
		ExtentTest test2=report.createTest("Payment Test","Verify Payment functionality");
		
		ExtentTest loginTest=test2.createNode("Login");
		loginTest.log(Status.PASS,"Enter Username");
		loginTest.log(Status.PASS,"Enter Password");
		loginTest.log(Status.PASS, "Click Submit");
		
		ExtentTest cartTest=test2.createNode("Select Product and navigate to Cart");
		cartTest.log(Status.PASS,"Select Product");
		cartTest.log(Status.PASS,"Click on Add to Cart button");
		
		ExtentTest paymentTest=test2.createNode("Make Payment");
		paymentTest.log(Status.PASS, "Verify product in cart");
		paymentTest.log(Status.PASS, "Verify product in cart");
		
	
		report.flush();
  }
}
