package Payments;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import forgo.genericUtility.BaseClass;

public class Banktransfers extends BaseClass {

	@Test(description="Create Company Accounts")
	public void TC001() throws InterruptedException, IOException{
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[2]")).click();
		driver.findElement(By.xpath("//span[text()='Bank Transfers']")).click();
		driver.findElement(By.xpath("//span[text()='Create Payment']")).click();
		Thread.sleep(1000);
		WebElement ceditAccountElement=driver.findElement(By.xpath("(//input[@class='ant-select-selection-search-input'])[3]"));
		ceditAccountElement.click();
		ceditAccountElement.sendKeys("4621");
		ceditAccountElement.sendKeys(Keys.ARROW_DOWN);
		ceditAccountElement.sendKeys(Keys.ENTER);
		WebElement amountElement=driver.findElement(By.xpath("(//input[@class='ant-select-selection-search-input'])[3]"));
		amountElement.click();
		amountElement.sendKeys("INR");
		amountElement.sendKeys(Keys.ARROW_DOWN);
		amountElement.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("(//input[@class='ant-input pp-form-input'])[1]")).sendKeys("1000");
		driver.findElement(By.xpath("(//input[@class='ant-input pp-form-input'])[2]")).sendKeys("Abcddef");
		driver.findElement(By.xpath("(//span[text()='Create Payment'])[2]")).click();

		}
	@Test(description="Search by employee name")
	public void TC002() throws InterruptedException, IOException{
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[2]")).click();
		driver.findElement(By.xpath("//span[text()='Bank Transfers']")).click();
		driver.findElement(By.xpath("//input[@class='ant-input ant-input-lg']")).sendKeys("arun");
	}
}
