package loginforgo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class web {

	public WebDriver driver;

	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://dashboard.forgocards.com/");
	}

	@Test(priority = 1, description = "This test verifies message after sending credentials")
	public void verifyMessageAfterSendingCredentials() {
		// Locate the email and password fields and enter credentials
		WebElement emailField = driver.findElement(By.xpath("//input[@id='email']"));
		WebElement passwordField = driver.findElement(By.id("password"));
		emailField.sendKeys("admin.fi@yopmail.com");
		passwordField.sendKeys("Password@1323");

		WebElement loginButton = driver.findElement(By.xpath("//button[contains(text(),'Login')]"));
		loginButton.click();


	}



	@Test(priority = 2, description = "This test verifies wrong email functionality")
	public void wrongEmail() {
		driver.findElement(By.id("email")).sendKeys("admn.fi@yopmail.com");
		driver.findElement(By.id("password")).sendKeys("Spend@123");
		WebElement loginButton = driver.findElement(By.xpath("//button[contains(text(),'Login')]"));
		loginButton.click();


	}

	@Test(priority = 3, description = "This test verifies WrongPassword functionality")
	public void wrongPassword() throws InterruptedException {
		driver.findElement(By.id("email")).sendKeys("admin.fi@yopmail.com");
		driver.findElement(By.id("password")).sendKeys("spend@123");
		WebElement login = driver.findElement(By.xpath("//button[contains(text(),'Login')]"));
		login.click();
		Thread.sleep(3000);
		String errorMessageText= driver.findElement(By.xpath("//span[@class=\"messageTest\"]")).getText();
		System.out.println(errorMessageText);
	}

	@Test(priority = 4, description = "This test verifies WrongCredentials functionality")
	public void wrongCredentials() {
		driver.findElement(By.id("email")).sendKeys("admn.fi@yopmail.com");
		driver.findElement(By.id("password")).sendKeys("spend@123");
		WebElement login = driver.findElement(By.xpath("//button[contains(text(),'Login')]"));
		login.click();
	}

	@Test(priority = 5, description = "This test verifies NoCredentials functionality")
	public void noCredentials() {
		driver.findElement(By.id("email")).sendKeys(" ");
		driver.findElement(By.id("password")).sendKeys(" ");
		WebElement login = driver.findElement(By.xpath("//button[contains(text(),'Login')]"));
		login.click();
	}

	@Test(priority = 6, description = "This test verifies only email functionality")
	public void onlyEmailCredentials() {
		driver.findElement(By.id("email")).sendKeys("admn.fi@yopmail.com");
		driver.findElement(By.id("password")).sendKeys(" ");
		WebElement login = driver.findElement(By.xpath("//button[contains(text(),'Login')]"));
		login.click();
	}

	@Test(priority = 7, description = "This test verifies only password functionality")
	public void onlyPasswordCredentials() {
		driver.findElement(By.id("email")).sendKeys(" ");
		driver.findElement(By.id("password")).sendKeys("spend@123");
		WebElement login = driver.findElement(By.xpath("//button[contains(text(),'Login')]"));
		login.click();
	}

	@Test(priority = 8, description = "This test verifies copy url and paste in new browser")
	public void copyPastAndPasteURL() {
		driver.get("https://dashboard.forgocards.com/");
		String loggedInURL = driver.getCurrentUrl();
		WebDriver newDriver = new ChromeDriver();
		newDriver.get(loggedInURL);
		driver.quit();
		newDriver.quit();
	}
	@Test(priority=9,description="This test verifies To Verify forgot password button")
	public void verifyForgotPasswordButton() throws InterruptedException {
		driver.findElement(By.xpath("//span[@class='text-dim ml2 cursor']")).click();
		Thread.sleep(3000);
	}
	@Test(priority=10,description="To verify user is able set new password")
	public void setNewPassword() {
		driver.findElement(By.xpath("//span[@class='text-dim ml2 cursor']")).click();
		driver.findElement(By.xpath("//input[@placeholder=\" Enter Email Address\"]")).sendKeys("admin.fi@yopmail.com");
		driver.findElement(By.xpath("//button[@class=\"ant-btn ant-btn-primary primaryButton\"]")).click();
		driver.get("https://dashboard.forgocards.com/reset-password?token=a3d125d76fad4b3a9e2f19c0f3d08f9bea42");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Password@1323");
		driver.findElement(By.xpath("//input[@name=\"password_confirmation\"]")).sendKeys("Password@1323");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	@Test(priority=11,description="To verify user is able login with new password")
	public void loginWithNewPassword() {
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin.fi@yopmail.com");
		driver.findElement(By.id("password")).sendKeys("Password@1323");
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();

	}
	@Test(priority=11,description="To verify user is able login with new password")
	public void loginWithOldPassword() {
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin.fi@yopmail.com");
		driver.findElement(By.id("password")).sendKeys("Spend@123");
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();

	}

	@AfterMethod()
	public void teardown() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
	}
}
