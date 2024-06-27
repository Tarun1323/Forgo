package Purchases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import forgo.genericUtility.BaseClass;

public class Purchase_order extends BaseClass{
	@Test(priority=1,description = "Purchase order creation with mandiotry fields")
	public void PUO_TC001() throws InterruptedException, IOException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[7]")).click();
		driver.findElement(By.xpath("//span[text()='Purchase Orders']")).click();
		driver.findElement(By.xpath("//span[text()='My Purchases']")).click();
		driver.findElement(By.xpath("//span[text()='Add New']")).click();
		WebElement customerInfoElement = driver.findElement(By.xpath("(//input[@class='ant-select-selection-search-input'])[2]"));
		customerInfoElement.click();
		customerInfoElement.sendKeys("arun");
		customerInfoElement.sendKeys(Keys.ARROW_DOWN);
		customerInfoElement.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("(//div[@class='ant-picker-input'])[1]")).click();
		driver.findElement(By.xpath("//a[text()='Now']")).click();
		driver.findElement(By.xpath("(//input[@class='ant-input pp-form-input'])[1]")).sendKeys("p1_0987");
		Thread.sleep(2000);
		WebElement paymentTermsElents=driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[2]"));
		paymentTermsElents.click();
		paymentTermsElents.sendKeys("Daily");
		paymentTermsElents.sendKeys(Keys.ARROW_DOWN);
		paymentTermsElents.sendKeys(Keys.ENTER);

		


	}
	
	@Test(priority=2,description = "Purchases-Filter")
	public void PUO_TC002() throws InterruptedException, IOException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[7]")).click();
		driver.findElement(By.xpath("//span[text()='Purchase Orders']")).click();
		driver.findElement(By.xpath("//span[text()='My Purchases']")).click();
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
		driver.findElement(By.xpath("//span[text()='Declined']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"Declined");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Declined']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Accepted']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"Accepted");
		Thread.sleep(1000);
		}
	
	@Test(priority=3,description = "Purchases-sort")
	public void PUO_TC003() throws InterruptedException, IOException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[7]")).click();
		driver.findElement(By.xpath("//span[text()='Purchase Orders']")).click();
		driver.findElement(By.xpath("//span[text()='My Purchases']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='anticon anticon-ellipsis pp-icon-25']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Purchase Date']")).click();
		wUtil.takeScreenShot(driver,"Purchase Date-sort");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='anticon anticon-ellipsis pp-icon-25']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Vendor Name']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"Vendor-sort by Vendorname");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='anticon anticon-ellipsis pp-icon-25']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Amount']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"Vendor-sort by Amount");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='anticon anticon-ellipsis pp-icon-25']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Delivery Date']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"Vendor-sort by Delivery Date");
}
	@Test(priority=4,description = "Purchases-Search")
	public void PUO_TC004() throws InterruptedException, IOException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[7]")).click();
		driver.findElement(By.xpath("//span[text()='Purchase Orders']")).click();
		driver.findElement(By.xpath("//span[text()='My Purchases']")).click();
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
	public void PUO_TC005() throws InterruptedException, IOException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[7]")).click();
		driver.findElement(By.xpath("//span[text()='Purchase Orders']")).click();
		driver.findElement(By.xpath("//span[text()='My Purchases']")).click();
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
	public void PUO_TC006() throws InterruptedException, IOException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[7]")).click();
		driver.findElement(By.xpath("//span[text()='Purchase Orders']")).click();
		driver.findElement(By.xpath("//span[text()='My Purchases']")).click();
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
		wUtil.takeScreenShot(driver,"Edit_Purchases");
		}
	@Test(priority=7,description = "Verifies Clone")
	public void PUO_TC007() throws InterruptedException, IOException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[7]")).click();
		driver.findElement(By.xpath("//span[text()='Purchase Orders']")).click();
		driver.findElement(By.xpath("//span[text()='My Purchases']")).click();
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
		wUtil.takeScreenShot(driver,"Clone_purchases");

	}
	@Test(priority=8,description = "Verifies Delete_purchases")
	public void PUO_TC008() throws InterruptedException, IOException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[7]")).click();
		driver.findElement(By.xpath("//span[text()='Purchase Orders']")).click();
		driver.findElement(By.xpath("//span[text()='My Purchases']")).click();
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
	
	@Test(priority=9,description = "Verifies Submit Purchases")
	public void PUO_TC009() throws InterruptedException, IOException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[7]")).click();
		driver.findElement(By.xpath("//span[text()='Purchase Orders']")).click();
		driver.findElement(By.xpath("//span[text()='My Purchases']")).click();
		driver.findElement(By.xpath("//span[text()='Add Filters']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Unsubmitted']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//tr[@class='ant-table-row ant-table-row-level-0'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Submit']")).click();
		Thread.sleep(4000);
		wUtil.takeScreenShot(driver,"Submit_Purchase");

	}
	@Test(priority=10,description = "Verifies recall Pending Approval Purchases")
	public void PUO_TC010() throws InterruptedException, IOException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[7]")).click();
		driver.findElement(By.xpath("//span[text()='Purchase Orders']")).click();
		driver.findElement(By.xpath("//span[text()='My Purchases']")).click();
		driver.findElement(By.xpath("//span[text()='Add Filters']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Pending approval']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//tr[@class='ant-table-row ant-table-row-level-0'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Recall']")).click();
		Thread.sleep(4000);
		wUtil.takeScreenShot(driver,"recall_Purchase");

	}
	
	@Test(priority=11,description="To Verify detail page for Purchases order")
	public void PUO_TC011() throws InterruptedException, IOException{
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[7]")).click();
		driver.findElement(By.xpath("//span[text()='Purchase Orders']")).click();
		driver.findElement(By.xpath("//span[text()='My Purchases']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//tr[@class='ant-table-row ant-table-row-level-0'])[1]")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"details for DC");
		driver.findElement(By.xpath("//li[text()='Items']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"Item tabe for DC");
		driver.findElement(By.xpath("//li[text()='History']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"HIstory tabe for DC");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[text()='Comments']")).click();
		driver.findElement(By.xpath("//input[@class='ant-input']")).sendKeys("12345asdf");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Send']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"comment tabe for DC");
	
}
	//Approve
	
	@Test(priority=12,description = "Approve-Purchases-Filter")
	public void PUO_TC012() throws InterruptedException, IOException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[7]")).click();
		driver.findElement(By.xpath("//span[text()='Purchase Orders']")).click();
		driver.findElement(By.xpath("//span[text()='Add Filters']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Pending approval']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"Approve-Pending_approval");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Pending approval']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Approved']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"Approve-Approved");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Approved']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Rejected']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"Approve-Rejected");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Rejected']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Overdue']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"Approve-Overdue");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Overdue']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Declined']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"Approve-Declined");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Declined']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Accepted']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"Approve-Accepted");
		Thread.sleep(1000);
		
		}
	@Test(priority=13,description = "Purchases/Approve-sort")
	public void PUO_TC013() throws InterruptedException, IOException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[7]")).click();
		driver.findElement(By.xpath("//span[text()='Purchase Orders']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='anticon anticon-ellipsis pp-icon-25']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Purchase Date']")).click();
		wUtil.takeScreenShot(driver,"Purchase Date-sort");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='anticon anticon-ellipsis pp-icon-25']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Vendor Name']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"Vendor-sort by Vendorname");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='anticon anticon-ellipsis pp-icon-25']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Amount']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"Vendor-sort by Amount");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='anticon anticon-ellipsis pp-icon-25']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Delivery Date']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"Vendor-sort by Delivery Date");
}
	@Test(priority=14,description = "Purchases/Approve-Search")
	public void PUO_TC014() throws InterruptedException, IOException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[7]")).click();
		driver.findElement(By.xpath("//span[text()='Purchase Orders']")).click();
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
	@Test(priority=15,description = "Verifies approv for Pending Approval Purchases")
	public void PUO_TC015() throws InterruptedException, IOException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[7]")).click();
		driver.findElement(By.xpath("//span[text()='Purchase Orders']")).click();
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
		wUtil.takeScreenShot(driver,"Approvals_Purchase/Approve");

	}
	@Test(priority=16,description = "Verifies rejec for Pending Approval Purchases")
	public void PUO_TC016() throws InterruptedException, IOException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[7]")).click();
		driver.findElement(By.xpath("//span[text()='Purchase Orders']")).click();
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
	
	@Test(priority=17,description = "Verifies Convert to bill for Approvaed")
	public void PUO_TC017() throws InterruptedException, IOException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[7]")).click();
		driver.findElement(By.xpath("//span[text()='Purchase Orders']")).click();
		driver.findElement(By.xpath("//span[text()='Add Filters']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Approved']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//tr[@class='ant-table-row ant-table-row-level-0'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Bill']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Confirm']")).click();
		driver.findElement(By.xpath("(//input[@class='ant-input pp-form-input'])[1]")).sendKeys("123");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Save']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"Approvals_Purchase/convert to bill");

	}
	
	@Test(priority=18,description = "Verifies Convert to bill for Approvaed")
	public void PUO_TC018() throws InterruptedException, IOException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[7]")).click();
		driver.findElement(By.xpath("//span[text()='Purchase Orders']")).click();
		driver.findElement(By.xpath("//span[text()='Add Filters']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Approved']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//tr[@class='ant-table-row ant-table-row-level-0'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Create']")).click();
		driver.findElement(By.xpath("(//div[@class='ant-picker-input'])[1]")).click();
		driver.findElement(By.xpath("(s//a[text()='Now'])[1]")).click();
		driver.findElement(By.xpath("(//div[@class='ant-picker-input'])[2]")).click();
		driver.findElement(By.xpath("(//a[text()='Now'])[2]")).click();
		Thread.sleep(1000);
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1000);");
		driver.findElement(By.id("(//input[@class='ant-input pp-form-input'])[1]")).sendKeys("1234");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='ant-picker-input'])[2]")).click();
		driver.findElement(By.xpath("(//a[text()='Now'])[2]")).click();





		//sdriver.findElement(By.xpath("//span[text()='Save']")).click();
		//Thread.sleep(1000);
		//wUtil.takeScreenShot(driver,"Approvals_Purchase/convert to bill");

	}
}

	
	



