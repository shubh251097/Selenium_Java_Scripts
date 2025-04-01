package selenium_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class New_login {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		//System.out.println(driver.getTitle());
		 Thread.sleep(3000);
		String actTitle=driver.getTitle();
		System.out.println(actTitle);
		String expTitle="OrangeHRM";
		System.out.println(actTitle.equals(expTitle));
		
	
		String act_url=driver.getCurrentUrl();
		System.out.println(act_url);
		String exp_url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		System.out.println(act_url.equals(exp_url));
		
		

		

	}

}
