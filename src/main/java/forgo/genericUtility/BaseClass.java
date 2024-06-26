package forgo.genericUtility;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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
 * @author Nagarjuna,Tarun
 * 
 */

public class BaseClass {
	
	public WebDriverUtility wUtil = new WebDriverUtility();
	public JavaUtility jUtil = new JavaUtility();
	public PropertyFileUtility pUtil = new PropertyFileUtility();
	public ExcelFileUtility eUtil = new ExcelFileUtility();
	public WebDriver driver= null;
	public LoginPage lp;
	public DashBoard db;

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
		lp =new LoginPage(driver);
		db =new DashBoard(driver);
		Reporter.log("----browser launched Successfully----", true);
	}
	
	@BeforeMethod
	public void bmlConfig() throws IOException, InterruptedException {
		
		String Email = pUtil.readDataFromPropertyFile("email");
		String Password = pUtil.readDataFromPropertyFile("password");
		Thread.sleep(2000);
		Thread.sleep(1000);
		lp.login(Email, Password);

		driver.findElement(By.xpath("(//button[@class='go_to_organisation'])[1]")).click();
		Reporter.log("----Login Successfull----", true);
	}
	
	@AfterMethod
	public void amConfig() throws InterruptedException
	{
		Thread.sleep(1000);
		
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
