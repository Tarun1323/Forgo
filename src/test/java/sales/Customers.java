package sales;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import forgo.genericUtility.BaseClass;

public class Customers extends BaseClass {
	@Test(priority=1)
	public void TC1() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[5]")).click();
		driver.findElement(By.xpath("//button[@class='ant-btn ant-btn-primary ant-btn-compact-item ant-btn-compact-first-item']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter Customer Name']")).sendKeys("Varun");
		driver.findElement(By.xpath("//input[@placeholder='Enter Company Name']")).sendKeys("run");
		driver.findElement(By.xpath("//input[@placeholder='Enter Email']")).sendKeys("run@yopmail.com");
		driver.findElement(By.xpath("//input[@name='primary_contact']")).sendKeys("0987654321");
		Actions actions = new Actions(driver);
		WebElement footer = driver.findElement(By.tagName("footer"));
		actions.moveToElement(footer).perform();
		driver.findElement(By.xpath("//div[@class='ant-select-item-option-content' and text()='INR']\r\n")).click();
		driver.findElement(By.xpath("//button[@id='save']")).click();

	}
	@Test(priority=2,description="sort")
	public void TC2() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[5]")).click();
		driver.findElement(By.xpath("//span[@aria-label='ellipsis']//*[name()='svg']")).click();
	}

	@Test(priority=3,description="sort by customer name")
	public void TC3() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[5]")).click();
		driver.findElement(By.xpath("//span[@aria-label='ellipsis']//*[name()='svg']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Customer Name']")).click();
	}
	@Test(priority=4,description="sort by Company name")
	public void TC4() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[5]")).click();
		driver.findElement(By.xpath("//span[@aria-label='ellipsis']//*[name()='svg']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Company Name']")).click();
	}
	@Test(priority=5,description="sort by Email")
	public void TC5() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[5]")).click();
		driver.findElement(By.xpath("//span[@aria-label='ellipsis']//*[name()='svg']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Email']")).click();
	}
	@Test(priority=6,description="sort by Phone")
	public void TC6() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[5]")).click();
		driver.findElement(By.xpath("//span[@aria-label='ellipsis']//*[name()='svg']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
	}
	@Test(priority=7,description="sort by Created At")
	public void TC7() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[5]")).click();
		driver.findElement(By.xpath("//span[@aria-label='ellipsis']//*[name()='svg']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Created At']")).click();
	}
	@Test(priority=8,description="sort by  Refresh")
	public void TC8() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[5]")).click();
		driver.findElement(By.xpath("//span[@aria-label='ellipsis']//*[name()='svg']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Refresh']")).click();
	}

	@Test(priority=9,description="Add Filters")
	public void TC9() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[5]")).click();
		driver.findElement(By.xpath("//button[@class='ant-btn ant-btn-primary ant-dropdown-trigger pp-main-button']")).click();

	}
	@Test(priority=10,description="Add Filters-All")
	public void TC10() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[5]")).click();
		driver.findElement(By.xpath("//button[@class='ant-btn ant-btn-primary ant-dropdown-trigger pp-main-button']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='All']")).click();
	}
	@Test(priority=11,description="Add Filters-Active")
	public void TC11() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[5]")).click();
		driver.findElement(By.xpath("//button[@class='ant-btn ant-btn-primary ant-dropdown-trigger pp-main-button']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Active']")).click();

	}
	@Test(priority=12,description="Add Filters-InActive")
	public void TC12() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[5]")).click();
		driver.findElement(By.xpath("//button[@class='ant-btn ant-btn-primary ant-dropdown-trigger pp-main-button']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Inactive']")).click();
	}
	@Test(priority=13,description="Search by companyname")
	public void TC13() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[5]")).click();
		driver.findElement(By.xpath("//input[@id='search-input']")).sendKeys("XYZ");
	}

	@Test(priority=14,description="Search by Customername")
	public void TC14() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[5]")).click();
		driver.findElement(By.xpath("//input[@id='search-input']")).sendKeys("xyzabc");
	}

	@Test(priority=15,description="Search by Email")
	public void TC15() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[5]")).click();
		driver.findElement(By.xpath("//input[@id='search-input']")).sendKeys("ta@yopmail.com");
	}

	@Test(priority=16,description="Search by Phonenumber")
	public void TC16() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[5]")).click();
		driver.findElement(By.xpath("//input[@id='search-input']")).sendKeys("9878987678");

	}
	@Test(priority=17,description= "Deactivate, Activeted Customer")
	public void TC17() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[5]")).click();
		driver.findElement(By.xpath("//button[@class='ant-btn ant-btn-primary ant-dropdown-trigger pp-main-button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Active']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//td[@class='ant-table-cell'])[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/section/section/main/div/div[1]/button[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='DeActivate']")).click();
	}


}
