package selenium_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handling_Slider {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/slider/#colorpicker");
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		WebElement slider1=driver.findElement(By.xpath("//span[@style='left: 100%;']"));
		Actions act=new Actions(driver);
		act.clickAndHold(slider1).moveByOffset(-100, 0).release().build().perform();
		Thread.sleep(2000);
		act.clickAndHold(slider1).moveByOffset(150, 0).release().build().perform();
		Thread.sleep(2000);

		WebElement slider2=driver.findElement(By.xpath("//span[@style='left: 54.902%;']"));
		act.clickAndHold(slider2).moveByOffset(-50, 0).release().build().perform();
		Thread.sleep(2000);
		act.clickAndHold(slider2).moveByOffset(150, 0).release().build().perform();
		Thread.sleep(2000);
		
		WebElement slider3=driver.findElement(By.xpath("//span[@style='left: 23.5294%;']"));
		act.clickAndHold(slider3).moveByOffset(-150, 0).release().build().perform();
		Thread.sleep(2000);
		act.clickAndHold(slider3).moveByOffset(200, 0).release().build().perform();
		Thread.sleep(3000);
		
		driver.navigate().to("https://jqueryui.com/slider/");
		//WebElement frame=driver.findElement(By.xpath("demo-frame"));
		
		driver.switchTo().frame(0);
		Thread.sleep(3000);
		WebElement slider4=driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));
		//Actions act1=new Actions(driver);
		act.clickAndHold(slider4).moveByOffset(300, 0).release().build().perform();
		Thread.sleep(5000);
		driver.navigate().back();
		//driver.close();	
		
	}

}
