package day1;

import org.testng.annotations.Test;

@Test(invocationCount=2)
public class InvocationCount {
	public void enterusername() {
		System.out.println("Enter Your Username");
	}

	public void enterpassword() {
		System.out.println("Enter Your Password");
	}

	public void login() {
		System.out.println("Successfully Logged in");
	}

	public void entertransaction() {
		System.out.println("Enter your Limit");
	}

	public void transactionsuccessful() {
		System.out.println("Transaction Complete");
	}

	public void logout() {
		System.out.println("Successfully Logged Out");
	}

}
