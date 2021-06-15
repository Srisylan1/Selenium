package day1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ContainsXpathLocator {
	@Test
	public void browser() throws Exception {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\SRI\\Downloads\\Web Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://login.salesforce.com/?locale=eu");
		driver.findElement(By.xpath("//input[contains(@id, 'username')]")).sendKeys("Srisylan");
		driver.findElement(By.xpath("//input[contains(@name, 'pw')]")).sendKeys("sylanSri!997");
		Thread.sleep(5000);
		driver.quit();
	}
//	@Test
	//	public void salesforce() throws Exception {
	//	System.setProperty("webdriver.gecko.driver", "C:\\Users\\SRI\\Downloads\\Web Drivers\\geckodriver.exe");
	//	WebDriver searchengine=new FirefoxDriver();
	//	searchengine.get("https://www.amazon.in/ap/signin?_encoding=UTF8&openid.assoc_handle=inflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fie%3DUTF8%26action%3Dsign-out%26path%3D%252Fgp%252Fyourstore%252Fhome%26ref_%3Dnav_AccountFlyout_signout%26signIn%3D1%26useRedirectOnSuccess%3D1");
	//	searchengine.findElement(By.xpath("//input[contains(@id,'ap_email')]")).sendKeys("srisylants@gmail.com");
	//	searchengine.findElement(By.xpath("//input[contains(@id,'continue')]")).click();
	//	searchengine.findElement(By.xpath("//input[contains(@id,'ap_password')]")).sendKeys("sylanSri!997");
	//	searchengine.findElement(By.xpath("//input[contains(@id,'signInSubmit')]")).submit();
	//	Thread.sleep(10000);
	//	searchengine.quit();
	
}
