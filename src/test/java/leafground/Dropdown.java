package leafground;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	@Test
	public void dropdown() throws Exception {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		Thread.sleep(2000);

		//UsingIndex
		WebElement select1= driver.findElement(By.xpath("//*[@id=\"dropdown1\"]"));
		Select sele=new Select(select1);
		sele.selectByIndex(1);
		Thread.sleep(2000);

		//UsingText
		WebElement select2= driver.findElement(By.xpath("//*[@name=\"dropdown2\"]"));
		Select sele1=new Select(select2);
		sele1.selectByVisibleText("Appium");
		Thread.sleep(2000);

		//UsingValue
		WebElement select3= driver.findElement(By.xpath("//*[@name=\"dropdown3\"]"));
		Select sele2=new Select(select3);
		sele2.selectByValue("3");
		Thread.sleep(2000);

		//For getting all size in the DropDown
		List<WebElement> select4= driver.findElements(By.xpath("//*[@class=\"example\"][4]/select/option"));
		System.out.println(select4.size());
		Thread.sleep(2000);
		
		//UsingSendkeys
		driver.findElement(By.xpath("//*[@class=\"example\"][5]/select")).sendKeys("Loadrunner");
		Thread.sleep(2000);
		
		//using forloop for selecting all options
		List<WebElement> select5= driver.findElements(By.xpath("//*[@class=\"example\"][6]/select/option"));
		int size=select5.size();
		for (WebElement webElement : select5) {
			Thread.sleep(2000);
			webElement.click();
		}
		for (int i=0 ; i<size ; i++)
		{
			Thread.sleep(2000);
			select5.get(i).click();
		}
        driver.quit();
	}
}
