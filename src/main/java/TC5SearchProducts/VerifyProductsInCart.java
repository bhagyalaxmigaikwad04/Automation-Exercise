package TC5SearchProducts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
public class VerifyProductsInCart {
	
		WebDriver driver;

		  public VerifyProductsInCart(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		  //@FindBy(xpath="//a[text()='Sleeveless Dress']")
			//public WebElement Product1;
			
			@FindBy(xpath="//a[text()='Stylish Dress']")
			public WebElement Product2;
			
			@FindBy(xpath="//a[text()='Sleeves Top and Short - Blue & Pink']")
			public WebElement Product3;
			
			@FindBy(xpath="//a[text()='Sleeveless Unicorn Patch Gown - Pink']")
			public WebElement Product4;
			
			@FindBy(xpath="//a[text()='Cotton Mull Embroidered Dress']")
			public WebElement Product5;
			
			@FindBy(xpath="//a[text()='Blue Cotton Indie Mickey Dress']")
			public WebElement Product6;
			
			@FindBy(xpath="//a[text()='Long Maxi Tulle Fancy Dress Up Outfits -Pink']")
			public WebElement Product7;
			
			@FindBy(xpath="//a[text()='Sleeveless Unicorn Print Fit & Flare Net Dress - Multi']")
			public WebElement Product8;
			
			@FindBy(xpath="//a[text()='Rose Pink Embroidered Maxi Dress']")
			public WebElement Product9;
			
			public void CheckProducts() {
			
			//Assert.assertTrue(Product1.isDisplayed());
			Assert.assertTrue(Product2.isDisplayed());
			Assert.assertTrue(Product3.isDisplayed());
			Assert.assertTrue(Product4.isDisplayed());
			Assert.assertTrue(Product5.isDisplayed());
			Assert.assertTrue(Product6.isDisplayed());
			Assert.assertTrue(Product7.isDisplayed());
			Assert.assertTrue(Product8.isDisplayed());
			Assert.assertTrue(Product9.isDisplayed());
			}	

}
