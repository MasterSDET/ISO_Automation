import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class IOS_Automation_TC01 extends IOS_Autmomation_Base_File
{
@Test
	public  void IOS_TC01()
	{
	// IOS tags found by Id, Accessibility id , Resource id , class , xpath , iosClassChanin,
	 // IOSPredicatcateString,
	
	driver.findElement(AppiumBy.iOSClassChain("**/XCUItElementtypecell")).sendKeys("Mohit");
	
	
	}

}
