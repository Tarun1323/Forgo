package sales;

import java.io.File;
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
		WebElement searchBox = driver.findElement(By.xpath("//input[@class='ant-input ant-input-lg']"));
		searchBox.sendKeys("INV_0232");
		List<WebElement> invoiceElements = driver.findElements(By.xpath("//td[@class='ant-table-cell']"));

		boolean invoiceFound = false;
		for (WebElement invoiceElement : invoiceElements) {
			String invoiceNumber = invoiceElement.getText();
			if (invoiceNumber.equals("INV_0232")) {
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
		WebElement searchBox = driver.findElement(By.xpath("//td[@class='ant-table-cell ant-table-cell-row-hover']"));
		searchBox.sendKeys("5356");
		List<WebElement> invoiceElements = driver.findElements(By.xpath("//td[@class='ant-table-cell']"));
		System.out.println(invoiceElements.get(2));

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
	public void TC66() throws InterruptedException {
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
		try {
			File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshotFile, new File("C:\\Users\\koppu\\Downloads\\Selenium Screen shots\\sendmail.jpg"));
			System.out.println("Screenshot saved successfully!");
		} catch (Exception e) {
			System.out.println("Failed to capture screenshot: " + e.getMessage());
		}

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
		WebElement dropDownsElement = driver.findElement(By.xpath("(//div[@class='ant-space-item'])[1]")); 
		dropDownsElement.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Delete']")).click();
		driver.findElement(By.xpath("//span[text()='Confirm']")).click();
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
	public void TC69() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[text()='Confirm']")).click();
		Thread.sleep(500);
		try {
			File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshotFile, new File("C:\\Users\\koppu\\Downloads\\Selenium Screen shots\\delete.jpg"));
			System.out.println("Screenshot saved successfully!");
		} catch (Exception e) {
			System.out.println("Failed to capture screenshot: " + e.getMessage());
		}
	}

	@Test(description="Approvals")
	public void TC70() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[5]")).click();
		driver.findElement(By.xpath("//span[text()='Sales Order']")).click();
		driver.findElement(By.xpath("//span[text()='Invoices']")).click();
		driver.findElement(By.xpath("//span[text()='My Invoices']")).click();
		driver.findElement(By.xpath("//span[text()='Approvals']")).click();
		driver.findElement(By.xpath("//div[@class='status status_pending_approval']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='approve']")).click();
		driver.findElement(By.xpath("//button[@class='ant-btn ant-btn-primary pp-main-button']")).click();

		try {
			File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshotFile, new File("C:\\Users\\koppu\\Downloads\\Selenium Screen shots\\Approve.jpg"));
			System.out.println("Aprove screenshot saved successfully!");
		} catch (Exception e) {
			System.out.println("Failed to capture screenshot: " + e.getMessage());
		}
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
	public void TC73() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[5]")).click();
		driver.findElement(By.xpath("//span[text()='Sales Order']")).click();
		driver.findElement(By.xpath("//span[text()='Invoices']")).click();
		driver.findElement(By.xpath("//span[text()='My Invoices']")).click();
		driver.findElement(By.xpath("(//tr[@class='ant-table-row ant-table-row-level-0'])[1]")).click();
		driver.findElement(By.xpath("//li[contains(text(),'Payment Made')]")).click();
		try {
			File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshotFile, new File("C:\\Users\\koppu\\Downloads\\Selenium Screen shots\\invoice-PaymentsMade.jpg"));
			System.out.println("Aprove screenshot saved successfully!");
		} catch (Exception e) {
			System.out.println("Failed to capture screenshot: " + e.getMessage());
		}
	}
	@Test(description="To Verify invoice Comments")
	public void TC74() throws InterruptedException {
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
		try {
			File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshotFile, new File("C:\\Users\\koppu\\Downloads\\Selenium Screen shots\\invoice-Comments.jpg"));
			System.out.println("Aprove screenshot saved successfully!");
		} catch (Exception e) {
			System.out.println("Failed to capture screenshot: " + e.getMessage());
		}
	}
	@Test(description="To Verify invoice History")
	public void TC75() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[5]")).click();
		driver.findElement(By.xpath("//span[text()='Sales Order']")).click();
		driver.findElement(By.xpath("//span[text()='Invoices']")).click();
		driver.findElement(By.xpath("//span[text()='My Invoices']")).click();
		driver.findElement(By.xpath("(//tr[@class='ant-table-row ant-table-row-level-0'])[1]")).click();
		driver.findElement(By.xpath("//li[contains(text(),'History')]")).click();
		try {
			File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshotFile, new File("C:\\Users\\koppu\\Downloads\\Selenium Screen shots\\invoice-History.jpg"));
			System.out.println("Aprove screenshot saved successfully!");
		} catch (Exception e) {
			System.out.println("Failed to capture screenshot: " + e.getMessage());
		}
	}
	@Test(description="To Verify Filters")
	public void TC76() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[5]")).click();
		driver.findElement(By.xpath("//span[text()='Sales Order']")).click();
		driver.findElement(By.xpath("//span[text()='Invoices']")).click();
		driver.findElement(By.xpath("//span[text()='My Invoices']")).click();
		driver.findElement(By.xpath("//span[text()='Add Filters']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Pending approval']")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.body.style.zoom='80%'");
		Thread.sleep(1000);
		try {
			File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshotFile, new File("C:\\Users\\koppu\\Downloads\\Selenium Screen shots\\invoice-Pending Approval.jpg"));
			System.out.println("Aprove screenshot saved successfully!");
		} catch (Exception e) {
			System.out.println("Failed to capture screenshot: " + e.getMessage());
		}


	}

}

