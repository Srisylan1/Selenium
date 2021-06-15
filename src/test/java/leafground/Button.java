package leafground;



import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Button {

	@Test
	public void button() throws Exception {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://leafground.com/pages/Button.html");
		Thread.sleep(1500);

		// going back to main page and coming back to same page

		driver.findElement(By.xpath("//*[@id=\"home\"]")).click();
		Thread.sleep(1500);
		driver.navigate().back();
		Thread.sleep(1500);

		// getting the position of X and Y

		WebElement position = driver.findElement(By.xpath("//*[@id=\"position\"]"));
		System.out.println(position.getLocation().getX());
		System.out.println(position.getLocation().getY());
		Thread.sleep(1500);
		/*		Point getXY = position.getLocation();
		System.out.println(getXY.x+" "+getXY.y);
		Thread.sleep(1500);     					*/

		// finding the background color

		WebElement color = driver.findElement(By.xpath("//*[@id=\"color\"]"));
		String colour =  color.getCssValue("background-color");
		System.out.println(colour);
		Thread.sleep(1500);

		// getting the height and width

		WebElement size =  driver.findElement(By.xpath("//*[@id=\"size\"]"));
		System.out.println(size.getSize().getHeight());
		System.out.println(size.getSize().getWidth());

		/* Dimension Di = size.getSize();
		System.out.println(Di.getHeight()+" "+Di.getWidth());	*/

	}
}
