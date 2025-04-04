package selenium_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Scrolling_Using_JavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//1st way scroll down on a web page in Selenium by defining the number of pixels
		//js.executeScript("window.scrollBy(0,2500)","");
		
		Thread.sleep(3000);
		//2nd way scroll up on a web page by defining the no. of pixels
		//js.executeScript("window.scrollBy(0,-1500)","");
		
		// 3rd way Scrolling down the page till the element is found	
		WebElement mouseHover = driver.findElement(By.id("mousehover"));
		js.executeScript("arguments[0].scrollIntoView();",mouseHover);
		
		
		
        // 4th way scroll down to the bottom of the webpage using Selenium
       js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
       
		
		Thread.sleep(3000);
		
		/*Actions a = new Actions(driver);
		
		a.moveToElement(mouseHover).build().perform();
		
		Thread.sleep(2000);
		
		WebElement top = driver.findElement(By.xpath("//a[@href='#top']"));
		Thread.sleep(2000);
		
		top.click();*/
	}



	}


