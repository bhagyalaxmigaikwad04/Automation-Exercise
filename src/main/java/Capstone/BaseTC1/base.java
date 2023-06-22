package Capstone.BaseTC1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {

	public WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sonu\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
        driver.get("https://automationexercise.com/");
        driver.manage(). window(). maximize ();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        return driver;
}
}