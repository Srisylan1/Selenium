package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class StartswithXpathLocator {
	@Test
	public void salesforce() {
		System.setProperty("webdriver.gecko.driver","C:\\\\Users\\\\SRI\\\\Downloads\\\\Web Drivers\\\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://login.salesforce.com/?locale=eu");
		driver.findElement(By.xpath("//input[starts-with(@id, 'username')]")).sendKeys("Srisylan");
		driver.findElement(By.xpath("//input[starts-with(@name, 'pw')]")).sendKeys("sylanSri!997");
	}
}
