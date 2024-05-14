package sales;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.util.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sales {
	public WebDriver driver;



	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://dashboard.forgocards.com/");



		driver.get("https://dashboard.forgocards.com/");
		WebElement emailField = driver.findElement(By.xpath("//input[@id='email']"));
		WebElement passwordField = driver.findElement(By.id("password"));

		emailField.sendKeys("admin.fi@yopmail.com");
		passwordField.sendKeys("Spend@123");
		WebElement loginButton = driver.findElement(By.xpath("//button[contains(text(),'Login')]"));
		loginButton.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement organizationElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("go_to_organisation")));
		organizationElement.click();
		WebElement Sales=	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[contains(@class,'menu-item')])[5]")));
		Sales.click();
	}
	@Test(priority=1)
	public void TC1() {
		
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
	public void TC2() {
		driver.findElement(By.xpath("//span[@aria-label='ellipsis']//*[name()='svg']")).click();
	}

	@Test(priority=3,description="sort by customer name")
	public void TC3() throws InterruptedException {
		driver.findElement(By.xpath("//span[@aria-label='ellipsis']//*[name()='svg']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Customer Name']")).click();
	}
	@Test(priority=4,description="sort by Company name")
	public void TC4() throws InterruptedException {
		driver.findElement(By.xpath("//span[@aria-label='ellipsis']//*[name()='svg']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Company Name']")).click();
	}
	@Test(priority=5,description="sort by Email")
	public void TC5() throws InterruptedException {
		driver.findElement(By.xpath("//span[@aria-label='ellipsis']//*[name()='svg']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Email']")).click();
	}
	@Test(priority=6,description="sort by Phone")
	public void TC6() throws InterruptedException {
		driver.findElement(By.xpath("//span[@aria-label='ellipsis']//*[name()='svg']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
	}
	@Test(priority=7,description="sort by Created At")
	public void TC7() throws InterruptedException {
		driver.findElement(By.xpath("//span[@aria-label='ellipsis']//*[name()='svg']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Created At']")).click();
	}
	@Test(priority=8,description="sort by  Refresh")
	public void TC8() throws InterruptedException {
		driver.findElement(By.xpath("//span[@aria-label='ellipsis']//*[name()='svg']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Refresh']")).click();
	}

	@Test(priority=9,description="Add Filters")
	public void TC9() {

		driver.findElement(By.xpath("//button[@class='ant-btn ant-btn-primary ant-dropdown-trigger pp-main-button']")).click();

	}
	@Test(priority=10,description="Add Filters-All")
	public void TC10() throws InterruptedException {
		driver.findElement(By.xpath("//button[@class='ant-btn ant-btn-primary ant-dropdown-trigger pp-main-button']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='All']")).click();
	}
	@Test(priority=11,description="Add Filters-Active")
	public void TC11() throws InterruptedException {
		driver.findElement(By.xpath("//button[@class='ant-btn ant-btn-primary ant-dropdown-trigger pp-main-button']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Active']")).click();

	}
	@Test(priority=12,description="Add Filters-InActive")
	public void TC12() throws InterruptedException {
		driver.findElement(By.xpath("//button[@class='ant-btn ant-btn-primary ant-dropdown-trigger pp-main-button']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Inactive']")).click();
	}
	@Test(priority=13,description="Search by companyname")
	public void TC13() {
		driver.findElement(By.xpath("//input[@id='search-input']")).sendKeys("XYZ");
	}

	@Test(priority=14,description="Search by Customername")
	public void TC14() {
		driver.findElement(By.xpath("//input[@id='search-input']")).sendKeys("xyzabc");
	}

	@Test(priority=15,description="Search by Email")
	public void TC15() {
		driver.findElement(By.xpath("//input[@id='search-input']")).sendKeys("ta@yopmail.com");
	}

	@Test(priority=16,description="Search by Phonenumber")
	public void TC16() {
		driver.findElement(By.xpath("//input[@id='search-input']")).sendKeys("9878987678");

	}
	@Test(priority=17,description= "Deactivate, Activeted Customer")
	public void TC17() throws InterruptedException {
		driver.findElement(By.xpath("//button[@class='ant-btn ant-btn-primary ant-dropdown-trigger pp-main-button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Active']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//td[@class='ant-table-cell'])[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/section/section/main/div/div[1]/button[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='DeActivate']")).click();
	}

	@AfterMethod()
	public void teardown() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
	}
	@Test
	public void TC18() throws InterruptedException {
		driver.findElement(By.xpath("//span[text()='Estimate']")).click();
		driver.findElement(By.xpath("//span[text()='My Estimates']")).click();
		driver.findElement(By.xpath("//span[text()='Add New']")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div/section/section/main/form/div[2]/div[1]/div/div/div/div/div/div/span[1]/input")).sendKeys("anil");
		driver.findElement(By.xpath("/html/body/div[2]/div/div")).click();
		/*WebElement dateTime=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/section/section/main/form/div[2]/div[2]/div[3]/div/div/div/div"));
		dateTime.sendKeys("03/05/2024 16:04:04");*/
		driver.findElement(By.xpath("//input[@name='customFields.1.value']")).sendKeys("taer");
		driver.findElement(By.xpath("//input[@name='customFields.2.value']")).sendKeys("rat");
		driver.findElement(By.xpath("//input[@name='customFields.3.value']")).sendKeys("raara");
		driver.findElement(By.xpath("//div[@name='items.0.item_id']")).click();

	}
	@Test
	public void TC19() throws InterruptedException {
		driver.findElement(By.xpath("//span[text()='Estimate']")).click();
		driver.findElement(By.xpath("//span[text()='My Estimates']")).click();
		driver.findElement(By.xpath("//input[@id='search-input']")).sendKeys("EST_0022");
		Thread.sleep(1000);

	}
	@Test
	public void TC20() throws InterruptedException {
		driver.findElement(By.xpath("//span[text()='Estimate']")).click();
		driver.findElement(By.xpath("//span[text()='My Estimates']")).click();
		driver.findElement(By.xpath("//input[@id='search-input']")).sendKeys("jyo");
		Thread.sleep(1000);

	}
	@Test
	public void TC21(){
		driver.findElement(By.xpath("//span[text()='Estimate']")).click();
		driver.findElement(By.xpath("//span[text()='My Estimates']")).click();
		driver.findElement(By.xpath("//span[@class='anticon anticon-ellipsis pp-icon-25']")).click();

	}
	@Test
	public void TC22() throws InterruptedException{
		driver.findElement(By.xpath("//span[text()='Estimate']")).click();
		driver.findElement(By.xpath("//span[text()='My Estimates']")).click();
		driver.findElement(By.xpath("//span[@class='anticon anticon-ellipsis pp-icon-25']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Customer Name']")).click();


	}
	@Test
	public void TC23() throws InterruptedException{
		driver.findElement(By.xpath("//span[text()='Estimate']")).click();
		driver.findElement(By.xpath("//span[text()='My Estimates']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/section/section/main/div/div/div/div[2]/div/div/div/div/div/div/div/table/tbody/tr[2]")).click();
		Thread.sleep(1000);

	}
	@Test
	public void TC24() throws InterruptedException{
		driver.findElement(By.xpath("//span[text()='Estimate']")).click();
		driver.findElement(By.xpath("//span[text()='My Estimates']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/section/section/main/div/div/div/div[2]/div/div/div/div/div/div/div/table/tbody/tr[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Edit']")).click();

	}
	@Test
	public void TC25() throws InterruptedException{
		driver.findElement(By.xpath("//span[text()='Estimate']")).click();
		driver.findElement(By.xpath("//span[text()='My Estimates']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/section/section/main/div/div/div/div[2]/div/div/div/div/div/div/div/table/tbody/tr[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='More']")).click();

	}
	@Test
	public void TC26() throws InterruptedException{
		driver.findElement(By.xpath("//span[text()='Estimate']")).click();
		driver.findElement(By.xpath("//span[text()='My Estimates']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/section/section/main/div/div/div/div[2]/div/div/div/div/div/div/div/table/tbody/tr[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='More']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Send Email']")).click();

	}

	@Test
	public void TC27() throws InterruptedException{
		driver.findElement(By.xpath("//span[text()='Estimate']")).click();
		driver.findElement(By.xpath("//span[text()='My Estimates']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/section/section/main/div/div/div/div[2]/div/div/div/div/div/div/div/table/tbody/tr[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='More']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Clone']")).click();

	}
	@Test
	public void TC28() throws InterruptedException{
		driver.findElement(By.xpath("//span[text()='Estimate']")).click();
		driver.findElement(By.xpath("//span[text()='My Estimates']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/section/section/main/div/div/div/div[2]/div/div/div/div/div/div/div/table/tbody/tr[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='More']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Delete']")).click();

	}
	@Test
	public void TC29() throws InterruptedException{
		driver.findElement(By.xpath("//span[text()='Estimate']")).click();
		driver.findElement(By.xpath("//span[text()='My Estimates']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/section/section/main/div/div/div/div[2]/div/div/div/div/div/div/div/table/tbody/tr[2]")).click();
		driver.findElement(By.xpath("//li[@class='active']")).click();
		Thread.sleep(1000);

	}
	@Test
	public void TC30() throws InterruptedException{
		driver.findElement(By.xpath("//span[text()='Estimate']")).click();
		driver.findElement(By.xpath("//span[text()='My Estimates']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/section/section/main/div/div/div/div[2]/div/div/div/div/div/div/div/table/tbody/tr[2]")).click();
		driver.findElement(By.xpath("//li[text()='Comments']")).click();
	}
	@Test
	public void TC31() throws InterruptedException{
		driver.findElement(By.xpath("//span[text()='Estimate']")).click();
		driver.findElement(By.xpath("//span[text()='My Estimates']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/section/section/main/div/div/div/div[2]/div/div/div/div/div/div/div/table/tbody/tr[2]")).click();
		driver.findElement(By.xpath("//li[text()='History']")).click();
	}
	@Test
	public void TC32() throws InterruptedException{
		driver.findElement(By.xpath("//span[text()='Estimate']")).click();
		driver.findElement(By.xpath("//span[text()='My Estimates']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/section/section/main/div/div/div/div[2]/div/div/div/div/div/div/div/table/tbody/tr[2]")).click();
		driver.findElement(By.xpath("//li[text()='Comments']")).click();
		driver.findElement(By.xpath("//input[@class='ant-input']")).sendKeys("xcv");
		driver.findElement(By.xpath("//span[text()='Send']")).click();
	}
	@Test(description="To Verify the pagination" )
	public void TC33() throws InterruptedException{
		driver.findElement(By.xpath("//span[text()='Estimate']")).click();
		driver.findElement(By.xpath("//span[text()='My Estimates']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[@class='ant-pagination-next']")).click();

	}
	@Test(description="Submit")
	public void TC34() throws InterruptedException{
		driver.findElement(By.xpath("//span[text()='Estimate']")).click();
		driver.findElement(By.xpath("//span[text()='My Estimates']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/section/section/main/div/div/div/div[2]/div/div/div/div/div/div/div/table/tbody/tr[2]")).click();
		driver.findElement(By.xpath("//li[@class='active']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='pp-main-button ']")).click();

	}
	@Test(description="BulkApprove")
	public void TC35() throws InterruptedException{
		driver.findElement(By.xpath("//span[text()='Estimate']")).click();
		driver.findElement(By.xpath("//span[text()='Approvals']")).click();
		driver.findElement(By.xpath("//input[@class='ant-checkbox-input' and @aria-label='Select all']")).click();
		driver.findElement(By.xpath("//button[@class='approve']")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//button[@class='ant-btn ant-btn-primary ant-dropdown-trigger pp-main-button']")).click();


	}
	@Test(description="SalesOrder")
	public void TC36(){
		driver.findElement(By.xpath("//span[text()='Sales Order']")).click();
	}

	@Test(description="SalesOrder creation")
	public void TC37() throws InterruptedException{
		driver.findElement(By.xpath("//span[text()='Sales Order']")).click();
		driver.findElement(By.xpath("//span[text()='My Sales']")).click();
		driver.findElement(By.xpath("//span[text()='Add New']")).click();
		driver.findElement(By.xpath("(//input[@class='ant-select-selection-search-input'])[2]")).sendKeys("anil");
		//driver.findElement(By.xpath("(//input[@class='ant-select-selection-search-input'])[1]")).click();
		//driver.findElement(By.xpath("//div[@class='ant-select-dropdown ant-select-dropdown-placement-bottomLeft  ant-select-dropdown-hidden']")).click();
		//driver.findElement(By.xpath("//input[@name='ref_po_no']")).sendKeys("123234");
		//driver.findElement(By.xpath("(//input[@class='ant-select-selection-search-input'])[3]")).sendKeys("123234");
		//driver.findElement(By.xpath("//input[@id=\"rc_select_2\"]")).sendKeys("Custom");
		driver.findElement(By.xpath("(//input[@class='ant-select-selection-search-input'])[4]")).sendKeys("lap");
		driver.findElement(By.xpath("//input[@name='items.0.quantity']")).sendKeys("10");
		driver.findElement(By.xpath("//input[@name='items.0.unit_price']")).sendKeys("10000");
		driver.findElement(By.xpath("//input[@name='items.0.discount_percentage']")).sendKeys("20");
		//driver.findElement(By.xpath("//div[@name='items.0.tax_type']")).sendKeys("GST 10%");
		driver.findElement(By.xpath("(//button[@id='save'])[1]")).click();
		Thread.sleep(10000);
	}
	@Test(description="Add Filter")
	public void TC38(){
		driver.findElement(By.xpath("//span[text()='Sales Order']")).click();
		driver.findElement(By.xpath("//span[text()='My Sales']")).click();
		//driver.findElement(By.xpath("(//tr[@class='ant-table-row ant-table-row-level-0'])[3]")).click();
		driver.findElement(By.xpath("//span[text()='Add Filters']")).click();

	}
	@Test(description="Pending Approval")
	public void TC39() throws InterruptedException{
		driver.findElement(By.xpath("//span[text()='Sales Order']")).click();
		driver.findElement(By.xpath("//span[text()='My Sales']")).click();
		driver.findElement(By.xpath("//span[text()='Add Filters']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[text()='Pending approval'])[1]")).click();

	}
	@Test(description="Search by id")
	public void TC40() throws InterruptedException{
		driver.findElement(By.xpath("//span[text()='Sales Order']")).click();
		driver.findElement(By.xpath("//span[text()='My Sales']")).click();
		driver.findElement(By.xpath("//span[text()='Add Filters']")).click();
		driver.findElement(By.xpath("//input[@class='ant-input ant-input-lg']")).sendKeys("SO_01222");


	}
	@Test(description="Search by customer")
	public void TC41() throws InterruptedException{
		driver.findElement(By.xpath("//span[text()='Sales Order']")).click();
		driver.findElement(By.xpath("//span[text()='My Sales']")).click();
		driver.findElement(By.xpath("//span[text()='Add Filters']")).click();
		driver.findElement(By.xpath("//input[@class='ant-input ant-input-lg']")).sendKeys("anil");
	}
	@Test(description="Search by estimate")
	public void TC42() throws InterruptedException{
		driver.findElement(By.xpath("//span[text()='Sales Order']")).click();
		driver.findElement(By.xpath("//span[text()='My Sales']")).click();
		driver.findElement(By.xpath("//span[text()='Add Filters']")).click();
		driver.findElement(By.xpath("//input[@class='ant-input ant-input-lg']")).sendKeys("asdfgh");

	}
	@Test(description="Sort")
	public void TC43() throws InterruptedException{
		driver.findElement(By.xpath("//span[text()='Sales Order']")).click();
		driver.findElement(By.xpath("//span[text()='My Sales']")).click();
		driver.findElement(By.xpath("//span[@class='anticon anticon-ellipsis pp-icon-25']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Customer Name']")).click();
	}
	@Test(description="Edit the Existing Sales Order")
	public void TC44() throws InterruptedException{
		driver.findElement(By.xpath("//span[text()='Sales Order']")).click();
		driver.findElement(By.xpath("//span[text()='My Sales']")).click();
		driver.findElement(By.xpath("//span[text()='Add Filters']")).click();
		driver.findElement(By.xpath("//input[@class='ant-input ant-input-lg']")).sendKeys("SO_01222");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//tbody[@class='ant-table-tbody']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Edit']")).click();
	}


	@Test(description="click on submit button Existing Sales Order")
	public void TC45() throws InterruptedException{
		driver.findElement(By.xpath("//span[text()='Sales Order']")).click();
		driver.findElement(By.xpath("//span[text()='My Sales']")).click();
		driver.findElement(By.xpath("//span[text()='Add Filters']")).click();
		driver.findElement(By.xpath("//input[@class='ant-input ant-input-lg']")).sendKeys("SO_01222");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//tbody[@class='ant-table-tbody']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Submit']")).click();
	}
	@Test(description="click on Recall")
	public void TC46() throws InterruptedException{
		driver.findElement(By.xpath("//span[text()='Sales Order']")).click();
		driver.findElement(By.xpath("//span[text()='My Sales']")).click();
		driver.findElement(By.xpath("//span[text()='Add Filters']")).click();
		driver.findElement(By.xpath("//input[@class='ant-input ant-input-lg']")).sendKeys("SO_01222");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//tbody[@class='ant-table-tbody']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Recall']")).click();


	}

	@Test(description="click on more option")
	public void TC47() throws InterruptedException{
		driver.findElement(By.xpath("//span[text()='Sales Order']")).click();
		driver.findElement(By.xpath("//span[text()='My Sales']")).click();
		driver.findElement(By.xpath("//span[text()='Add Filters']")).click();
		driver.findElement(By.xpath("//input[@class='ant-input ant-input-lg']")).sendKeys("SO_01222");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//tbody[@class='ant-table-tbody']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='More']")).click();

	}

	@Test(description="click on Send email	")
	public void TC48() throws InterruptedException{
		driver.findElement(By.xpath("//span[text()='Sales Order']")).click();
		driver.findElement(By.xpath("//span[text()='My Sales']")).click();
		driver.findElement(By.xpath("//span[text()='Add Filters']")).click();
		driver.findElement(By.xpath("//input[@class='ant-input ant-input-lg']")).sendKeys("SO_01222");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//tbody[@class='ant-table-tbody']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='More']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Send Email']")).click();


	}
	@Test(description="click on more option")
	public void TC49() throws InterruptedException{
		driver.findElement(By.xpath("//span[text()='Sales Order']")).click();
		driver.findElement(By.xpath("//span[text()='My Sales']")).click();
		driver.findElement(By.xpath("//span[text()='Add Filters']")).click();
		driver.findElement(By.xpath("//input[@class='ant-input ant-input-lg']")).sendKeys("SO_01222");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//tbody[@class='ant-table-tbody']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='More']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Clone']")).click();


	}
	@Test(description="click on Delete option")
	public void TC50() throws InterruptedException{
		driver.findElement(By.xpath("//span[text()='Sales Order']")).click();
		driver.findElement(By.xpath("//span[text()='My Sales']")).click();
		driver.findElement(By.xpath("//span[text()='Add Filters']")).click();
		driver.findElement(By.xpath("//input[@class='ant-input ant-input-lg']")).sendKeys("SO_01222");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//tbody[@class='ant-table-tbody']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='More']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Delete']")).click();


	}
	@Test(description="Details Tab in Sales Order Detail Page")
	public void TC51() throws InterruptedException{
		driver.findElement(By.xpath("//span[text()='Sales Order']")).click();
		driver.findElement(By.xpath("//span[text()='My Sales']")).click();
		driver.findElement(By.xpath("//span[text()='Add Filters']")).click();
		driver.findElement(By.xpath("//input[@class='ant-input ant-input-lg']")).sendKeys("SO_01222");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//tbody[@class='ant-table-tbody']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[@class='active']")).click();


	}
	@Test(description="clickon item Tab in Sales Order")
	public void TC52() throws InterruptedException{
		driver.findElement(By.xpath("//span[text()='Sales Order']")).click();
		driver.findElement(By.xpath("//span[text()='My Sales']")).click();
		driver.findElement(By.xpath("//span[text()='Add Filters']")).click();
		driver.findElement(By.xpath("//input[@class='ant-input ant-input-lg']")).sendKeys("SO_01222");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//tbody[@class='ant-table-tbody']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[@class='active']")).click();
		driver.findElement(By.xpath("//li[text()='Items']")).click();
		Thread.sleep(1000);
		boolean isListElementDisplayed=driver.findElement(By.xpath("//tr[@class='ant-table-row ant-table-row-level-0']")).isDisplayed();
		if (isListElementDisplayed) {
			System.out.println("The list element is displayed.");
		} else {
			System.out.println("The list element is not displayed.");
		}



	}
	@Test(description="add comment")
	public void TC53() throws InterruptedException{
		driver.findElement(By.xpath("//span[text()='Sales Order']")).click();
		driver.findElement(By.xpath("//span[text()='My Sales']")).click();
		driver.findElement(By.xpath("//span[text()='Add Filters']")).click();
		driver.findElement(By.xpath("//input[@class='ant-input ant-input-lg']")).sendKeys("SO_01222");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//tbody[@class='ant-table-tbody']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[contains(text(),'Comments')]")).click();
		driver.findElement(By.xpath("//input[@class='ant-input']")).sendKeys("abcd");
		driver.findElement(By.xpath("//span[text()='Send']")).click();	


	}
	@Test(description="History")
	public void TC54() throws InterruptedException{
		driver.findElement(By.xpath("//span[text()='Sales Order']")).click();
		driver.findElement(By.xpath("//span[text()='My Sales']")).click();
		driver.findElement(By.xpath("//span[text()='Add Filters']")).click();
		driver.findElement(By.xpath("//input[@class='ant-input ant-input-lg']")).sendKeys("SO_01222");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//tbody[@class='ant-table-tbody']")).click();
		driver.findElement(By.xpath("//li[contains(text(),'History')]")).click();


	}
	@Test(description="Details")
	public void TC55() throws InterruptedException{
		driver.findElement(By.xpath("//span[text()='Sales Order']")).click();
		driver.findElement(By.xpath("//span[text()='My Sales']")).click();
		driver.findElement(By.xpath("//span[text()='Add Filters']")).click();
		driver.findElement(By.xpath("//input[@class='ant-input ant-input-lg']")).sendKeys("SO_01222");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//tbody[@class='ant-table-tbody']")).click();
	}
	@Test(description="Invoices")
	public void TC56() throws InterruptedException{
		driver.findElement(By.xpath("//span[text()='Sales Order']")).click();
		driver.findElement(By.xpath("//span[text()='Invoices']")).click();
		driver.findElement(By.xpath("//span[text()='My Invoices']")).click();

	}
	@Test(description="Creat New Invoice")
	public void TC57() throws InterruptedException{
		driver.findElement(By.xpath("//span[text()='Sales Order']")).click();
		driver.findElement(By.xpath("//span[text()='Invoices']")).click();
		driver.findElement(By.xpath("//span[text()='My Invoices']")).click();
		driver.findElement(By.xpath("//span[text()='Add New']")).click();
		WebElement customerInfoElement = driver.findElement(By.xpath("(//input[@class='ant-select-selection-search-input'])[2]"));
		customerInfoElement.click();
		customerInfoElement.sendKeys("anjali tiwari");
		customerInfoElement.sendKeys(Keys.ARROW_DOWN);
		customerInfoElement.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("(//input[@class='ant-input pp-form-input'])[2]")).sendKeys("123");
		WebElement paymentTermsElents=driver.findElement(By.xpath("(//input[@class='ant-select-selection-search-input'])[3]"));
		paymentTermsElents.click();
		paymentTermsElents.sendKeys("Daily");
		paymentTermsElents.sendKeys(Keys.ARROW_DOWN);
		paymentTermsElents.sendKeys(Keys.ENTER);
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(1000);
		WebElement categoryElement=driver.findElement(By.xpath("(//input[@class='ant-select-selection-search-input'])[4]"));
		categoryElement.click();
		categoryElement.sendKeys("bill category");
		categoryElement.sendKeys(Keys.ARROW_DOWN);
		categoryElement.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		WebElement itemDetailElement=driver.findElement(By.xpath("(//input[@class='ant-select-selection-search-input'])[5]"));
		itemDetailElement.click();
		itemDetailElement.sendKeys("tarun1414");
		itemDetailElement.sendKeys(Keys.ARROW_DOWN);
		itemDetailElement.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("(//input[@class='ant-input pp-form-input'])[4]")).sendKeys("1");
		driver.findElement(By.xpath("(//input[@class='ant-input pp-form-input'])[5]")).sendKeys("10000");
		WebElement taxElement=driver.findElement(By.xpath("(//input[@class='ant-select-selection-search-input'])[6]"));
		taxElement.click();
		taxElement.sendKeys("GST 10%");
		taxElement.sendKeys(Keys.ARROW_DOWN);
		taxElement.sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@id='save']")).click();
		
		
	}
	@Test(description="Add Filters")
	public void TC58() throws InterruptedException {

		driver.findElement(By.xpath("//span[text()='Sales Order']")).click();
		driver.findElement(By.xpath("//span[text()='Invoices']")).click();
		driver.findElement(By.xpath("//span[text()='My Invoices']")).click();
		driver.findElement(By.xpath("//span[text()='Add Filters']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Pending approval']")).click();
		List<WebElement> statusElements = driver.findElements(By.xpath("//div[@class='status status_pending approval']"));

		System.out.println("Number of status elements: " + statusElements.size());

		for (WebElement statusElement : statusElements) {
			System.out.println("Status: " + statusElement.getText());
        }
	}


}





