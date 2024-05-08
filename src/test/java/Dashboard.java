
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import java.time.Duration;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Dashboard {
	public WebDriver driver;

	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://dashboard.forgocards.com/");
	}


	@Test(priority=1)
	public void Test1() {
		driver.get("https://dashboard.forgocards.com/");
		WebElement emailField = driver.findElement(By.xpath("//input[@id='email']"));
		WebElement passwordField = driver.findElement(By.id("password"));

		emailField.sendKeys("admin.fi@yopmail.com");
		passwordField.sendKeys("Spend@123");
		WebElement loginButton = driver.findElement(By.xpath("//button[contains(text(),'Login')]"));
		loginButton.click();
	}


	@Test(priority=2)
	public void Test2() throws InterruptedException {
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
		driver.findElement(By.xpath("//div[@class='go_to_organisation'][1]")).click();


	}
	@Test(priority=3)
	public void Test3() {
		driver.get("https://dashboard.forgocards.com/");
		WebElement emailField = driver.findElement(By.xpath("//input[@id='email']"));
		WebElement passwordField = driver.findElement(By.id("password"));

		emailField.sendKeys("admin.fi@yopmail.com");
		passwordField.sendKeys("Spend@123");
		WebElement loginButton = driver.findElement(By.xpath("//button[contains(text(),'Login')]"));
		loginButton.click();


	}
	@Test
	public void Test4() {
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
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/di//li[@class='ant-tabs-tab-btn tab-active'][contains(text(),'Overview')]v[1]/div[1]/section[1]/section[1]/main[1]/div[1]/ul[1]/li[2]")).click();
		driver.findElement(By.xpath("//div[@class='go_to_organisation'][1]")).click();

	}
	@Test
	public void Test5() {

		driver.findElement(By.xpath("//div[@class='cursor active']")).click();
	}
	@Test
	public void Test6() {
		driver.findElement(By.xpath("//li[normalize-space()='Trips (8)']")).click();
		driver.findElement(By.xpath("//li[normalize-space()='Trips (8)']")).click();

	}
	@Test
	public void Test7() {

		driver.get("https://dashboard.forgocards.com/");
		WebElement emailField = driver.findElement(By.xpath("//input[@id='email']"));
		WebElement passwordField = driver.findElement(By.id("password"));

		emailField.sendKeys("admin.fi@yopmail.com");
		passwordField.sendKeys("Spend@123");
		WebElement loginButton = driver.findElement(By.xpath("//button[contains(text(),'Login')]"));
		loginButton.click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/di//li[@class='ant-tabs-tab-btn tab-active'][contains(text(),'Overview')]v[1]/div[1]/section[1]/section[1]/main[1]/div[1]/ul[1]/li[2]")).click();
        driver.findElement(By.xpath("//div[@class='cursor active']")).click();

	}
	@AfterMethod()
	public void teardown() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
	}
}