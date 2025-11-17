package testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGEx9 {
	@Test(dataProvider="RetrieveData")
	  public void login(String userName , String Password) {
		  System.out.println("UserName :" + userName + "password :" + Password);
	  }

	  @DataProvider(name="RetrieveData")
	  public Object[][] getData() {
		  Object[][] obj = new Object[3][2];
		  obj[0][0] = "Atul";
		  obj[0][1] = "Atul" ;
		  obj[1][0] = "John" ;
		  obj[1][1] = "234" ;
		  obj[2][0] = "Nincole" ;
		  obj[2][1] = "2345";
		  return obj;
	  }

}
