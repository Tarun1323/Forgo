package sales;

import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;








public class Payment_Received {
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
	@Test(description="To Verify Payments Recived")
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
		@AfterMethod()
		public void teardown() throws InterruptedException {
			Thread.sleep(3000);
			driver.close();
		
}
}


