package TC1RegisterUser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage1 {
	WebDriver driver;

	  public HomePage1(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
}
	 // @FindBy(xpath=" //*[text()=' Logged in as ']")
	 // public WebElement LoggedInUser;
	  
	  @FindBy(xpath="//*[text()=' Delete Account']")
	  public WebElement DeleteAccount;
	  
	  public void AccountDeleted()
	  {
		 // Assert.assertTrue(LoggedInUser.isDisplayed());
		  
		  DeleteAccount.click();
 }
}
