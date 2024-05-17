package expenses;

import java.time.Duration;
import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import forgo.genericUtility.JavaUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Expenses {

	public WebDriver driver;
	
	JavaUtility jUtil = new JavaUtility();

	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://dashboard.forgocards.com/");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin.fi@yopmail.com");
		driver.findElement(By.id("password")).sendKeys("Spend@123");
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement organizationElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("go_to_organisation")));
		organizationElement.click();
		WebElement Expenses=	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[contains(@class,'menu-item')])[6]")));
		Expenses.click();
		
		

	}

	@AfterMethod
	public void closebrowser() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
	}

	@Test
	public void Create_Expense() throws InterruptedException {

		driver.findElement(By.xpath("//span[text()='Add New']")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("amount_cents")).sendKeys(jUtil.generateRandomNumber(4));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='ant-picker-input']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Now']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@class='ant-select-selection-search'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Test']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@class='ant-select-selection-search-input'])[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Stationary']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@title='Card']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[5]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Company']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@class='ant-input'])[2]")).sendKeys("Automation Testing");
		Thread.sleep(1000);
		// driver.findElement(By.xpath("//span[text()='Save and Close']")).click();
		driver.findElement(By.xpath("//span[text()='Cancel']")).click();

	}

	@Test
	public void Edit_Expense() throws InterruptedException {
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("document.querySelector(\"div[style$='overflow: auto hidden;']\").scrollLeft= 50");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[text()='saved'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Edit']")).click();
		Thread.sleep(1000);
		String s = jUtil.generateRandomNumber(3);
		driver.findElement(By.name("amount_cents")).sendKeys(s);
		Thread.sleep(1000);
	    //driver.findElement(By.xpath("//span[text()='Save and Close']")).click();
	    
	}

	@Test
	public void Expense_Filters() throws InterruptedException {

		driver.findElement(By.xpath("//span[text()='Add Filters']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Saved']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Saved']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Reported']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Reported']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Pending Reimbursements']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Pending Reimbursements']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Rejected']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Rejected']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Reimbursed']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Reimbursed']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Pending Approval']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Pending Approval']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='All Expenses']")).click();

	}

	@Test
	public void Expense_Search() throws InterruptedException {
		
		Thread.sleep(2000);
		WebElement search = driver.findElement(By.xpath("//input[@id='search-input']"));
		search.sendKeys("25");
		Thread.sleep(2000);
		search.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		Thread.sleep(2000);
		search.sendKeys("Zomato");
		Thread.sleep(2000);
		search.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		Thread.sleep(2000);
		search.sendKeys("Test");
		Thread.sleep(2000);
		search.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
	}

	@Test
	public void Expense_Sort() throws InterruptedException {

		driver.findElement(By.xpath("//span[@class='anticon anticon-ellipsis pp-icon-25']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='amount']")).click(); 
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='anticon anticon-ellipsis pp-icon-25']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='transaction date']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='anticon anticon-ellipsis pp-icon-25']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='merchant name']")).click();

	}

}
