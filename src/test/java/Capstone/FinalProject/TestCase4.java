package Capstone.FinalProject;

import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Capstone.BaseTC1.BaseConfigurationGrid;
import TC4RemoveProduct.CartPage4;
import TC4RemoveProduct.HomePage4;


public class TestCase4 extends BaseConfigurationGrid {
	HomePage4 homepage4obj;
	CartPage4 cartpageobj;
		 
		WebDriver driver;

		@Parameters({"Port"})
		@BeforeClass
		public void setup4(String Port) throws MalformedURLException
		{
			driver=setUp(Port);
			
			homepage4obj = new HomePage4(driver);
			cartpageobj = new CartPage4(driver);
			
		}
		@Test
		public void scenarioDemo4() throws InterruptedException, IOException
		{
			homepage4obj.testcase4();
			cartpageobj.RemoveCart();
		}
		}
	
