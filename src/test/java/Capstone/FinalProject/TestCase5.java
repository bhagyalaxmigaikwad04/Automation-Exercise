package Capstone.FinalProject;

import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Capstone.BaseTC1.BaseConfigurationGrid;
import TC5SearchProducts.ClickOnCart;
import TC5SearchProducts.HomePage5;
import TC5SearchProducts.LoginDetails5;
import TC5SearchProducts.ProductPage5;
import TC5SearchProducts.SignInOrLoginForCart;
import TC5SearchProducts.VerifyProductsInCart;

public class TestCase5 extends BaseConfigurationGrid{
	HomePage5 homepage5obj;
	ProductPage5 productpage5obj;
	SignInOrLoginForCart signinORloginFORcartobj;
	LoginDetails5 LoginDetails5obj;
	ClickOnCart clickonCartobj;
	VerifyProductsInCart verifyproductsobj;
	
	WebDriver driver;
	@Parameters({"Port"})
	@BeforeClass
	public void setup1(String Port) throws MalformedURLException
	{
		driver=setUp(Port);
		
		homepage5obj= new HomePage5(driver);
		productpage5obj = new ProductPage5(driver);
		signinORloginFORcartobj = new SignInOrLoginForCart(driver);
		LoginDetails5obj = new LoginDetails5(driver);
		clickonCartobj = new ClickOnCart(driver);
		verifyproductsobj = new VerifyProductsInCart(driver);	
	}
	@Test
	public void scenarioDemo5() throws InterruptedException, IOException
	{
		homepage5obj.ClickProductTab();
		productpage5obj.AllProducts();
		signinORloginFORcartobj.SignuporLogin();
		LoginDetails5obj.Login5();
		clickonCartobj.ClickonCart();
		verifyproductsobj.CheckProducts();
			
	}
	}
