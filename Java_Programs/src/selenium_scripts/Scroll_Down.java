package selenium_scripts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_Down {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.browserstack.com/guide/selenium-scroll-tutorial");
		
		//scroll down on a web page in Selenium by defining the number of pixels
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1500)","");
	
		
		//to perform Scroll on application using Selenium
	       JavascriptExecutor jns = (JavascriptExecutor) driver;
	       jns.executeScript("window.scrollBy(0,-350)", "");
	   

		Thread.sleep(2000);
		driver.navigate().to("https://google.com/");
		driver.navigate().back();
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.close();
		
	}

}
