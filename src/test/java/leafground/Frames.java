package leafground;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {
	@Test
	public void framework() {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("http://leafground.com/pages/frame.html");

		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src=\"default.html\"]")));
		driver.findElement(By.xpath("//button[@id=\"Click\"]")).click();
		driver.switchTo().defaultContent();

		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src=\"page.html\"]")));
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src=\"nested.html\"]")));
		driver.findElement(By.xpath("//button[@id=\"Click1\"]")).click();
		driver.switchTo().defaultContent();
		
		System.out.println(driver.findElement(By.xpath("//iframe")).getSize());




	}

}
