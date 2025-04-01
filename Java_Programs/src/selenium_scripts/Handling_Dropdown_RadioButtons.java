package selenium_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Dropdown_RadioButtons {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://jqueryui.com/controlgroup/");
		
		WebElement element=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(element);
		Thread.sleep(2000);

		WebElement dropdown1=driver.findElement(By.xpath("(//span[@class='ui-selectmenu-icon ui-icon ui-icon-triangle-1-s'])[1]"));
		dropdown1.click();
		driver.findElement(By.id("ui-id-6")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//label[@for='transmission-standard']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//label [@for='insurance']")).click();
		Thread.sleep(2000);
		
		Thread.sleep(2000);
		
	WebElement count=	driver.findElement(By.xpath("(//span[@class='ui-button-icon ui-icon ui-icon-triangle-1-n'])[1]"));
		count.click();
		count.click();
		Thread.sleep(2000);
		
		WebElement dropdown2=driver.findElement(By.xpath("(//span[@class='ui-selectmenu-icon ui-icon ui-icon-triangle-1-s'])[2]"));
		dropdown2.click();
		driver.findElement(By.xpath("//div[@id='ui-id-12']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//label[@for='transmission-automatic-v']")).click();
		WebElement checkbox=driver.findElement(By.xpath("//label[@for='insurance-v']"));
		System.out.println(checkbox.isDisplayed());
		System.out.println(checkbox.isEnabled());
		checkbox.click();
		System.out.println(checkbox.isSelected());
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@id='book']")).click();
		
		
	}

	}


