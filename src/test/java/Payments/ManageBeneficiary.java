package Payments;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import forgo.genericUtility.BaseClass;

public class ManageBeneficiary extends BaseClass {

	@Test(description="Create Manage Beneficiary")
	public void TC001() throws InterruptedException, IOException{
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[2]")).click();
		driver.findElement(By.xpath("//span[text()='Manage Beneficiary']")).click();
		driver.findElement(By.xpath("//span[text()='Add New']")).click();
		driver.findElement(By.xpath("(//input[@class='ant-input pp-form-input'])[1]")).sendKeys("HDFC0004194");
		driver.findElement(By.xpath("(//input[@class='ant-input pp-form-input'])[2]")).sendKeys("Tarun");
		WebElement currencyElement=driver.findElement(By.xpath("(//input[@class='ant-select-selection-search-input'])[2]"));
		currencyElement.click();
		currencyElement.sendKeys("India");
		currencyElement.sendKeys(Keys.ARROW_DOWN);
		currencyElement.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("(//input[@class='ant-input pp-form-input'])[3]")).sendKeys("123409876");
		driver.findElement(By.xpath("(//input[@class='ant-input pp-form-input'])[5]")).sendKeys("tatr123@gmail.com");
		driver.findElement(By.xpath("(//input[@class='ant-input pp-form-input'])[6]")).sendKeys("9876541230");
		driver.findElement(By.xpath("//span[text()='Create']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"Creat Manage Beneficiary");

	}
	@Test(description="Create Manage Beneficiary")
	public void TC002() throws InterruptedException, IOException{
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[2]")).click();
		driver.findElement(By.xpath("//span[text()='Manage Beneficiary']")).click();
		WebElement searchElement=driver.findElement(By.xpath("//input[@class='ant-input ant-input-lg']"));
		searchElement.sendKeys("Sanjay");
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"Search By Beneficiary Name");
		searchElement.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		searchElement.sendKeys("123409876");
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"Search By AccNo");
		searchElement.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		searchElement.sendKeys("tatr");
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"Search By Email");
		searchElement.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		searchElement.sendKeys("9876541230");
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"Search By PhNo");
		
}
	
}
