package DashBoard;


import org.openqa.selenium.By;
import java.io.IOException;
import org.testng.annotations.Test;
import forgo.genericUtility.BaseClass;

public class OverView extends BaseClass{

	@Test(description="Dashboard-Company")
	public void TC001() throws IOException, InterruptedException {
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"Dash Board");



	}
	@Test(description="Dashboard Reports")
	public void TC002() throws InterruptedException, IOException {
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"DashBoard Reports");

	}
	@Test(description="Dashboard Bills ")
	public void TC003() throws InterruptedException, IOException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[text()='Bills (7)']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"DashBoard-Bills");

		}
	@Test(description="Dashboard Invoices")
	public void TC004() throws InterruptedException, IOException {

		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[text()='Invoices (5)']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"Dashboard Invoices");
		
		}
	@Test(description="Dashboard Trips")
	public void TC005() throws InterruptedException, IOException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[text()='Trips (9)']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"Dashboard Trips");

	}
	@Test(description="Dashboard Adv")
		public void TC006() throws InterruptedException, IOException {
			Thread.sleep(1000);
			driver.findElement(By.xpath("//li[text()='Advances (6)']")).click();
			Thread.sleep(1000);
			wUtil.takeScreenShot(driver,"Dashboard Adv");

	}
	
	@Test(description="Dashboard-OverView")
	public void TC007() throws InterruptedException, IOException {
		driver.findElement(By.xpath("//li[text()='Overview']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"Over View");
		
	}
	
	@Test(description="Dashboard-OverView PendingAPP")
	public void TC008() throws InterruptedException, IOException {
		driver.findElement(By.xpath("//li[text()='Overview']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Pending Approval']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"OverView PendingAPP");

		
	}
	
	@Test(description="Dashboard-OverView PendingRemb")
	public void TC009() throws InterruptedException, IOException {
		driver.findElement(By.xpath("//li[text()='Overview']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Pending Reimbursement']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"OverView PendingRemb");

		
	}
	
	@Test(description="Dashboard-Quick Links")
	public void TC010() throws InterruptedException, IOException {
		driver.findElement(By.xpath("//li[text()='Overview']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@class='flex-center'])[1]")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"Creat Advances");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='anticon anticon-close ant-modal-close-icon']")).click();
		driver.findElement(By.xpath("(//div[@class='menu-item '])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[text()='Overview']")).click();
		driver.findElement(By.xpath("(//span[@class='flex-center'])[3]")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"Creat Reports");
		driver.findElement(By.xpath("//span[@class='anticon anticon-close ant-modal-close-icon']")).click();
		driver.findElement(By.xpath("(//div[@class='menu-item '])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[text()='Overview']")).click();
		driver.findElement(By.xpath("(//span[@class='flex-center'])[2]")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver,"Creat Expenses");


		
	}
		
}

