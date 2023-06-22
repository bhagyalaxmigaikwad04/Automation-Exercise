package Capstone.FinalProject;

import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Capstone.BaseTC1.BaseConfigurationGrid;
import TC1RegisterUser.AccDeleted;
import TC1RegisterUser.AccountCreated;
import TC1RegisterUser.HomePage1;
import TC1RegisterUser.LoginORSignUPPageTC1;
import TC1RegisterUser.SignUpDetailsTc1;
import TC1RegisterUser.SignUpLoginPage;

public class TestCase1 extends BaseConfigurationGrid {
	
		 SignUpLoginPage signupobj;
		 LoginORSignUPPageTC1 newusersignupobj ;
		 SignUpDetailsTc1 detailsobj;
		  AccountCreated createdobj;
		  HomePage1 userloggedobj;
		 AccDeleted deletedobj;
		WebDriver driver;

		@Parameters({"Port"})
		@BeforeClass
		public void setup1(String Port) throws MalformedURLException
		{
			driver=setUp(Port);
			
			signupobj=new SignUpLoginPage(driver);
			newusersignupobj=new LoginORSignUPPageTC1(driver);
			detailsobj=new SignUpDetailsTc1(driver);
			createdobj=new AccountCreated(driver);
			userloggedobj=new HomePage1(driver);
			deletedobj=new AccDeleted(driver);
		}
		@Test
		public void scenarioDemo1() throws InterruptedException, IOException
		{
			signupobj.SignUpButton();
			newusersignupobj.SignUP();
			detailsobj.CreateAccount();
			createdobj.AccCreated();
			userloggedobj.AccountDeleted();
			deletedobj.Accdeleted();
		}
		}
	
	
	
	
	
	
	