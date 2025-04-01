package selenium_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Hover {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement element=driver.findElement(By.xpath("(//span[normalize-space()='Fashion'])[2]"));
		//(//span[.='Fashion'])[2]
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		act.moveToElement(element).build().perform();
		
		driver.findElement(By.linkText("Women Ethnic")).click();
		Thread.sleep(2000);
		//WebElement ele1=driver.findElement(By.xpath("//a[normalize-space()='Women Kurtas & Kurtis']"));
		//act.moveToElement(ele1);
		driver.findElement(By.xpath("//a[normalize-space()='Women Cotton Blend Kurti Pant Dupatta Set'][1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='L']")).click();
		//a[@class='CDDksN io5kcR zmLe5G dpZEpc']
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='QqFHMw vslbG+ In9uk2']")).click();
		

	}
	

}
