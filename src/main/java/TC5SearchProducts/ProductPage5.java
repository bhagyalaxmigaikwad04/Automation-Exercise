package TC5SearchProducts;

	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import org.testng.Assert;

	public class ProductPage5 {	
		WebDriver driver;


		  public ProductPage5(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		  
		 // @FindBy(xpath="//*[text()=' Products'][@style='color: orange;']")
		 //  public WebElement AllProductDisplay;
		  
		  @FindBy(xpath="//input[@id='search_product']")
		  public WebElement Search;
		  
		  @FindBy(id="submit_search")
		  public WebElement SearchSubmit;
		  
		  @FindBy(xpath="//*[text()='Searched Products']")
		  public WebElement SearchProductDisplay;
  
		  @FindBy(xpath="(//a[text()='Add to cart'])[1]")
		  public WebElement AddToCart3;
		 @FindBy(xpath="(//a[text()='Add to cart'])[3]")
		  public WebElement AddToCart4;
		 @FindBy(xpath="(//a[text()='Add to cart'])[5]")
		  public WebElement AddToCart16;
		 @FindBy(xpath="(//a[text()='Add to cart'])[7]")
		  public WebElement AddToCart19;
		 @FindBy(xpath="(//a[text()='Add to cart'])[9]")
		  public WebElement AddToCart20;
		 @FindBy(xpath="(//a[text()='Add to cart'])[11]")
		  public WebElement AddToCart21;
		 @FindBy(xpath="(//a[text()='Add to cart'])[13]")
		  public WebElement AddToCart22;
		 @FindBy(xpath="(//a[text()='Add to cart'])[15]")
		  public WebElement AddToCart23;
		 @FindBy(xpath="(//a[text()='Add to cart'])[17]")
		  public WebElement AddToCart38;
		 
		  @FindBy(xpath="//button[text()='Continue Shopping']")
		  public WebElement ContinueShopping;
		  
		  @FindBy(xpath="//*[text()= ' Cart']")
		  public WebElement Cart;
		 
		  
		  public void AllProducts()
		  {
			//Assert.assertEquals(AllProductDisplay.isDisplayed(), true);
			Search.sendKeys("dress");
			SearchSubmit.click();
			Assert.assertTrue(SearchProductDisplay.isDisplayed());
			
			Actions act = new Actions(driver);
			
			JavascriptExecutor jsq = (JavascriptExecutor) driver;
	        jsq.executeScript("window.scrollBy(0,500)", "");
			
			act.moveToElement(AddToCart3).click().build().perform();;
			ContinueShopping.click();
			
			act.moveToElement(AddToCart4).click().build().perform();
			ContinueShopping.click();
			
			act.moveToElement(AddToCart16).click().build().perform();
			ContinueShopping.click();
			
			JavascriptExecutor jst = (JavascriptExecutor) driver;
	        jst.executeScript("window.scrollBy(0,600)", "");
			
			act.moveToElement(AddToCart19).click().build().perform();
			ContinueShopping.click();
			
			act.moveToElement(AddToCart20).click().build().perform();
			ContinueShopping.click();
			
			act.moveToElement(AddToCart21).click().build().perform();
			ContinueShopping.click();
			
			JavascriptExecutor jss = (JavascriptExecutor) driver;
	        jss.executeScript("window.scrollBy(0,550)", "");
			
			act.moveToElement(AddToCart22).click().build().perform();
			ContinueShopping.click();
			
			act.moveToElement(AddToCart23).click().build().perform();
			ContinueShopping.click();
			
			act.moveToElement(AddToCart38).click().build().perform();
			ContinueShopping.click();
			
			JavascriptExecutor jsb = (JavascriptExecutor) driver;
	        jsb.executeScript("window.scrollBy(0,-1600)", "");
			
	        Cart.click();
		  }

}
