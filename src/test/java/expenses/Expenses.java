package expenses;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import forgo.genericUtility.BaseClass;

public class Expenses extends BaseClass {

	
	@Test(description = "Create_Expense")
	public void EXP_TC_001() throws InterruptedException {
		
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[6]")).click();
		driver.findElement(By.xpath("//span[text()='Add New']")).click();
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
		//driver.findElement(By.xpath("//span[text()='Cancel']")).click();
		Thread.sleep(1000);
	    String message = driver.findElement(By.xpath("//span[@class='messageText']")).getText();
		System.out.println(message);

	}

	@Test(description = "Edit_Expense")
	public void EXP_TC_002() throws InterruptedException {
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[6]")).click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.querySelector(\"div[style$='overflow: auto hidden;']\").scrollLeft= 150");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[6]")).click();
		driver.findElement(By.xpath("//span[text()='Add Filters']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Saved']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[text()='saved'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Edit']")).click();
		Thread.sleep(1000);
		WebElement amount = driver.findElement(By.name("amount_cents"));
		amount.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		amount.sendKeys(jUtil.generateRandomNumber(3));
		Thread.sleep(1000);
	    driver.findElement(By.xpath("//span[text()='Save and Close']")).click();
	    //driver.findElement(By.xpath("//span[text()='Cancel']")).click();
	    Thread.sleep(1000);
	    String message = driver.findElement(By.xpath("//span[@class='messageText']")).getText();
		System.out.println(message);
	    
	}

	@Test(description = "Expense_Filters")
	public void EXP_TC_003() throws InterruptedException {
		
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[6]")).click();
		driver.findElement(By.xpath("//span[text()='Add Filters']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Saved']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Saved']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Reported']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Reported']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Pending Reimbursements']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Pending Reimbursements']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Rejected']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Rejected']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Reimbursed']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Reimbursed']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Pending Approval']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Pending Approval']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='All Expenses']")).click();

	}

	@Test(description = "Expense_Search")
	public void EXP_TC_004() throws InterruptedException, IOException {
		
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[6]")).click();
		Thread.sleep(1000);
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

	@Test(description = "Expense_Sort")
	public void EXP_TC_005() throws InterruptedException {
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[6]")).click();
		driver.findElement(By.xpath("//span[@class='anticon anticon-ellipsis pp-icon-25']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='amount']")).click(); 
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='anticon anticon-ellipsis pp-icon-25']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='transaction date']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='anticon anticon-ellipsis pp-icon-25']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='merchant name']")).click();

	}
	
	@Test(description = "Add_Expense_To_Report")
	public void EXP_TC_006() throws InterruptedException{
		
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[6]")).click();
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.querySelector(\"div[style$='overflow: auto hidden;']\").scrollLeft= 150");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[text()='saved'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Add to Report']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@class='ant-radio-input'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[text()='Add to Report'])[2]")).click();
		Thread.sleep(1000);
	    String message = driver.findElement(By.xpath("//span[@class='messageText']")).getText();
		System.out.println(message);
		
	}
	
	@Test(description = "Change_Report_In_Expense")
	public void EXP_TC_007() throws InterruptedException{
		
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[6]")).click();
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.querySelector(\"div[style$='overflow: auto hidden;']\").scrollLeft= 150");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Add Filters']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Reported']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='status status_reported'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Change Report']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@class='ant-radio-input'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[text()='Change Report'])[2]")).click();
		Thread.sleep(1000);
	    String message = driver.findElement(By.xpath("//span[@class='messageText']")).getText();
		System.out.println(message);
		
	}
	
	@Test(description = "Comment_In_Expense")
	public void EXP_TC_008() throws InterruptedException{
		
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[6]")).click();
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


}
