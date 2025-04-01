package selenium_scripts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandles {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.redbus.in/");
       String str=driver.getWindowHandle();
       System.out.println(str);
       driver.findElement(By.xpath("//span[normalize-space()='Help']")).click();
       Set<String>str2=driver.getWindowHandles();
       System.out.println(str2);
  
      
       Thread.sleep(2000);
       Object[]windows=str2.toArray();
       String window1=windows[0].toString();
       System.out.println(window1);
       
       String window2=windows[1].toString();
       System.out.println(window2);
       
       driver.switchTo().window(window2);
       driver.findElement(By.xpath("//span[normalize-space()='Account']")).click();
       Thread.sleep(2000);
       driver.switchTo().window(window1);
       
       driver.findElement(By.xpath("//span[normalize-space()='Train Tickets']")).click();
       
       
	}

}
