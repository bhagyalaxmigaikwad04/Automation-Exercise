package TC6AddReview;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.openqa.selenium.JavascriptExecutor;

public class ProductPafeForReview {

		WebDriver driver;

		  public ProductPafeForReview(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		  @FindBy(xpath="//a[@href='/products']")
		   public WebElement ClickOnProduct;
		  
		  //@FindBy(xpath="//h2[text()='All Products']")
		 //  public WebElement AllProductDisplay;
		  
		  @FindBy(xpath="(//*[text()='View Product'])[3]")
		  public WebElement ClickOnViewProduct;
		  
		  public void ReviewDisplay() {
			  ClickOnProduct.click();
			  
			 // Assert.assertEquals(AllProductDisplay.isDisplayed(), true);
			  
			  JavascriptExecutor js = (JavascriptExecutor) driver;
		        js.executeScript("window.scrollBy(0,450)", "");
		        
		        ClickOnViewProduct.click();
		        
		        JavascriptExecutor jsn = (JavascriptExecutor) driver;
				  jsn.executeScript("const elements = document.getElementsByClassName('adsbygoogle adsbygoogle-noablate'); while (elements.length > 0) elements[0].remove()");
				
				 // ClickOnViewProduct.click();  
	  }	  

	}


