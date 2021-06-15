package leafground;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windowsconcept {

	@Test
	public void windows() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Window.html");
		Thread.sleep(2000);
		String parent =  driver.getWindowHandle();
		System.out.println(parent);

		driver.findElement(By.id("home")).click();
		Set<String> child =  driver.getWindowHandles();
		System.out.println(child);
		
		Iterator<String> childwindows = child.iterator();
		
		while(childwindows.hasNext())
		{
			String title = driver.switchTo().window(childwindows.next()).getTitle();
			if(title.equalsIgnoreCase("TestLeaf - Selenium Playground"))
				driver.close();	
		}
		
		driver.switchTo().window(parent).close();


	}
}
