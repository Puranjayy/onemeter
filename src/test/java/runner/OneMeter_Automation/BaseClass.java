package runner.OneMeter_Automation;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {
	
	protected AppiumDriver<MobileElement> driver;
	
	@BeforeTest
	public void setup() {
		
		try {
		DesiredCapabilities caps = new DesiredCapabilities();
		
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
		caps.setCapability(MobileCapabilityType.VERSION, "6.0.1");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus 5");
		caps.setCapability(MobileCapabilityType.UDID, "04dd815513aff3e6");
		caps.setCapability(MobileCapabilityType.APP, "/Users/puranjays/Downloads/app-qa1-debug.apk");
		caps.setCapability("appPackage", "com.wakoopa.qa1");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		
		driver = new AppiumDriver<MobileElement>(url, caps);
		
		}catch(Exception exp) {
			System.out.println("Cause :" +exp.getCause());
			System.out.println("Message :"+exp.getMessage());
			exp.printStackTrace();
		}
	}
	
	@AfterTest
	public void teardown() {
		
	}

}
