package sales;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import forgo.genericUtility.BaseClass;
//import io.github.bonigarcia.wdm.WebDriverManager;
public class Delivery_Chalana extends BaseClass {

	@Test(description="Creat Delivery Challan")
	public void TC77() throws InterruptedException{
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[5]")).click();
		driver.findElement(By.xpath("//span[text()='Delivery Challan']")).click();
		driver.findElement(By.xpath("//span[text()='My Delivery']")).click();
		driver.findElement(By.xpath("//span[text()='Add New']")).click();
		WebElement customerInfoElement = driver.findElement(By.xpath("(//input[@class='ant-select-selection-search-input'])[2]"));
		customerInfoElement.click();
		customerInfoElement.sendKeys("anjali tiwari");
		customerInfoElement.sendKeys(Keys.ARROW_DOWN);
		customerInfoElement.sendKeys(Keys.ENTER);
		WebElement deliveryChallanElement=driver.findElement(By.xpath("(//input[@class='ant-input pp-form-input'])[1]"));
		deliveryChallanElement.click();
		Thread.sleep(1000);
		deliveryChallanElement.sendKeys("12121");         
		Thread.sleep(1000);
		WebElement soNumberElement=driver.findElement(By.xpath("(//input[@class='ant-input pp-form-input'])[2]"));
		soNumberElement.click();
		soNumberElement.sendKeys("07667");
		driver.findElement(By.xpath("//input[@name='challan_date']")).click();
		Thread.sleep(1000); 
		driver.findElement(By.xpath("//a[text()='Today']")).click();
		Thread.sleep(1000); 
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement saveElement=driver.findElement(By.xpath("//span[text()='Save']"));
		js.executeScript("arguments[0].scrollIntoView(true);", saveElement);
		Thread.sleep(1000);
		WebElement challanaTypeElement=driver.findElement(By.name("challan_type"));
		challanaTypeElement.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Supply on Approvals']")).click();
		driver.findElement(By.name("ware_house_detail_id")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='amazon']")).click();
		WebElement itemDetailsElement=driver.findElement(By.xpath("(//input[@class='ant-select-selection-search-input'])[5]"));
		itemDetailsElement.click();
		itemDetailsElement.sendKeys("tarun1414");
		itemDetailsElement.sendKeys(Keys.ARROW_DOWN);
		itemDetailsElement.sendKeys(Keys.ENTER);
		driver.findElement(By.name("items.0.quantity")).sendKeys("1");
		driver.findElement(By.name("items.0.discount_percentage")).sendKeys("15");
		driver.findElement(By.xpath("//span[text()='Save']")).click();
		Thread.sleep(1000);
		try {
			File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshotFile, new File("C:\\Users\\koppu\\Downloads\\Selenium Screen shots\\DC-Creating.jpg"));
			System.out.println("Aprove screenshot saved successfully!");
		} catch (Exception e) {
			System.out.println("Failed to capture screenshot: " + e.getMessage());
		}

	}
	@Test(description="	To verify user is able to search the DC by reference number")
	public void TC78() throws InterruptedException{
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[5]")).click();
		driver.findElement(By.xpath("//span[text()='Delivery Challan']")).click();
		driver.findElement(By.xpath("//span[text()='My Delivery']")).click();
		driver.findElement(By.xpath("//input[@id='search-input']")).sendKeys("07667");
		Thread.sleep(1000);
		try {
			File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshotFile, new File("C:\\Users\\koppu\\Downloads\\Selenium Screen shots\\Dc searsch by reference NO.jpg"));
			System.out.println("Aprove screenshot saved successfully!");
		} catch (Exception e) {
			System.out.println("Failed to capture screenshot: " + e.getMessage());
		}

	}
	@Test(description="	To verify user is able to search the Credit Note by customer name")
	public void TC79() throws InterruptedException{
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[5]")).click();
		driver.findElement(By.xpath("//span[text()='Delivery Challan']")).click();
		driver.findElement(By.xpath("//span[text()='My Delivery']")).click();
		driver.findElement(By.xpath("//input[@id='search-input']")).sendKeys("anil");
		Thread.sleep(1000);
		try {
			File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshotFile, new File("C:\\Users\\koppu\\Downloads\\Selenium Screen shots\\Dc search by customer name.jpg"));
			System.out.println("Aprove screenshot saved successfully!");
		} catch (Exception e) {
			System.out.println("Failed to capture screenshot: " + e.getMessage());
		}

	}
	@Test(description="	To verify user is able to search the Credit Note by Delivery Chalana NO")
	public void TC80() throws InterruptedException{
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[5]")).click();
		driver.findElement(By.xpath("//span[text()='Delivery Challan']")).click();
		driver.findElement(By.xpath("//span[text()='My Delivery']")).click();
		driver.findElement(By.xpath("//input[@id='search-input']")).sendKeys("DC_05");
		Thread.sleep(1000);
		try {
			File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshotFile, new File("C:\\Users\\koppu\\Downloads\\Selenium Screen shots\\Dc search by Delivery Chalana NO.jpg"));
			System.out.println("Aprove screenshot saved successfully!");
		} catch (Exception e) {
			System.out.println("Failed to capture screenshot: " + e.getMessage());
		}
	}	
	@Test(description="	To verify user is able to search the Credit Note after applied any sort option")
	public void TC81() throws InterruptedException{
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[5]")).click();
		driver.findElement(By.xpath("//span[text()='Delivery Challan']")).click();
		driver.findElement(By.xpath("//span[text()='My Delivery']")).click();
		driver.findElement(By.xpath("//span[@class='anticon anticon-ellipsis pp-icon-25']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Date']")).click();
		Thread.sleep(1000);
		try {
			File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshotFile, new File("C:\\Users\\koppu\\Downloads\\Selenium Screen shots\\Dc Sort by date.jpg"));
			System.out.println("Aprove screenshot saved successfully!");
		} catch (Exception e) {
			System.out.println("Failed to capture screenshot: " + e.getMessage());
		}

	}
	@Test(description="	To Verify the detail page of Credit Note")
	public void TC82() throws InterruptedException{
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[5]")).click();
		driver.findElement(By.xpath("//span[text()='Delivery Challan']")).click();
		driver.findElement(By.xpath("//span[text()='My Delivery']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//tr[@class='ant-table-row ant-table-row-level-0'])[1]")).click();
		Thread.sleep(1000);
		try {
			File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshotFile, new File("C:\\Users\\koppu\\Downloads\\Selenium Screen shots\\Dc detail page.jpg"));
			System.out.println("Aprove screenshot saved successfully!");
		} catch (Exception e) {
			System.out.println("Failed to capture screenshot: " + e.getMessage());
		}
	}
	@Test(description="	To Verify that user is able to Edit the Existing Credit Note")
	public void TC83() throws InterruptedException{
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[5]")).click();
		driver.findElement(By.xpath("//span[text()='Delivery Challan']")).click();
		driver.findElement(By.xpath("//span[text()='My Delivery']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//tr[@class='ant-table-row ant-table-row-level-0'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Edit']")).click();
		Thread.sleep(1000);

		try {
			File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshotFile, new File("C:\\Users\\koppu\\Downloads\\Selenium Screen shots\\Edit DC.jpg"));
			System.out.println("Aprove screenshot saved successfully!");
		} catch (Exception e) {
			System.out.println("Failed to capture screenshot: " + e.getMessage());
		}
	}
	@Test(description="	To verify Submit Button")
	public void TC84() throws InterruptedException{
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[5]")).click();
		driver.findElement(By.xpath("//span[text()='Delivery Challan']")).click();
		driver.findElement(By.xpath("//span[text()='My Delivery']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//tr[@class='ant-table-row ant-table-row-level-0'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Submit']")).click();
		Thread.sleep(1000);

		try {
			File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshotFile, new File("C:\\Users\\koppu\\Downloads\\Selenium Screen shots\\submit button .jpg"));
			System.out.println("Aprove screenshot saved successfully!");
		} catch (Exception e) {
			System.out.println("Failed to capture screenshot: " + e.getMessage());
		}
	}
	@Test(description="	To Verify Items Tab in Credit Note Detail Page")
	public void TC85() throws InterruptedException{
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[5]")).click();
		driver.findElement(By.xpath("//span[text()='Delivery Challan']")).click();
		driver.findElement(By.xpath("//span[text()='My Delivery']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//tr[@class='ant-table-row ant-table-row-level-0'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[text()='Items']")).click();
		Thread.sleep(1000);

		try {
			File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshotFile, new File("C:\\Users\\koppu\\Downloads\\Selenium Screen shots\\DC-Item Tab  .jpg"));
			System.out.println("Aprove screenshot saved successfully!");
		} catch (Exception e) {
			System.out.println("Failed to capture screenshot: " + e.getMessage());
		}


	}
	@Test(description="	To Verify Comments Tab in Credit Note Detail Page")
	public void TC86() throws InterruptedException{
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[5]")).click();
		driver.findElement(By.xpath("//span[text()='Delivery Challan']")).click();
		driver.findElement(By.xpath("//span[text()='My Delivery']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//tr[@class='ant-table-row ant-table-row-level-0'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[text()='Comments']")).click();
		driver.findElement(By.xpath("//input[@class='ant-input']")).sendKeys("asdf");
		driver.findElement(By.xpath("//span[text()='Send']")).click();
		Thread.sleep(1000);

		try {
			File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshotFile, new File("C:\\Users\\koppu\\Downloads\\Selenium Screen shots\\DC-Comment Tab  .jpg"));
			System.out.println("Aprove screenshot saved successfully!");
		} catch (Exception e) {
			System.out.println("Failed to capture screenshot: " + e.getMessage());
		}


	}
	@Test(description="To Verify History Tab in Credit Note Detail Page")
	public void TC87() throws InterruptedException{
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[5]")).click();
		driver.findElement(By.xpath("//span[text()='Delivery Challan']")).click();
		driver.findElement(By.xpath("//span[text()='My Delivery']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//tr[@class='ant-table-row ant-table-row-level-0'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[text()='History']")).click();
		Thread.sleep(1000);

		try {
			File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshotFile, new File("C:\\Users\\koppu\\Downloads\\Selenium Screen shots\\DC-History  Tab  .jpg"));
			System.out.println("Aprove screenshot saved successfully!");
		} catch (Exception e) {
			System.out.println("Failed to capture screenshot: " + e.getMessage());
		}


	}
	@Test(description="To Verify filter")
	public void TC88() throws InterruptedException{
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[5]")).click();
		driver.findElement(By.xpath("//span[text()='Delivery Challan']")).click();
		driver.findElement(By.xpath("//span[text()='My Delivery']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Add Filters']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@class='ant-dropdown-menu-title-content'])[3]")).click();
		Thread.sleep(1000);
		try {
			File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshotFile, new File("C:\\Users\\koppu\\Downloads\\Selenium Screen shots\\DC-Filters Tab  .jpg"));
			System.out.println("Aprove screenshot saved successfully!");
		}
		catch (Exception e) {
			System.out.println("Failed to capture screenshot: " + e.getMessage());
		}
	}
		@Test(description="To Verify Approval filters for DC")
		public void TC89() throws InterruptedException, IOException{
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[5]")).click();
			driver.findElement(By.xpath("//span[text()='Delivery Challan']")).click();
			driver.findElement(By.xpath("(//span[text()='Add Filters'])[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//span[text()='Approved']")).click();
			wUtil.takeScreenShot(driver,"Approved");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[text()='Approved']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[text()='Pending Approval']")).click();
			wUtil.takeScreenShot(driver,"Pending Approval");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[text()='Pending Approval']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[text()='Rejected']")).click();
			wUtil.takeScreenShot(driver,"Rejected");
			Thread.sleep(2000);
	
	}
		@Test(description="To Verify Approval search for DC")
		public void TC90() throws InterruptedException, IOException{
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[5]")).click();
			driver.findElement(By.xpath("//span[text()='Delivery Challan']")).click();
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
		@Test(description="To Verify sort DC")
		public void TC91() throws InterruptedException, IOException{
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[5]")).click();
			driver.findElement(By.xpath("//span[text()='Delivery Challan']")).click();
			driver.findElement(By.xpath("//span[@class='anticon anticon-ellipsis pp-icon-25']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//span[text()='Date']")).click();
			Thread.sleep(1000);
			wUtil.takeScreenShot(driver,"sort  by date");	

}
		@Test(description="To Verify detail page for DC approval")
		public void TC92() throws InterruptedException, IOException{
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[5]")).click();
			driver.findElement(By.xpath("//span[text()='Delivery Challan']")).click();
			driver.findElement(By.xpath("//div[@class='status status_pending_approval']")).click();
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
		@Test(description="To Verify Approve and Reject for DC approval")
		public void TC93() throws InterruptedException, IOException{
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[5]")).click();
			driver.findElement(By.xpath("//span[text()='Delivery Challan']")).click();
			driver.findElement(By.xpath("//div[@class='status status_pending_approval']")).click();
			/*driver.findElement(By.xpath("//span[text()='Approve']")).click();
			Thread.sleep(1000);
			wUtil.takeScreenShot(driver,"Approval for DC");*/
			driver.findElement(By.xpath("//span[text()='Reject']")).click();
			Thread.sleep(1000);
			wUtil.takeScreenShot(driver,"Reject for DC");
			driver.findElement(By.xpath("(//span[text()='Cancel'])[1]")).click();
		
		}
}

