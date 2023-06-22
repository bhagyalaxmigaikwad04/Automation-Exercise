package Capstone.FinalProject;
import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Capstone.BaseTC1.BaseConfigurationGrid;
import TC6AddReview.ProductPafeForReview;
import TC6AddReview.ReviewPage;

public class TestCase6 extends BaseConfigurationGrid {
	ProductPafeForReview productReviewobj;
	ReviewPage reviewPageobj;
	 
	WebDriver driver;
	@Parameters({"Port"})
	@BeforeClass
	public void setup1(String Port) throws MalformedURLException
	{
		driver=setUp(Port);
		
		productReviewobj = new ProductPafeForReview(driver);
		reviewPageobj = new ReviewPage(driver);
	}
	    @Test
		public void scenario6() throws IOException, InterruptedException {
	    	productReviewobj.ReviewDisplay();
    	reviewPageobj.WriteReview();
	    }
}
