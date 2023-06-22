package TC4RemoveProduct;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.openqa.selenium.JavascriptExecutor;

public class HomePage4 {
	WebDriver driver;

	  public HomePage4(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);

}

		  @FindBy(xpath="//*[text()=' Home'][@style='color: orange;']")
		   public WebElement HomePage;
		  
		  @FindBy(xpath="(//*[text()='Add to cart'])[1]")
		  public WebElement AddtoCart1;
		  
		  @FindBy(xpath="(//*[text()='Add to cart'])[3]")
		  public WebElement AddtoCart3;
		  
		  @FindBy(xpath="(//*[text()='Add to cart'])[5]")
		  public WebElement AddtoCart5;
		  
		  @FindBy(xpath="(//*[text()='Add to cart'])[7]")
		  public WebElement AddtoCart7;
		  
		  @FindBy(xpath="(//*[text()='Add to cart'])[9]")
		  public WebElement AddtoCart9;
		  
		  @FindBy(xpath="//button[text()='Continue Shopping']")
		  public WebElement ContinueShopping;
		  
		  @FindBy(xpath="//*[text()=' Cart']")
		  public WebElement CartButton;


		   public void testcase4() throws InterruptedException 
		  {
			   
			   JavascriptExecutor js = (JavascriptExecutor) driver;
		        js.executeScript("window.scrollBy(0,450)", "");
		        
			   Assert.assertEquals(HomePage.isDisplayed(), true);
			   
			
		        Actions act = new Actions(driver);
		        
		       act.moveToElement(AddtoCart1).click().build().perform();
			   ContinueShopping.click();
					   
			   act.moveToElement(AddtoCart3).click().build().perform();
			   ContinueShopping.click();
			   
			   act.moveToElement(AddtoCart5).click().build().perform();
			   ContinueShopping.click();
			   
			   JavascriptExecutor jsq = (JavascriptExecutor) driver;
		        jsq.executeScript("window.scrollBy(0,450)", "");
			   
			   act.moveToElement(AddtoCart7).click().build().perform();
			   ContinueShopping.click();
			   
			   act.moveToElement(AddtoCart7).click().build().perform();
			   ContinueShopping.click();
			   
			   JavascriptExecutor jse = (JavascriptExecutor) driver;
		        jse.executeScript("window.scrollBy(0,-900)", "");
		        
			   CartButton.click();
		   }
		}


