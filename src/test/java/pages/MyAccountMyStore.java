package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;

public class MyAccountMyStore extends ProjectMethods{
	
	public MyAccountMyStore() {
		PageFactory.initElements(driver,this);

	}
	

	@FindBy(how = How.LINK_TEXT , using ="T-shirts")
	WebElement eleOrdTshirt;
	
	@FindBy(how = How.XPATH , using = "//i[@class='icon-user']")
	WebElement elePersonalInfo;
	
	
	
	@And("click the TShirt")
	public TShirtMyStore clickTshirtLink() {
		click(eleOrdTshirt);
		return new TShirtMyStore();
	}
	
	
	
	public void verifyLoginPage() {
		System.out.println("Product Detail page is displayed");
	}

	@And("click the Personal Info")
	public IdentityMystore clickPersonalInfo() {
		click(elePersonalInfo);
		return new IdentityMystore();
	}
	
	
	
}