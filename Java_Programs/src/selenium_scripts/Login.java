package selenium_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public  class Login {

	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	
	driver.get("https://dev.flexifyme.com");
	

	
	//Thread.sleep(2000);
	String pgtitle=driver.getTitle();
	System.out.println(pgtitle);
	String title=driver.getCurrentUrl();
	System.out.println(title);
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,200)", " ");
	
	
	driver.findElement(By.name("firstName")).sendKeys("Shubham");
	driver.findElement(By.xpath("//input[@value='+91']")).sendKeys("9922345672");
	
	Select sc =new Select(driver.findElement(By.name("category")));
	sc.selectByVisibleText("Lower Back Pain");
	//driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[4]/form[1]/div[1]/div[5]/button[1]")).click();
 Thread.sleep(3000);
	
	driver.close();

		
		
		

	}

}
