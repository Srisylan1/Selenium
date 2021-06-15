package leafground;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dragconcept {

	@Test
	public void drag() throws Exception {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("http://leafground.com/");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@alt=\"Draggable\"]")).click();
		Thread.sleep(2000);

		WebElement dragging = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));

		Actions move = new Actions(driver);

	//	move.dragAndDropBy(dragging, 190, 200);
	//	move.build().perform();
		
	//	move.clickAndHold(dragging).moveToElement(dragging, 190, 200);
	//	move.build().perform();
		
		move.clickAndHold(dragging).moveByOffset(190, 200);
		move.build().perform();

	}
}
