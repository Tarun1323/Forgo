package Analytics;


	import java.io.IOException;
	import org.openqa.selenium.By;
	import org.testng.annotations.Test;
	import forgo.genericUtility.BaseClass;

	public class Expenses_Anyalytics extends BaseClass {

		@Test(description="Expenses Analytics")
		public void TC001() throws InterruptedException, IOException{
			
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[10]")).click();
			driver.findElement(By.xpath("(//input[@class='ant-select-selection-search-input'])[2]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//div[text()='PDF'])[2]")).click();
			Thread.sleep(200);
			wUtil.takeScreenShot(driver,"Expenses Analytics PDF");
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//input[@class='ant-select-selection-search-input'])[2]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//div[text()='CSV'])[2]")).click();
			Thread.sleep(200);
			wUtil.takeScreenShot(driver,"Expenses Analytics CSV");
			Thread.sleep(5000);

		}
		@Test(description="Expenses- Expensesrepot")
		public void TC002() throws InterruptedException, IOException{
			
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[10]")).click();
			driver.findElement(By.xpath("//li[text()='Expense Reports']")).click();
			driver.findElement(By.xpath("(//input[@class='ant-select-selection-search-input'])[2]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//div[text()='PDF'])[2]")).click();
			Thread.sleep(200);
			wUtil.takeScreenShot(driver,"Expenses- Expensesrepot PDF");
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//input[@class='ant-select-selection-search-input'])[2]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//div[text()='CSV'])[2]")).click();
			Thread.sleep(200);
			wUtil.takeScreenShot(driver,"Expenses- Expensesrepot CSV");
			Thread.sleep(5000);
		
	}
		@Test(description="Expenses- trips")
		public void TC003() throws InterruptedException, IOException{
			
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[10]")).click();
			driver.findElement(By.xpath("//li[text()='Trips']")).click();
			driver.findElement(By.xpath("(//input[@class='ant-select-selection-search-input'])[2]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//div[text()='PDF'])[2]")).click();
			Thread.sleep(200);
			wUtil.takeScreenShot(driver,"Expenses- trips PDF");
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//input[@class='ant-select-selection-search-input'])[2]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//div[text()='CSV'])[2]")).click();
			Thread.sleep(200);
			wUtil.takeScreenShot(driver,"Expenses- trips CSV");
			Thread.sleep(5000);
		
	}
		@Test(description="Expenses-Card Transactions")
		public void TC004() throws InterruptedException, IOException{
			
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[10]")).click();
			driver.findElement(By.xpath("//li[text()='Card Transactions']")).click();
			driver.findElement(By.xpath("(//input[@class='ant-select-selection-search-input'])[2]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//div[text()='PDF'])[2]")).click();
			Thread.sleep(200);
			wUtil.takeScreenShot(driver,"Expenses-Card Transactions PDF");
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//input[@class='ant-select-selection-search-input'])[2]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//div[text()='CSV'])[2]")).click();
			Thread.sleep(200);
			wUtil.takeScreenShot(driver,"Expenses-Card Transactions CSV");
			Thread.sleep(5000);
		
	}
		@Test(description="Expenses-Card Transactions")
		public void TC005() throws InterruptedException, IOException{
			
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[10]")).click();
			driver.findElement(By.xpath("//li[text()='Advances']")).click();
			driver.findElement(By.xpath("(//input[@class='ant-select-selection-search-input'])[2]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//div[text()='PDF'])[2]")).click();
			Thread.sleep(200);
			wUtil.takeScreenShot(driver,"Expenses-Advances PDF");
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//input[@class='ant-select-selection-search-input'])[2]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//div[text()='CSV'])[2]")).click();
			Thread.sleep(200);
			wUtil.takeScreenShot(driver,"Expenses-Advances CSV");
			Thread.sleep(5000);
		
	}
		
		
		
		
		
	}
