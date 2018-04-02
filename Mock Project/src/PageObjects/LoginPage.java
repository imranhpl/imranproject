package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	private static WebElement element = null;
	public static WebElement email(WebDriver driver){
		
	element= driver.findElement(By.xpath("//input[@name='Email']"));
	return element;	
	}
	public static WebElement password(WebDriver driver){
		
		element= driver.findElement(By.xpath("//input[@name='Password']"));
		return element;	
		}
	
public static WebElement loginButton(WebDriver driver){
		
		element= driver.findElement(By.xpath("//button[@type='submit']"));
		return element;	
		}

public static WebElement passwordFieldRequired(WebDriver driver){
	
	element= driver.findElement(By.xpath("//span[@class='text-danger vaidation_class field-validation-error']"));
	return element;	
	}

public static WebElement emailPasswordIncorrect(WebDriver driver){
	
	element= driver.findElement(By.xpath("//li[text()='The user name or password is incorrect.']"));
	return element;	
	}

public static WebElement emailFieldRequired(WebDriver driver){
	
	element= driver.findElement(By.xpath("//span[@class='text-danger vaidation_class field-validation-error'][@data-valmsg-for='Email']"));
	return element;	
	}

public static WebElement passFieldRequired(WebDriver driver){
	
	element= driver.findElement(By.xpath("//span[@class='text-danger vaidation_class field-validation-error'][@data-valmsg-for='Password']"));
	return element;	
	}
}
