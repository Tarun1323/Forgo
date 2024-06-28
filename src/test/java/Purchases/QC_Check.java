package Purchases;

import java.io.IOException;	
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import forgo.genericUtility.BaseClass;

public class QC_Check extends BaseClass {

	@Test(description="Add filters QC_Check")
	public void TC001() throws InterruptedException, IOException{
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[7]")).click();
		driver.findElement(By.xpath("//span[text()='QC Check']")).click();
		driver.findElement(By.xpath("//span[text()='Add Filters']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='QC Check Pending']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"QC_Check-Pending");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='QC Check Pending']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Completed']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"QC_Check-Completed");
		Thread.sleep(1000);
		

	}
	@Test(description="Add filters QC_Check")
	public void TC002() throws InterruptedException, IOException{
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[7]")).click();
		driver.findElement(By.xpath("//span[text()='QC Check']")).click();
		driver.findElement(By.xpath("//span[@class='anticon anticon-ellipsis pp-icon-25']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Date']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"QC_Date-sort");

}
	@Test(priority=4,description = "Bill-Search")
	public void BIL_004() throws InterruptedException, IOException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[7]")).click();
		driver.findElement(By.xpath("//span[text()='QC Check']")).click();
		WebElement searchElement=driver.findElement(By.xpath("//input[@class='ant-input ant-input-lg']"));
		searchElement.sendKeys("Example");
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"SearchyBy_VendorName");
		Thread.sleep(1000);
		searchElement.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='ant-input ant-input-lg']")).sendKeys("MR_767");
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"SearchyBy_PurchaseNo");
		Thread.sleep(1000);
		searchElement.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='ant-input ant-input-lg']")).sendKeys("QC_001");
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"SearchyBy_qc");
		
		}
	@Test(description="QC_Check-Complete")
	public void TC005() throws InterruptedException, IOException{
			
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[7]")).click();
		driver.findElement(By.xpath("//span[text()='QC Check']")).click();
		driver.findElement(By.xpath("//span[text()='Add Filters']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='QC Check Pending']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//tr[@class='ant-table-row ant-table-row-level-0'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Complete']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"SearchyBy_qc");

		
	}
	
	@Test(description="QC_Check-Save")
	public void TC006() throws InterruptedException, IOException{
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[7]")).click();
		driver.findElement(By.xpath("//span[text()='QC Check']")).click();
		driver.findElement(By.xpath("//span[text()='Add Filters']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='QC Check Pending']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//tr[@class='ant-table-row ant-table-row-level-0'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Save']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"SearchyBy_qc");

		}
	
	
	

	
}
