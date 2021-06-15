package leafground;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selectableconcept {

	@Test
	public void select() throws Exception {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("http://leafground.com/pages/selectable.html");

		List<WebElement> select = driver.findElements(By.xpath("//*[@id=\"selectable\"]/li"));
		System.out.println(select.size());

		Actions selecting = new Actions(driver);

		//selecting one by one
		/*		selecting.click(select.get(1));
		Thread.sleep(2000);
		selecting.click(select.get(5));
		Thread.sleep(2000);
		selecting.click(select.get(2));
		Thread.sleep(2000);
		selecting.click(select.get(4));
		Thread.sleep(2000);
		selecting.click(select.get(6));
		Thread.sleep(2000);
		selecting.click(select.get(3));
		Thread.sleep(2000);
		 */

		//selecting all at a time
		selecting.keyDown(Keys.CONTROL);
		selecting.click(select.get(1));
		Thread.sleep(2000);
		selecting.click(select.get(5));
		Thread.sleep(2000);
		selecting.click(select.get(2));
		Thread.sleep(2000);
		selecting.click(select.get(4));
		Thread.sleep(2000);
		selecting.click(select.get(6));
		Thread.sleep(2000);
		selecting.click(select.get(3));
		Thread.sleep(2000);


		selecting.build().perform();


	}
}
