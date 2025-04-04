package selenium_scripts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDownToBottom {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.browserstack.com/guide/selenium-scroll-tutorial");
		
		//scroll down to the bottom of the webpage using Selenium
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		   js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
				String pgtitle=driver.getTitle();
				System.out.println(pgtitle);

		Thread.sleep(2000);
		driver.navigate().to("https://google.com/");
		String title=driver.getCurrentUrl();
		System.out.println(title);
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(4000);
		driver.navigate().forward();
		Thread.sleep(4000);
		driver.close();

	}

}
