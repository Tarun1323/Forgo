package Purchases;

import java.io.IOException;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import forgo.genericUtility.BaseClass;

public class Matterial_Receipt extends BaseClass {
	@Test(priority=1,description = "Bills creation with mandiotry fields")
	public void MR_TC001() throws InterruptedException, IOException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[7]")).click();
		driver.findElement(By.xpath("//span[text()='Material Receipt']")).click();
		driver.findElement(By.xpath("//span[text()='My Material']")).click();
		driver.findElement(By.xpath("//span[text()='Add New']")).click();
		WebElement vendorElement = driver.findElement(By.xpath("(//input[@class='ant-select-selection-search-input'])[2]"));
		vendorElement.click();
		vendorElement.sendKeys("Varun");
		vendorElement.sendKeys(Keys.ARROW_DOWN);
		vendorElement.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		WebElement movementDateElement= driver.findElement(By.name("movement_date"));
		movementDateElement.click();
		driver.findElement(By.xpath("//a[text()='Now']")).click();
		Thread.sleep(1000);
		WebElement accountDateElement= driver.findElement(By.name("account_date"));
		accountDateElement.click();
		driver.findElement(By.xpath("(//a[text()='Now'])[2]")).click();
		driver.findElement(By.xpath("//input[@name='mr_no'] ")).sendKeys("123asdf");
		Thread.sleep(1000);
		WebElement materialReceiptDateElement= driver.findElement(By.name("receipt_date"));
		materialReceiptDateElement.click();
		driver.findElement(By.xpath("(//a[text()='Now'])[3]")).click();
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(2000);
		driver.findElement(By.name("//input[@name='ref_purchase_order_no'] ")).sendKeys("123kjh");
		Thread.sleep(1000);
		WebElement warehouseElement= driver.findElement(By.xpath("(//input[@class='ant-select-selection-search-input'])[3]"));
		warehouseElement.click();
		warehouseElement.sendKeys("amazon");
		warehouseElement.sendKeys(Keys.ARROW_DOWN);
		warehouseElement.sendKeys(Keys.ENTER);
		/*WebElement purchaseOrderElement=driver.findElement(By.xpath("(//input[@class='ant-input pp-form-input'])[2]"));
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
		Thread.sleep(3000);*/
		
	}
	@Test(priority=2,description = "Sort-MR/My Material")
	public void MR_TC002() throws InterruptedException, IOException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[7]")).click();
		driver.findElement(By.xpath("//span[text()='Material Receipt']")).click();
		driver.findElement(By.xpath("//span[text()='My Material']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='anticon anticon-ellipsis pp-icon-25']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Date']")).click();
		wUtil.takeScreenShot(driver,"MR Date-sort");
		
	}
	@Test(priority=3,description = "search-MR")
	public void MR_TC003() throws InterruptedException, IOException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[7]")).click();
		driver.findElement(By.xpath("//span[text()='Material Receipt']")).click();
		driver.findElement(By.xpath("//span[text()='My Material']")).click();

		Thread.sleep(2000);
		WebElement searchElement=driver.findElement(By.xpath("//input[@class='ant-input ant-input-lg']"));
		searchElement.sendKeys("Karteek");
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"SearchyBy_VendorName");
		Thread.sleep(1000);
		searchElement.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='ant-input ant-input-lg']")).sendKeys("1234");
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"SearchyBy_PurchaseNo");
		Thread.sleep(1000);

	}

	@Test(priority=4,description = "MR-Filter")
	public void MR_TC004() throws InterruptedException, IOException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[7]")).click();
		driver.findElement(By.xpath("//span[text()='Material Receipt']")).click();
		driver.findElement(By.xpath("//span[text()='My Material']")).click();
		driver.findElement(By.xpath("//span[text()='Add Filters']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Unsubmitted']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"Unsubmitted");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Unsubmitted']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Approved']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"Approved");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Approved']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Pending Approval']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"Pending Approval");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Pending Approval']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Rejected']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"Rejected");
		Thread.sleep(1000);
		
	}
	@Test(priority=5,description = "Edit MR")
	public void MR_TC005() throws InterruptedException, IOException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[7]")).click();
		driver.findElement(By.xpath("//span[text()='Material Receipt']")).click();
		driver.findElement(By.xpath("//span[text()='My Material']")).click();
		driver.findElement(By.xpath("//span[text()='Add Filters']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Unsubmitted']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//tr[@class='ant-table-row ant-table-row-level-0']")).click();
		driver.findElement(By.xpath("//span[text()='Edit']")).click();
		WebElement poNumberElement=driver.findElement(By.xpath("(//input[@class='ant-input pp-form-input'])[2]"));
		poNumberElement.click();
		poNumberElement.sendKeys(Keys.CONTROL + "a");  
		poNumberElement.sendKeys(Keys.DELETE);		
		poNumberElement.sendKeys("as12");
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"Edit-MR");
		Thread.sleep(1000);

		
	}
		
	
}