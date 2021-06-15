package leafground;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert {
	@Test
	public void alert() throws Exception {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("http://leafground.com/pages/Alert.html");

		WebElement alertbox = driver.findElement(By.xpath("//*[@onclick='normalAlert()']"));
		System.out.println(alertbox.isDisplayed());
		//System.out.println(alertbox.isEnabled());
		alertbox.click();

		Thread.sleep(2000);

		org.openqa.selenium.Alert alerts = driver.switchTo().alert();
		alerts.accept();

		driver.findElement(By.cssSelector("button[onclick='confirmAlert()']")).click();
		Thread.sleep(2000);
		alerts.dismiss();
		//alerts.accept();

		WebElement promptbox =  driver.findElement(By.cssSelector("button[onclick='confirmPrompt()']"));
		promptbox.click();
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(2000);
		System.out.println(alerts.getText());
		driver.switchTo().alert().sendKeys("Selenium Institue");
		Thread.sleep(2000);
		alerts.accept();

		driver.findElement(By.cssSelector("button[onclick='lineBreaks()']")).click();
		Thread.sleep(2000);
		System.out.println(alerts.getText());
		String text = alerts.getText();
		if(text.contains("How")) {
			System.out.println("the text is in next line");
		}
		else {
			System.out.println("the text is not in next line");
		}
		alerts.accept();

		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[onclick='sweetalert()']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".swal-button")).click();





	}

}
