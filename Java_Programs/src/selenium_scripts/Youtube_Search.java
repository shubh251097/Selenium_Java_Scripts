package selenium_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube_Search {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.youtube.com");
		WebElement search= driver.findElement(By.xpath("//input[@name='search_query']"));
		search.sendKeys("salaar bgm");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='ytSearchboxComponentSearchButton']")).click();
		
		
		Thread.sleep(5000);
		driver.close();
		
		
	}

}
