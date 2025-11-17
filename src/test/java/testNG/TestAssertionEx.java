package testNG;
 
import java.time.Duration;
 
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;

import org.testng.annotations.Test;
 
public class TestAssertionEx {

	@Test

	public void login() {

		WebDriver driver = new ChromeDriver();

		driver.get("http://automationbykrishna.com/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.manage().window().maximize();

		WebElement element = driver.findElement(By.id("basicelements"));

		Assert.assertTrue(element.isDisplayed() , "Hello");

		Assert.assertEquals(driver.getTitle(), "Login Signup Demo", "Passed");

//		driver.quit();

	}

//	@Test

//	public void login() {

//		System.out.println("login Test");

//		Assert.assertTrue(false);

//	}

}
 
/*

* 

* OP : 

* login Test

FAILED: testNG.TestAssertionEx.login

Assert.assertTrue(false); --> OP As Exception 

java.lang.AssertionError: expected [true] but found [false]
 
 
Assertion : Generally seeks the Condition to make as -> Pass or fail
 
Hard Assertion : if any line gets failed --> it gets failed

Soft Assertion : it will continue in this run till the end

* */
 
 
 