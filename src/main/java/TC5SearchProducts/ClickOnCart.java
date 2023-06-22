package TC5SearchProducts;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;


public class ClickOnCart {
	
		WebDriver driver;

		  public ClickOnCart(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		  
		  @FindBy(xpath="//*[text()=' Cart']")
		  public WebElement CartTab;
		  
		  public void ClickonCart()
		  {
		  CartTab.click();
	  }

	}
