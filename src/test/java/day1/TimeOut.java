package day1;

import org.testng.annotations.Test;

public class TimeOut {

	@Test
	public void enterusername() throws Exception {
		System.out.println("Enter Your Username");
		Thread.sleep(4000);
	}
	@Test(timeOut = 5000)
	public void enterpassword() throws Exception {
		System.out.println("Enter Your Password");
		Thread.sleep(4000); 
	}
	@Test(timeOut = 1000)
	public void login() throws Exception {
		System.out.println("Successfully Logged in");
		Thread.sleep(0100);
	}
	@Test(timeOut = 6000)
	public void entertransaction() throws Exception {
		System.out.println("Enter your Limit");
		Thread.sleep(5500);
	}
	@Test(timeOut = 1000)
	public void transactionsuccessful() throws Exception {
		System.out.println("Transaction Complete");
	}
	@Test(timeOut = 2000)
	public void logout() throws Exception {
		System.out.println("Successfully Logged Out");
		Thread.sleep(1000);
	}
}
