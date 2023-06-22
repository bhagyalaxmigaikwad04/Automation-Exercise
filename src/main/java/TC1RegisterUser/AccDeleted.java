package TC1RegisterUser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class AccDeleted {
	WebDriver driver;

	  public AccDeleted(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);

}

@FindBy(xpath="//b[text()='Account Deleted!']")
public WebElement AccDeleted;

@FindBy(xpath="//a[text()='Continue']")
public WebElement ClickContinue;

public void Accdeleted() throws InterruptedException
{ 
	Assert.assertTrue(AccDeleted.isDisplayed()) ;
	Thread.sleep(1000);
	ClickContinue.click(); 

}

}

