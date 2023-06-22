package Capstone.FinalProject;

import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Capstone.BaseTC1.BaseConfigurationGrid;
import TC3LoginWithInvalidDetails.HomePage3;
import TC3LoginWithInvalidDetails.LoginPage3;

public class TestCase3 extends BaseConfigurationGrid{
	
	HomePage3 homeapge3obj;
	LoginPage3 loginpage3obj;
	
		 WebDriver driver;

		 @Parameters({"Port"})
		@BeforeClass
		public void setup3(String Port) throws MalformedURLException
		{
			 driver=setUp(Port);
			
			homeapge3obj =  new HomePage3(driver);
			loginpage3obj= new LoginPage3(driver);
			
		}
		@Test
		public void scenarioDemo3() throws InterruptedException, IOException
		{
			homeapge3obj.SignUpButton();
			loginpage3obj.LoginTest();
		}
		}

