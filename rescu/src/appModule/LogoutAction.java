package appModule;

import org.openqa.selenium.WebDriver;

import PageObjects.HomePage;

public class LogoutAction {
	 public static void Execute(WebDriver driver) throws InterruptedException{

		 HomePage.LogoutDropdown(driver).click();    //IMRAN
		 Thread.sleep(3000);
		 HomePage.Logout(driver).click();
		   }
}
