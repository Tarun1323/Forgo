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

public class Reports extends BaseClass {
	
	@Test(description = "Approve_Report")
	public void REP_TC_001() throws InterruptedException, IOException {
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[6]")).click();
		driver.findElement(By.xpath("//span[text()='Reports']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='status status_pending_approval'])[1]")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//button[@class='approve']")).click();
		
	}
	
	@Test(description = "Reject_Report")
	public void REP_TC_002() throws InterruptedException, IOException {
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[6]")).click();
		driver.findElement(By.xpath("//span[text()='Reports']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='status status_pending_approval'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='reject']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(" //textarea[@class='ant-input reasonTextArea']")).sendKeys("Reject Reason-Automation");
		//driver.findElement(By.xpath("//span[text()='Confirm']")).click();
		driver.findElement(By.xpath("//span[text()='Cancel']")).click();
	}
	
	
	@Test(description = "Reimburse_Report")
	public void REP_TC_003() throws InterruptedException, IOException {
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[6]")).click();
		driver.findElement(By.xpath("//span[text()='Reports']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='status status_pending_reimbursement'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='approve']")).click();
		
	}

	
	@Test(description = "Reject_Report_In_Prnding_Approval")
	public void REP_TC_004() throws InterruptedException, IOException {
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[6]")).click();
		driver.findElement(By.xpath("//span[text()='Reports']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='status status_pending_reimbursement'])[1]")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//button[@class='approve']")).click();
		driver.findElement(By.xpath("//span[text()='Cancel']")).click();
		
	}
	
	@Test(description = "Report_Approvals_Filters")
	public void REP_TC_005() throws InterruptedException, IOException {

		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[6]")).click();
		driver.findElement(By.xpath("//span[text()='Reports']")).click();

		driver.findElement(By.xpath("//span[text()='Add Filters']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Pending Approval']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver, "Pending Approval" + " " + jUtil.getSystemDateInFormat());
		driver.findElement(By.xpath("//span[text()='Pending Approval']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Pending Reimbursements']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver, "Pending Reimbursements" + " " + jUtil.getSystemDateInFormat());
		driver.findElement(By.xpath("//span[text()='Pending Reimbursements']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Approved']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver, "Approved" + " " + jUtil.getSystemDateInFormat());
		driver.findElement(By.xpath("//span[text()='Approved']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Rejected']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver, "Rejected" + " " + jUtil.getSystemDateInFormat());
		driver.findElement(By.xpath("//span[text()='Rejected']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Reimbursed']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver, "Reimbursed" + " " + jUtil.getSystemDateInFormat());
		driver.findElement(By.xpath("//span[text()='Reimbursed']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='All Reports']")).click();

	}

	@Test(description = "Report_Approvals_Search")
	public void REP_TC_006() throws InterruptedException, IOException {

		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[6]")).click();
		driver.findElement(By.xpath("//span[text()='Reports']")).click();

		WebElement search = driver.findElement(By.xpath("//input[@id='search-input']"));
		search.sendKeys("77");
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver, "ID" + " " + jUtil.getSystemDateInFormat());
		search.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		Thread.sleep(1000);
		search.sendKeys("Naga");
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver, "Employee Name" + " " + jUtil.getSystemDateInFormat());
		search.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		Thread.sleep(1000);
		search.sendKeys("Test");
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver, "Report Name" + " " + jUtil.getSystemDateInFormat());
		search.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		Thread.sleep(1000);
	}

	@Test(description = "Report_Approvals_Sort")
	public void REP_TC_007() throws InterruptedException {

		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[6]")).click();
		driver.findElement(By.xpath("//span[text()='Reports']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='anticon anticon-ellipsis pp-icon-25']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='amount']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='anticon anticon-ellipsis pp-icon-25']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Report Name']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='anticon anticon-ellipsis pp-icon-25']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Submitted Date']")).click();

	}
	
	@Test(description = "Create_Report")

	public void REP_TC_008() throws InterruptedException {

		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[6]")).click();
		driver.findElement(By.xpath("//span[text()='Reports']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='My Reports']")).click();
		driver.findElement(By.xpath("//span[text()='Add New']")).click();
		driver.findElement(By.xpath("(//input[@class='ant-input'])[1]")).sendKeys("Automation Report" + jUtil.generateRandomNumber(3));
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

	@Test(description = "Add_Expense_In_Report")
	public void REP_TC_009() throws InterruptedException {

		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[6]")).click();
		driver.findElement(By.xpath("//span[text()='Reports']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='My Reports']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='status status_unsubmitted'])[1]")).click();
		driver.findElement(By.xpath("//li[text()='Expense']")).click();
		Thread.sleep(1000);

		// WebElement AddNewExpense1 =
		// driver.findElement(By.xpath("//button[@class='primary-btn']"));
		// AddNewExpense1.click();
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

	@Test(description = "Unlink_Expense_From_Report")
	public void REP_TC_010() throws InterruptedException {
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[6]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Reports']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='My Reports']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='status status_unsubmitted'])[1]")).click();
		driver.findElement(By.xpath("//li[text()='Expense']")).click();
		Thread.sleep(1000);
		WebElement unlink = driver.findElement(By.xpath("(//img[@class='ant-dropdown-trigger action-logo'])[1]"));
		Thread.sleep(1000);
		unlink.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[text()='Unlink Expense'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Unlink']")).click();
		//driver.findElement(By.xpath("//button[@class='ant-btn ant-btn-default cancelButton ml1 mt1']")).click();

	}
	
	@Test(description = "My_Reports_Filters")
	public void REP_TC_011() throws InterruptedException, IOException {

		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[6]")).click();
		driver.findElement(By.xpath("//span[text()='Reports']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='My Reports']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Add Filters']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Pending Approval']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver, "Pending Approval" + " " + jUtil.getSystemDateInFormat());
		driver.findElement(By.xpath("//span[text()='Pending Approval']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Pending Reimbursements']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver, "Pending Reimbursements" + " " + jUtil.getSystemDateInFormat());
		driver.findElement(By.xpath("//span[text()='Pending Reimbursements']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Unsubmitted']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver, "Approved" + " " + jUtil.getSystemDateInFormat());
		driver.findElement(By.xpath("//span[text()='Unsubmitted']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Rejected']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver, "Rejected" + " " + jUtil.getSystemDateInFormat());
		driver.findElement(By.xpath("//span[text()='Rejected']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Reimbursed']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver, "Reimbursed" + " " + jUtil.getSystemDateInFormat());
		driver.findElement(By.xpath("//span[text()='Reimbursed']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='All Reports']")).click();

	}

	@Test(description = "My_Reports_Search")
	public void REP_TC_012() throws InterruptedException, IOException {

		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[6]")).click();
		driver.findElement(By.xpath("//span[text()='Reports']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='My Reports']")).click();
		WebElement search = driver.findElement(By.xpath("//input[@id='search-input']"));
		search.sendKeys("77");
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver, "ID" + " " + jUtil.getSystemDateInFormat());
		search.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		Thread.sleep(1000);
		search.sendKeys("Naga");
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver, "Employee Name" + " " + jUtil.getSystemDateInFormat());
		search.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		Thread.sleep(1000);
		search.sendKeys("Test");
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver, "Report Name" + " " + jUtil.getSystemDateInFormat());
		search.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		Thread.sleep(1000);
	}

	@Test(description = "My_Reports_Sort")
	public void REP_TC_013() throws InterruptedException {

		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[6]")).click();
		driver.findElement(By.xpath("//span[text()='Reports']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='My Reports']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='anticon anticon-ellipsis pp-icon-25']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='amount']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='anticon anticon-ellipsis pp-icon-25']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Report Name']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='anticon anticon-ellipsis pp-icon-25']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Submitted Date']")).click();

	}
	

}
