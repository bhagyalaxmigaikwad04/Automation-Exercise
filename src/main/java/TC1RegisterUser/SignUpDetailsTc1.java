package TC1RegisterUser;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class SignUpDetailsTc1 {
	WebDriver driver;

	  public SignUpDetailsTc1(WebDriver driver)
	{
		this.driver=driver;
	PageFactory.initElements(driver, this);
		
	}
	// @FindBy(xpath ="//b[text()='Enter Account Information']")	
	 // public WebElement TextVisible;	
	  
	 
@FindBy(id="id_gender2")
public WebElement TitleTab;

@FindBy(xpath ="//input[@id='password']")	
public WebElement EnterPassword;

@FindBy(id="days")
public WebElement DayDropdown;

@FindBy(id="months")
public WebElement MonthDropdown;

@FindBy(id="years")
public WebElement YearDropdown;

@FindBy(xpath ="//input[@id='newsletter']")	
public WebElement NewsLetter;

@FindBy(xpath ="//input[@id='optin']")	
public WebElement Offers;
 
@FindBy (xpath = "//input[@id='first_name'] ")
public WebElement FirstName;

@FindBy (xpath = "//input[@id='last_name'] ")
public WebElement LastName;

@FindBy (xpath = "//input[@id='company'] ")
public WebElement Company;

@FindBy (xpath = "//input[@id='address1']")
public WebElement Address1;

@FindBy(xpath ="//input[@id='address2']")	
public WebElement Address2 ;

@FindBy (xpath = "//select[@id='country'] ")
public WebElement Country;

@FindBy (xpath = "//input[@id='state']")
public WebElement State;

@FindBy (xpath = "//*[@id=\"city\"]")
public WebElement City ;

@FindBy (xpath = "//input[@id='zipcode']")
public WebElement Zipcode;

@FindBy (xpath = "//input[@id='mobile_number'] ")
public WebElement MobileNo;

@FindBy (xpath = "//button[text() = 'Create Account' ] ")
public WebElement CreateAcc; 

public void CreateAccount() throws IOException
{
	FileInputStream file1 = new FileInputStream("C:\\Users\\sonu\\eclipse-workspace\\FinalProject\\src\\main\\java\\Config\\Config.Properties");
	Properties Prop = new Properties();
	Prop.load(file1);
	
	// Assert.assertTrue(TextVisible.isDisplayed()) ;
	 TitleTab.click();
	 String pass=Prop.getProperty("password2");
	EnterPassword.sendKeys(pass);
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,250)", "");
   
    String day = Prop.getProperty("day");
	Select s = new Select(DayDropdown);
	s.selectByVisibleText(day);
	
	String mon= Prop.getProperty("month");
	Select s1 = new Select(MonthDropdown);
	s1.selectByVisibleText(mon);
	
	String Year = Prop.getProperty("year");
	Select s2 = new Select(YearDropdown);
     s2.selectByVisibleText(Year);
	
     NewsLetter.click();
	Offers.click();
	
	String Firstname = Prop.getProperty("firstname");
    FirstName.sendKeys(Firstname);
	
	String lastname = Prop.getProperty("Lastname");
	LastName.sendKeys(lastname);
	
	String companyName = Prop.getProperty("company");
	Company.sendKeys(companyName);
	
	String add1 = Prop.getProperty("address1");
	Address1.sendKeys(add1);
	
	String add2 = Prop.getProperty("address2");
	Address2.sendKeys(add2);
	
	JavascriptExecutor jsb = (JavascriptExecutor) driver;
    jsb.executeScript("window.scrollBy(0,250)", "");
	
    String StateName = Prop.getProperty("state");
    State.sendKeys(StateName);
	
    String cityname = Prop.getProperty("city");
    City.sendKeys(cityname);
	
    String ZipCode = Prop.getProperty("zipcode");
    Zipcode.sendKeys(ZipCode);
	
    String mob = Prop.getProperty("MobileNo");
    MobileNo.sendKeys(mob);
	
    JavascriptExecutor jsv = (JavascriptExecutor) driver;
    jsv.executeScript("window.scrollBy(0,250)", "");
	CreateAcc.click();
}
}
