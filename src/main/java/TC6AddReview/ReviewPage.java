package TC6AddReview;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ReviewPage {

		WebDriver driver;

		  public ReviewPage(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		  
		  @FindBy(xpath="//*[text()='Write Your Review']")
		  public WebElement YourReview;
		  
		  @FindBy(id="name")
		  public WebElement ReviewName;
		  
		  @FindBy(id="email")
		  public WebElement ReviewEmail;
		  
		  @FindBy(id="review")
		  public WebElement WriteReview;
		  
		  @FindBy(id="button-review")
		  public WebElement SubmitReview;
		  
		  @FindBy(xpath = "//span[text()='Thank you for your review.']")
		   public WebElement Thankyou;
		  
		  
		  
		  public void WriteReview() throws IOException, InterruptedException
		  {
			  
			  JavascriptExecutor js = (JavascriptExecutor) driver;
		        js.executeScript("window.scrollBy(0,250)", "");
		        
			  Assert.assertTrue(YourReview.isDisplayed());
			  
			  JavascriptExecutor jsm = (JavascriptExecutor) driver;
		        jsm.executeScript("window.scrollBy(0,250)", "");
		        
			
			  FileInputStream file1 = new FileInputStream("C:\\Users\\sonu\\eclipse-workspace\\FinalProject\\src\\main\\java\\Config\\Config.Properties");
				Properties Prop = new Properties();
				Prop.load(file1);
				
			  String NameForReview = Prop.getProperty("name");
			  ReviewName.sendKeys(NameForReview);
			  Thread.sleep(2000);
			  String EmailForReview = Prop.getProperty("EmailAddress");
			  ReviewEmail.sendKeys(EmailForReview);
			  Thread.sleep(2000);
			 
			  String YourReview = Prop.getProperty("Review");
			  WriteReview.sendKeys(YourReview);
			  Thread.sleep(2000);
			  
			  JavascriptExecutor jsp = (JavascriptExecutor) driver;
		        jsp.executeScript("window.scrollBy(0,250)", "");
		        
			  SubmitReview.click();
			  
			  Assert.assertTrue(Thankyou.isDisplayed());
	  }

	}


