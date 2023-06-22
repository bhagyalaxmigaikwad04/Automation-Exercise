package TC5SearchProducts;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginDetails5 {
	WebDriver driver;

	  public LoginDetails5(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

@FindBy(xpath="(//*[@placeholder='Email Address'])[1]")
	public WebElement LoginEmail;
	
	@FindBy(xpath="//*[@placeholder='Password']")
	public WebElement LoginPassword;
	
	@FindBy(xpath="//*[text()='Login']")
	public WebElement LoginButton;
	
	public void Login5() throws IOException 
	{

		 FileInputStream file1 = new FileInputStream("C:\\Users\\sonu\\eclipse-workspace\\FinalProject\\src\\main\\java\\Config\\Config.Properties");
			Properties Prop = new Properties();
			Prop.load(file1);
			
		 String Email = Prop.getProperty("Email5");
		 LoginEmail.sendKeys(Email);
		 
		 String Password = Prop.getProperty("password5");
		 LoginPassword.sendKeys(Password);
		 
		 LoginButton.click();			 
}
}