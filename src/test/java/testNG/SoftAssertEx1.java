package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class SoftAssertEx1 {
	public void login() {

		WebDriver driver = new ChromeDriver();

		driver.get("http://automationbykrishna.com/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.manage().window().maximize();

		WebElement element = driver.findElement(By.id("basicelements"));
		//soft -> we create object of softAssert
		//in hard we directly use through the class of hardAssert
		SoftAssert soft=new SoftAssert();
		soft.assertTrue(element.isDisplayed());
		soft.assertAll();
		
		driver.quit();

	}
}
