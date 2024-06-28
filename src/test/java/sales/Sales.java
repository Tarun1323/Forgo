package sales;
import java.io.File;
import java.time.Duration;
import java.util.Collections;
import java.util.List;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
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
	@Test(description="Details Invoices")
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

		List<WebElement> actualStatusElements = driver.findElements(By.xpath("//div[@class='status status_pending approval']"));

		if (!actualStatusElements.isEmpty()) {
			System.out.println("Pending approval status elements found:");
			for (WebElement actualCurrentStatusElement : actualStatusElements) {
				System.out.println("Size: " + actualCurrentStatusElement.getSize());
				System.out.println("Text: " + actualCurrentStatusElement.getText());
			}
		}

		else {
			System.out.println("No pending approval status elements found.");
		}
	}





	@Test(description="invoice number")
	public void TC59() throws InterruptedException {

		driver.findElement(By.xpath("//span[text()='Sales Order']")).click();
		driver.findElement(By.xpath("//span[text()='Invoices']")).click();
		driver.findElement(By.xpath("//span[text()='My Invoices']")).click();
		WebElement searchBox = driver.findElement(By.xpath("//input[@class='ant-input ant-input-lg']"));
		searchBox.sendKeys("INV_0232");
		List<WebElement> invoiceElements = driver.findElements(By.xpath("//td[@class='ant-table-cell']"));

		boolean invoiceFound = false;
		for (WebElement invoiceElement : invoiceElements) {
			String invoiceNumber = invoiceElement.getText();
			if (invoiceNumber.equals("INV_0232")) {
				invoiceFound = true;
				break; 
			}
		}

		if (invoiceFound) {
			System.out.println("Invoice with number 'INV_0232' found.");
		} else {
			System.out.println("Invoice with number 'INV_0232' not found.");
		}

	}

	@Test(description="customer name")
	public void TC60() {

		navigateToMyInvoicesPage();

		WebElement searchBox = driver.findElement(By.xpath("//input[@class='ant-input ant-input-lg']"));
		searchBox.sendKeys("anil");
		List<WebElement> invoiceElements = driver.findElements(By.xpath("(//td[@class='ant-table-cell ant-table-cell-row-hover'])[2]"));
		boolean invoiceFound = false;
		for (WebElement invoiceElement : invoiceElements) {
			String invoiceNumber = invoiceElement.getText();
			if (invoiceNumber.equals("anil")) {
				invoiceFound = true;
				break;
			}
		}

		if (invoiceFound) {
			System.out.println("Invoice with number 'anil' found.");
		} else {
			System.out.println("Invoice with number 'anil' not found.");
		}
	}

	private void navigateToMyInvoicesPage() {
		driver.findElement(By.xpath("//span[text()='Sales Order']")).click();
		driver.findElement(By.xpath("//span[text()='Invoices']")).click();
		driver.findElement(By.xpath("//span[text()='My Invoices']")).click();
	}


@Test(description="SO number")
public void TC61() throws InterruptedException {

	driver.findElement(By.xpath("//span[text()='Sales Order']")).click();
	driver.findElement(By.xpath("//span[text()='Invoices']")).click();
	driver.findElement(By.xpath("//span[text()='My Invoices']")).click();
	WebElement searchBox = driver.findElement(By.xpath("//td[@class='ant-table-cell ant-table-cell-row-hover']"));
	searchBox.sendKeys("5356");
	List<WebElement> invoiceElements = driver.findElements(By.xpath("//td[@class='ant-table-cell']"));
	System.out.println(invoiceElements.get(2));
	
}
@Test(description="Date")
public void TC62() throws InterruptedException {

	driver.findElement(By.xpath("//span[text()='Sales Order']")).click();
	driver.findElement(By.xpath("//span[text()='Invoices']")).click();
	driver.findElement(By.xpath("//span[text()='My Invoices']")).click();
	driver.findElement(By.xpath("//span[@class='anticon anticon-ellipsis pp-icon-25']")).click();
	Thread.sleep(1000);
    driver.findElement(By.xpath("(//span[@class='ant-dropdown-menu-title-content'])[3]")).click();	
}

@Test(description="Due Date")
public void TC63() throws InterruptedException {

	driver.findElement(By.xpath("//span[text()='Sales Order']")).click();
	driver.findElement(By.xpath("//span[text()='Invoices']")).click();
	driver.findElement(By.xpath("//span[text()='My Invoices']")).click();
	driver.findElement(By.xpath("//span[@class='anticon anticon-ellipsis pp-icon-25']")).click();
	Thread.sleep(1000);
    driver.findElement(By.xpath("(//span[@class='ant-dropdown-menu-title-content'])[4]")).click();	
}
@Test(description="Amount")
public void TC64() throws InterruptedException {

	driver.findElement(By.xpath("//span[text()='Sales Order']")).click();
	driver.findElement(By.xpath("//span[text()='Invoices']")).click();
	driver.findElement(By.xpath("//span[text()='My Invoices']")).click();
	driver.findElement(By.xpath("//span[@class='anticon anticon-ellipsis pp-icon-25']")).click();
	Thread.sleep(1000);
    driver.findElement(By.xpath("//span[text()='Amount']")).click();	
}
@SuppressWarnings("unused")
@Test(description="more option")
public void TC65() throws InterruptedException {

	driver.findElement(By.xpath("//span[text()='Sales Order']")).click();
	driver.findElement(By.xpath("//span[text()='Invoices']")).click();
	driver.findElement(By.xpath("//span[text()='My Invoices']")).click();
	driver.findElement(By.xpath("(//tr[@class='ant-table-row ant-table-row-level-0'])[1]")).click();
	WebElement invoiceElement = driver.findElement(By.xpath("//li[@class='active']"));
	List<WebElement> invoicesElements = Collections.singletonList(invoiceElement);
	for(WebElement invoicesElement:invoicesElements);
	System.out.println(invoiceElement.getText());
	

}



@Test(description="Send mail")
public void TC66() throws InterruptedException {
    
    driver.findElement(By.xpath("//span[text()='Sales Order']")).click();
    driver.findElement(By.xpath("//span[text()='Invoices']")).click();
    driver.findElement(By.xpath("//span[text()='My Invoices']")).click();
    driver.findElement(By.xpath("(//tr[@class='ant-table-row ant-table-row-level-0'])[1]")).click();
    WebElement dropDownsElement = driver.findElement(By.xpath("(//div[@class='ant-space-item'])[1]")); 
    dropDownsElement.click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//span[text()='Send Email']")).click();
    Thread.sleep(1000);
    try {
        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshotFile, new File("C:\\Users\\koppu\\Downloads\\Selenium Screen shots\\sendmail.jpg"));
        System.out.println("Screenshot saved successfully!");
    } catch (Exception e) {
        System.out.println("Failed to capture screenshot: " + e.getMessage());
    }
    
}
@Test(description="clone")
public void TC67() throws InterruptedException {
    
    driver.findElement(By.xpath("//span[text()='Sales Order']")).click();
    driver.findElement(By.xpath("//span[text()='Invoices']")).click();
    driver.findElement(By.xpath("//span[text()='My Invoices']")).click();
    driver.findElement(By.xpath("(//tr[@class='ant-table-row ant-table-row-level-0'])[1]")).click();
    WebElement dropDownsElement = driver.findElement(By.xpath("(//div[@class='ant-space-item'])[1]")); 
    dropDownsElement.click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//span[text()='Clone']")).click();
    Thread.sleep(3000);
    try {
        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshotFile, new File("C:\\Users\\koppu\\Downloads\\Selenium Screen shots\\clone.jpg"));
        System.out.println("Screenshot saved successfully!");
    } catch (Exception e) {
        System.out.println("Failed to capture screenshot: " + e.getMessage());
    }
    
}
@Test(description="Delete")
public void TC68() throws InterruptedException {
    
    driver.findElement(By.xpath("//span[text()='Sales Order']")).click();
    driver.findElement(By.xpath("//span[text()='Invoices']")).click();
    driver.findElement(By.xpath("//span[text()='My Invoices']")).click();
    driver.findElement(By.xpath("(//tr[@class='ant-table-row ant-table-row-level-0'])[1]")).click();
    WebElement dropDownsElement = driver.findElement(By.xpath("(//div[@class='ant-space-item'])[1]")); 
    dropDownsElement.click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//span[text()='Delete']")).click();
    driver.findElement(By.xpath("//span[text()='Confirm']")).click();
    Thread.sleep(500);
    try {
        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshotFile, new File("C:\\Users\\koppu\\Downloads\\Selenium Screen shots\\delete.jpg"));
        System.out.println("Screenshot saved successfully!");
    } catch (Exception e) {
        System.out.println("Failed to capture screenshot: " + e.getMessage());
    }
    
}
@Test(description="Delete")
public void TC69() throws InterruptedException {
    
    driver.findElement(By.xpath("//span[text()='Sales Order']")).click();
    driver.findElement(By.xpath("//span[text()='Invoices']")).click();
    driver.findElement(By.xpath("//span[text()='My Invoices']")).click();
    driver.findElement(By.xpath("(//tr[@class='ant-table-row ant-table-row-level-0'])[1]")).click();
    WebElement dropDownsElement = driver.findElement(By.xpath("(//div[@class='ant-space-item'])[1]")); 
    dropDownsElement.click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//span[text()='Delete']")).click();
    driver.findElement(By.xpath("//span[text()='Confirm']")).click();
    Thread.sleep(500);
    try {
        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshotFile, new File("C:\\Users\\koppu\\Downloads\\Selenium Screen shots\\delete.jpg"));
        System.out.println("Screenshot saved successfully!");
    } catch (Exception e) {
        System.out.println("Failed to capture screenshot: " + e.getMessage());
    }
}

    @Test(description="Approvals")
    public void TC70() throws InterruptedException {
        
        driver.findElement(By.xpath("//span[text()='Sales Order']")).click();
        driver.findElement(By.xpath("//span[text()='Invoices']")).click();
        driver.findElement(By.xpath("//span[text()='My Invoices']")).click();
        driver.findElement(By.xpath("//span[text()='Approvals']")).click();
        driver.findElement(By.xpath("//div[@class='status status_pending_approval']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='approve']")).click();
        driver.findElement(By.xpath("//button[@class='ant-btn ant-btn-primary pp-main-button']")).click();

        try {
            File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screenshotFile, new File("C:\\Users\\koppu\\Downloads\\Selenium Screen shots\\Approve.jpg"));
            System.out.println("Aprove screenshot saved successfully!");
        } catch (Exception e) {
            System.out.println("Failed to capture screenshot: " + e.getMessage());
        }
}
    @Test(description="To Verify invoice  details")
    public void TC71() throws InterruptedException {
        
        driver.findElement(By.xpath("//span[text()='Sales Order']")).click();
        driver.findElement(By.xpath("//span[text()='Invoices']")).click();
        driver.findElement(By.xpath("//span[text()='My Invoices']")).click();
        driver.findElement(By.xpath("(//tr[@class='ant-table-row ant-table-row-level-0'])[1]")).click();
        try {
            File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screenshotFile, new File("C:\\Users\\koppu\\Downloads\\Selenium Screen shots\\invoicedetails.jpg"));
            System.out.println("Aprove screenshot saved successfully!");
        } catch (Exception e) {
            System.out.println("Failed to capture screenshot: " + e.getMessage());
        }
}
    
    @Test(description="To Verify invoice Items")
    public void TC72() throws InterruptedException {
        
        driver.findElement(By.xpath("//span[text()='Sales Order']")).click();
        driver.findElement(By.xpath("//span[text()='Invoices']")).click();
        driver.findElement(By.xpath("//span[text()='My Invoices']")).click();
        driver.findElement(By.xpath("(//tr[@class='ant-table-row ant-table-row-level-0'])[1]")).click();
        driver.findElement(By.xpath("//li[contains(text(),'Items')]")).click();
        try {
            File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screenshotFile, new File("C:\\Users\\koppu\\Downloads\\Selenium Screen shots\\invoice-Items.jpg"));
            System.out.println("Aprove screenshot saved successfully!");
        } catch (Exception e) {
            System.out.println("Failed to capture screenshot: " + e.getMessage());
        }
}
    @Test(description="To Verify invoice PaymentsMade")
    public void TC73() throws InterruptedException {
        
        driver.findElement(By.xpath("//span[text()='Sales Order']")).click();
        driver.findElement(By.xpath("//span[text()='Invoices']")).click();
        driver.findElement(By.xpath("//span[text()='My Invoices']")).click();
        driver.findElement(By.xpath("(//tr[@class='ant-table-row ant-table-row-level-0'])[1]")).click();
        driver.findElement(By.xpath("//li[contains(text(),'Payment Made')]")).click();
        try {
            File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screenshotFile, new File("C:\\Users\\koppu\\Downloads\\Selenium Screen shots\\invoice-PaymentsMade.jpg"));
            System.out.println("Aprove screenshot saved successfully!");
        } catch (Exception e) {
            System.out.println("Failed to capture screenshot: " + e.getMessage());
        }
}
    @Test(description="To Verify invoice Comments")
    public void TC74() throws InterruptedException {
        
        driver.findElement(By.xpath("//span[text()='Sales Order']")).click();
        driver.findElement(By.xpath("//span[text()='Invoices']")).click();
        driver.findElement(By.xpath("//span[text()='My Invoices']")).click();
        driver.findElement(By.xpath("(//tr[@class='ant-table-row ant-table-row-level-0'])[1]")).click();
        driver.findElement(By.xpath("//li[contains(text(),'Comments')]")).click();
        driver.findElement(By.xpath("//input[@class='ant-input'] ")).sendKeys("xcb");
        driver.findElement(By.xpath("//button[@class='ant-btn ant-btn-default formButton ml1'] ")).click();
        Thread.sleep(1000);
        try {
            File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screenshotFile, new File("C:\\Users\\koppu\\Downloads\\Selenium Screen shots\\invoice-Comments.jpg"));
            System.out.println("Aprove screenshot saved successfully!");
        } catch (Exception e) {
            System.out.println("Failed to capture screenshot: " + e.getMessage());
        }
}
    @Test(description="To Verify invoice History")
    public void TC75() throws InterruptedException {
        
        driver.findElement(By.xpath("//span[text()='Sales Order']")).click();
        driver.findElement(By.xpath("//span[text()='Invoices']")).click();
        driver.findElement(By.xpath("//span[text()='My Invoices']")).click();
        driver.findElement(By.xpath("(//tr[@class='ant-table-row ant-table-row-level-0'])[1]")).click();
        driver.findElement(By.xpath("//li[contains(text(),'History')]")).click();
        try {
            File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screenshotFile, new File("C:\\Users\\koppu\\Downloads\\Selenium Screen shots\\invoice-History.jpg"));
            System.out.println("Aprove screenshot saved successfully!");
        } catch (Exception e) {
            System.out.println("Failed to capture screenshot: " + e.getMessage());
        }
    }
    @Test(description="To Verify Filters")
    public void TC76() throws InterruptedException {
        
        driver.findElement(By.xpath("//span[text()='Sales Order']")).click();
        driver.findElement(By.xpath("//span[text()='Invoices']")).click();
        driver.findElement(By.xpath("//span[text()='My Invoices']")).click();
        driver.findElement(By.xpath("//span[text()='Add Filters']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[text()='Pending approval']")).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.body.style.zoom='80%'");
        Thread.sleep(1000);
        try {
            File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screenshotFile, new File("C:\\Users\\koppu\\Downloads\\Selenium Screen shots\\invoice-Pending Approval.jpg"));
            System.out.println("Aprove screenshot saved successfully!");
        } catch (Exception e) {
            System.out.println("Failed to capture screenshot: " + e.getMessage());
        }
    }
  
        @Test(description="Creat Delivery Challan")
    	public void TC77() throws InterruptedException{
    		driver.findElement(By.xpath("//span[text()='Delivery Challan']")).click();
    		driver.findElement(By.xpath("//span[text()='My Delivery']")).click();
    		driver.findElement(By.xpath("//span[text()='Add New']")).click();
    		WebElement customerInfoElement = driver.findElement(By.xpath("(//input[@class='ant-select-selection-search-input'])[2]"));
    		customerInfoElement.click();
    		customerInfoElement.sendKeys("anjali tiwari");
    		customerInfoElement.sendKeys(Keys.ARROW_DOWN);
    		customerInfoElement.sendKeys(Keys.ENTER);
    		WebElement deliveryChallanElement=driver.findElement(By.xpath("(//input[@class='ant-input pp-form-input'])[1]"));
    		deliveryChallanElement.click();
    		Thread.sleep(1000);
    		deliveryChallanElement.sendKeys("12121");         
    		Thread.sleep(1000);
    		WebElement soNumberElement=driver.findElement(By.xpath("(//input[@class='ant-input pp-form-input'])[2]"));
    		soNumberElement.click();
    		soNumberElement.sendKeys("07667");
    		driver.findElement(By.xpath("//input[@name='challan_date']")).click();
    		Thread.sleep(1000); 
    		driver.findElement(By.xpath("//a[text()='Today']")).click();
    		Thread.sleep(1000); 
            JavascriptExecutor js = (JavascriptExecutor) driver;
    		WebElement saveElement=driver.findElement(By.xpath("//span[text()='Save']"));
    		js.executeScript("arguments[0].scrollIntoView(true);", saveElement);
    		Thread.sleep(1000);
    		WebElement challanaTypeElement=driver.findElement(By.name("challan_type"));
    		challanaTypeElement.click();
    		Thread.sleep(1000);
    		driver.findElement(By.xpath("//div[text()='Supply on Approvals']")).click();
    		driver.findElement(By.name("ware_house_detail_id")).click();
    		Thread.sleep(1000);
    		driver.findElement(By.xpath("//div[text()='amazon']")).click();
    		WebElement itemDetailsElement=driver.findElement(By.xpath("(//input[@class='ant-select-selection-search-input'])[5]"));
    		itemDetailsElement.click();
    		itemDetailsElement.sendKeys("tarun1414");
    		itemDetailsElement.sendKeys(Keys.ARROW_DOWN);
    		itemDetailsElement.sendKeys(Keys.ENTER);
    		driver.findElement(By.name("items.0.quantity")).sendKeys("1");
    		driver.findElement(By.name("items.0.discount_percentage")).sendKeys("15");
    		driver.findElement(By.xpath("//span[text()='Save']")).click();
    		Thread.sleep(1000);
            try {
                File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
                FileUtils.copyFile(screenshotFile, new File("C:\\Users\\koppu\\Downloads\\Selenium Screen shots\\DC-Creating.jpg"));
                System.out.println("Aprove screenshot saved successfully!");
            } catch (Exception e) {
                System.out.println("Failed to capture screenshot: " + e.getMessage());
            }
    		
    		}
        @Test(description="	To verify user is able to search the DC by reference number")
    	public void TC78() throws InterruptedException{
    		driver.findElement(By.xpath("//span[text()='Delivery Challan']")).click();
    		driver.findElement(By.xpath("//span[text()='My Delivery']")).click();
    		driver.findElement(By.xpath("//input[@id='search-input']")).sendKeys("07667");
    		Thread.sleep(1000);
    		try {
                File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
                FileUtils.copyFile(screenshotFile, new File("C:\\Users\\koppu\\Downloads\\Selenium Screen shots\\Dc searsch by reference NO.jpg"));
                System.out.println("Aprove screenshot saved successfully!");
            } catch (Exception e) {
                System.out.println("Failed to capture screenshot: " + e.getMessage());
            }
    		
        }
        @Test(description="	To verify user is able to search the Credit Note by customer name")
    	public void TC79() throws InterruptedException{
    		driver.findElement(By.xpath("//span[text()='Delivery Challan']")).click();
    		driver.findElement(By.xpath("//span[text()='My Delivery']")).click();
    		driver.findElement(By.xpath("//input[@id='search-input']")).sendKeys("anil");
    		Thread.sleep(1000);
    		try {
                File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
                FileUtils.copyFile(screenshotFile, new File("C:\\Users\\koppu\\Downloads\\Selenium Screen shots\\Dc search by customer name.jpg"));
                System.out.println("Aprove screenshot saved successfully!");
            } catch (Exception e) {
                System.out.println("Failed to capture screenshot: " + e.getMessage());
            }
    		
        }
        @Test(description="	To verify user is able to search the Credit Note by Delivery Chalana NO")
    	public void TC80() throws InterruptedException{
    		driver.findElement(By.xpath("//span[text()='Delivery Challan']")).click();
    		driver.findElement(By.xpath("//span[text()='My Delivery']")).click();
    		driver.findElement(By.xpath("//input[@id='search-input']")).sendKeys("DC_05");
    		Thread.sleep(1000);
    		try {
                File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
                FileUtils.copyFile(screenshotFile, new File("C:\\Users\\koppu\\Downloads\\Selenium Screen shots\\Dc search by Delivery Chalana NO.jpg"));
                System.out.println("Aprove screenshot saved successfully!");
            } catch (Exception e) {
                System.out.println("Failed to capture screenshot: " + e.getMessage());
            }
        }	
        @Test(description="	To verify user is able to search the Credit Note after applied any sort option")
    	public void TC81() throws InterruptedException{
    		driver.findElement(By.xpath("//span[text()='Delivery Challan']")).click();
    		driver.findElement(By.xpath("//span[text()='My Delivery']")).click();
    		driver.findElement(By.xpath("//span[@class='anticon anticon-ellipsis pp-icon-25']")).click();
    		Thread.sleep(1000);
    		driver.findElement(By.xpath("//span[text()='Date']")).click();
    		Thread.sleep(1000);
    		try {
                File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
                FileUtils.copyFile(screenshotFile, new File("C:\\Users\\koppu\\Downloads\\Selenium Screen shots\\Dc Sort by date.jpg"));
                System.out.println("Aprove screenshot saved successfully!");
            } catch (Exception e) {
                System.out.println("Failed to capture screenshot: " + e.getMessage());
            }
        
        }
        @Test(description="	To Verify the detail page of Credit Note")
    	public void TC82() throws InterruptedException{
    		driver.findElement(By.xpath("//span[text()='Delivery Challan']")).click();
    		driver.findElement(By.xpath("//span[text()='My Delivery']")).click();
    		Thread.sleep(1000);
    		driver.findElement(By.xpath("(//tr[@class='ant-table-row ant-table-row-level-0'])[1]")).click();
    		Thread.sleep(1000);
    		try {
                File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
                FileUtils.copyFile(screenshotFile, new File("C:\\Users\\koppu\\Downloads\\Selenium Screen shots\\Dc detail page.jpg"));
                System.out.println("Aprove screenshot saved successfully!");
            } catch (Exception e) {
                System.out.println("Failed to capture screenshot: " + e.getMessage());
            }
}
        @Test(description="	To Verify that user is able to Edit the Existing Credit Note")
    	public void TC83() throws InterruptedException{
    		driver.findElement(By.xpath("//span[text()='Delivery Challan']")).click();
    		driver.findElement(By.xpath("//span[text()='My Delivery']")).click();
    		Thread.sleep(1000);
    		driver.findElement(By.xpath("(//tr[@class='ant-table-row ant-table-row-level-0'])[1]")).click();
    		Thread.sleep(1000);
    		driver.findElement(By.xpath("//span[text()='Edit']")).click();
    		Thread.sleep(1000);

        try {
            File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screenshotFile, new File("C:\\Users\\koppu\\Downloads\\Selenium Screen shots\\Edit DC.jpg"));
            System.out.println("Aprove screenshot saved successfully!");
        } catch (Exception e) {
            System.out.println("Failed to capture screenshot: " + e.getMessage());
        }
        }
        @Test(description="	To verify Submit Button")
    	public void TC84() throws InterruptedException{
    		driver.findElement(By.xpath("//span[text()='Delivery Challan']")).click();
    		driver.findElement(By.xpath("//span[text()='My Delivery']")).click();
    		Thread.sleep(1000);
    		driver.findElement(By.xpath("(//tr[@class='ant-table-row ant-table-row-level-0'])[1]")).click();
    		Thread.sleep(1000);
    		driver.findElement(By.xpath("//span[text()='Submit']")).click();
    		Thread.sleep(1000);

        try {
            File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screenshotFile, new File("C:\\Users\\koppu\\Downloads\\Selenium Screen shots\\submit button .jpg"));
            System.out.println("Aprove screenshot saved successfully!");
        } catch (Exception e) {
            System.out.println("Failed to capture screenshot: " + e.getMessage());
        }
        }
        @Test(description="	To Verify Items Tab in Credit Note Detail Page")
    	public void TC85() throws InterruptedException{
    		driver.findElement(By.xpath("//span[text()='Delivery Challan']")).click();
    		driver.findElement(By.xpath("//span[text()='My Delivery']")).click();
    		Thread.sleep(1000);
    		driver.findElement(By.xpath("(//tr[@class='ant-table-row ant-table-row-level-0'])[1]")).click();
    		Thread.sleep(1000);
    		driver.findElement(By.xpath("//li[text()='Items']")).click();
    		Thread.sleep(1000);

            try {
                File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
                FileUtils.copyFile(screenshotFile, new File("C:\\Users\\koppu\\Downloads\\Selenium Screen shots\\DC-Item Tab  .jpg"));
                System.out.println("Aprove screenshot saved successfully!");
            } catch (Exception e) {
                System.out.println("Failed to capture screenshot: " + e.getMessage());
            }
            

        }
        @Test(description="	To Verify Comments Tab in Credit Note Detail Page")
    	public void TC86() throws InterruptedException{
    		driver.findElement(By.xpath("//span[text()='Delivery Challan']")).click();
    		driver.findElement(By.xpath("//span[text()='My Delivery']")).click();
    		Thread.sleep(1000);
    		driver.findElement(By.xpath("(//tr[@class='ant-table-row ant-table-row-level-0'])[1]")).click();
    		Thread.sleep(1000);
    		driver.findElement(By.xpath("//li[text()='Comments']")).click();
    		driver.findElement(By.xpath("//input[@class='ant-input']")).sendKeys("asdf");
    		driver.findElement(By.xpath("//span[text()='Send']")).click();
    		Thread.sleep(1000);

            try {
                File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
                FileUtils.copyFile(screenshotFile, new File("C:\\Users\\koppu\\Downloads\\Selenium Screen shots\\DC-Comment Tab  .jpg"));
                System.out.println("Aprove screenshot saved successfully!");
            } catch (Exception e) {
                System.out.println("Failed to capture screenshot: " + e.getMessage());
            }
            

        }
        @Test(description="To Verify History Tab in Credit Note Detail Page")
    	public void TC87() throws InterruptedException{
    		driver.findElement(By.xpath("//span[text()='Delivery Challan']")).click();
    		driver.findElement(By.xpath("//span[text()='My Delivery']")).click();
    		Thread.sleep(1000);
    		driver.findElement(By.xpath("(//tr[@class='ant-table-row ant-table-row-level-0'])[1]")).click();
    		Thread.sleep(1000);
    		driver.findElement(By.xpath("//li[text()='History']")).click();
    		Thread.sleep(1000);

            try {
                File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
                FileUtils.copyFile(screenshotFile, new File("C:\\Users\\koppu\\Downloads\\Selenium Screen shots\\DC-History  Tab  .jpg"));
                System.out.println("Aprove screenshot saved successfully!");
            } catch (Exception e) {
                System.out.println("Failed to capture screenshot: " + e.getMessage());
            }
            

        }
        @Test(description="To Verify filter")
    	public void TC88() throws InterruptedException{
    		driver.findElement(By.xpath("//span[text()='Delivery Challan']")).click();
        	driver.findElement(By.xpath("//span[text()='My Delivery']")).click();
        	Thread.sleep(1000);
        	driver.findElement(By.xpath("//span[text()='Add Filters']")).click();
        	Thread.sleep(1000);
        	driver.findElement(By.xpath("(//span[@class='ant-dropdown-menu-title-content'])[3]")).click();
        	Thread.sleep(1000);
        	try {
            File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screenshotFile, new File("C:\\Users\\koppu\\Downloads\\Selenium Screen shots\\DC-Filters Tab  .jpg"));
            System.out.println("Aprove screenshot saved successfully!");
                 }
        	catch (Exception e) {
            System.out.println("Failed to capture screenshot: " + e.getMessage());
        }
        
}
        @Test(description="To Verify Payments Recived	")
    	public void TC89() throws InterruptedException{
    		driver.findElement(By.xpath("//span[text()='Payments Received']")).click();
    		try {
                File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
                FileUtils.copyFile(screenshotFile, new File("C:\\Users\\koppu\\Downloads\\Selenium Screen shots\\Payments Recived.jpg"));
                System.out.println("screenshot saved successfully!");
                     }
            	catch (Exception e) {
                System.out.println("Failed to capture screenshot: " + e.getMessage());
            }
        
}
        @Test(description="To Verify Payments Recived-Add filters")
    	public void TC90() throws InterruptedException{
    		driver.findElement(By.xpath("//span[text()='Payments Received']")).click();
    		driver.findElement(By.xpath("//span[text()='Add Filters']")).click();
    		Thread.sleep(1000);
    		driver.findElement(By.xpath("//span[text()='Partially Paid']")).click();
    		Thread.sleep(1000);

    		try {
                File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
                FileUtils.copyFile(screenshotFile, new File("C:\\Users\\koppu\\Downloads\\Selenium Screen shots\\Payments Recived-Add filters.jpg"));
                System.out.println("screenshot saved successfully!");
                     }
            	catch (Exception e) {
                System.out.println("Failed to capture screenshot: " + e.getMessage());
            }
        }
        @Test(description="To Verify Payments Recived- Search by CustomerName")
    	public void TC91() throws InterruptedException{
    		driver.findElement(By.xpath("//span[text()='Payments Received']")).click();
    		driver.findElement(By.xpath("//input[@id='search-input']")).sendKeys("Nagarjuna");
    		Thread.sleep(1000);

    		try {
                File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
                FileUtils.copyFile(screenshotFile, new File("C:\\Users\\koppu\\Downloads\\Selenium Screen shots\\Payments Recived-search by CustomerName.jpg"));
                System.out.println("screenshot saved successfully!");
                     }
            	catch (Exception e) {
                System.out.println("Failed to capture screenshot: " + e.getMessage());
            }
        }
        @Test(description="To Verify Payments Recived- Search by InoviceNo")
    	public void TC92() throws InterruptedException{
    		driver.findElement(By.xpath("//span[text()='Payments Received']")).click();
    		driver.findElement(By.xpath("//input[@id='search-input']")).sendKeys("INV_23");
    		Thread.sleep(1000);

    		try {
                File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
                FileUtils.copyFile(screenshotFile, new File("C:\\Users\\koppu\\Downloads\\Selenium Screen shots\\Payments Recived-search by InoviceNo.jpg"));
                System.out.println("screenshot saved successfully!");
                     }
            	catch (Exception e) {
                System.out.println("Failed to capture screenshot: " + e.getMessage());
            }
        }
        @Test(description="To Verify Payments Recived- sort by by Date")
    	public void TC93() throws InterruptedException{
    		driver.findElement(By.xpath("//span[text()='Payments Received']")).click();
    		driver.findElement(By.xpath("//span[@class='anticon anticon-ellipsis pp-icon-25']")).click();
    		Thread.sleep(1000);
    		driver.findElement(By.xpath("//span[text()='Date']")).click();
    		Thread.sleep(1000);
    		try {
                File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
                FileUtils.copyFile(screenshotFile, new File("C:\\Users\\koppu\\Downloads\\Selenium Screen shots\\Payments Recived-sort by Date.jpg"));
                System.out.println("screenshot saved successfully!");
                     }
            	catch (Exception e) {
                System.out.println("Failed to capture screenshot: " + e.getMessage());
            }
    		
}
        @Test(description="To Verify Payments Recived- sort by by CustomerName")
    	public void TC94() throws InterruptedException{
    		driver.findElement(By.xpath("//span[text()='Payments Received']")).click();
    		driver.findElement(By.xpath("//span[@class='anticon anticon-ellipsis pp-icon-25']")).click();
    		Thread.sleep(1000);
    		driver.findElement(By.xpath("//span[text()='Customer Name']")).click();
    		Thread.sleep(1000);
    		try {
                File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
                FileUtils.copyFile(screenshotFile, new File("C:\\Users\\koppu\\Downloads\\Selenium Screen shots\\Payments Recived-sort by CustomerName.jpg"));
                System.out.println("screenshot saved successfully!");
                     }
            	catch (Exception e) {
                System.out.println("Failed to capture screenshot: " + e.getMessage());
            }
    		
}
        
        @Test(description="To Verify Payments Recived- sort by by Mode")
    	public void TC95() throws InterruptedException{
    		driver.findElement(By.xpath("//span[text()='Payments Received']")).click();
    		driver.findElement(By.xpath("//span[@class='anticon anticon-ellipsis pp-icon-25']")).click();
    		Thread.sleep(1000);
    		driver.findElement(By.xpath("//span[text()='Mode']")).click();
    		Thread.sleep(1000);
    		try {
                File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
                FileUtils.copyFile(screenshotFile, new File("C:\\Users\\koppu\\Downloads\\Selenium Screen shots\\Payments Recived-sort by Mode.jpg"));
                System.out.println("screenshot saved successfully!");
                     }
            	catch (Exception e) {
                System.out.println("Failed to capture screenshot: " + e.getMessage());
            }
    		
}
        @Test(description="To Verify Payments Recived- sort by by Amount")
    	public void TC96() throws InterruptedException{
    		driver.findElement(By.xpath("//span[text()='Payments Received']")).click();
    		driver.findElement(By.xpath("//span[@class='anticon anticon-ellipsis pp-icon-25']")).click();
    		Thread.sleep(1000);
    		driver.findElement(By.xpath("//span[text()='Amount']")).click();
    		Thread.sleep(1000);
    		try {
                File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
                FileUtils.copyFile(screenshotFile, new File("C:\\Users\\koppu\\Downloads\\Selenium Screen shots\\Payments Recived-sort by Amount.jpg"));
                System.out.println("screenshot saved successfully!");
                     }
            	catch (Exception e) {
                System.out.println("Failed to capture screenshot: " + e.getMessage());
            }
    		
}
}


    












