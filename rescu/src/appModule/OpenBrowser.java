package appModule;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {
	 //static WebDriver driver;
	public static void openChrome(WebDriver driver){
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium requirements\\chromedriver.exe");
		driver=new ChromeDriver();	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(100,TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
}
