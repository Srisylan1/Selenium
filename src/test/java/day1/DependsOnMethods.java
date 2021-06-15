package day1;

import org.testng.annotations.Test;

public class DependsOnMethods {

	@Test 
	public void enterusername() {
		System.out.println("Enter Your Username");
	}
	@Test(dependsOnMethods="enterusername")
	public void enterpassword() {
		System.out.println("Enter Your Password");
	}
	@Test(dependsOnMethods="enterpassword")
	public void login() {
		System.out.println("Successfully Logged in");
	}
	@Test(dependsOnMethods="login")
	public void entertransaction() {
		System.out.println("Enter your Limit");
	}
	@Test(dependsOnMethods="entertransaction")
	public void transactionsuccessful() {
		System.out.println("Transaction Complete");
	}
	@Test(dependsOnMethods="transactionsuccessful")
	public void logout() {
		System.out.println("Successfully Logged Out");
	}
}
