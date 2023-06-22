package TC2LoginWithValidDetails;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteAcc2 {
	WebDriver driver;

	  public DeleteAcc2(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
}

	@FindBy(xpath="//*[text()=' Delete Account']")
		  public WebElement DeleteAccount2;

	 public void AccountDeleted2()
	  {
	
		  DeleteAccount2.click();
	  }
}
