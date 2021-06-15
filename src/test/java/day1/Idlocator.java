package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Idlocator {
	@Test
	public void gmail() {
		System.setProperty("webdriver.gecko.driver","C:\\\\Users\\\\SRI\\\\Downloads\\\\Web Drivers\\\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");

		//driver.findElement(By.linkText("username")).sendKeys("srisylants@gmail.com");
		
		WebElement username=driver.findElement(By.id("identifierId"));
	    username.sendKeys("srisylants@gmail.com");
		
		//driver.findElement(By.linkText("password")).sendKeys("sylanSri!997");

	}

}
