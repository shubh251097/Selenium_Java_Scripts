package selenium_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_CheckboxandRadioButton {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/checkboxradio/");
		
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		WebElement element=driver.findElement(By.xpath("//label[@for='radio-3']"));
		System.out.println(element.isDisplayed());
		System.out.println(element.isEnabled());
		//System.out.println(element.isSelected());
		element.click();
		System.out.println(element.isSelected());
		 
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='checkbox-1']")).click();
		System.out.println(element.isDisplayed());
		System.out.println(element.isEnabled());
		System.out.println(element.isSelected());
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//label[@for='checkbox-3']")).click();
		System.out.println(element.isDisplayed());
		System.out.println(element.isEnabled());
		System.out.println(element.isSelected());
		
         Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='checkbox-nested-2']")).click();
		driver.findElement(By.xpath("//label[@for='checkbox-nested-4']")).click();
		driver.findElement(By.xpath("//label[@for='checkbox-nested-3']")).click();
		driver.findElement(By.xpath("//label[@for='checkbox-nested-1']")).click();
		Thread.sleep(2000);
		driver.close();
		
	}

}
