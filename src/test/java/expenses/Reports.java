package expenses;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import forgo.genericUtility.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Reports {
	
	public WebDriver driver;
	WebDriverUtility wUtil = new WebDriverUtility();
	
	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://dashboard.forgocards.com/");
		//driver.get("https://ems-web.finmeadows.com/");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin.fi@yopmail.com");
		driver.findElement(By.id("password")).sendKeys("Spend@123");
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement organizationElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("go_to_organisation")));
		organizationElement.click();
		WebElement Expenses=	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[contains(@class,'menu-item')])[6]")));
		Expenses.click();
		
		WebElement Reports=	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Reports']")));
		Reports.click();
		
		

	}

	@AfterMethod
	public void closebrowser() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
	}

	@Test
	
	public void Create_Report() throws InterruptedException
	{
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='My Reports']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Add New']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@class='ant-input'])[1]")).sendKeys("Automation Report");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='from_date']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Now']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='to_date']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[text()='Now'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@class='ant-input'])[2]")).sendKeys("Auto Desc");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//span[text()='Save']")).click();
		driver.findElement(By.xpath("//span[text()='Cancel']")).click();
		
	}
	
	@Test
	public void Report_Approvals_Filters() throws InterruptedException, IOException {
		
		driver.findElement(By.xpath("//span[text()='Add Filters']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Pending Approval']")).click();
		Thread.sleep(2000);
		wUtil.takeScreenShot(driver, "Pending Approval");
		driver.findElement(By.xpath("//span[text()='Pending Approval']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Pending Reimbursements']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver, "Pending Reimbursements");
		driver.findElement(By.xpath("//span[text()='Pending Reimbursements']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Approved']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver, "Approved");
		driver.findElement(By.xpath("//span[text()='Approved']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Rejected']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver, "Rejected");
		driver.findElement(By.xpath("//span[text()='Rejected']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Reimbursed']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver, "Reimbursed");
		driver.findElement(By.xpath("//span[text()='Reimbursed']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='All Reports']")).click();
		
		
	}
	
	@Test
	public void Report_Approvals_Search() throws InterruptedException {
		
		Thread.sleep(2000);
		WebElement search = driver.findElement(By.xpath("//input[@id='search-input']"));
		search.sendKeys("25");
		Thread.sleep(2000);
		search.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		Thread.sleep(2000);
		search.sendKeys("Nag");
		Thread.sleep(2000);
		search.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		Thread.sleep(2000);
		search.sendKeys("check");
		Thread.sleep(2000);
		search.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		Thread.sleep(2000);
		search.sendKeys("Test");
		search.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
	}

	@Test
	public void Report_Approvals_Sort() throws InterruptedException {

		driver.findElement(By.xpath("//span[@class='anticon anticon-ellipsis pp-icon-25']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='amount']")).click(); 
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='anticon anticon-ellipsis pp-icon-25']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Report Name']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='anticon anticon-ellipsis pp-icon-25']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Submitted Date']")).click();

	}

	

}
