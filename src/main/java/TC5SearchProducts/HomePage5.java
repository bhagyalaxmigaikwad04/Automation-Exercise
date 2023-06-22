package TC5SearchProducts;
 import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	//import org.openqa.selenium.JavascriptExecutor;

	public class HomePage5 {
		
		WebDriver driver;

		  public HomePage5(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		  
		  @FindBy(xpath="//*[text()=' Products']")
		  public WebElement ClickOnProduct;
		  
		  public void ClickProductTab() {
			  
			  ClickOnProduct.click();
			  
			 //JavascriptExecutor js = (JavascriptExecutor) driver;
			//  js.executeScript("const elements = document.getElementsByClassName('adsbygoogle adsbygoogle-noablate'); while (elements.length > 0) elements[0].remove()");
			  
			 
	  }
	}

