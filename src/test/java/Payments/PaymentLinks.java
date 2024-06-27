package Payments;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import forgo.genericUtility.BaseClass;

public class PaymentLinks extends BaseClass {

	@Test(description="Create Payment Links")
	public void TC001() throws InterruptedException, IOException{
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[2]")).click();
		driver.findElement(By.xpath("//span[text()='Payment Links']")).click();
		driver.findElement(By.xpath("//span[text()='Add New']")).click();
		Thread.sleep(1000);
		WebElement customerElement=driver.findElement(By.xpath("(//input[@class='ant-select-selection-search-input'])[2]"));
		customerElement.click();
		customerElement.sendKeys("Hari");
		customerElement.sendKeys(Keys.ARROW_DOWN);
		customerElement.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("(//input[@class='ant-input pp-form-input'])[1]")).sendKeys("xcv");
		driver.findElement(By.xpath("(//input[@class='ant-input pp-form-input'])[2]")).sendKeys("20000");
		driver.findElement(By.xpath("//span[text()='Create']")).click();
		Thread.sleep(3000);
		wUtil.takeScreenShot(driver,"Create payment Link");

	}
	
	@Test(description="sort-Payment Links")
	public void TC002() throws InterruptedException, IOException{
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[2]")).click();
		driver.findElement(By.xpath("//span[text()='Payment Links']")).click();
		driver.findElement(By.xpath("//span[@class='anticon anticon-ellipsis pp-icon-25']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Amount']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"sort by Amount");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='anticon anticon-ellipsis pp-icon-25']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Create Date & Time']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"sort by Date & Time");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='anticon anticon-ellipsis pp-icon-25']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Customer Name']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"sort by Customer Name");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='anticon anticon-ellipsis pp-icon-25']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Mobile No']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"sort by Mobile No");
		driver.findElement(By.xpath("//span[@class='anticon anticon-ellipsis pp-icon-25']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Status']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"sort by Status");


		}
	@Test(description="search-Payment Links")
	public void TC003() throws InterruptedException, IOException{
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[2]")).click();
		driver.findElement(By.xpath("//span[text()='Payment Links']")).click();
		WebElement searchElement=driver.findElement(By.xpath("//input[@class='ant-input ant-input-lg']"));
		searchElement.sendKeys("Nagarjuna");
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"SearchyBy_CustomerName");
		Thread.sleep(1000);
		searchElement.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		Thread.sleep(1000);		
		driver.findElement(By.xpath("//input[@class='ant-input ant-input-lg']")).sendKeys("6678827721");
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"SearchyBy_MobileNo");
		Thread.sleep(1000);

		
	}

}
