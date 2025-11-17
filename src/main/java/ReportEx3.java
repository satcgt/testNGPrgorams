import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ReportEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.get("http://automationbykrishna.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		ExtentSparkReporter reporter =new ExtentSparkReporter("./Reports/reportScreen.html");
		reporter.config().setReportName("Äutomation Test Report");
		reporter.config().setDocumentTitle("Test Execution Report");
		
		ExtentReports report=new ExtentReports();
		report.attachReporter(reporter);
		report.setSystemInfo("Tester", "Srishti Raturi");
		report.setSystemInfo("Browser", "Chrome");
		
		ExtentTest test=report.createTest("LoginTest","Verify login functionality");
		
		WebElement registration =driver.findElement(By.id("registration2"));
		registration.click();
		test.pass("Registration clicked",MediaEntityBuilder.createScreenCaptureFromPath("C:\\Users\\srraturi\\eclipse-workspace\\SeleniumMavenProject\\screenshots\\screenshot.png").build());
		
		driver.findElement(By.id("unameSignin")).sendKeys("Srishti");
		test.log(Status.PASS, "UserName entered");
		
		
		
		test.pass("Registration clicked",MediaEntityBuilder.createScreenCaptureFromPath("C:\\Users\\srraturi\\eclipse-workspace\\SeleniumMavenProject\\screenshots\\screenshot.png").build());
		test.pass("Registration clicked").addScreenCaptureFromPath("C:\\Users\\srraturi\\eclipse-workspace\\SeleniumMavenProject\\screenshots\\screenshot.png");
		driver.quit();
		report.flush();
		
	}

}
