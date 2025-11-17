package testNG;



import org.testng.annotations.Test;
 
public class TestNGExp3 {

	/*

	 * The Note : The Priority Value assigned is from Zero - Above

	 * And if not assigned : By default Zero is assigned 

	 * and there are most as not --> assigned it goes alphabetically 

	 */
 
	@Test

	public void PayementMethod(){

		System.out.println("Payement Method");

	}

	@Test(priority=0)

	public void LoginMethod(){

		System.out.println("Login Method");

	}

	@Test(priority=2)

	public void BilingMethod(){

		System.out.println("Biling Method");

	}

	@Test

	public void RegistrationMethod(){

		System.out.println("Registration Method");

	}
 
}

 