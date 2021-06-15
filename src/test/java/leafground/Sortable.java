package leafground;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sortable {
	@Test
	public void sort() {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("http://leafground.com/pages/sortable.html");

		List<WebElement> sorting =  driver.findElements(By.xpath("//*[@id='sortable']/li"));

		/*		Actions action =  new Actions(driver);
		action.clickAndHold(sorting.get(1)).pause(5000).moveToElement(sorting.get(5)).release().build().perform();
		action.clickAndHold(sorting.get(5)).pause(5000).moveToElement(sorting.get(1)).release().build().perform();
		 */
		int count = sorting.size();
		System.out.println(count);

		WebElement from = sorting.get(1);
		WebElement to = sorting.get(5);

		Actions action =  new Actions(driver);
		action.clickAndHold(from).pause(3000).moveToElement(to).pause(3000).release().build().perform();
	}

}
