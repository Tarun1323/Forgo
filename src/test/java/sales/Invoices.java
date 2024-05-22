package sales;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import forgo.genericUtility.BaseClass;

public class Invoices extends BaseClass {

	@Test(description="Details")
	public void TC55() throws InterruptedException{
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[5]")).click();
		driver.findElement(By.xpath("//span[text()='Sales Order']")).click();
		driver.findElement(By.xpath("//span[text()='My Sales']")).click();
		driver.findElement(By.xpath("//span[text()='Add Filters']")).click();
		driver.findElement(By.xpath("//input[@class='ant-input ant-input-lg']")).sendKeys("SO_01222");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//tbody[@class='ant-table-tbody']")).click();
	}
	@Test(description="Details Invoices")
	public void TC56() throws InterruptedException{
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[5]")).click();
		driver.findElement(By.xpath("//span[text()='Sales Order']")).click();
		driver.findElement(By.xpath("//span[text()='Invoices']")).click();
		driver.findElement(By.xpath("//span[text()='My Invoices']")).click();

	}
	@Test(description="Creat New Invoice")
	public void TC57() throws InterruptedException{
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[5]")).click();
		driver.findElement(By.xpath("//span[text()='Sales Order']")).click();
		driver.findElement(By.xpath("//span[text()='Invoices']")).click();
		driver.findElement(By.xpath("//span[text()='My Invoices']")).click();
		driver.findElement(By.xpath("//span[text()='Add New']")).click();
		WebElement customerInfoElement = driver.findElement(By.xpath("(//input[@class='ant-select-selection-search-input'])[2]"));
		customerInfoElement.click();
		customerInfoElement.sendKeys("anjali tiwari");
		customerInfoElement.sendKeys(Keys.ARROW_DOWN);
		customerInfoElement.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("(//input[@class='ant-input pp-form-input'])[2]")).sendKeys("123");
		WebElement paymentTermsElents=driver.findElement(By.xpath("(//input[@class='ant-select-selection-search-input'])[3]"));
		paymentTermsElents.click();
		paymentTermsElents.sendKeys("Daily");
		paymentTermsElents.sendKeys(Keys.ARROW_DOWN);
		paymentTermsElents.sendKeys(Keys.ENTER);
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(1000);
		WebElement categoryElement=driver.findElement(By.xpath("(//input[@class='ant-select-selection-search-input'])[4]"));
		categoryElement.click();
		categoryElement.sendKeys("bill category");
		categoryElement.sendKeys(Keys.ARROW_DOWN);
		categoryElement.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		WebElement itemDetailElement=driver.findElement(By.xpath("(//input[@class='ant-select-selection-search-input'])[5]"));
		itemDetailElement.click();
		itemDetailElement.sendKeys("tarun1414");
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
		driver.findElement(By.xpath("//button[@id='save']")).click();


	}
	@Test(description="Add Filters")
	public void TC58() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[5]")).click();
		driver.findElement(By.xpath("//span[text()='Sales Order']")).click();
		driver.findElement(By.xpath("//span[text()='Invoices']")).click();
		driver.findElement(By.xpath("//span[text()='My Invoices']")).click();
		driver.findElement(By.xpath("//span[text()='Add Filters']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Pending approval']")).click();

		List<WebElement> actualStatusElements = driver.findElements(By.xpath("//div[@class='status status_pending approval']"));

		if (!actualStatusElements.isEmpty()) {
			System.out.println("Pending approval status elements found:");
			for (WebElement actualCurrentStatusElement : actualStatusElements) {
				System.out.println("Size: " + actualCurrentStatusElement.getSize());
				System.out.println("Text: " + actualCurrentStatusElement.getText());
			}
		}

		else {
			System.out.println("No pending approval status elements found.");
		}
	}

	@Test(description="invoice number")
	public void TC59() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[5]")).click();

		driver.findElement(By.xpath("//span[text()='Sales Order']")).click();
		driver.findElement(By.xpath("//span[text()='Invoices']")).click();
		driver.findElement(By.xpath("//span[text()='My Invoices']")).click();
		WebElement searchBox = driver.findElement(By.xpath("//input[@class='ant-input ant-input-lg']"));
		searchBox.sendKeys("INV_0209");
		Thread.sleep(1000);
		List<WebElement> invoiceElements = driver.findElements(By.xpath("//input[@class=\\\"ant-input ant-input-lg\\\"]"));

		boolean invoiceFound = false;
		for (WebElement invoiceElement : invoiceElements) {
			String invoiceNumber = invoiceElement.getText();
			if (invoiceNumber.equals("INV_0209")) {
				invoiceFound = true;
				break; 
			}
		}

		if (invoiceFound) {
			System.out.println("Invoice with number 'INV_0232' found.");
		} else {
			System.out.println("Invoice with number 'INV_0232' not found.");
		}

	}

	@Test(description="customer name")
	public void TC60() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[5]")).click();
		navigateToMyInvoicesPage();

		WebElement searchBox = driver.findElement(By.xpath("//input[@class='ant-input ant-input-lg']"));
		searchBox.sendKeys("anil");
		List<WebElement> invoiceElements = driver.findElements(By.xpath("(//td[@class='ant-table-cell ant-table-cell-row-hover'])[2]"));
		boolean invoiceFound = false;
		for (WebElement invoiceElement : invoiceElements) {
			String invoiceNumber = invoiceElement.getText();
			if (invoiceNumber.equals("anil")) {
				invoiceFound = true;
				break;
			}
		}

		if (invoiceFound) {
			System.out.println("Invoice with number 'anil' found.");
		} else {
			System.out.println("Invoice with number 'anil' not found.");
		}
	}

	private void navigateToMyInvoicesPage() {
		driver.findElement(By.xpath("//span[text()='Sales Order']")).click();
		driver.findElement(By.xpath("//span[text()='Invoices']")).click();
		driver.findElement(By.xpath("//span[text()='My Invoices']")).click();
	}



	@Test(description="SO number")
	public void TC61() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[5]")).click();
		driver.findElement(By.xpath("//span[text()='Sales Order']")).click();
		driver.findElement(By.xpath("//span[text()='Invoices']")).click();
		driver.findElement(By.xpath("//span[text()='My Invoices']")).click();
		WebElement searchBox = driver.findElement(By.xpath("//input[@class=\"ant-input ant-input-lg\"]"));
		searchBox.sendKeys("111");
		

	}
	@Test(description="Date")
	public void TC62() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[5]")).click();
		driver.findElement(By.xpath("//span[text()='Sales Order']")).click();
		driver.findElement(By.xpath("//span[text()='Invoices']")).click();
		driver.findElement(By.xpath("//span[text()='My Invoices']")).click();
		driver.findElement(By.xpath("//span[@class='anticon anticon-ellipsis pp-icon-25']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@class='ant-dropdown-menu-title-content'])[3]")).click();	
	}

	@Test(description="Due Date")
	public void TC63() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[5]")).click();
		driver.findElement(By.xpath("//span[text()='Sales Order']")).click();
		driver.findElement(By.xpath("//span[text()='Invoices']")).click();
		driver.findElement(By.xpath("//span[text()='My Invoices']")).click();
		driver.findElement(By.xpath("//span[@class='anticon anticon-ellipsis pp-icon-25']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@class='ant-dropdown-menu-title-content'])[4]")).click();	
	}
	@Test(description="Amount")
	public void TC64() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[5]")).click();
		driver.findElement(By.xpath("//span[text()='Sales Order']")).click();
		driver.findElement(By.xpath("//span[text()='Invoices']")).click();
		driver.findElement(By.xpath("//span[text()='My Invoices']")).click();
		driver.findElement(By.xpath("//span[@class='anticon anticon-ellipsis pp-icon-25']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Amount']")).click();	
	}
	@SuppressWarnings("unused")
	@Test(description="more option")
	public void TC65() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[5]")).click();
		driver.findElement(By.xpath("//span[text()='Sales Order']")).click();
		driver.findElement(By.xpath("//span[text()='Invoices']")).click();
		driver.findElement(By.xpath("//span[text()='My Invoices']")).click();
		driver.findElement(By.xpath("(//tr[@class='ant-table-row ant-table-row-level-0'])[1]")).click();
		WebElement invoiceElement = driver.findElement(By.xpath("//li[@class='active']"));
		List<WebElement> invoicesElements = Collections.singletonList(invoiceElement);
		for(WebElement invoicesElement:invoicesElements);
		System.out.println(invoiceElement.getText());
	}
	@Test(description="Send mail")
	public void TC66() throws InterruptedException, IOException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[5]")).click();
		driver.findElement(By.xpath("//span[text()='Sales Order']")).click();
		driver.findElement(By.xpath("//span[text()='Invoices']")).click();
		driver.findElement(By.xpath("//span[text()='My Invoices']")).click();
		driver.findElement(By.xpath("(//tr[@class='ant-table-row ant-table-row-level-0'])[1]")).click();
		WebElement dropDownsElement = driver.findElement(By.xpath("(//div[@class='ant-space-item'])[1]")); 
		dropDownsElement.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Send Email']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver, "Send Mail");

	}
	@Test(description="clone")
	public void TC67() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[5]")).click();
		driver.findElement(By.xpath("//span[text()='Sales Order']")).click();
		driver.findElement(By.xpath("//span[text()='Invoices']")).click();
		driver.findElement(By.xpath("//span[text()='My Invoices']")).click();
		driver.findElement(By.xpath("(//tr[@class='ant-table-row ant-table-row-level-0'])[1]")).click();
		WebElement dropDownsElement = driver.findElement(By.xpath("(//div[@class='ant-space-item'])[1]")); 
		dropDownsElement.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Clone']")).click();
		Thread.sleep(3000);
		try {
			File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshotFile, new File("C:\\Users\\koppu\\Downloads\\Selenium Screen shots\\clone.jpg"));
			System.out.println("Screenshot saved successfully!");
		} catch (Exception e) {
			System.out.println("Failed to capture screenshot: " + e.getMessage());
		}

	}
	@Test(description="Delete")
	public void TC68() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[5]")).click();
		driver.findElement(By.xpath("//span[text()='Sales Order']")).click();
		driver.findElement(By.xpath("//span[text()='Invoices']")).click();
		driver.findElement(By.xpath("//span[text()='My Invoices']")).click();
		driver.findElement(By.xpath("(//tr[@class='ant-table-row ant-table-row-level-0'])[1]")).click();
		Thread.sleep(2000);
		WebElement dropDownsElement = driver.findElement(By.xpath("(//div[@class='ant-space-item'])[1]")); 
		dropDownsElement.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Delete']")).click();
		//driver.findElement(By.xpath("//span[text()='Confirm']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Cancel']")).click();

		Thread.sleep(500);
		try {
			File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshotFile, new File("C:\\Users\\koppu\\Downloads\\Selenium Screen shots\\delete.jpg"));
			System.out.println("Screenshot saved successfully!");
		} catch (Exception e) {
			System.out.println("Failed to capture screenshot: " + e.getMessage());
		}

	}
	@Test(description="Delete")
	public void TC69() throws InterruptedException, IOException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[5]")).click();
		driver.findElement(By.xpath("//span[text()='Sales Order']")).click();
		driver.findElement(By.xpath("//span[text()='Invoices']")).click();
		driver.findElement(By.xpath("//span[text()='My Invoices']")).click();
		driver.findElement(By.xpath("(//tr[@class='ant-table-row ant-table-row-level-0'])[1]")).click();
		WebElement dropDownsElement = driver.findElement(By.xpath("(//div[@class='ant-space-item'])[1]")); 
		dropDownsElement.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Delete']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Confirm']")).click();
		Thread.sleep(5000);
		wUtil.takeScreenShot(driver, "Invoices Approvals"+jUtil.getSystemDateInFormat());
		Thread.sleep(1000);
	}

	@Test(description="Approvals")
	public void TC70() throws InterruptedException, IOException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[5]")).click();
		driver.findElement(By.xpath("//span[text()='Sales Order']")).click();
		driver.findElement(By.xpath("//span[text()='Invoices']")).click();
		driver.findElement(By.xpath("//span[text()='My Invoices']")).click();
		driver.findElement(By.xpath("//span[text()='Approvals']")).click();
		driver.findElement(By.xpath("//span[text()='Add Filters']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Pending approval']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='status status_pending_approval'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='approve']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Cancel']")).click();
		Thread.sleep(5000);
		wUtil.takeScreenShot(driver, "Invoices Approvals"+jUtil.getSystemDateInFormat());
		Thread.sleep(1000);
	}
	@Test(description="To Verify invoice  details")
	public void TC71() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[5]")).click();
		driver.findElement(By.xpath("//span[text()='Sales Order']")).click();
		driver.findElement(By.xpath("//span[text()='Invoices']")).click();
		driver.findElement(By.xpath("//span[text()='My Invoices']")).click();
		driver.findElement(By.xpath("(//tr[@class='ant-table-row ant-table-row-level-0'])[1]")).click();
		try {
			File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshotFile, new File("C:\\Users\\koppu\\Downloads\\Selenium Screen shots\\invoicedetails.jpg"));
			System.out.println("Aprove screenshot saved successfully!");
		} catch (Exception e) {
			System.out.println("Failed to capture screenshot: " + e.getMessage());
		}
	}

	@Test(description="To Verify invoice Items")
	public void TC72() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[5]")).click();
		driver.findElement(By.xpath("//span[text()='Sales Order']")).click();
		driver.findElement(By.xpath("//span[text()='Invoices']")).click();
		driver.findElement(By.xpath("//span[text()='My Invoices']")).click();
		driver.findElement(By.xpath("(//tr[@class='ant-table-row ant-table-row-level-0'])[1]")).click();
		driver.findElement(By.xpath("//li[contains(text(),'Items')]")).click();
		try {
			File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshotFile, new File("C:\\Users\\koppu\\Downloads\\Selenium Screen shots\\invoice-Items.jpg"));
			System.out.println("Aprove screenshot saved successfully!");
		} catch (Exception e) {
			System.out.println("Failed to capture screenshot: " + e.getMessage());
		}
	}
	@Test(description="To Verify invoice PaymentsMade")
	public void TC73() throws InterruptedException, IOException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[5]")).click();
		driver.findElement(By.xpath("//span[text()='Sales Order']")).click();
		driver.findElement(By.xpath("//span[text()='Invoices']")).click();
		driver.findElement(By.xpath("//span[text()='My Invoices']")).click();
		driver.findElement(By.xpath("(//tr[@class='ant-table-row ant-table-row-level-0'])[1]")).click();
		driver.findElement(By.xpath("//li[contains(text(),'Payment Made')]")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver, "Payments Made"+jUtil.getSystemDateInFormat());
	}
	@Test(description="To Verify invoice Comments")
	public void TC74() throws InterruptedException, IOException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[5]")).click();
		driver.findElement(By.xpath("//span[text()='Sales Order']")).click();
		driver.findElement(By.xpath("//span[text()='Invoices']")).click();
		driver.findElement(By.xpath("//span[text()='My Invoices']")).click();
		driver.findElement(By.xpath("(//tr[@class='ant-table-row ant-table-row-level-0'])[1]")).click();
		driver.findElement(By.xpath("//li[contains(text(),'Comments')]")).click();
		driver.findElement(By.xpath("//input[@class='ant-input'] ")).sendKeys("xcb");
		driver.findElement(By.xpath("//button[@class='ant-btn ant-btn-default formButton ml1'] ")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver, "invoice Comments"+jUtil.getSystemDateInFormat());
	}
	@Test(description="To Verify invoice History")
	public void TC75() throws InterruptedException, IOException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[5]")).click();
		driver.findElement(By.xpath("//span[text()='Sales Order']")).click();
		driver.findElement(By.xpath("//span[text()='Invoices']")).click();
		driver.findElement(By.xpath("//span[text()='My Invoices']")).click();
		driver.findElement(By.xpath("(//tr[@class='ant-table-row ant-table-row-level-0'])[1]")).click();
		driver.findElement(By.xpath("//li[contains(text(),'History')]")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver, "invoice history"+jUtil.getSystemDateInFormat());

	}
	@Test(description="To Verify pending approval filters")
	public void TC76() throws InterruptedException, IOException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[5]")).click();
		driver.findElement(By.xpath("//span[text()='Sales Order']")).click();
		driver.findElement(By.xpath("//span[text()='Invoices']")).click();
		driver.findElement(By.xpath("//span[text()='My Invoices']")).click();
		driver.findElement(By.xpath("//span[text()='Add Filters']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Pending approval']")).click();
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.querySelector(\"div[style$='overflow: auto hidden;']\").scrollLeft= 150");
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver, "Pending Approval");
		
	}
	@Test(description="To Verify approved filters")
	public void TC77() throws InterruptedException, IOException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[5]")).click();
		driver.findElement(By.xpath("//span[text()='Sales Order']")).click();
		driver.findElement(By.xpath("//span[text()='Invoices']")).click();
		driver.findElement(By.xpath("//span[text()='My Invoices']")).click();
		driver.findElement(By.xpath("//span[text()='Add Filters']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Approved']")).click();
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.querySelector(\"div[style$='overflow: auto hidden;']\").scrollLeft= 150");
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver, "Approved");
		
	}

	@Test(description="To Verify Overdue filters")
	public void TC78() throws InterruptedException, IOException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[5]")).click();
		driver.findElement(By.xpath("//span[text()='Sales Order']")).click();
		driver.findElement(By.xpath("//span[text()='Invoices']")).click();
		driver.findElement(By.xpath("//span[text()='My Invoices']")).click();
		driver.findElement(By.xpath("//span[text()='Add Filters']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Overdue']")).click();
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.querySelector(\"div[style$='overflow: auto hidden;']\").scrollLeft= 150");
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver, "Overdue");
		
	}
	
	@Test(description="To Verify Rejected filters")
	public void TC79() throws InterruptedException, IOException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[5]")).click();
		driver.findElement(By.xpath("//span[text()='Sales Order']")).click();
		driver.findElement(By.xpath("//span[text()='Invoices']")).click();
		driver.findElement(By.xpath("//span[text()='My Invoices']")).click();
		driver.findElement(By.xpath("//span[text()='Add Filters']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Rejected']")).click();
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.querySelector(\"div[style$='overflow: auto hidden;']\").scrollLeft= 150");
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver, "Rejected");
		
	}
	@Test(description="To Verify Unsubmitted filters")
	public void TC80() throws InterruptedException, IOException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[5]")).click();
		driver.findElement(By.xpath("//span[text()='Sales Order']")).click();
		driver.findElement(By.xpath("//span[text()='Invoices']")).click();
		driver.findElement(By.xpath("//span[text()='My Invoices']")).click();
		driver.findElement(By.xpath("//span[text()='Add Filters']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Unsubmitted']")).click();
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.querySelector(\"div[style$='overflow: auto hidden;']\").scrollLeft= 150");
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver, "Unsubmitted");
		
	}
	
	//Approvals from Invoices
	
	
	
	@Test(description="To Verify pending approval filters")
	public void TC81() throws InterruptedException, IOException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[5]")).click();
		driver.findElement(By.xpath("//span[text()='Sales Order']")).click();
		driver.findElement(By.xpath("//span[text()='Invoices']")).click();
		driver.findElement(By.xpath("//span[text()='Add Filters']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Pending approval']")).click();
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.querySelector(\"div[style$='overflow: auto hidden;']\").scrollLeft= 150");
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver, "Pending Approval-Approvals");
		
	}
	@Test(description="To Verify pending approval filters")
	public void TC82() throws InterruptedException, IOException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[5]")).click();
		driver.findElement(By.xpath("//span[text()='Sales Order']")).click();
		driver.findElement(By.xpath("//span[text()='Invoices']")).click();
		driver.findElement(By.xpath("//span[text()='Add Filters']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Approved']")).click();
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.querySelector(\"div[style$='overflow: auto hidden;']\").scrollLeft= 150");
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver, "Approved-Approvals");
		
	}
	@Test(description="To Verify pending approval filters")
	public void TC83() throws InterruptedException, IOException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[5]")).click();
		driver.findElement(By.xpath("//span[text()='Sales Order']")).click();
		driver.findElement(By.xpath("//span[text()='Invoices']")).click();
		driver.findElement(By.xpath("//span[text()='Add Filters']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Overdue']")).click();
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.querySelector(\"div[style$='overflow: auto hidden;']\").scrollLeft= 150");
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver, "Overdue-Approvals");
		
	}
	@Test(description="To Verify pending approval filters")
	public void TC84() throws InterruptedException, IOException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[5]")).click();
		driver.findElement(By.xpath("//span[text()='Sales Order']")).click();
		driver.findElement(By.xpath("//span[text()='Invoices']")).click();
		driver.findElement(By.xpath("//span[text()='Add Filters']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Rejected']")).click();
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.querySelector(\"div[style$='overflow: auto hidden;']\").scrollLeft= 150");
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver, "Rejected-Approvals");
		
	}
	@Test(description="To Verify Approval search for Invoices")
	public void TC85() throws InterruptedException, IOException{
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[5]")).click();
		driver.findElement(By.xpath("//span[text()='Sales Order']")).click();
		driver.findElement(By.xpath("//span[text()='Invoices']")).click();
		WebElement searchElement=driver.findElement(By.xpath("//input[@class='ant-input ant-input-lg']"));
		searchElement.sendKeys("07667");
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"Search by RF_num");
		searchElement.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		Thread.sleep(1000);
		searchElement.sendKeys("anil");
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"Search by cutomer_name");
		Thread.sleep(1000);
		searchElement.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		Thread.sleep(1000);
		searchElement.sendKeys("DC_03");
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"Search by DC");	
	}
	@Test(description="To Verify sort invoices")
	public void TC86() throws InterruptedException, IOException{
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[5]")).click();
		driver.findElement(By.xpath("//span[text()='Sales Order']")).click();
		driver.findElement(By.xpath("//span[text()='Invoices']")).click();
		driver.findElement(By.xpath("//span[@class='anticon anticon-ellipsis pp-icon-25']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Date']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"Approval-sort  by date");
		driver.findElement(By.xpath("//span[@class='anticon anticon-ellipsis pp-icon-25']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Due Date']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"Approval-sort  by Due Date");
		driver.findElement(By.xpath("//span[@class='anticon anticon-ellipsis pp-icon-25']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Amount']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"Approval-sort  by amount");
		Thread.sleep(10000);

}


	

}

