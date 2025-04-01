package selenium_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handling_MouseHover {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.unipune.ac.in/");
		
		Actions act=new Actions(driver);
		WebElement element1=driver.findElement(By.xpath("//span[@id='stUI5_txt']"));
		act.moveToElement(element1).build().perform();
		Thread.sleep(2000);
		
		WebElement element2=driver.findElement(By.xpath("//span[@id='stUI45_txt']"));
		act.moveToElement(element2).build().perform();
		Thread.sleep(2000);

		WebElement element3=driver.findElement(By.xpath("//span[@id='stUI187_txt']"));
		act.moveToElement(element3).build().perform();
		Thread.sleep(2000);
		
		WebElement element4=driver.findElement(By.xpath("//span[@id='stUI197_txt']"));
		act.moveToElement(element4).build().perform();
		Thread.sleep(2000);
		
		WebElement element5=driver.findElement(By.xpath("//span[@id='stUI220_txt']"));
		act.moveToElement(element5).build().perform();
		Thread.sleep(2000);
		
		driver.close();
	}

}
