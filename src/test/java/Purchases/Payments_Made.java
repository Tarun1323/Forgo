package Purchases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import forgo.genericUtility.BaseClass;


public class Payments_Made extends BaseClass {
	@Test(priority=1,description = "Sort by Paymentmade/Pending")
	public void PM_TC001() throws InterruptedException, IOException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[7]")).click();
		driver.findElement(By.xpath("//span[text()='Payments Made']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='anticon anticon-ellipsis pp-icon-25']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Date']")).click();
		wUtil.takeScreenShot(driver,"Paymentmade Date-sort");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='anticon anticon-ellipsis pp-icon-25']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Vendor Name']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"Paymentmade by Vendorname");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='anticon anticon-ellipsis pp-icon-25']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Bill Number']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"Paymentmade by Bill Number");

	}
	@Test(priority=2,description = "search by Paymentmade/Pending")
	public void PM_TC002() throws InterruptedException, IOException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[7]")).click();
		driver.findElement(By.xpath("//span[text()='Payments Made']")).click();
		Thread.sleep(2000);
		WebElement searchElement=driver.findElement(By.xpath("//input[@class='ant-input ant-input-lg']"));
		searchElement.sendKeys("sanjay");
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"SearchyBy_VendorName");
		Thread.sleep(1000);
		searchElement.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='ant-input ant-input-lg']")).sendKeys("BIL_04");
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"SearchyBy_PurchaseNo");
		Thread.sleep(1000);

	}
	@Test(priority=13,description = "make Paymentmade/Pending")
	public void PM_TC003() throws InterruptedException, IOException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[7]")).click();
		driver.findElement(By.xpath("//span[text()='Payments Made']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//tr[@class='ant-table-row ant-table-row-level-0'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='anticon anticon-caret-down down-caret']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Record Payment']")).click();
		driver.findElement(By.xpath("(//input[@class='ant-input pp-form-input'])[2]")).sendKeys("asdf");
		driver.findElement(By.xpath("(//input[@class='ant-input pp-form-input'])[3]")).sendKeys("asdfg");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Save']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"Make_Payments/Payments");
		//Save button not working

	}
	
	//Paid
	
	@Test(priority=4,description = "Sort by Paymentmade/Pending")
	public void PM_TC004() throws InterruptedException, IOException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[7]")).click();
		driver.findElement(By.xpath("//span[text()='Payments Made']")).click();
		driver.findElement(By.xpath("//span[text()='Paid']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='anticon anticon-ellipsis pp-icon-25']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Created Date']")).click();
		wUtil.takeScreenShot(driver,"Paymentmade/Paid Creadted Date-sort");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='anticon anticon-ellipsis pp-icon-25']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Bill No']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"Paymentmade/Paid Creadted Bill No");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='anticon anticon-ellipsis pp-icon-25']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Vendor Name']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"Paymentmade by Vendorname");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='anticon anticon-ellipsis pp-icon-25']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Amount']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"Paymentmade by Amount");

	}
	
	@Test(priority=5,description = "search by Paymentmade/Pending")
	public void PM_TC005() throws InterruptedException, IOException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[7]")).click();
		driver.findElement(By.xpath("//span[text()='Payments Made']")).click();
		driver.findElement(By.xpath("//span[text()='Paid']")).click();
		Thread.sleep(2000);
		WebElement searchElement=driver.findElement(By.xpath("//input[@class='ant-input ant-input-lg']"));
		searchElement.sendKeys("sanjay");
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"SearchyBy_VendorName");
		Thread.sleep(1000);
		searchElement.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='ant-input ant-input-lg']")).sendKeys("BIL_09");
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"SearchyBy_PurchaseNo");
		Thread.sleep(1000);

	}
	
	@Test(priority=6,description="To Verify detail page for Payments Made")
	public void PM_TC011() throws InterruptedException, IOException{
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[7]")).click();
		driver.findElement(By.xpath("//span[text()='Payments Made']")).click();
		driver.findElement(By.xpath("//span[text()='Paid']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//tr[@class='ant-table-row ant-table-row-level-0'])[1]")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"details for PaymentsMade");
		driver.findElement(By.xpath("//li[text()='Details']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"Item tabe for PaymentsMade");
		driver.findElement(By.xpath("//li[text()='History']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"HIstory tabe for Bills");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[text()='Comments']")).click();
		driver.findElement(By.xpath("//input[@class='ant-input']")).sendKeys("12345asdf");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Send']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"comment tabe for PaymentsMade");

	}
	
	@Test(priority=7,description="To Verify Payments Made-Paid")
	public void PM_TC012() throws InterruptedException, IOException{
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[7]")).click();
		driver.findElement(By.xpath("//span[text()='Payments Made']")).click();
		driver.findElement(By.xpath("//span[text()='Paid']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"Payments-Paid");
	
}
	
	@Test(priority=7,description="To Verify sort")
	public void PM_TC013() throws InterruptedException, IOException{
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[7]")).click();
		driver.findElement(By.xpath("//span[text()='Payments Made']")).click();
		driver.findElement(By.xpath("//span[text()='Paid']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='anticon anticon-ellipsis pp-icon-25']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Created Date']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"Created Date");
		driver.findElement(By.xpath("//span[@class='anticon anticon-ellipsis pp-icon-25']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Bill No']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"Bill No");
		driver.findElement(By.xpath("//span[@class='anticon anticon-ellipsis pp-icon-25']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Vendor Name']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"Vendor Name");
		driver.findElement(By.xpath("//span[@class='anticon anticon-ellipsis pp-icon-25']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Amount']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"Amount");
		
}
	@Test(priority=7,description="To Verify Search")
	public void PM_TC014() throws InterruptedException, IOException{
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[7]")).click();
		driver.findElement(By.xpath("//span[text()='Payments Made']")).click();
		driver.findElement(By.xpath("//span[text()='Paid']")).click();
		Thread.sleep(1000);
		WebElement searchElement=driver.findElement(By.xpath("//input[@class='ant-input ant-input-lg']"));
		searchElement.sendKeys("sanjay");
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"SearchyBy_VendorName");
		Thread.sleep(1000);
		searchElement.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='ant-input ant-input-lg']")).sendKeys("BIL_09");
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"SearchyBy_BillNo");
		Thread.sleep(1000);
		searchElement.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='ant-input ant-input-lg']")).sendKeys("test");
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"SearchyBy_refernc");
		
		}
	
	
	

}

