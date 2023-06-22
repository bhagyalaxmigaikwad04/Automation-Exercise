package Capstone.FinalProject;

import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Capstone.BaseTC1.BaseConfigurationGrid;
import Capstone.BaseTC1.base;
import TC2LoginWithValidDetails.DeleteAcc2;
import TC2LoginWithValidDetails.LoginPage2;
import TC2LoginWithValidDetails.homepage2;


public class TestCase2 extends BaseConfigurationGrid {
	
	homepage2 homeapgeobj2;
	LoginPage2 loginpage2obj;
	DeleteAcc2 deleteacc2obj;
		 
		WebDriver driver;

		@Parameters({"Port"})
		@BeforeClass
		public void setup2(String Port) throws MalformedURLException
		{
			driver=setUp(Port);
			
			homeapgeobj2 =  new homepage2(driver);
			loginpage2obj= new LoginPage2(driver);
			deleteacc2obj= new DeleteAcc2(driver);
		}
		@Test
		public void scenarioDemo2() throws InterruptedException, IOException
		{
			homeapgeobj2.SignUpButton();
			loginpage2obj.LoginTest();
			//deleteacc2obj.AccountDeleted2();
		}
		}


