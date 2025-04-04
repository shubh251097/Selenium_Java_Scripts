package selenium_scripts;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_MultipleWindows {

	public static void main(String[] args) throws InterruptedException {

		
			WebDriver driver = new ChromeDriver();
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			
			WebElement button = driver.findElement(By.id("openwindow"));
			button.click();
			
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			
			Thread.sleep(1000);
			
		    System.out.println(driver.getWindowHandle());
		    //System.out.println(d.getWindowHandles());
		    
		    Set<String> obj = driver.getWindowHandles();
		    
		    Iterator<String> it=obj.iterator();
		    
		    String parent_window = it.next();
		    String child_window = it.next();
		    
		    driver.switchTo().window(child_window);
		    
		    Thread.sleep(1000);
		    
		    System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			
			Thread.sleep(4000);
			
			WebElement contactButton = driver.findElement(By.xpath("(//a[@href='contactus.html'])[1]"));
			contactButton.click();
			
			Thread.sleep(4000);
			
			driver.switchTo().window(parent_window);
			Thread.sleep(1000);
			
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			

	}

}
