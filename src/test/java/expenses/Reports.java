package expenses;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;
import forgo.genericUtility.BaseClass;

public class Reports extends BaseClass {
	
	//Approvals Tab In Reports module
	
	@Test(description = "Approve_Report")
	public void REP_TC_001() throws InterruptedException, IOException {
		
		Thread.sleep(1000);
		db.clickOnExpensesLnk();
		driver.findElement(By.xpath("//span[text()='Reports']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='status status_pending_approval'])[1]")).click();
		Thread.sleep(1000);
<<<<<<< HEAD
		//driver.findElement(By.xpath("//button[@class='approve']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"Approve_Report");

		
=======
		//driver.findElement(By.xpath("//button@c[lass='approve']")).click();
		Thread.sleep(2000);
		String message = driver.findElement(By.xpath("//span[@class='messageText']")).getText();
		System.out.println(message);
>>>>>>> branch 'master' of https://github.com/PurpleplumTech/ems_test_automation
		
	}
	
	@Test(description = "Reject_Report")
	public void REP_TC_002() throws InterruptedException, IOException {
		
		Thread.sleep(1000);
		db.clickOnExpensesLnk();
		driver.findElement(By.xpath("//span[text()='Reports']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='status status_pending_approval'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='reject']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(" //textarea[@class='ant-input reasonTextArea']")).sendKeys("Reject Reason-Automation");
		//driver.findElement(By.xpath("//span[text()='Confirm']")).click();
		driver.findElement(By.xpath("//span[text()='Cancel']")).click();
<<<<<<< HEAD
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"Reject_Report");

=======
		Thread.sleep(2000);
		String message = driver.findElement(By.xpath("//span[@class='messageText']")).getText();
		System.out.println(message);
>>>>>>> branch 'master' of https://github.com/PurpleplumTech/ems_test_automation
	}
	
	
	@Test(description = "Reimburse_Report")
	public void REP_TC_003() throws InterruptedException, IOException {
		
		db.clickOnExpensesLnk();
		driver.findElement(By.xpath("//span[text()='Reports']")).click();
		driver.findElement(By.xpath("(//div[@class='status status_pending_reimbursement'])[1]")).click();
		driver.findElement(By.xpath("//button[@class='approve']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='ant-select-selector'])[2]")).click();
		driver.findElement(By.xpath("//div[text()='Bank Transfer']")).click();
<<<<<<< HEAD
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='ant-select-selector'])[3]")).click();
		driver.findElement(By.xpath("(//div[text()='Company'])[2]")).click();
		driver.findElement(By.xpath("//button[text()='Record Reimbursement']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"Reimburse_Report");


=======
		driver.findElement(By.xpath("(//div[@class='ant-select-selector'])[3]")).click();
		driver.findElement(By.xpath("(//div[text()='Client'])[2]")).click();
		driver.findElement(By.name("reference")).sendKeys("Auto Ref");
		driver.findElement(By.name("notes")).sendKeys("Auto Notes");
		//driver.findElement(By.xpath("//button[text()='Record Reimbursement']")).click();
		driver.findElement(By.xpath("//button[text()='Cancel']")).click();
		Thread.sleep(2000);
		String message = driver.findElement(By.xpath("//span[@class='messageText']")).getText();
		System.out.println(message);
>>>>>>> branch 'master' of https://github.com/PurpleplumTech/ems_test_automation
		
	}

	
	@Test(description = "Reject_Report_In_Prnding_Reimbursement")
	public void REP_TC_004() throws InterruptedException, IOException {
		
		Thread.sleep(1000);
		db.clickOnExpensesLnk();
		driver.findElement(By.xpath("//span[text()='Reports']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='status status_pending_reimbursement'])[1]")).click();
		Thread.sleep(1000);
<<<<<<< HEAD
		//driver.findElement(By.xpath("//button[@class='approve']")).click();
		driver.findElement(By.xpath("//button[text()='Reject']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//textarea[@class='ant-input reasonTextArea']")).sendKeys("qwert");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Confirm']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"Reject_Report_In_Prnding_Approval");
=======
		driver.findElement(By.xpath("//button[@class='reject']")).click();
		driver.findElement(By.xpath(" //textarea[@class='ant-input reasonTextArea']")).sendKeys("Reject Reason-Automation");
		//driver.findElement(By.xpath("//span[text()='Confirm']")).click();
		driver.findElement(By.xpath("//span[text()='Cancel']")).click();
		Thread.sleep(2000);
		String message = driver.findElement(By.xpath("//span[@class='messageText']")).getText();
		System.out.println(message);
>>>>>>> branch 'master' of https://github.com/PurpleplumTech/ems_test_automation
		
	}
	
	@Test(description = "Report_Approvals_Filters")
	public void REP_TC_005() throws InterruptedException, IOException {

		db.clickOnExpensesLnk();
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

		db.clickOnExpensesLnk();
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

		db.clickOnExpensesLnk();
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
	
	
	@Test(description = "Share_Report_In_More_Report_Approvals")
	public void REP_TC_008() throws InterruptedException {

		db.clickOnExpensesLnk();
		driver.findElement(By.xpath("//span[text()='Reports']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//tr[@class='ant-table-row ant-table-row-level-0'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='ant-dropdown-trigger more']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Share Report']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("rajesh@yopmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Submit']")).click();
		Thread.sleep(1000);
	    String message = driver.findElement(By.xpath("//span[@class='messageText']")).getText();
	    System.out.println(message);
		
	}
	
	@Test(description = "Download_Report_In_More_Report_Approvals")
	public void REP_TC_009() throws InterruptedException {

		db.clickOnExpensesLnk();
		driver.findElement(By.xpath("//span[text()='Reports']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//tr[@class='ant-table-row ant-table-row-level-0'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='ant-dropdown-trigger more']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Download PDF']")).click();
		Thread.sleep(2000);
		wUtil.switchToWindow(driver, "amazonaws");
		driver.close();
		Thread.sleep(2000);
		wUtil.switchToWindow(driver, "expenses");
	
	}
	
	
//	@Test(description = "Forward_Approval_In_More")
//	public void REP_TC_010() throws InterruptedException {
//
//		db.clickOnExpensesLnk();
//		driver.findElement(By.xpath("//span[text()='Reports']")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("(//div[@class='status status_pending_approval'])[1]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//button[@class='ant-dropdown-trigger more']")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//span[text()='Forward Approval']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("(//span[@class='ant-select-selection-search'])[2]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("(//div[@class='ant-select-item-option-content'])[1]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//span[text()='Submit']")).click();
//		
//	}
	
	@Test(description = "Add_Comments_In_Repport_Approvals")
	public void REP_TC_011() throws InterruptedException {

		db.clickOnExpensesLnk();
		driver.findElement(By.xpath("//span[text()='Reports']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//tr[@class='ant-table-row ant-table-row-level-0'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[text()='Comments']")).click();
		driver.findElement(By.xpath("//input[@class='ant-input']")).sendKeys("Automation comments");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Send']")).click();
		Thread.sleep(1000);
		String message = driver.findElement(By.xpath("//span[@class='messageText']")).getText();
		System.out.println(message);
	
	}
	
	//------------------------------------------------------My Reports Scripts-----------------------------------------------------------------------------

	@Test(description = "Create_Report")

	public void REP_TC_012() throws InterruptedException {

		db.clickOnExpensesLnk();
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
		driver.findElement(By.xpath("//span[text()='Save']")).click();
		//driver.findElement(By.xpath("//span[text()='Cancel']")).click();
		Thread.sleep(1000);
		String message = driver.findElement(By.xpath("//span[@class='messageText']")).getText();
		//System.out.println(message);
		Reporter.log(message);

	}
	
	@Test(description = "Edit_Report")

	public void REP_TC_013() throws InterruptedException {

		db.clickOnExpensesLnk();
		driver.findElement(By.xpath("//span[text()='Reports']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='My Reports']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='status status_unsubmitted'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Edit']")).click();
		Thread.sleep(1000);
		WebElement desc = driver.findElement(By.xpath("(//input[@class='ant-input'])[2]"));
		desc.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		desc.sendKeys("Auto Desc"+" "+jUtil.generateRandomNumber(3));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Save']")).click();
		//driver.findElement(By.xpath("//span[text()='Cancel']")).click();
		Thread.sleep(1000);
		String message = driver.findElement(By.xpath("//span[@class='messageText']")).getText();
		System.out.println(message);

	}

	@Test(description = "Add_Expense_In_Report")
	public void REP_TC_014() throws InterruptedException {

		db.clickOnExpensesLnk();
		driver.findElement(By.xpath("//span[text()='Reports']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='My Reports']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='status status_unsubmitted'])[1]")).click();
		driver.findElement(By.xpath("//li[text()='Expense']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='secondary-btn mr1']")).click();
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
		
		Thread.sleep(1000);
		String message = driver.findElement(By.xpath("//span[@class='messageText']")).getText();
		System.out.println(message);

	}
	
	@Test(description = "Link_Expense_In_Report")
	public void REP_TC_015() throws InterruptedException {

		db.clickOnExpensesLnk();
		driver.findElement(By.xpath("//span[text()='Reports']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='My Reports']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='status status_unsubmitted'])[1]")).click();
		driver.findElement(By.xpath("//li[text()='Expense']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Add unreported Expense']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@class='ant-checkbox-input'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Add  Expenses']")).click();
		Thread.sleep(1000);
		String message = driver.findElement(By.xpath("//span[@class='messageText']")).getText();
		System.out.println(message);
	}

	@Test(description = "Unlink_Expense_From_Report")
	public void REP_TC_016() throws InterruptedException {
		
		Thread.sleep(1000);
		db.clickOnExpensesLnk();
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
		Thread.sleep(1000);
		String message = driver.findElement(By.xpath("//span[@class='messageText']")).getText();
		System.out.println(message);

	}
	
	@Test(description = "Link_Advance_In_Report")
	public void REP_TC_017() throws InterruptedException {
		
		db.clickOnExpensesLnk();
		driver.findElement(By.xpath("//span[text()='Reports']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='My Reports']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='status status_unsubmitted'])[1]")).click();
		driver.findElement(By.xpath("//li[text()='Advances']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='+ Link Advance']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@class='ant-checkbox-input'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Add  Advances']")).click();
		Thread.sleep(1000);
		String message = driver.findElement(By.xpath("//span[@class='messageText']")).getText();
		System.out.println(message);

	}
	
	@Test(description = "Unlink_Advance_From_Report")
	public void REP_TC_018() throws InterruptedException {
		
		db.clickOnExpensesLnk();
		driver.findElement(By.xpath("//span[text()='Reports']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='My Reports']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='status status_unsubmitted'])[1]")).click();
		driver.findElement(By.xpath("//li[text()='Advances']")).click();
		Thread.sleep(1000);
		WebElement unlik = driver.findElement(By.xpath("//img[@class='ant-dropdown-trigger action-logo']"));
		wUtil.mouseHoverOn(driver, unlik);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Unlink Advance']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Unlink']")).click();

	}
	
	@Test(description = "Link_Trip_In_Report")
	public void REP_TC_019() throws InterruptedException {
		
		db.clickOnExpensesLnk();
		driver.findElement(By.xpath("//span[text()='Reports']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='My Reports']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='status status_unsubmitted'])[1]")).click();
		driver.findElement(By.xpath("//li[text()='Trips']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='+ Link Trips']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@class='ant-checkbox-input'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Add  Trips']")).click();
		Thread.sleep(1000);
		String message = driver.findElement(By.xpath("//span[@class='messageText']")).getText();
		System.out.println(message);

	}
	
	@Test(description = "Unlink_Trip_From_Report")
	public void REP_TC_020() throws InterruptedException {
		
		db.clickOnExpensesLnk();
		driver.findElement(By.xpath("//span[text()='Reports']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='My Reports']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='status status_unsubmitted'])[1]")).click();
		driver.findElement(By.xpath("//li[text()='Trips']")).click();
		Thread.sleep(1000);
		WebElement unlik = driver.findElement(By.xpath("//img[@class='ant-dropdown-trigger action-logo']"));
		wUtil.mouseHoverOn(driver, unlik);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Unlink Trip']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Unlink']")).click();

	}
	
	@Test(description = "Add_Comments_In_My_Reports")
	public void REP_TC_021() throws InterruptedException {
		
		db.clickOnExpensesLnk();
		driver.findElement(By.xpath("//span[text()='Reports']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='My Reports']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//tr[@class='ant-table-row ant-table-row-level-0'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[text()='Comments']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='ant-input']")).sendKeys("Automation comments");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Send']")).click();
		Thread.sleep(1000);
		String message = driver.findElement(By.xpath("//span[@class='messageText']")).getText();
		System.out.println(message);

	}
	
	@Test(description = "Share_Report_In_More_My_Report")
	public void REP_TC_022() throws InterruptedException {

		db.clickOnExpensesLnk();
		driver.findElement(By.xpath("//span[text()='Reports']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='My Reports']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//tr[@class='ant-table-row ant-table-row-level-0'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='ant-dropdown-trigger more']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Share Report']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("rajesh@yopmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Submit']")).click();
		Thread.sleep(1000);
	    String message = driver.findElement(By.xpath("//span[@class='messageText']")).getText();
		System.out.println(message);
	}
	
	@Test(description = "Download_Report_In_More_My_Report")
	public void REP_TC_023() throws InterruptedException {

		db.clickOnExpensesLnk();
		driver.findElement(By.xpath("//span[text()='Reports']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='My Reports']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//tr[@class='ant-table-row ant-table-row-level-0'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='ant-dropdown-trigger more']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Download PDF']")).click();
		Thread.sleep(1000);
		wUtil.switchToWindow(driver, "amazonaws");
		Thread.sleep(1000);
		driver.close();
		Thread.sleep(1000);
		wUtil.switchToWindow(driver, "expenses");
	
	}	
	
	
	@Test(description = "Submit_Report")
	public void REP_TC_024() throws InterruptedException {

		db.clickOnExpensesLnk();
		driver.findElement(By.xpath("//span[text()='Reports']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='My Reports']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='status status_unsubmitted'])[1]")).click();
		Thread.sleep(1000);
		try {
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		Thread.sleep(2000);
	    String message = driver.findElement(By.xpath("//span[@class='messageText']")).getText();
		System.out.println(message);
		}catch(NoSuchElementException e) {
			
			System.out.println("Expenses Not linked to report");
		}
	}	
	
	@Test(description = "Recall_Report")
	public void REP_TC_025() throws InterruptedException {

		db.clickOnExpensesLnk();
		driver.findElement(By.xpath("//span[text()='Reports']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='My Reports']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='status status_pending_approval'])[1]")).click();
		Thread.sleep(1000);
		
		try
		{
			driver.findElement(By.xpath("//button[text()='Recall']")).click();
			Thread.sleep(2000);
		    String message = driver.findElement(By.xpath("//span[@class='messageText']")).getText();
			System.out.println(message);
		}
		catch(NoSuchElementException e) {
			
			System.out.println("Recall button Not found");
		}
		
	}	
	
	@Test(description = "My_Reports_Filters")
	public void REP_TC_027() throws InterruptedException, IOException {

		db.clickOnExpensesLnk();
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
	public void REP_TC_028() throws InterruptedException, IOException {

		db.clickOnExpensesLnk();
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
	public void REP_TC_026() throws InterruptedException {

		Thread.sleep(1000);
		db.clickOnExpensesLnk();
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
