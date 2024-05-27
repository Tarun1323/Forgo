package expenses;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import forgo.genericUtility.BaseClass;

public class Trips extends BaseClass {
	
	@Test(description = "Create_Trip")
	public void TRIP_TC_001() throws InterruptedException {
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[6]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Trips']")).click();
	}

}
