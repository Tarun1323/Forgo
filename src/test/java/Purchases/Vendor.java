package Purchases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import forgo.genericUtility.BaseClass;

public class Vendor extends BaseClass {

	@Test(priority=1,description = "Vendor creation with mandiotry fields")
	public void VND_TC001() throws InterruptedException, IOException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[7]")).click();
		driver.findElement(By.xpath("//span[text()='Vendor']")).click();
		driver.findElement(By.xpath("//span[text()='Add New']")).click();
		driver.findElement(By.xpath("(//input[@class='ant-input pp-form-input'])[1]")).sendKeys("un");
		driver.findElement(By.xpath("(//input[@class='ant-input pp-form-input'])[2]")).sendKeys("xyz");
		driver.findElement(By.xpath("(//input[@class='ant-input pp-form-input'])[3]")).sendKeys("abdwert@yopmail.com");
		driver.findElement(By.xpath("(//input[@class='ant-input pp-form-input'])[4]")).sendKeys("0987652345");
		WebElement currencyElement=driver.findElement(By.xpath("(//input[@class='ant-select-selection-search-input'])[4]"));
		currencyElement.click();
		currencyElement.sendKeys("INR");
		currencyElement.sendKeys(Keys.ARROW_DOWN);
		currencyElement.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//span[text()='Save']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"Vendor created");

}
	@Test(priority=2,description = "Vendor-sort")
	public void VND_TC002() throws InterruptedException, IOException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[7]")).click();
		driver.findElement(By.xpath("//span[text()='Vendor']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='anticon anticon-ellipsis pp-icon-25']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Vendor Name']")).click();
		wUtil.takeScreenShot(driver,"Vendor-sort");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='anticon anticon-ellipsis pp-icon-25']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Company Name']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"Vendor-sort by ComanyName");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='anticon anticon-ellipsis pp-icon-25']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Created At']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"Vendor-sort by CreatetAt");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='anticon anticon-ellipsis pp-icon-25']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Refresh']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"Vendor-sort by Refresh");
}
	@Test(priority=3,description = "Vendor-Search")
	public void VND_TC003() throws InterruptedException, IOException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[7]")).click();
		driver.findElement(By.xpath("//span[text()='Vendor']")).click();
		WebElement searchElement=driver.findElement(By.xpath("//input[@class='ant-input ant-input-lg']"));
		searchElement.sendKeys("Nag");
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"SearchyBy_CSName");
		Thread.sleep(1000);
		searchElement.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='ant-input ant-input-lg']")).sendKeys("Grid");
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"SearchyBy_CmpnyName");
		Thread.sleep(1000);
		searchElement.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='ant-input ant-input-lg']")).sendKeys("abcd@yopmail.com");
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"SearchyBy_Gmail");
		searchElement.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='ant-input ant-input-lg']")).sendKeys("7667686678");
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"SearchyBy_Phone");
		Thread.sleep(1000);
		searchElement.sendKeys(Keys.CONTROL, "a", Keys.DELETE);

		
	}
	@Test(priority=4,description = "Vendor-Filter")
	public void VND_TC004() throws InterruptedException, IOException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[7]")).click();
		driver.findElement(By.xpath("//span[text()='Vendor']")).click();
		driver.findElement(By.xpath("//span[text()='Add Filters']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Active']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"Filter_Active");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Active']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Inactive']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"Filter_Inctive");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Inactive']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='All']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"Filter_All");
		Thread.sleep(1000);
		}
	@Test(priority=5,description = "Activie to Deactive")
	public void VND_TC005() throws InterruptedException, IOException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[7]")).click();
		driver.findElement(By.xpath("//span[text()='Vendor']")).click();
		driver.findElement(By.xpath("//span[text()='Add Filters']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Active']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//tr[@class='ant-table-row ant-table-row-level-0'])[1]")).click();
		driver.findElement(By.xpath("//span[@class='anticon anticon-ellipsis pp-icon-25']")).click();
		driver.findElement(By.xpath("//span[text()='DeActivate']")).click();
	    Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"Activate to deactivate");
		


	
}
	@Test(priority=6,description = "DeActivie to Active")
	public void VND_TC006() throws InterruptedException, IOException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[7]")).click();
		driver.findElement(By.xpath("//span[text()='Vendor']")).click();
		driver.findElement(By.xpath("//span[text()='Add Filters']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Inactive']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//tr[@class='ant-table-row ant-table-row-level-0'])[1]")).click();
		driver.findElement(By.xpath("//span[@class='anticon anticon-ellipsis pp-icon-25']")).click();
		driver.findElement(By.xpath("//span[text()='Activate']")).click();
	    Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"deactivate to Activate");
		
		}
	@Test(priority=7,description = "Vendor creation with every fields")
	public void VND_TC007() throws InterruptedException, IOException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[7]")).click();
		driver.findElement(By.xpath("//span[text()='Vendor']")).click();
		driver.findElement(By.xpath("//span[text()='Add New']")).click();
		driver.findElement(By.xpath("(//input[@class='ant-input pp-form-input'])[1]")).sendKeys("arun");
		driver.findElement(By.xpath("(//input[@class='ant-input pp-form-input'])[2]")).sendKeys("xyz");
		driver.findElement(By.xpath("(//input[@class='ant-input pp-form-input'])[3]")).sendKeys("abcd@yopmail.com");
		driver.findElement(By.xpath("(//input[@class='ant-input pp-form-input'])[4]")).sendKeys("0987652345");
		WebElement gstElement=driver.findElement(By.xpath("(//input[@class=\"ant-select-selection-search-input\"])[2]"));
		gstElement.click();
		gstElement.sendKeys("Overseas");
		gstElement.sendKeys(Keys.ARROW_DOWN);
		gstElement.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("(//input[@class=\"ant-input pp-form-input\"])[5]")).sendKeys("123098");
		driver.findElement(By.xpath("(//input[@class=\"ant-input pp-form-input\"])[6]")).sendKeys("CHYPA2540M");
		WebElement supplyElement=driver.findElement(By.xpath("(//input[@class='ant-select-selection-search-input'])[3]"));
		supplyElement.click();
		supplyElement.sendKeys("Goa");
		supplyElement.sendKeys(Keys.ARROW_DOWN);
		supplyElement.sendKeys(Keys.ENTER);
		WebElement currencyElement=driver.findElement(By.xpath("(//input[@class='ant-select-selection-search-input'])[4]"));
		currencyElement.click();
		currencyElement.sendKeys("INR");
		currencyElement.sendKeys(Keys.ARROW_DOWN);
		currencyElement.sendKeys(Keys.ENTER);
		WebElement paymentElement=driver.findElement(By.xpath("(//input[@class='ant-select-selection-search-input'])[5]"));
		paymentElement.click();
		paymentElement.sendKeys("Daily");
		paymentElement.sendKeys(Keys.ARROW_DOWN);
		paymentElement.sendKeys(Keys.ENTER);
		WebElement tdsElement=driver.findElement(By.xpath("(//input[@class='ant-select-selection-search-input'])[6]"));
		tdsElement.click();
		tdsElement.sendKeys("Dividend 10%");
		tdsElement.sendKeys(Keys.ARROW_DOWN);
		tdsElement.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("(//div[text()='Address'])")).click();
		WebElement regionElement=driver.findElement(By.xpath("(//input[@class='ant-select-selection-search-input'])[7]"));
		regionElement.click();
		regionElement.sendKeys("India");
		regionElement.sendKeys(Keys.ARROW_DOWN);
		regionElement.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("(//input[@class='ant-input pp-form-input'])[7]")).sendKeys("madhapur/123");
		driver.findElement(By.xpath("(//input[@class='ant-input pp-form-input'])[8]")).sendKeys("Hyderabad");
		driver.findElement(By.xpath("(//input[@class='ant-input pp-form-input'])[9]")).sendKeys("Telengana");
		driver.findElement(By.xpath("(//input[@class='ant-input pp-form-input'])[10]")).sendKeys("700098");
		driver.findElement(By.xpath("(//input[@class='ant-input pp-form-input'])[11]")).sendKeys("9854657687");
		driver.findElement(By.xpath("(//div[text()='Contact Persons'])")).click();
		WebElement salatutationElemen=driver.findElement(By.xpath("(//input[@class='ant-select-selection-search-input'])[8]"));
		salatutationElemen.click();
		salatutationElemen.sendKeys("Mrs");
		salatutationElemen.sendKeys(Keys.ARROW_DOWN);
		salatutationElemen.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("(//input[@class='ant-input pp-form-input'])[12]")).sendKeys("Tarun");
		driver.findElement(By.xpath("(//input[@class='ant-input pp-form-input'])[13]")).sendKeys("Kumar");
		driver.findElement(By.xpath("(//input[@class='ant-input pp-form-input'])[14]")).sendKeys("Koppurothu");
		driver.findElement(By.xpath("(//input[@class='ant-input pp-form-input'])[15]")).sendKeys("Koppurothu@1323");
		driver.findElement(By.xpath("(//input[@class='ant-input pp-form-input'])[16]")).sendKeys("123456789");
		driver.findElement(By.xpath("(//div[text()='Payment Details'])")).click();
		driver.findElement(By.xpath("(//input[@class='ant-input pp-form-input'])[17]")).sendKeys("HDFC0000042");
		driver.findElement(By.xpath("(//input[@class='ant-input pp-form-input'])[18]")).sendKeys("HDFC");
		driver.findElement(By.xpath("(//input[@class='ant-input pp-form-input'])[19]")).sendKeys("123456789098");
		driver.findElement(By.xpath("(//input[@class='ant-input pp-form-input'])[20]")).sendKeys("Madapur");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[text()='Save'])")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"Vendor created allfields");

}

	
}

