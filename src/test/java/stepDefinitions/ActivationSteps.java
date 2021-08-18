package stepDefinitions;

import java.util.concurrent.TimeUnit;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import runner.OneMeter_Automation.BaseClass;

public class ActivationSteps extends BaseClass {

	public void scroll_to_orders()
	{

	   new TouchAction(driver).tap(PointOption.point(983,1675)).release().perform(); 
	}
	
	@Given("user is on the login page")
	public void user_is_on_the_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		setup();
	   
	}

	@When("user enters pincode")
	public void user_enters_pincode() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElementById("com.wakoopa.qa1:id/pincodeEditText").click();
		driver.findElementById("com.wakoopa.qa1:id/pincodeEditText").sendKeys("zgcdisox");
		
    
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		MobileElement el= driver.findElementById("com.wakoopa.qa1:id/loginButton");
		TouchAction t =new TouchAction(driver);
		PointOption point=new PointOption();
		scroll_to_orders();
		

	}


	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	    
	}
	
	@And("user taps on Go to setting")
	public void user_taps_on_go_to_setting() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElementById("com.wakoopa.qa1:id/openSettingsButton").click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	@Then("taps on Wakoopa QA1 in Device Setting")
	public void taps_on_wakoopa_qa1_in_device_setting() {
	    // Write code here that turns the phrase above into concrete actions
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[5]/android.widget.RelativeLayout/android.widget.TextView[1]").click();
		
	}
	
	@Then("taps the toggle to permit usage")
	public void taps_the_toggle_to_permit_usage() {
	    // Write code here that turns the phrase above into concrete actions
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.RelativeLayout").click();
	}


}
