package selenium_scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handling_Dropdowns {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
        WebElement m = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
        Select sc = new Select(m);
        sc.selectByIndex(1);
        //this method will select the option as per the index value provided as input
        
        Thread.sleep(2000);
        sc.selectByValue("option3");
        //this method will select the option as per the given value
        
        Thread.sleep(2000);
        sc.selectByVisibleText("Option2");
        // this method will choose the option as per text displayed on UI
        
        Thread.sleep(2000);
        List<WebElement> link = sc.getOptions();
        System.out.println(link.size());
        
         /*  for(int i =0; i<l.size(); i++)
        {
        	//l.get(i).click();
        	System.out.println(l.get(i).getText());
        	Thread.sleep(2000);
        } */
        
for(WebElement k:link)
{
	System.out.println(k.getText());
	
}
driver.close();
		
	}
}



	


