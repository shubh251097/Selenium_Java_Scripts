package selenium_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_KeyBoardOperations {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		WebElement element1 = driver.findElement(By.id("username"));
		element1.sendKeys("Prashanth Devil");
		Thread.sleep(3000);
		
		element1.sendKeys(Keys.CONTROL+"a");
		Thread.sleep(3000);
		
		element1.sendKeys(Keys.CONTROL+"c");
		Thread.sleep(3000);
		
		element1.sendKeys(Keys.TAB);
		Thread.sleep(3000);
		
		WebElement element2 = driver.findElement(By.id("password"));
		element2.sendKeys(Keys.CONTROL+"v");
		Thread.sleep(3000);
		
		//element2.clear();
		
		element2.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(1000);
		
		element2.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(1000);
		
		element2.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(1000);
		
		
		element2.sendKeys(Keys.ARROW_LEFT);
		Thread.sleep(1000);
		
		element2.sendKeys(Keys.ARROW_LEFT);
		Thread.sleep(1000);
		
		element2.sendKeys(Keys.ARROW_RIGHT);
		Thread.sleep(1000);
		
		element2.sendKeys(Keys.ARROW_RIGHT);

	}

}
