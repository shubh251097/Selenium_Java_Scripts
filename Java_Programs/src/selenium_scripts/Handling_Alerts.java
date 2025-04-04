package selenium_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Alerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		Thread.sleep(2000);
		WebElement ele= driver.findElement(By.xpath("//a[normalize-space()='SwitchTo']"));
		ele.click();
		driver.findElement(By.xpath("//a[normalize-space()='Alerts']")).click();
		
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//a[normalize-space()='Alert with OK']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		
		String alertmsg=driver.switchTo().alert().getText();
		System.out.println(alertmsg);
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
	
		
		
		
		
		

	}

}
