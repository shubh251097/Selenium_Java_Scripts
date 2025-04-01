package selenium_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_Script {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		
		driver=new ChromeDriver();
		Thread.sleep(2000);
		
		driver=new ChromeDriver();
		Thread.sleep(2000);
		
		driver.close();

	}

}
