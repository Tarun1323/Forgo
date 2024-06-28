package Purchases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import forgo.genericUtility.BaseClass;

//Bill_creation

public class Bills extends BaseClass {
	@Test(priority=1,description = "Bills creation with mandiotry fields")
	public void BIL_TC001() throws InterruptedException, IOException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[7]")).click();
		driver.findElement(By.xpath("//span[text()='Bills']")).click();
		driver.findElement(By.xpath("//span[text()='My Bills']")).click();
		driver.findElement(By.xpath("//span[text()='Add New']")).click();
		WebElement vendorElement = driver.findElement(By.xpath("(//input[@class='ant-select-selection-search-input'])[2]"));
		vendorElement.click();
		vendorElement.sendKeys("Varun");
		vendorElement.sendKeys(Keys.ARROW_DOWN);
		vendorElement.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		WebElement billElement= driver.findElement(By.name("billing_date"));
		billElement.click();
		driver.findElement(By.xpath("//a[text()='Now']")).click();
		WebElement purchaseOrderElement=driver.findElement(By.xpath("(//input[@class='ant-input pp-form-input'])[2]"));
		purchaseOrderElement.sendKeys("asd23");
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(2000);
		WebElement paymentTermsElents=driver.findElement(By.xpath("(//input[@class='ant-select-selection-search-input'])[3]"));
		paymentTermsElents.click();
		paymentTermsElents.sendKeys("Daily");
		paymentTermsElents.sendKeys(Keys.ARROW_DOWN);
		paymentTermsElents.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement placeOfSupplyElement=driver.findElement(By.xpath("(//input[@class='ant-select-selection-search-input'])[4]"));
		placeOfSupplyElement.click();
		placeOfSupplyElement.sendKeys("Andhra Pradesh");
		placeOfSupplyElement.sendKeys(Keys.ARROW_DOWN);
		placeOfSupplyElement.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement categoryTermsElement=driver.findElement(By.xpath("(//input[@class='ant-select-selection-search-input'])[5]"));
		categoryTermsElement.click();
		categoryTermsElement.sendKeys("Stationary");
		categoryTermsElement.sendKeys(Keys.ARROW_DOWN);
		categoryTermsElement.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.name("gl_code")).sendKeys("12qwe");
		Thread.sleep(1000);
		WebElement totalElement=driver.findElement(By.xpath("//span[text()='Sub total']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", totalElement);
		Thread.sleep(2000);
		WebElement itemDetailElement=driver.findElement(By.xpath("(//input[@class='ant-select-selection-search-input'])[6]"));
		itemDetailElement.click();
		itemDetailElement.sendKeys("lap");
		itemDetailElement.sendKeys(Keys.ARROW_DOWN);
		itemDetailElement.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		

		/*driver.findElement(By.xpath("(//input[@class='ant-input pp-form-input'])[4]")).sendKeys("1");
		driver.findElement(By.xpath("(//input[@class='ant-input pp-form-input'])[5]")).sendKeys("10000");
		WebElement taxElement=driver.findElement(By.xpath("(//input[@class='ant-select-selection-search-input'])[6]"));
		taxElement.click();
		taxElement.sendKeys("GST 10%");
		taxElement.sendKeys(Keys.ARROW_DOWN);
		taxElement.sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@id='save']")).click();*/
	}
		/*driver.findElement(By.xpath("(//input[@class='ant-input pp-form-input'])[2]")).sendKeys("123");
		Thread.sleep(1000);
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(5000);
		WebElement paymentTermsElents=driver.findElement(By.xpath("(//input[@class='ant-select-selection-search-input'])[3]"));
		paymentTermsElents.click();
		paymentTermsElents.sendKeys("Daily");
		paymentTermsElents.sendKeys(Keys.ARROW_DOWN);
		paymentTermsElents.sendKeys(Keys.ENTER);
		WebElement categoryElement=driver.findElement(By.xpath("(//input[@class='ant-select-selection-search-input'])[4]"));
		categoryElement.click();
		categoryElement.sendKeys("Stationary");
		categoryElement.sendKeys(Keys.ARROW_DOWN);
		categoryElement.sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		WebElement itemDetailElement=driver.findElement(By.xpath("(//input[@class='ant-select-selection-search-input'])[5]"));
		itemDetailElement.click();
		itemDetailElement.sendKeys("lap");
		itemDetailElement.sendKeys(Keys.ARROW_DOWN);
		itemDetailElement.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("(//input[@class='ant-input pp-form-input'])[4]")).sendKeys("1");
		driver.findElement(By.xpath("(//input[@class='ant-input pp-form-input'])[5]")).sendKeys("10000");
		WebElement taxElement=driver.findElement(By.xpath("(//input[@class='ant-select-selection-search-input'])[6]"));
		taxElement.click();
		taxElement.sendKeys("GST 10%");
		taxElement.sendKeys(Keys.ARROW_DOWN);
		taxElement.sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@id='save']")).click();*/

	
	@Test(priority=2,description = "Bill-Filter")
	public void BIL_002() throws InterruptedException, IOException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[7]")).click();
		driver.findElement(By.xpath("//span[text()='Bills']")).click();
		driver.findElement(By.xpath("//span[text()='My Bills']")).click();
		driver.findElement(By.xpath("//span[text()='Add Filters']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Pending approval']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"Pending_approval");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Pending approval']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Approved']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"Approved");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Approved']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Rejected']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"Rejected");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Rejected']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Unsubmitted']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"Unsubmitted");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Unsubmitted']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Overdue']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"Overdue");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Overdue']")).click();
		Thread.sleep(1000);
	}
	@Test(priority=3,description = "Purchases-sort")
	public void BIL_003() throws InterruptedException, IOException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[7]")).click();
		driver.findElement(By.xpath("//span[text()='Bills']")).click();
		driver.findElement(By.xpath("//span[text()='My Bills']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='anticon anticon-ellipsis pp-icon-25']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Date']")).click();
		wUtil.takeScreenShot(driver,"Bill Date-sort");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='anticon anticon-ellipsis pp-icon-25']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Vendor Name']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"Bill-sort by Vendorname");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='anticon anticon-ellipsis pp-icon-25']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Amount']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"Bill-sort by Amount");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='anticon anticon-ellipsis pp-icon-25']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Due Date']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"Bill-sort by Due Date");
	}
	@Test(priority=4,description = "Bill-Search")
	public void BIL_004() throws InterruptedException, IOException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[7]")).click();
		driver.findElement(By.xpath("//span[text()='Bills']")).click();
		driver.findElement(By.xpath("//span[text()='My Bills']")).click();
		WebElement searchElement=driver.findElement(By.xpath("//input[@class='ant-input ant-input-lg']"));
		searchElement.sendKeys("Nag");
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"SearchyBy_VendorName");
		Thread.sleep(1000);
		searchElement.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='ant-input ant-input-lg']")).sendKeys("PO_045");
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"SearchyBy_PurchaseNo");
		Thread.sleep(1000);

	}
	@Test(priority=5,description = "Unsubmited to sumbit")
	public void BIL_TC005() throws InterruptedException, IOException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[7]")).click();
		driver.findElement(By.xpath("//span[text()='Bills']")).click();
		driver.findElement(By.xpath("//span[text()='My Bills']")).click();
		driver.findElement(By.xpath("//span[text()='Add Filters']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Unsubmitted']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//tr[@class='ant-table-row ant-table-row-level-0'])[1]")).click();
		driver.findElement(By.xpath("//span[text()='Submit']")).click();
		Thread.sleep(4000);
		wUtil.takeScreenShot(driver,"Unsubmited to sumbit");
	}

	@Test(priority=6,description = "Verifies Edit_Purchases")
	public void BIL_TC006() throws InterruptedException, IOException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[7]")).click();
		driver.findElement(By.xpath("//span[text()='Bills']")).click();
		driver.findElement(By.xpath("//span[text()='My Bills']")).click();
		driver.findElement(By.xpath("//span[text()='Add Filters']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Unsubmitted']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//tr[@class='ant-table-row ant-table-row-level-0'])[1]")).click();
		driver.findElement(By.xpath("//span[text()='Edit']")).click();
		Thread.sleep(4000);
		WebElement vendorElement = driver.findElement(By.xpath("(//input[@class='ant-input pp-form-input'])[2]"));
		vendorElement.click();
		Thread.sleep(1000);
		vendorElement.clear();
		vendorElement.sendKeys("arun");
		vendorElement.sendKeys(Keys.ARROW_DOWN);
		vendorElement.sendKeys(Keys.ENTER);
		wUtil.takeScreenShot(driver,"Edit_Bills");

	}

	@Test(priority=7,description = "Verifies Clone")
	public void BIL_TC007() throws InterruptedException, IOException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[7]")).click();
		driver.findElement(By.xpath("//span[text()='Bills']")).click();
		driver.findElement(By.xpath("//span[text()='My Bills']")).click();
		driver.findElement(By.xpath("//span[text()='Add Filters']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Unsubmitted']")).click();
		Thread.sleep(1000);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//tr[@class='ant-table-row ant-table-row-level-0'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='More']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Clone']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Save']")).click();
		Thread.sleep(2000);
		wUtil.takeScreenShot(driver,"Clone_Bills");

	}


	@Test(priority=8,description = "Verifies Delete_Bills")
	public void BIL_TC008() throws InterruptedException, IOException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[7]")).click();
		driver.findElement(By.xpath("//span[text()='Bills']")).click();
		driver.findElement(By.xpath("//span[text()='My Bills']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//tr[@class='ant-table-row ant-table-row-level-0'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='More']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Delete']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Confirm']")).click();
		Thread.sleep(2000);
		wUtil.takeScreenShot(driver,"Delete_purchases");

	}
	@Test(priority=9,description = "Verifies Submit Bills")
	public void BIL_TC009() throws InterruptedException, IOException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[7]")).click();
		driver.findElement(By.xpath("//span[text()='Bills']")).click();
		driver.findElement(By.xpath("//span[text()='My Bills']")).click();
		driver.findElement(By.xpath("//span[text()='Add Filters']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Unsubmitted']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//tr[@class='ant-table-row ant-table-row-level-0'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Submit']")).click();
		Thread.sleep(4000);
		wUtil.takeScreenShot(driver,"Submit_Bills");

	}
	@Test(priority=10,description = "Verifies recall Pending Approval Bills")
	public void BIL_TC010() throws InterruptedException, IOException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[7]")).click();
		driver.findElement(By.xpath("//span[text()='Bills']")).click();
		driver.findElement(By.xpath("//span[text()='My Bills']")).click();
		driver.findElement(By.xpath("//span[text()='Add Filters']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Pending approval']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//tr[@class='ant-table-row ant-table-row-level-0'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Recall']")).click();
		Thread.sleep(4000);
		wUtil.takeScreenShot(driver,"recall_Bills");

	}
	@Test(priority=11,description="To Verify detail page for Bills")
	public void PUO_TC011() throws InterruptedException, IOException{
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[7]")).click();
		driver.findElement(By.xpath("//span[text()='Bills']")).click();
		driver.findElement(By.xpath("//span[text()='My Bills']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//tr[@class='ant-table-row ant-table-row-level-0'])[1]")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"details for DC");
		driver.findElement(By.xpath("//li[text()='Items']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"Item tabe for Bills");
		driver.findElement(By.xpath("//li[text()='History']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"HIstory tabe for Bills");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[text()='Comments']")).click();
		driver.findElement(By.xpath("//input[@class='ant-input']")).sendKeys("12345asdf");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Send']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"comment tabe for Bills");

	}
	//Approve
	@Test(priority=12,description = "Bill/Approve-Filter")
	public void BIL_012() throws InterruptedException, IOException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[7]")).click();
		driver.findElement(By.xpath("//span[text()='Bills']")).click();
		driver.findElement(By.xpath("//span[text()='Add Filters']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Pending approval']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"Pending_approval");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Pending approval']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Approved']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"Approved");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Approved']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Rejected']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"Rejected");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Rejected']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Overdue']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"Overdue");
		Thread.sleep(1000);

	}
	@Test(priority=13,description = "Bill/Approve-sort")
	public void BIL_013() throws InterruptedException, IOException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[7]")).click();
		driver.findElement(By.xpath("//span[text()='Bills']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='anticon anticon-ellipsis pp-icon-25']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Date']")).click();
		wUtil.takeScreenShot(driver,"Bill Date-sort");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='anticon anticon-ellipsis pp-icon-25']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Vendor Name']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"Bill-sort by Vendorname");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='anticon anticon-ellipsis pp-icon-25']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Amount']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"Bill-sort by Amount");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='anticon anticon-ellipsis pp-icon-25']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Due Date']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"Bill-sort by Due Date");
	}
	@Test(priority=14,description = "Bill/Approve-Search")
	public void BIL_014() throws InterruptedException, IOException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[7]")).click();
		driver.findElement(By.xpath("//span[text()='Bills']")).click();
		WebElement searchElement=driver.findElement(By.xpath("//input[@class='ant-input ant-input-lg']"));
		searchElement.sendKeys("Nag");
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"SearchyBy_VendorName");
		Thread.sleep(1000);
		searchElement.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='ant-input ant-input-lg']")).sendKeys("PO_045");
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"SearchyBy_PurchaseNo");
		Thread.sleep(1000);

	}
	@Test(priority=15,description = "Verifies approv for Pending Approval Bills")
	public void BIL_TC015() throws InterruptedException, IOException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[7]")).click();
		driver.findElement(By.xpath("//span[text()='Bills']")).click();
		driver.findElement(By.xpath("//span[text()='Add Filters']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Pending approval']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//tr[@class='ant-table-row ant-table-row-level-0'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Approve']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Confirm']")).click();
		Thread.sleep(4000);
		wUtil.takeScreenShot(driver,"Approvals_Bills/Approve");

	}
	@Test(priority=16,description = "Verifies reject for Pending Approval Bills")
	public void BIL_TC016() throws InterruptedException, IOException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[7]")).click();
		driver.findElement(By.xpath("//span[text()='Bills']")).click();
		driver.findElement(By.xpath("//span[text()='Add Filters']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Pending approval']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//tr[@class='ant-table-row ant-table-row-level-0'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Reject']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//textarea[@class='ant-input mt1']")).sendKeys("qwer");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Confirm']")).click();
		Thread.sleep(4000);
		wUtil.takeScreenShot(driver,"Approvals_Purchase/Reject");

	}
	@Test(priority=17,description = "Make Payments for Approved/Bills_Approvals")
	public void BIL_TC017() throws InterruptedException, IOException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[7]")).click();
		driver.findElement(By.xpath("//span[text()='Bills']")).click();
		driver.findElement(By.xpath("//span[text()='Add Filters']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Approved']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//tr[@class='ant-table-row ant-table-row-level-0'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='anticon anticon-caret-down down-caret']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Record Payment']")).click();
		driver.findElement(By.xpath("(//input[@class='ant-input pp-form-input'])[2]")).sendKeys("123asdf");
		driver.findElement(By.xpath("(//input[@class='ant-input pp-form-input'])[3]")).sendKeys("asdfg");
		driver.findElement(By.xpath("//span[text()='Save']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"Make_Payments/Approvals bill");

	}

}







