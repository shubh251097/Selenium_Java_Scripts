package selenium_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Links {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/?locale=in");
		
		Thread.sleep(2000);
		
		WebElement link1 = driver.findElement(By.linkText("Forgot Your Password?"));
		//link1.click();
		System.out.println(link1.isDisplayed());
		System.out.println(link1.isEnabled());
		link1.click();
		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://login.salesforce.com/secur/forgotpassword.jsp?locale=in&lqs=locale%3Din";
        
		System.out.println(actualURL.equalsIgnoreCase(expectedURL));
		
		Thread.sleep(2000);
		
		WebElement link2 = driver.findElement(By.partialLinkText("Need Help Loggi"));
		boolean b1 = link2.isDisplayed();
		if(b1==true)
		{
			System.out.println("passed");
		}
		else
		{
			System.out.println("failed...!!");
			System.out.println("element is not displayed on screen");
		}
		
		boolean b2 = link2.isEnabled();
		if(b2==true)
		{
			System.out.println("link is displayed");
		}
		else
		{
			System.out.println("link is not displayed!");
		}
	}



	}


