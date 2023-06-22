package TC4RemoveProduct;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
public class CartPage4 {
		WebDriver driver;

		  public CartPage4(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		  
		  @FindBy(xpath="//*[text()=' Cart'][@style='color: orange;']")
		   public WebElement Cartpage;
		  
		  @FindBy(xpath="//i[@class='fa fa-times'][1]")
		  public WebElement RemoveProduct1;
		  
		  @FindBy(xpath="//i[@class='fa fa-times'][1]")
		  public WebElement RemoveProduct2;
		  
		  @FindBy(xpath = "(//a[@class='cart_quantity_delete'])[1]")
		  public WebElement RemoveProduct3;
		  
		  @FindBy(xpath = "(//a[@class='cart_quantity_delete'])[1]")
		  public WebElement RemoveProduct4;
		  
		  //@FindBy(xpath = "//a[@class='cart_quantity_delete']")
		  //public WebElement RemoveProduct5;
		  
		 @FindBy(xpath="//b[text()='Cart is empty!']")
		 public WebElement EmptyCart;
		  
		  
		  public void RemoveCart() throws InterruptedException
		  {
			  Assert.assertTrue(Cartpage.isDisplayed());
			  
			  RemoveProduct1.click();
			  Thread.sleep(2000);
			  RemoveProduct2.click();
			  Thread.sleep(2000);
			  RemoveProduct3.click();
			  Thread.sleep(2000);
			  RemoveProduct4.click();
			  Thread.sleep(2000);
			 // RemoveProduct5.click();
			  Assert.assertTrue(EmptyCart.isDisplayed());
		  }
		
	}


