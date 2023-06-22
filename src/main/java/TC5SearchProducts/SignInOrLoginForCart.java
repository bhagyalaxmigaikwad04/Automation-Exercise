package TC5SearchProducts;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInOrLoginForCart {
	
		WebDriver driver;

		  public SignInOrLoginForCart(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		  
		  @FindBy(xpath=" //*[text()=' Signup / Login']")
		  public WebElement ClickSignUpOrLoginButton;
		  
		  public void SignuporLogin() {
			  
			  ClickSignUpOrLoginButton.click();
		  }

	}

