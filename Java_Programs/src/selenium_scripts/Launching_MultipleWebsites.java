package selenium_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launching_MultipleWebsites {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shubham\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	 System.out.println(driver.getTitle());
	 System.out.println(driver.getCurrentUrl());
	 
	 Thread.sleep(3000);
	// WebDriver driver1=new ChromeDriver();
	 //driver1.get("https://demo.automationtesting.in/Alerts.html");
	 
	 WebDriver driver1=driver.switchTo().newWindow(WindowType.TAB);
	driver1.get("https://demo.automationtesting.in/Alerts.html");
	 System.out.println(driver1.getTitle());
     System.out.println(driver1.getCurrentUrl());	 
	 Thread.sleep(3000);
      //driver.close();
	}

}
