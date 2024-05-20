package forgo.genericUtility;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import forgo.ObjectRepository.DashBoard;
import forgo.ObjectRepository.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * This Class Contains basic configuration annotation for common funtionalities like launch the browser, login and logout etc..
 * @author Nagarjuna
 * 
 */

public class BaseClass {
	
	public WebDriverUtility wUtil = new WebDriverUtility();
	public JavaUtility jUtil = new JavaUtility();
	public PropertyFileUtility pUtil = new PropertyFileUtility();
	public ExcelFileUtility eUtil = new ExcelFileUtility();
	public WebDriver driver = null;
	
	
	@BeforeSuite
	public void bsConfig() {
		
		Reporter.log("----Database connected Successfully----", true);
	}
	
	@BeforeClass
	public void bcConfig() throws IOException {
		
		String url = pUtil.readDataFromPropertyFile("forgoUrl");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		wUtil.maximiseWindow(driver);
		wUtil.waitForElementsToLoadInDOM(driver);
		driver.get(url);
		Reporter.log("----browser launched Successfully----", true);
	}
	
	@BeforeMethod
	public void bmlConfig() throws IOException, InterruptedException {
		
		String Email = pUtil.readDataFromPropertyFile("email");
		String Password = pUtil.readDataFromPropertyFile("password");
		
		LoginPage lp = new LoginPage(driver);
		lp.login(Email, Password);
		
		driver.findElement(By.xpath("(//button[@class='go_to_organisation'])[1]")).click();
		Reporter.log("----Login Successfull----", true);
	}
	
	@AfterMethod
	public void amConfig() throws InterruptedException
	{
		
		DashBoard db = new DashBoard(driver);
		db.logout();
		Reporter.log("----logout sucessfull----", true);
	}
	
	@AfterClass
	public void acConfig()
	{
		driver.close();
		Reporter.log("----browser Closed Successfull----", true);
	}
	
	@AfterSuite
	public void asConfig() {
		Reporter.log("----Database Closed Successfull----", true);
	}

}
