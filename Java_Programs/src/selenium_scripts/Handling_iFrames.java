package selenium_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_iFrames {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Frames.html");
	    System.out.println(driver.getTitle());
     	System.out.println(driver.getCurrentUrl());
	
		Thread.sleep(2000);
		//WebElement element=driver.findElement(By.xpath("//iframe[@id='singleframe']"));
		
		//driver.switchTo().frame(element);
		//WebElement frame1=driver.findElement(By.xpath("//input[@type='text']"));
	//	frame1.sendKeys("Automation Testing");
		
		Thread.sleep(2000);
		//driver.switchTo().defaultContent();
	
		
		driver.findElement(By.linkText("Iframe with in an Iframe")).click();
		WebElement frame2=driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(frame2);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("This is Frame 2");
		
	
		
		//driver.close();

	}
}
