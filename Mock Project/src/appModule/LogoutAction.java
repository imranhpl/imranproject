package appModule;

import org.openqa.selenium.WebDriver;

import PageObjects.HomePage;

public class LogoutAction {
	 public static void Execute(WebDriver driver) throws InterruptedException{
//IMRAN 
		 HomePage.LogoutDropdown(driver).click();
		 //IMRAN
//SSSSSS
		 Thread.sleep(3000);
		 HomePage.Logout(driver).click();
		   }
}
