package sales;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import forgo.genericUtility.BaseClass;

public class Estimates extends BaseClass {
	@Test
	public void TC18() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[5]")).click();
		driver.findElement(By.xpath("//span[text()='Estimate']")).click();
		driver.findElement(By.xpath("//span[text()='My Estimates']")).click();
		driver.findElement(By.xpath("//span[text()='Add New']")).click();
		WebElement customerInfoElement = driver.findElement(By.xpath("(//input[@class='ant-select-selection-search-input'])[2]"));
		customerInfoElement.click();
		customerInfoElement.sendKeys("anjali tiwari");
		customerInfoElement.sendKeys(Keys.ARROW_DOWN);
		customerInfoElement.sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[@class='ant-input pp-form-input'])[2]")).sendKeys("123");
		WebElement paymentTermsElents=driver.findElement(By.xpath("(//input[@class='ant-select-selection-search-input'])[3]"));
		paymentTermsElents.click();
		paymentTermsElents.sendKeys("Daily");
		paymentTermsElents.sendKeys(Keys.ARROW_DOWN);
		paymentTermsElents.sendKeys(Keys.ENTER);
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(5000);
		WebElement categoryElement=driver.findElement(By.xpath("(//input[@class='ant-select-selection-search-input'])[4]"));
		categoryElement.click();
		categoryElement.sendKeys("bill category");
		categoryElement.sendKeys(Keys.ARROW_DOWN);
		categoryElement.sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		WebElement itemDetailElement=driver.findElement(By.xpath("(//input[@class='ant-select-selection-search-input'])[5]"));
		itemDetailElement.click();
		itemDetailElement.sendKeys("lap");
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
	@Test
	public void TC19() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[5]")).click();
		driver.findElement(By.xpath("//span[text()='Estimate']")).click();
		driver.findElement(By.xpath("//span[text()='My Estimates']")).click();
		driver.findElement(By.xpath("//input[@id='search-input']")).sendKeys("EST_0022");
		Thread.sleep(1000);

	}
	@Test
	public void TC20() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[5]")).click();
		driver.findElement(By.xpath("//span[text()='Estimate']")).click();
		driver.findElement(By.xpath("//span[text()='My Estimates']")).click();
		driver.findElement(By.xpath("//input[@id='search-input']")).sendKeys("jyo");
		Thread.sleep(1000);

	}
	@Test
	public void TC21() throws InterruptedException{
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[5]")).click();
		driver.findElement(By.xpath("//span[text()='Estimate']")).click();
		driver.findElement(By.xpath("//span[text()='My Estimates']")).click();
		driver.findElement(By.xpath("//span[@class='anticon anticon-ellipsis pp-icon-25']")).click();

	}
	@Test
	public void TC22() throws InterruptedException{
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[5]")).click();
		driver.findElement(By.xpath("//span[text()='Estimate']")).click();
		driver.findElement(By.xpath("//span[text()='My Estimates']")).click();
		driver.findElement(By.xpath("//span[@class='anticon anticon-ellipsis pp-icon-25']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Customer Name']")).click();


	}
	@Test
	public void TC23() throws InterruptedException{
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[5]")).click();
		driver.findElement(By.xpath("//span[text()='Estimate']")).click();
		driver.findElement(By.xpath("//span[text()='My Estimates']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/section/section/main/div/div/div/div[2]/div/div/div/div/div/div/div/table/tbody/tr[2]")).click();
		Thread.sleep(1000);

	}
	@Test
	public void TC24() throws InterruptedException{
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[5]")).click();
		driver.findElement(By.xpath("//span[text()='Estimate']")).click();
		driver.findElement(By.xpath("//span[text()='My Estimates']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/section/section/main/div/div/div/div[2]/div/div/div/div/div/div/div/table/tbody/tr[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Edit']")).click();

	}
	@Test
	public void TC25() throws InterruptedException{
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[5]")).click();
		driver.findElement(By.xpath("//span[text()='Estimate']")).click();
		driver.findElement(By.xpath("//span[text()='My Estimates']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/section/section/main/div/div/div/div[2]/div/div/div/div/div/div/div/table/tbody/tr[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='More']")).click();

	}
	@Test
	public void TC26() throws InterruptedException{
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[5]")).click();
		driver.findElement(By.xpath("//span[text()='Estimate']")).click();
		driver.findElement(By.xpath("//span[text()='My Estimates']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/section/section/main/div/div/div/div[2]/div/div/div/div/div/div/div/table/tbody/tr[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='More']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Send Email']")).click();

	}

	@Test
	public void TC27() throws InterruptedException{
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[5]")).click();
		driver.findElement(By.xpath("//span[text()='Estimate']")).click();
		driver.findElement(By.xpath("//span[text()='My Estimates']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/section/section/main/div/div/div/div[2]/div/div/div/div/div/div/div/table/tbody/tr[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='More']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Clone']")).click();

	}
	@Test
	public void TC28() throws InterruptedException{
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[5]")).click();
		driver.findElement(By.xpath("//span[text()='Estimate']")).click();
		driver.findElement(By.xpath("//span[text()='My Estimates']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/section/section/main/div/div/div/div[2]/div/div/div/div/div/div/div/table/tbody/tr[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='More']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Delete']")).click();

	}
	@Test
	public void TC29() throws InterruptedException{
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[5]")).click();
		driver.findElement(By.xpath("//span[text()='Estimate']")).click();
		driver.findElement(By.xpath("//span[text()='My Estimates']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/section/section/main/div/div/div/div[2]/div/div/div/div/div/div/div/table/tbody/tr[2]")).click();
		driver.findElement(By.xpath("//li[@class='active']")).click();
		Thread.sleep(1000);

	}
	@Test
	public void TC30() throws InterruptedException{
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[5]")).click();
		driver.findElement(By.xpath("//span[text()='Estimate']")).click();
		driver.findElement(By.xpath("//span[text()='My Estimates']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/section/section/main/div/div/div/div[2]/div/div/div/div/div/div/div/table/tbody/tr[2]")).click();
		driver.findElement(By.xpath("//li[text()='Comments']")).click();
	}
	@Test
	public void TC31() throws InterruptedException{
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[5]")).click();
		driver.findElement(By.xpath("//span[text()='Estimate']")).click();
		driver.findElement(By.xpath("//span[text()='My Estimates']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/section/section/main/div/div/div/div[2]/div/div/div/div/div/div/div/table/tbody/tr[2]")).click();
		driver.findElement(By.xpath("//li[text()='History']")).click();
	}
	@Test
	public void TC32() throws InterruptedException{
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[5]")).click();
		driver.findElement(By.xpath("//span[text()='Estimate']")).click();
		driver.findElement(By.xpath("//span[text()='My Estimates']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/section/section/main/div/div/div/div[2]/div/div/div/div/div/div/div/table/tbody/tr[2]")).click();
		driver.findElement(By.xpath("//li[text()='Comments']")).click();
		driver.findElement(By.xpath("//input[@class='ant-input']")).sendKeys("xcv");
		driver.findElement(By.xpath("//span[text()='Send']")).click();
	}
	@Test(description="To Verify the pagination" )
	public void TC33() throws InterruptedException{
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[5]")).click();
		driver.findElement(By.xpath("//span[text()='Estimate']")).click();
		driver.findElement(By.xpath("//span[text()='My Estimates']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[@class='ant-pagination-next']")).click();

	}
	@Test(description="Submit")
	public void TC34() throws InterruptedException{
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[5]")).click();
		driver.findElement(By.xpath("//span[text()='Estimate']")).click();
		driver.findElement(By.xpath("//span[text()='My Estimates']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/section/section/main/div/div/div/div[2]/div/div/div/div/div/div/div/table/tbody/tr[2]")).click();
		driver.findElement(By.xpath("//li[@class='active']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='pp-main-button ']")).click();

	}
	@Test(description="BulkApprove")
	public void TC35() throws InterruptedException{
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[5]")).click();
		driver.findElement(By.xpath("//span[text()='Estimate']")).click();
		driver.findElement(By.xpath("//span[text()='Approvals']")).click();
		driver.findElement(By.xpath("//input[@class='ant-checkbox-input' and @aria-label='Select all']")).click();
		driver.findElement(By.xpath("//button[@class='approve']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Cancel']")).click();
		//driver.findElement(By.xpath("//button[@class='ant-btn ant-btn-primary ant-dropdown-trigger pp-main-button']")).click();
	}
		@AfterMethod()
		public void teardown() throws InterruptedException {
			Thread.sleep(3000);
			driver.close();

		}


	}



