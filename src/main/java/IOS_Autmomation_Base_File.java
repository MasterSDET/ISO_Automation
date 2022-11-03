
import java.net.MalformedURLException;
	import java.net.URL;
import java.time.Duration;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import io.appium.java_client.service.local.AppiumServiceBuilder;
 
    
    public class IOS_Autmomation_Base_File
{
public static IOSDriver driver;

@BeforeClass
public void IOS_Base_File () throws MalformedURLException
{		
	
	XCUITestOptions options = new XCUITestOptions();
	options.setDeviceName("Iphone 14 pro");
	options.setApp("//Users//mohitgaur//Library//Developer//Xcode//DerivedData//UIKitCatalog-bgwcwtgetrjxsnbnkbvujdyzuapo//Build//Products//Debug-iphonesimulator//UIKitCatalog.app");
	options.setPlatformVersion("16");
	options.setWdaLaunchTimeout(Duration.ofSeconds(20));
	
	 driver =  new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub/"), options);

 /* 

	options.setAppPackage("com.androidsample.generalstore");
	options.setAppActivity("com.androidsample.generalstore.SplashActivity");
	
*/
	

}	
}

    
  
	
