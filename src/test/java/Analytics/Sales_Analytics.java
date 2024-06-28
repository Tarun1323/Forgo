package Analytics;

import java.io.IOException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import forgo.genericUtility.BaseClass;

public class Sales_Analytics extends BaseClass {
	@Test(description="Sales Estimates")
	public void TC001() throws InterruptedException, IOException{
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[10]")).click();
		driver.findElement(By.xpath("//li[text()='Sales']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@class='ant-select-selection-search-input'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[text()='PDF'])[2]")).click();
		Thread.sleep(200);
		wUtil.takeScreenShot(driver,"Sales Estimates PDF");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@class='ant-select-selection-search-input'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[text()='CSV'])[2]")).click();
		Thread.sleep(200);
		wUtil.takeScreenShot(driver,"Sales Estimates CSV");
		Thread.sleep(5000);
		
	}
	
	@Test(description="Sales Estimates")
	public void TC002() throws InterruptedException, IOException{
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[10]")).click();
		driver.findElement(By.xpath("//li[text()='Sales']")).click();
		driver.findElement(By.xpath("//li[text()='Sales Orders']")).click();
        Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@class='ant-select-selection-search-input'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[text()='PDF'])[2]")).click();
		Thread.sleep(200);
		wUtil.takeScreenShot(driver,"Sales Salesorder PDF");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@class='ant-select-selection-search-input'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[text()='CSV'])[2]")).click();
		Thread.sleep(200);
		wUtil.takeScreenShot(driver,"Sales Salesorder CSV");
		Thread.sleep(5000);
		
	}
	
	@Test(description="Sales Invoices")
	public void TC003() throws InterruptedException, IOException{
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[10]")).click();
		driver.findElement(By.xpath("//li[text()='Sales']")).click();
		driver.findElement(By.xpath("//li[text()='Invoices']")).click();
        Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@class='ant-select-selection-search-input'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[text()='PDF'])[2]")).click();
		Thread.sleep(200);
		wUtil.takeScreenShot(driver,"Sales Invoices PDF");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@class='ant-select-selection-search-input'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[text()='CSV'])[2]")).click();
		Thread.sleep(200);
		wUtil.takeScreenShot(driver,"Sales Invoices CSV");
		Thread.sleep(5000);
		
	}
	
	@Test(description="Sales Payment Received")
	public void TC004() throws InterruptedException, IOException{
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[10]")).click();
		driver.findElement(By.xpath("//li[text()='Sales']")).click();
		driver.findElement(By.xpath("//li[text()='Payment Received']")).click();
        Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@class='ant-select-selection-search-input'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[text()='PDF'])[2]")).click();
		Thread.sleep(200);
		wUtil.takeScreenShot(driver,"Sales Payment Received PDF");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@class='ant-select-selection-search-input'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[text()='CSV'])[2]")).click();
		Thread.sleep(200);
		wUtil.takeScreenShot(driver,"Sales Payment Received CSV");
		Thread.sleep(5000);
		
	}
	@Test(description="Sales Invoice Aging")
	public void TC005() throws InterruptedException, IOException{
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[10]")).click();
		driver.findElement(By.xpath("//li[text()='Sales']")).click();
		driver.findElement(By.xpath("//li[text()='Invoice Aging']")).click();
        Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@class='ant-select-selection-search-input'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[text()='PDF'])[2]")).click();
		Thread.sleep(200);
		wUtil.takeScreenShot(driver,"Sales Invoice Aging PDF");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@class='ant-select-selection-search-input'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[text()='CSV'])[2]")).click();
		Thread.sleep(200);
		wUtil.takeScreenShot(driver,"Sales Invoice Aging CSV");
		Thread.sleep(5000);
		
	}
	
	





	}


