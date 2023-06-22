package TC3LoginWithInvalidDetails;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage3 {
	WebDriver driver;

	  public HomePage3(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);

}
	  @FindBy(xpath="//*[text()=' Home'][@style='color: orange;']")
	   public WebElement HomePage;

	  @FindBy(xpath="//*[text()=' Signup / Login']")
	  public WebElement Signup;
	  
	  public void SignUpButton() 
	  {
		   Assert.assertEquals(HomePage.isDisplayed(), true);
		   
		   Signup.click();
	   }
}


