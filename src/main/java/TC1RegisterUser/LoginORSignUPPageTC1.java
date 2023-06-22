package TC1RegisterUser;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginORSignUPPageTC1 {
	WebDriver driver;

	  public LoginORSignUPPageTC1(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
	  @FindBy(xpath="//*[text()='New User Signup!']")
		public WebElement SignUpText;
	   
	  @FindBy(xpath="//input[@placeholder='Name']")
		public WebElement EnterName;
		
	  @FindBy(xpath="//input[@data-qa='signup-email']")
		public WebElement EnterEmail;
	  
	  @FindBy(xpath="//button[text()='Signup']")
		public WebElement SignUpButton ;  
	  
	  public void SignUP() throws IOException {
		 Assert.assertTrue(SignUpText.isDisplayed() );
		
		 FileInputStream file1 = new FileInputStream("C:\\Users\\sonu\\eclipse-workspace\\FinalProject\\src\\main\\java\\Config\\Config.Properties");
		Properties Prop = new Properties();
			Prop.load(file1);
			
		 String Name = Prop.getProperty("NameNew");
		 EnterName.sendKeys(Name);
		
		 String EmailAdd = Prop.getProperty("EmailNew");
		 EnterEmail.sendKeys(EmailAdd);
		
		 SignUpButton.click();
		  
	 }
}
