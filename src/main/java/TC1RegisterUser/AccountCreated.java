package TC1RegisterUser;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class AccountCreated {
	WebDriver driver;

	  public AccountCreated(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);

}
@FindBy(xpath="//*[text()='Account Created!']")
public WebElement AccountCreated ;

@FindBy(xpath="//*[@data-qa='continue-button']")
public WebElement ContinueButton;
 

public void AccCreated() {
	
	Assert.assertTrue(AccountCreated.isDisplayed()) ;
	
	ContinueButton.click();
	 
	JavascriptExecutor js = (JavascriptExecutor) driver;
	 js.executeScript("const elements = document.getElementsByClassName('adsbygoogle adsbygoogle-noablate'); while (elements.length > 0) elements[0].remove()");
	
	 ContinueButton.click();
}


}

