package expenses;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import forgo.genericUtility.BaseClass;

public class Advances extends BaseClass{
	
	//My Advances Scripts
	
	@Test(description = "Create_Adavance")
	public void ADV_TC_001() throws InterruptedException{
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[6]")).click();
		driver.findElement(By.xpath("//span[text()='Advances']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='My Advances']")).click();
		driver.findElement(By.xpath("//span[text()='Add New']")).click();
		driver.findElement(By.xpath("(//input[@class='ant-input'])[1]")).sendKeys("Automation Advance" + jUtil.generateRandomNumber(3));
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@class='ant-input'])[2]")).sendKeys(jUtil.generateRandomNumber(4));
		driver.findElement(By.id("advance_date")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Now']")).click();
		driver.findElement(By.xpath("(//input[@class='ant-input'])[3]")).sendKeys("Ref automation");
		driver.findElement(By.xpath("(//input[@class='ant-input'])[4]")).sendKeys("Auto Desc");
		driver.findElement(By.xpath("//span[text()='Save']")).click();
		//driver.findElement(By.xpath("//span[text()='Cancel']")).click();
		Thread.sleep(1000);
		String message = driver.findElement(By.xpath("//span[@class='messageText']")).getText();
		System.out.println(message);
		
	}
	
	@Test(description = "Edit_Adavance")
	public void ADV_TC_002() throws InterruptedException{
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[6]")).click();
		driver.findElement(By.xpath("//span[text()='Advances']")).click();
		driver.findElement(By.xpath("//span[text()='My Advances']")).click();
		driver.findElement(By.xpath("//span[text()='Add Filters']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Unsubmitted']")).click();
		driver.findElement(By.xpath("(//div[@class='status status_unsubmitted'])[1]")).click();
		driver.findElement(By.xpath("//button[text()='Edit']")).click();
		WebElement reference = driver.findElement(By.xpath("(//input[@class='ant-input'])[3]"));
		Thread.sleep(1000);
		reference.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		Thread.sleep(1000);
		reference.sendKeys("Ref automation"+ jUtil.generateRandomNumber(3));
		WebElement desc = driver.findElement(By.xpath("(//input[@class='ant-input'])[4]"));
		Thread.sleep(1000);
		desc.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		Thread.sleep(1000);
		desc.sendKeys("Auto Desc"+jUtil.generateRandomNumber(3));
		driver.findElement(By.xpath("//span[text()='Save']")).click();
		//driver.findElement(By.xpath("//span[text()='Cancel']")).click();
		Thread.sleep(1000);
		String message = driver.findElement(By.xpath("//span[@class='messageText']")).getText();
		System.out.println(message);
		
	}
	

	@Test(description = "Submit_Adavance")
	public void ADV_TC_003() throws InterruptedException{
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[6]")).click();
		driver.findElement(By.xpath("//span[text()='Advances']")).click();
		driver.findElement(By.xpath("//span[text()='My Advances']")).click();
		driver.findElement(By.xpath("//span[text()='Add Filters']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Unsubmitted']")).click();
		driver.findElement(By.xpath("(//div[@class='status status_unsubmitted'])[1]")).click();
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		Thread.sleep(1000);
		String message = driver.findElement(By.xpath("//span[@class='messageText']")).getText();
		System.out.println(message);
		
	}
	
	@Test(description = "Recall_Adavance")
	public void ADV_TC_004() throws InterruptedException{
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[6]")).click();
		driver.findElement(By.xpath("//span[text()='Advances']")).click();
		driver.findElement(By.xpath("//span[text()='My Advances']")).click();
		driver.findElement(By.xpath("//span[text()='Add Filters']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Pending Approval']")).click();
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
	
	@Test(description = "Download_Pdf_In_More_My_Advance")
	public void ADV_TC_005() throws InterruptedException {

		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[6]")).click();
		driver.findElement(By.xpath("//span[text()='Advances']")).click();
		driver.findElement(By.xpath("//span[text()='My Advances']")).click();
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
	
	@Test(description = "Add_Comments_In_My_Advances")
	public void ADV_TC_006() throws InterruptedException {
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[6]")).click();
		driver.findElement(By.xpath("//span[text()='Advances']")).click();
		driver.findElement(By.xpath("//span[text()='My Advances']")).click();
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
	
	
	@Test(description = "Add_To_Report_In_My_Advances")
	public void ADV_TC_007() throws InterruptedException {
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[6]")).click();
		driver.findElement(By.xpath("//span[text()='Advances']")).click();
		driver.findElement(By.xpath("//span[text()='My Advances']")).click();
		driver.findElement(By.xpath("//span[text()='Add Filters']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Approved']")).click();
		
		driver.findElement(By.xpath("(//div[@class='status status_approved'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Add To Report']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@class='ant-radio-input'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Add to  Report']")).click();
		Thread.sleep(1000);
		String message = driver.findElement(By.xpath("//span[@class='messageText']")).getText();
		System.out.println(message);

	}
	
	@Test(description = "Filters_In_My_Advances")
	public void ADV_TC_008() throws InterruptedException, IOException {
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[6]")).click();
		driver.findElement(By.xpath("//span[text()='Advances']")).click();
		driver.findElement(By.xpath("//span[text()='My Advances']")).click();
		driver.findElement(By.xpath("//span[text()='Add Filters']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Approved']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver, "Approved"+" "+jUtil.getSystemDateInFormat());
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Approved']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Pending Approval']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver, "Pending Approval"+" "+jUtil.getSystemDateInFormat());
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Pending Approval']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Recovered']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver, "Recovered"+" "+jUtil.getSystemDateInFormat());
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Recovered']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Pending Recovery']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver, "Pending Recovery"+" "+jUtil.getSystemDateInFormat());
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Pending Recovery']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Rejected']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver, "Rejected"+" "+jUtil.getSystemDateInFormat());
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Rejected']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Unsubmitted']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver, "Unsubmitted"+" "+jUtil.getSystemDateInFormat());
		
	}

	/**
	 * @throws InterruptedException
	 * @throws IOException
	 */
	@Test(description = "My_Advances_Search")
	public void ADV_TC_009() throws InterruptedException, IOException {

		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[6]")).click();
		driver.findElement(By.xpath("//span[text()='Advances']")).click();
		driver.findElement(By.xpath("//span[text()='My Advances']")).click();
		WebElement search = driver.findElement(By.xpath("//input[@id='search-input']"));
		search.sendKeys("25");
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver, "Search by Advance ID" + " " + jUtil.getSystemDateInFormat());
		search.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		Thread.sleep(1000);
		search.sendKeys("Edit");
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver, "Search by title" + " " + jUtil.getSystemDateInFormat());
		search.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		Thread.sleep(1000);
		
	}

	@Test(description = "My_Advances_Sort")
	public void ADV_TC_010() throws InterruptedException, IOException {

		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[6]")).click();
		driver.findElement(By.xpath("//span[text()='Advances']")).click();
		driver.findElement(By.xpath("//span[text()='My Advances']")).click();
		driver.findElement(By.xpath("//span[@class='anticon anticon-ellipsis pp-icon-25']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='amount']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver, "Sort by Amount" + " " + jUtil.getSystemDateInFormat());
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='anticon anticon-ellipsis pp-icon-25']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='title']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver, "Sort by tiltle" + " " + jUtil.getSystemDateInFormat());
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='anticon anticon-ellipsis pp-icon-25']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='date']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver, "Sort by date" + " " + jUtil.getSystemDateInFormat());

	}
	
	@Test(description = "Delete_Adavance")
	public void ADV_TC_011() throws InterruptedException{
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[6]")).click();
		driver.findElement(By.xpath("//span[text()='Advances']")).click();
		driver.findElement(By.xpath("//span[text()='My Advances']")).click();
		driver.findElement(By.xpath("//span[text()='Add Filters']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Unsubmitted']")).click();
		driver.findElement(By.xpath("(//div[@class='status status_unsubmitted'])[1]")).click();
		driver.findElement(By.xpath("//button[text()='Delete']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//textarea[@class='ant-input reasonTextArea']")).sendKeys("Deleting By Selenium");
		Thread.sleep(1000);
		
//		driver.findElement(By.xpath("//span[text()='Confirm']")).click();
//		Thread.sleep(1000);
//		String message = driver.findElement(By.xpath("//span[@class='messageText']")).getText();
//		System.out.println(message);
		driver.findElement(By.xpath("//span[text()='Cancel']")).click();
	}
	
	//-----------------------------------------------------Advance Approvals----------------------------------------------------------------------------

	@Test(description = "Filters_In_Advances_Approvals")
	public void ADV_TC_012() throws InterruptedException, IOException {
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[6]")).click();
		driver.findElement(By.xpath("//span[text()='Advances']")).click();
		driver.findElement(By.xpath("//span[text()='Add Filters']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Approved']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver, "Approved"+" "+jUtil.getSystemDateInFormat());
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Approved']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Pending Approval']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver, "Pending Approval"+" "+jUtil.getSystemDateInFormat());
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Pending Approval']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Recovered']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver, "Recovered"+" "+jUtil.getSystemDateInFormat());
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Recovered']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Pending Recovery']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver, "Pending Recovery"+" "+jUtil.getSystemDateInFormat());
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Pending Recovery']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Rejected']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver, "Rejected"+" "+jUtil.getSystemDateInFormat());
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Rejected']")).click();
		
	}

	
	@Test(description = "Advances_Approvals_Search")
	public void ADV_TC_013() throws InterruptedException, IOException {

		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[6]")).click();
		driver.findElement(By.xpath("//span[text()='Advances']")).click();
		WebElement search = driver.findElement(By.xpath("//input[@id='search-input']"));
		search.sendKeys("25");
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver, "Search by Advance ID" + " " + jUtil.getSystemDateInFormat());
		search.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		Thread.sleep(1000);
		search.sendKeys("email");
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver, "Search by title" + " " + jUtil.getSystemDateInFormat());
		search.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		Thread.sleep(1000);
		
	}

	@Test(description = "Advances_Approvals_Sort")
	public void ADV_TC_014() throws InterruptedException, IOException {

		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[6]")).click();
		driver.findElement(By.xpath("//span[text()='Advances']")).click();
		driver.findElement(By.xpath("//span[@class='anticon anticon-ellipsis pp-icon-25']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='amount']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver, "Sort by Amount" + " " + jUtil.getSystemDateInFormat());
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='anticon anticon-ellipsis pp-icon-25']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='title']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver, "Sort by tiltle" + " " + jUtil.getSystemDateInFormat());
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='anticon anticon-ellipsis pp-icon-25']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='recorded by']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver, "Sort by Employee" + " " + jUtil.getSystemDateInFormat());

	}
	
	@Test(description = "Add_Comments_In_Advance_Approvals")
	public void ADV_TC_015() throws InterruptedException {
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[6]")).click();
		driver.findElement(By.xpath("//span[text()='Advances']")).click();
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
	
	@Test(description = "Approve_Advance")
	public void ADV_TC_016() throws InterruptedException {
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[6]")).click();
		driver.findElement(By.xpath("//span[text()='Advances']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Add Filters']")).click();
		Thread.sleep(1000);
		try {
			driver.findElement(By.xpath("(//div[@class='status status_pending_approval'])[1]")).click();
			}
			catch(NoSuchElementException e)
			{
				System.out.println("No Pending approval Adavances");
			}
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Approve']")).click();
		Thread.sleep(1000);
		String message = driver.findElement(By.xpath("//span[@class='messageText']")).getText();
		System.out.println(message);

	}
	
	@Test(description = "Reject_Advance")
	public void ADV_TC_017() throws InterruptedException {
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[6]")).click();
		driver.findElement(By.xpath("//span[text()='Advances']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Add Filters']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Pending Approval']")).click();
		try {
		driver.findElement(By.xpath("(//div[@class='status status_pending_approval'])[1]")).click();
		}
		catch(NoSuchElementException e)
		{
			System.out.println("No Pending approval Adavances");
		}
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Reject']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//textarea[@class='ant-input reasonTextArea']")).sendKeys("Test Reject Reason");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Confirm']")).click();
		Thread.sleep(2000);
		String message = driver.findElement(By.xpath("//span[@class='messageText']")).getText();
		System.out.println(message);
	}
	
	@Test(description = "Download_Advance_In_More_Advance_Approvals")
	public void ADV_TC_018() throws InterruptedException {

		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[6]")).click();
		driver.findElement(By.xpath("//span[text()='Advances']")).click();
		driver.findElement(By.xpath("(//tr[@class='ant-table-row ant-table-row-level-0'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='ant-dropdown-trigger more']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[text()='Download PDF']")).click();
		Thread.sleep(1000);
		wUtil.switchToWindow(driver, "amazonaws");
		Thread.sleep(1000);
		driver.close();
		Thread.sleep(1000);
		wUtil.switchToWindow(driver, "expenses");
	}	
}
