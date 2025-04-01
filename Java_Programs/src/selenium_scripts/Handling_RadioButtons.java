package selenium_scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_RadioButtons {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(2000);
		
		WebElement r1= driver.findElement(By.xpath("//input[@value='radio1']"));
        System.out.println(r1.isDisplayed());
        System.out.println(r1.isEnabled());
        System.out.println(r1.isSelected());
        r1.click();
        System.out.println(r1.isSelected());
        
        Thread.sleep(3000);
        WebElement r2 = driver.findElement(By.cssSelector("input[value='radio2']"));
        System.out.println(r2.isDisplayed());
        System.out.println(r2.isEnabled());
        System.out.println(r2.isSelected());
        r2.click();
        System.out.println(r2.isSelected());
        System.out.println(r1.isSelected());
        
        Thread.sleep(3000);
        WebElement r3 = driver.findElement(By.xpath("(//input[@class=\"radioButton\"])[3]"));
        System.out.println(r3.isDisplayed());
        System.out.println(r3.isEnabled());
        System.out.println(r3.isSelected());
        r3.click();
        
        
        System.out.println(r1.isSelected());
        System.out.println(r2.isSelected());
        System.out.println(r3.isSelected());
        
        List<WebElement> links = driver.findElements(By.xpath("//input[@class='radioButton']"));
        
        //apply for loop
        for(int i=0; i<links.size(); i++)
        {
        	System.out.println(links.get(i).isDisplayed());
        	System.out.println(links.get(i).isEnabled());
        	System.out.println(links.get(i).isSelected());
        	if(links.get(i).isSelected()==false)
        	{
        		links.get(i).click();
        	}
        }
        
        //for each loop
        for (WebElement radioButton : links) {
            System.out.println(radioButton.isDisplayed());
            System.out.println(radioButton.isEnabled());
            System.out.println(radioButton.isSelected());

            if (!radioButton.isSelected()) {
                radioButton.click();
            }
        }

	}




	}


