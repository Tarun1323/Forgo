package settings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import forgo.genericUtility.BaseClass;

public class Currencies extends BaseClass{

	
	@Test
	public void SET_CUR_TC_001() throws InterruptedException {
		
		Thread.sleep(1000);
		db.clickOnSettingsLnk();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Currencies']")).click();
		driver.findElement(By.xpath("//span[text()='New Currency ']")).click();
		WebElement currency_dropdown= driver.findElement(By.xpath("(//input[@class='ant-select-selection-search-input'])[2]"));
}
}