package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGExp7 {
  @Test
  @Parameters({"UserName","Password"})
  public void login(String username, String password) {
	  System.out.println("UserName:" + username + "Password:"+password);
  }
}
