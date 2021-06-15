package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Launchingbrowser {

	@Test
	public void browser() {
		//Firefox Driver launch scenario
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\SRI\\Downloads\\Web Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.gmail.com");
	}
	
}
