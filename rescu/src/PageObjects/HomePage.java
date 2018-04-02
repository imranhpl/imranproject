package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	private static WebElement element = null;
	public static WebElement LogoutDropdown(WebDriver driver){
		
	element= driver.findElement(By.xpath("//i[@class='icon-submenu lnr lnr-chevron-down']"));
	return element;	
	}
	public static WebElement Logout(WebDriver driver){
		
		element= driver.findElement(By.xpath("//span[text()='Logout']"));
		return element;	
		}
	
public static WebElement loginButton(WebDriver driver){
		
		element= driver.findElement(By.xpath("//button[@type='submit']"));
		return element;	
		}
}
