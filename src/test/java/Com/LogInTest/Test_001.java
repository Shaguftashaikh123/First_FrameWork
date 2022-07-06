package Com.LogInTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Com.PageObject.LoginPom;
import Com.Utility.BaseClass;
import Com.Utility.Library;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_001 extends BaseClass{

	@Test
	public void verifyLogInpage()
	{
	
		
		//identify webelement
		
		LoginPom login = PageFactory.initElements(driver, LoginPom.class);
		
		
	   //Actions
	
		Library.custome_Sendkeys(login.gettxt_email(),excel.getStringData("Sheet1", 0, 0));
		Library.custome_Sendkeys(login.gettxt_password(),excel.getStringData("Sheet1", 0, 1));
		
//	txt_email.sendKeys("Test@gmail.com");
//	txt_password.sendKeys("123456");
		
		
	}
	
	
	
}
