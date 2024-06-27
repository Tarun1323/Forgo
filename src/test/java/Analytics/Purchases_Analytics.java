package Analytics;

import java.io.IOException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import forgo.genericUtility.BaseClass;

public class Purchases_Analytics extends BaseClass {
	@Test(description="Purchases-Purchases Order")
	public void TC001() throws InterruptedException, IOException{
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[10]")).click();
		driver.findElement(By.xpath("//li[text()='Purchases']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@class='ant-select-selection-search-input'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[text()='PDF'])[2]")).click();
		Thread.sleep(200);
		wUtil.takeScreenShot(driver,"Purchases Purchasesorder PDF");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@class='ant-select-selection-search-input'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[text()='CSV'])[2]")).click();
		Thread.sleep(200);
		wUtil.takeScreenShot(driver,"Purchases Purchasesorder CSV");
		Thread.sleep(5000);
		
	}
	
	@Test(description="Purchases-Bills")
	public void TC002() throws InterruptedException, IOException{
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[10]")).click();
		driver.findElement(By.xpath("//li[text()='Purchases']")).click();
		driver.findElement(By.xpath("//li[text()='Bills']")).click();
        Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@class='ant-select-selection-search-input'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[text()='PDF'])[2]")).click();
		Thread.sleep(200);
		wUtil.takeScreenShot(driver,"Purchases Bills PDF");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@class='ant-select-selection-search-input'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[text()='CSV'])[2]")).click();
		Thread.sleep(200);
		wUtil.takeScreenShot(driver,"Purchases Bills CSV");
		Thread.sleep(5000);
		
	}
	
	@Test(description="Purchases-Payments Made")
	public void TC003() throws InterruptedException, IOException{
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[10]")).click();
		driver.findElement(By.xpath("//li[text()='Purchases']")).click();
		driver.findElement(By.xpath("//li[text()='Payments Made']")).click();
        Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@class='ant-select-selection-search-input'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[text()='PDF'])[2]")).click();
		Thread.sleep(200);
		wUtil.takeScreenShot(driver,"Purchases Payments Made PDF");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@class='ant-select-selection-search-input'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[text()='CSV'])[2]")).click();
		Thread.sleep(200);
		wUtil.takeScreenShot(driver,"Purchases Payments Made CSV");
		Thread.sleep(5000);
		
	}
	
	@Test(description="Purchases-Payments Made")
	public void TC004() throws InterruptedException, IOException{
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[10]")).click();
		driver.findElement(By.xpath("//li[text()='Purchases']")).click();
		driver.findElement(By.xpath("//li[text()='Bills Aging']")).click();
        Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@class='ant-select-selection-search-input'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[text()='PDF'])[2]")).click();
		Thread.sleep(200);
		wUtil.takeScreenShot(driver,"Purchases Payments Made PDF");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@class='ant-select-selection-search-input'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[text()='CSV'])[2]")).click();
		Thread.sleep(200);
		wUtil.takeScreenShot(driver,"Purchases Payments Made CSV");
		Thread.sleep(5000);
		
	}
	
	
}
	


