package leafground;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Edit {
	@Test
	public void edit() throws Exception {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		Thread.sleep(1500);

		driver.get("http://leafground.com/pages/Edit.html");
		Thread.sleep(1500);

		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc@abc.com");
		Thread.sleep(1500);

		driver.findElement(By.xpath("//*[@value=\"Append \"]")).sendKeys("Text Appended");
		Thread.sleep(1500);

		String textvalue = driver.findElement(By.xpath("//*[@value=\"TestLeaf\"]")).getAttribute("value");
		System.out.println(textvalue);
		Thread.sleep(1500);

		driver.findElement(By.xpath("//*[@value=\"Clear me!!\"]")).clear();
		Thread.sleep(1500);

		Boolean enable = driver.findElement(By.xpath("//*[@disabled=\"true\"]")).isEnabled();
		System.out.println(enable);
		Thread.sleep(1500);

		driver.quit();

	}

}
