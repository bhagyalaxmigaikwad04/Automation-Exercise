package TC3LoginWithInvalidDetails;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage3 {
	WebDriver driver;

	  public LoginPage3(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);

}
	@FindBy(xpath="//*[text()='Login to your account']")
	public WebElement LoginText;
  
  @FindBy(xpath="(//*[@placeholder='Email Address'])[1]")
	public WebElement LoginEmail;
	
	@FindBy(xpath="//*[@placeholder='Password']")
	public WebElement LoginPassword;
	
	@FindBy(xpath="//*[text()='Login']")
	public WebElement LoginButton;
	
	public void LoginTest()
	{
		Assert.assertTrue(LoginText.isDisplayed());
		LoginEmail.sendKeys("bvg@gmail.com");
		LoginPassword.sendKeys("Bhagya@2001");
		LoginButton.click();
	}


}
