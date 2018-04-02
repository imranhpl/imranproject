package AutomationTestCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.LoginPage;
import Utility.Constant;
import Utility.ExcelUtils;
import appModule.LogoutAction;
import appModule.OpenBrowser;


public class LoginTestCase {
	WebDriver driver;
	
	
	
	@Test
	public void test()throws Exception
	{
		
		OpenBrowser.openChrome(driver);
		driver.get("https://stackoverflow.com/questions/2001586/how-to-comment-a-block-in-eclipse");
	}
	
	
	/*@Test
			public void lp01() throws Exception
			{
		OpenBrowser.openChrome(driver);
		System.setProperty("webdriver.chrome.driver", "D:\\selenium requirements\\chromedriver.exe");
		driver=new ChromeDriver();	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(100,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(Constant.URL);
		Thread.sleep(5000);
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Test Cases for web");//Opening the excel file
	LoginPage.email(driver).sendKeys(ExcelUtils.getCellData(1, 11));//reading the data from excel file
	//String s1=ExcelUtils.getCellData(1, 12);
	double s1=ExcelUtils.getNumericCellData(1, 12);//
	int i= (int) s1;//converting double to int
	String num = Integer.toString(i);//int to string
	
	//s1 =(int)Double.parseDouble(s1) + "";
	//System.out.println(i);
	LoginPage.password(driver).sendKeys(num);//entering password
	//LoginPage.password(driver).sendKeys(ExcelUtils.getCellData(1, 12));
	//LoginPage.password(driver).sendKeys(ExcelUtils.getNumericCellData(1, 12));
	LoginPage.loginButton(driver).click();	//Login 
	Thread.sleep(5000);
	LogoutAction.Execute(driver);//executing logout function
	driver.quit();
			}
	@Test
	public void lp02 () throws Exception
	{
		//OpenBrowser.openChrome(driver);
		System.setProperty("webdriver.chrome.driver", "D:\\selenium requirements\\chromedriver.exe");
		driver=new ChromeDriver();	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(100,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(Constant.URL);
		Thread.sleep(5000);
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Test Cases for web");//Opening the excel file
		LoginPage.email(driver).sendKeys(ExcelUtils.getCellData(1, 11));//reading the data from excel file
		LoginPage.password(driver).sendKeys("");//entering password
		LoginPage.loginButton(driver).click();	//Login 
		//Assert.assertTrue(LoginPage.passwordFieldRequired(driver).isDisplayed());
		Assert.assertTrue(LoginPage.passwordFieldRequired(driver).isDisplayed());
		driver.quit();
		
	}
	
	
	@Test
	public void lp03 () throws Exception
	{
		//OpenBrowser.openChrome(driver);
		System.setProperty("webdriver.chrome.driver", "D:\\selenium requirements\\chromedriver.exe");
		driver=new ChromeDriver();	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(100,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(Constant.URL);
		Thread.sleep(5000);
		//ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Test Cases for web");//Opening the excel file
		LoginPage.email(driver).sendKeys("ab@heypayless.com");//reading the data from excel file
		LoginPage.password(driver).sendKeys("123456");//entering password
		LoginPage.loginButton(driver).click();	//Login 
		//Assert.assertTrue(LoginPage.passwordFieldRequired(driver).isDisplayed());
		Assert.assertTrue(LoginPage.emailPasswordIncorrect(driver).isDisplayed());
		driver.quit();
		
	}
	
	@Test
	public void lp04 () throws Exception
	{
		//OpenBrowser.openChrome(driver);
		System.setProperty("webdriver.chrome.driver", "D:\\selenium requirements\\chromedriver.exe");
		driver=new ChromeDriver();	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(100,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(Constant.URL);
		Thread.sleep(5000);
		//ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Test Cases for web");//Opening the excel file
		//LoginPage.email(driver).sendKeys("ab@heypayless.com");//reading the data from excel file
		//LoginPage.password(driver).sendKeys("123456");//entering password
		LoginPage.loginButton(driver).click();	//Login 
		//Assert.assertTrue(LoginPage.passwordFieldRequired(driver).isDisplayed());
		Assert.assertTrue(LoginPage.emailFieldRequired(driver).isDisplayed());
		Assert.assertTrue(LoginPage.passwordFieldRequired(driver).isDisplayed());
		driver.quit();
		
	}*/	
	
}
