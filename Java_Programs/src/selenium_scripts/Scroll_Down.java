package selenium_scripts;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_Down {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.browserstack.com/guide/selenium-scroll-tutorial");
		
		//scroll down on a web page in Selenium by defining the number of pixels
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,2000)","");
	
		Thread.sleep(3000);
		//to perform Scroll up
	       JavascriptExecutor jns = (JavascriptExecutor) driver;
	       jns.executeScript("window.scrollBy(0,-1500)", "");
	   

		Thread.sleep(5000);
		driver.navigate().to("https://google.com/");
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.close();
		
	}

}
