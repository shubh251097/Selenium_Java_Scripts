package selenium_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Actions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		

Actions act=new Actions(driver);
WebElement source1=driver.findElement(By.xpath("//div[@id='box6']"));
WebElement target1=driver.findElement(By.xpath("//div[@id='box106']"));
act.dragAndDrop(source1, target1).build().perform();


Thread.sleep(2000);
WebElement source2=driver.findElement(By.xpath("//div[@id='box3']"));
WebElement target2=driver.findElement(By.xpath("//div[@id='box103']"));
act.dragAndDrop(source2, target2).build().perform();


Thread.sleep(2000);
WebElement source3=driver.findElement(By.xpath("//div[@id='box1']"));
WebElement target3=driver.findElement(By.xpath("//div[@id='box101']"));
act.dragAndDrop(source3, target3).build().perform();
Thread.sleep(2000);


WebElement source4=driver.findElement(By.xpath("//div[@id='box2']"));
WebElement target4=driver.findElement(By.xpath("//div[@id='box102']"));
act.dragAndDrop(source4, target4).build().perform();
Thread.sleep(2000);



WebElement source5=driver.findElement(By.xpath("//div[@id='box7']"));
WebElement target5=driver.findElement(By.xpath("//div[@id='box107']"));
act.dragAndDrop(source5, target5).build().perform();
Thread.sleep(2000);


WebElement source6=driver.findElement(By.xpath("//div[@id='box4']"));
WebElement target6=driver.findElement(By.xpath("//div[@id='box104']"));
act.dragAndDrop(source6, target6).build().perform();
Thread.sleep(2000);


WebElement source7=driver.findElement(By.xpath("//div[@id='box5']"));
WebElement target7=driver.findElement(By.xpath("//div[@id='box105']"));
act.dragAndDrop(source7, target7).build().perform();
Thread.sleep(5000);

driver.close();


	}

}
