package selenium_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Textboxes {

	public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        // to launch the browser
        
        driver.get("https://www.google.co.in/");
        // to launch the URL/test page
        
        driver.manage().window().maximize();
        // maximize the browser window
        
        Thread.sleep(2000);
        
        //WebElement searchBar = driver.findElement(By.id("APjFqb"));
        WebElement searchBar = driver.findElement(By.xpath("//textarea[@name='q']"));
        // identify or locate the web element
        
        System.out.println(searchBar.isDisplayed());
        
        System.out.println(searchBar.isEnabled());
        
        searchBar.click();
        // perform click operation....
        
        Thread.sleep(2000);
        
        searchBar.sendKeys("squareit");
        
        
        //searchBar.clear();
        
        Thread.sleep(2000);
        
        driver.close();
        
	}



	}


