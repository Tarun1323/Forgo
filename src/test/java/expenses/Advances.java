package expenses;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Advances {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://dashboard.forgocards.com/");
		//driver.get("https://ems-web.finmeadows.com/");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin.fi@yopmail.com");
		driver.findElement(By.id("password")).sendKeys("Spend@123");
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement organizationElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("go_to_organisation")));
		organizationElement.click();
		WebElement Expenses=	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[contains(@class,'menu-item')])[6]")));
		Expenses.click();
		
		

	}

	@AfterClass()
	public void closebrowser() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
	}
	
	
	


}
