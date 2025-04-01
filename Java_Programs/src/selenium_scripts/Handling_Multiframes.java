package selenium_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Multiframes {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ui.vision/demo/webtest/frames/");
		Thread.sleep(2000);
		WebElement element=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(element);
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("This is Frame 1");
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		
		WebElement element2=driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(element2);
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("This is Frame 2");
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		
		
		WebElement element3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(element3);
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("This is Frame 3");
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		
		
		Thread.sleep(2000);
		driver.switchTo().frame(3);
		driver.findElement(By.xpath("//input[@name='mytext4']")).sendKeys("This is Frame 4");
		Thread.sleep(2000);
		
		
		driver.close();

	}
	
}
