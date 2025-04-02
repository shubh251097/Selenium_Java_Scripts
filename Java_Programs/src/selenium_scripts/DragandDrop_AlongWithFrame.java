package selenium_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop_AlongWithFrame {

	public static void main(String[] args) throws InterruptedException {
	


				WebDriver driver = new ChromeDriver();
				driver.get("https://jqueryui.com/droppable/");
				driver.manage().window().maximize();
				Thread.sleep(3000);
				
				//WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
				// located frame just like normal web element
				
				driver.switchTo().frame(0);
				// one of the approach to enter into a frame
				
				Actions act = new Actions(driver);
				// create an object for actions class
				
				WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));
				WebElement target = driver.findElement(By.xpath("//div[@id='droppable']"));
		
				//a.clickAndHold(source).build().perform();
				
				//a.moveToElement(target).build().perform();
				
				//a.release().build().perform();
				
				//a.clickAndHold(source).moveToElement(target).release().build().perform();
				Thread.sleep(2000);
				act.dragAndDrop(source, target).build().perform();
		
				Thread.sleep(3000);
				
				driver.close();
				
			}

		

	}


