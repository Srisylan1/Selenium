package day1;

import org.testng.annotations.Test;

public class Includeexcludeconcept {

	@Test 
	public void enterusername() {
		System.out.println("Enter Your Username");
	}
	@Test
	public void enterpassword() {
		System.out.println("Enter Your Password");
	}
	@Test
	public void login() {
		System.out.println("Successfully Logged in");
	}
	@Test
	public void entertransaction() {
		System.out.println("Enter your Limit");
	}
	@Test
	public void transactionsuccessful() {
		System.out.println("Transaction Complete");
	}
	@Test
	public void logout() {
		System.out.println("Successfully Logged Out");
	}
}
