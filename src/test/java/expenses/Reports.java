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

import forgo.genericUtility.BaseClass;
import forgo.genericUtility.JavaUtility;
import forgo.genericUtility.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Reports extends BaseClass{

	@Test

	public void Create_Report() throws InterruptedException {
		
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[6]")).click();
		driver.findElement(By.xpath("//span[text()='Reports']")).click();

		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='My Reports']")).click();
		
		driver.findElement(By.xpath("//span[text()='Add New']")).click();
		
		driver.findElement(By.xpath("(//input[@class='ant-input'])[1]")).sendKeys("Automation Report"+jUtil.generateRandomNumber(3));
		
		driver.findElement(By.xpath("//input[@id='from_date']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Now']")).click();
		
		driver.findElement(By.xpath("//input[@id='to_date']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[text()='Now'])[2]")).click();
		
		driver.findElement(By.xpath("(//input[@class='ant-input'])[2]")).sendKeys("Auto Desc");
		
		// driver.findElement(By.xpath("//span[text()='Save']")).click();
		driver.findElement(By.xpath("//span[text()='Cancel']")).click();

	}

	@Test
	public void Report_Approvals_Filters() throws InterruptedException, IOException {
		
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[6]")).click();
		driver.findElement(By.xpath("//span[text()='Reports']")).click();

		driver.findElement(By.xpath("//span[text()='Add Filters']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Pending Approval']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver, "Pending Approval");
		driver.findElement(By.xpath("//span[text()='Pending Approval']")).click();
		Thread.sleep(1000);
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
	public void Report_Approvals_Search() throws InterruptedException, IOException {
		
		
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[6]")).click();
		driver.findElement(By.xpath("//span[text()='Reports']")).click();
		
		WebElement search = driver.findElement(By.xpath("//input[@id='search-input']"));
		search.sendKeys("77");
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver, "ID"+jUtil.generateRandomNumber(4));
		search.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		Thread.sleep(1000);
		search.sendKeys("Naga");
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver, "Employee Name"+jUtil.generateRandomNumber(4));
		search.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		Thread.sleep(1000);
		search.sendKeys("Test");
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver, "Report Name"+jUtil.generateRandomNumber(4));
		search.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		Thread.sleep(1000);
	}

	@Test
	public void Report_Approvals_Sort() throws InterruptedException {
		
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[6]")).click();
		driver.findElement(By.xpath("//span[text()='Reports']")).click();

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

	@Test
	public void Add_Expense_In_Report() throws InterruptedException {
		
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[6]")).click();
		driver.findElement(By.xpath("//span[text()='Reports']")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='My Reports']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='status status_unsubmitted'])[1]")).click();

		driver.findElement(By.xpath("//li[text()='Expense']")).click();

		Thread.sleep(2000);

		//WebElement AddNewExpense1 = driver.findElement(By.xpath("//button[@class='primary-btn']"));
		//AddNewExpense1.click();
		WebElement AddNewExpense2 = driver.findElement(By.xpath("//button[@class='secondary-btn mr1']"));
		AddNewExpense2.click();
		Thread.sleep(1000);
		driver.findElement(By.name("amount_cents")).sendKeys(jUtil.generateRandomNumber(4));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='ant-picker-input']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Now']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@class='ant-select-selection-search'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Test']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@class='ant-select-selection-search-input'])[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Stationary']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@title='Card']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[5]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Company']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@class='ant-input'])[2]")).sendKeys("Automation Testing");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Save and Close']")).click();

	}
	
	@Test
	public void Unlink_Expense_From_Report() throws InterruptedException
	{
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[6]")).click();
		driver.findElement(By.xpath("//span[text()='Reports']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='My Reports']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='status status_unsubmitted'])[1]")).click();

		driver.findElement(By.xpath("//li[text()='Expense']")).click();
		Thread.sleep(2000);
		
		WebElement unlink = driver.findElement(By.xpath("(//img[@class='ant-dropdown-trigger action-logo'])[1]"));
		Thread.sleep(2000);
		unlink.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[text()='Unlink Expense'])[1]")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//button[@class='ant-btn ant-btn-default formButton mt1']")).click();
		driver.findElement(By.xpath("//button[@class='ant-btn ant-btn-default cancelButton ml1 mt1']")).click();
		
		
		
		
	}

}
