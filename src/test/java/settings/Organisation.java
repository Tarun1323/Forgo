package settings;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import forgo.genericUtility.BaseClass;

public class Organisation extends BaseClass {
	
	@Test
	public void SET_ORG_TC_001() throws InterruptedException {
	
		Thread.sleep(1000);
		db.clickOnSettingsLnk();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Organisation']")).click();
		driver.findElement(By.xpath("//span[text()='Add New Organisation']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Organisation Name']")).sendKeys("ORG"+" "+jUtil.generateRandomNumber(3));
		driver.findElement(By.xpath("//input[@placeholder='Organisation Registration No']")).sendKeys("REG"+jUtil.generateRandomNumber(7));
		driver.findElement(By.xpath("//input[@placeholder='Organisation Primary email']")).sendKeys("org"+jUtil.generateRandomNumber(3)+"@yopmail.com");
		driver.findElement(By.name("address")).sendKeys("Madhapur");
//		driver.findElement(By.xpath("")).click();
//			Thread.sleep(2000);
//		List<WebElement> Countries = driver.findElements(By.xpath("//div[@class='ant-select-item ant-select-item-option']"));
//		for (WebElement country : Countries) {
//			if(country.getText().contains("India")){
//				country.click();
//				break;
//			}}
		Thread.sleep(2000);
		WebElement country = driver.findElement(By.xpath("//span[text()='Select Country']"));
		country.click();
		country.sendKeys("india");
		country.sendKeys(Keys.ARROW_DOWN);
		country.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//input[@placeholder='Pincode']")).sendKeys("500081");
		driver.findElement(By.xpath("//input[@placeholder='Office Number']")).sendKeys(jUtil.generateRandomNumber(10));
		driver.findElement(By.xpath("//input[@placeholder='Tax ID']")).sendKeys("GSTIN"+jUtil.generateRandomNumber(10));
		driver.findElement(By.xpath("//input[@placeholder='TAN No']")).sendKeys("TAN"+jUtil.generateRandomNumber(7));
		Thread.sleep(2000);
		List<WebElement> CardVendors = driver.findElements(By.xpath("//input[@id='rc_select_3']"));
		for (WebElement vendor : CardVendors) {
			if(vendor.getText().contains("CARD")){
				vendor.click();
				break;
			}}
		
		driver.findElement(By.xpath("//input[@placeholder='MO Id']")).sendKeys("MO"+jUtil.generateRandomNumber(7));
		driver.findElement(By.xpath("//input[@placeholder='Virtual ID']")).sendKeys("VID"+jUtil.generateRandomNumber(13));
		driver.findElement(By.xpath("//input[@placeholder='Outlet ID']")).sendKeys("OID"+jUtil.generateRandomNumber(8));
		driver.findElement(By.xpath("//input[@placeholder='Primary Contact Name']")).sendKeys("Automation");
		driver.findElement(By.xpath("//input[@placeholder='Primary Contact Number']")).sendKeys(jUtil.generateRandomNumber(10));
		driver.findElement(By.xpath("//input[@placeholder='Contact Email']")).sendKeys("org"+jUtil.generateRandomNumber(3)+"@yopmail.com");
		
		WebElement baseCurrency = driver.findElement(By.xpath("(//input[@class='ant-select-selection-search-input'])[4]"));
		baseCurrency.click();
		baseCurrency.sendKeys("india");
		baseCurrency.sendKeys(Keys.ARROW_DOWN);
		baseCurrency.sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("//input[@placeholder='Account IFSC']")).sendKeys("SBIN0012732");
		driver.findElement(By.xpath("//input[@placeholder='Account name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@placeholder='Account Number']")).sendKeys(jUtil.generateRandomNumber(12));
		//driver.findElement(By.xpath("//span[normalize-space()='Create']")).click();
	}

}
