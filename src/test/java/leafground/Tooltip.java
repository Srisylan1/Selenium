package leafground;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tooltip {

	@Test
	public void tooltip() {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("http://leafground.com/pages/tooltip.html");
		//String name = "Enter your Name";

		WebElement getname = driver.findElement(By.xpath("//*[@id='age']"));
		getname.sendKeys("Srisylan");

		String title = getname.getText();

		System.out.println("Enter Your Name = Srisylan " +title);

		driver.close();

		//		if(title.equals(name)) {
		//		System.out.println("Srisylan");
		//}
	}
}
