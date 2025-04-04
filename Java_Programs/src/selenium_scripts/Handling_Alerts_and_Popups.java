package selenium_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Alerts_and_Popups {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shubham\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement alertButton = driver.findElement(By.id("alertbtn"));
		
		System.out.println(alertButton.isDisplayed());
		System.out.println(alertButton.isEnabled());
		
		alertButton.click();
		Thread.sleep(2000);
		
		//driver.switchTo().alert();
		// to shift the control or to enter into the alert modal
		Thread.sleep(2000);
		String alertmsg=driver.switchTo().alert().getText();
		System.out.println(alertmsg);
		
		driver.switchTo().alert().accept();
		// to accept the instructions in pop up or click on ok button
		
		Thread.sleep(2000);
		//driver.switchTo().alert().dismiss();
		
		String expectedText = "Hello , share this practice page and share your knowledge";
		
		System.out.println(alertmsg.equals(expectedText));

	}

}
