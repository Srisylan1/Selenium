package demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementsTextBox {

	@Test
	public void textbox() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.demoqa.com/");
		driver.get("https://www.demoqa.com/text-box");
		driver.manage().window().maximize();


		WebDriverWait wait = new WebDriverWait(driver,2);

	//	driver.findElement(By.xpath("(//*[@class=\"card mt-4 top-card\"])[1]")).click();

		driver.findElement(By.xpath("(//*[@id=\"item-0\"])[1]")).click();

		WebElement fullname = driver.findElement(By.cssSelector("#userName"));
		fullname.sendKeys("ABC");
		String name = fullname.getText();
		System.out.println("Full name is : ABC" +name);


	}

}
