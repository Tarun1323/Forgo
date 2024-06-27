package Payments;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import forgo.genericUtility.BaseClass;

public class BeneficiaryAccounts extends BaseClass {

	@Test(description="Create Company Accounts")
	public void TC001() throws InterruptedException, IOException{
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[2]")).click();
		driver.findElement(By.xpath("//span[text()='Beneficiary Accounts']")).click();
		driver.findElement(By.xpath("//span[text()='My Payments']")).click();
		driver.findElement(By.xpath("//span[text()='Create Payment']")).click();
		WebElement ceditAccountElement=driver.findElement(By.xpath("(//input[@class='ant-select-selection-search-input'])[3]"));
		ceditAccountElement.click();
		ceditAccountElement.sendKeys("arun");
		ceditAccountElement.sendKeys(Keys.ARROW_DOWN);
		ceditAccountElement.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("(//input[@class='ant-input pp-form-input'])[1]")).sendKeys("1000");
		driver.findElement(By.xpath("(//input[@class='ant-input pp-form-input'])[2]")).sendKeys("Abcddef");
		driver.findElement(By.xpath("(//span[text()='Create Payment'])[2]")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"BA-My payments");
 }
	@Test(description="Search by employee name")
	public void TC002() throws InterruptedException, IOException{
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[2]")).click();
		driver.findElement(By.xpath("//span[text()='Beneficiary Accounts']")).click();
		driver.findElement(By.xpath("//span[text()='My Payments']")).click();
		driver.findElement(By.xpath("//input[@class='ant-input ant-input-lg']")).sendKeys("arun");
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"BA-Search by name");
		
	}
	
	@Test(description=" edit Unsubmited")
	public void TC003() throws InterruptedException, IOException{
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[2]")).click();
		driver.findElement(By.xpath("//span[text()='Beneficiary Accounts']")).click();
		driver.findElement(By.xpath("//span[text()='My Payments']")).click();
		driver.findElement(By.xpath("//span[@class='anticon anticon-more']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Edit']")).click();
		WebElement amountElement=driver.findElement(By.xpath("//input[@class='ant-input pp-form-input']"));
		amountElement.click();
		amountElement.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		Thread.sleep(1000);
		amountElement.sendKeys("100000");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Update Payment']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"BA-My payments edit");
	
}
	@Test(description="Unsubmited-Submit")
	public void TC004() throws InterruptedException, IOException{
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[2]")).click();
		driver.findElement(By.xpath("//span[text()='Beneficiary Accounts']")).click();
		driver.findElement(By.xpath("//span[text()='My Payments']")).click();
		driver.findElement(By.xpath("//td[text()='Varun']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"Unsubmited-Submit");

		

}
	@Test(description="Unsubmited-delete")
	public void TC005() throws InterruptedException, IOException{
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[2]")).click();
		driver.findElement(By.xpath("//span[text()='Beneficiary Accounts']")).click();
		driver.findElement(By.xpath("//span[text()='My Payments']")).click();
		driver.findElement(By.xpath("//td[text()='Varun']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Delete']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Confirm']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"Unsubmited-delete");

		}
	@Test(description="Pendingapproval-ReCall")
	public void TC006() throws InterruptedException, IOException{
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[2]")).click();
		driver.findElement(By.xpath("//span[text()='Beneficiary Accounts']")).click();
		driver.findElement(By.xpath("//span[text()='My Payments']")).click();
		driver.findElement(By.xpath("//td[text()='arun']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Recall']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"Pendingapproval-ReCall");

		}
	@Test(description="Details")
	public void TC007() throws InterruptedException, IOException{
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[2]")).click();
		driver.findElement(By.xpath("//span[text()='Beneficiary Accounts']")).click();
		driver.findElement(By.xpath("//span[text()='My Payments']")).click();
		driver.findElement(By.xpath("//td[text()='arun']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"BA-details");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[text()='Comments']")).click();
		driver.findElement(By.xpath("//input[@class='ant-input']")).sendKeys("asdf");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Send']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"BA-Comments");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[text()='History']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"BA-History");

	}
	@Test(description="Recall")
	public void TC008() throws InterruptedException, IOException{
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[2]")).click();
		driver.findElement(By.xpath("//span[text()='Beneficiary Accounts']")).click();
		driver.findElement(By.xpath("//span[text()='My Payments']")).click();
		driver.findElement(By.xpath("//td[text()='arun']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Recall']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"recall");
		
	}
	//Approvals
	@Test(description="Search for Approvals")
	public void TC009() throws InterruptedException, IOException{
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[2]")).click();
		driver.findElement(By.xpath("//span[text()='Beneficiary Accounts']")).click();
		driver.findElement(By.xpath("//span[text()='My Payments']")).click();
		WebElement searchElement=driver.findElement(By.xpath("//input[@class='ant-input ant-input-lg']"));
		searchElement.sendKeys("40249");
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"Trans ID ");
		searchElement.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		Thread.sleep(1000);
		searchElement.sendKeys("gourish");
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"BfName");
		Thread.sleep(1000);


	}
	@Test(description="Approval for Pending Approve")
	public void TC010() throws InterruptedException, IOException{
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[2]")).click();
		driver.findElement(By.xpath("//span[text()='Beneficiary Accounts']")).click();
		WebElement searchElement=driver.findElement(By.xpath("//input[@class='ant-input ant-input-lg']"));
		searchElement.sendKeys("73728");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='pending approval']")).click();
		driver.findElement(By.xpath("//button[text()='Approve']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"Approve");

	}
	@Test(description=" Pay for Approval")
	public void TC011() throws InterruptedException, IOException{
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[2]")).click();
		driver.findElement(By.xpath("//span[text()='Beneficiary Accounts']")).click();
		driver.findElement(By.xpath("(//div[text()='approved'])[1]")).click();
		driver.findElement(By.xpath("//button[text()='Pay']")).click();
		driver.findElement(By.xpath("//span[text()='Send OTP']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"Pay");
		}
	
}
