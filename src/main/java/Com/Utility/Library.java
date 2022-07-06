package Com.Utility;

import org.openqa.selenium.WebElement;

public class Library {

	
	public static void custome_Sendkeys(WebElement element, String text)
	{
		try
		{
			element.sendKeys(text);
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
