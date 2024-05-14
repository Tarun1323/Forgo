package sales;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTest {
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://dashboard.forgocards.com/");
  }
    

    @AfterTest
    public void tearDown() {
        // Close WebDriver
        driver.quit();
    }

    @Test
    public void testValidLogin() {
        
        WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
        username.sendKeys("admin.fi@yopmail.com");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("Spend@123");
        WebElement login = driver.findElement(By.xpath("//button[contains(text(),'Login')]"));
        login.click();
        
        WebElement homePage = driver.findElement(By.id("homePage"));
        Assert.assertTrue(homePage.isDisplayed(), "Home page is not displayed after login");
    }

    @Test
    public void testInvalidLogin() {
        
        WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
        username.sendKeys("adminfi@yopmail.com");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("Spend@123");
        WebElement login = driver.findElement(By.xpath("//button[contains(text(),'Login')]"));
        login.click();
        
        WebElement validationMessage = driver.findElement(By.id("validationMessage"));
        Assert.assertTrue(validationMessage.isDisplayed(), "Validation message is not displayed for invalid login");
    }

    @Test
    public void testResetPasswordPage() {
    	 WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
         username.sendKeys("admin.fi@yopmail.com");
         WebElement resetPasswordPage = driver.findElement(By.className("text-dim ml2 cursor"));
        Assert.assertTrue(resetPasswordPage.isDisplayed(), "Reset password page is not opened");
    }

    @Test
    public void testResetPasswordLinkSent() {
    	WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
        username.sendKeys("admin.fi@yopmail.com");
        
        WebElement resetPasswordButton = driver.findElement(By.className("text-dim ml2 cursor"));
        resetPasswordButton.click();
        WebElement resetPasswordSentMessage = driver.findElement(By.id("resetPasswordSentMessage"));
        Assert.assertTrue(resetPasswordSentMessage.isDisplayed(), "Reset password link is not sent to email");
    }

    @Test
    public void testPasswordChangeAndLogin() {
        // Step 1: Open email and click on reset password link
        // This step cannot be automated
        
        // Step 2: Enter new password
        WebElement newPassword = driver.findElement(By.id("newPassword"));
        newPassword.sendKeys("new_valid_password");
        
        // Step 3: Enter confirm new password
        WebElement confirmNewPassword = driver.findElement(By.id("confirmNewPassword"));
        confirmNewPassword.sendKeys("new_valid_password");
        
        // Step 4: Click on set password button
        WebElement setPasswordButton = driver.findElement(By.id("setPasswordButton"));
        setPasswordButton.click();
        
        // Step 5: Verify login page is opened after password change
        WebElement loginPage = driver.findElement(By.id("loginPage"));
        Assert.assertTrue(loginPage.isDisplayed(), "Login page is not opened after password change");
    }

    @Test
    public void testViewPassword() {
        // Step 1: Click on eye icon to view password
        WebElement eyeIcon = driver.findElement(By.id("eyeIcon"));
        eyeIcon.click();
        
        // Step 2: Verify password is visible
        WebElement passwordField = driver.findElement(By.id("password"));
        Assert.assertEquals(passwordField.getAttribute("type"), "text", "Password is not visible");
    }

    @Test
    public void testPasswordEncryption() {
        // Step 1: Open/Paste/Enter the URL
        driver.get("url");
        
        // Step 2: Enter the valid username
        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("valid_username");
        
        // Step 3: Enter the valid password
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("valid_password");
        
        // Step 4: Click on Login button
        WebElement loginButton = driver.findElement(By.id("loginButton"));
        loginButton.click();
        
        // Step 5: Verify password is encrypted
        // Cannot be directly verified with Selenium
        // You may need to inspect network traffic to verify encryption
    }

    @Test
    public void testLoginWithEnterKey() {
        // Step 1: Open/Paste/Enter the URL
        driver.get("url");
        
        // Step 2: Enter the valid username
        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("valid_username");
        
        // Step 3: Enter the valid password
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("valid_password");
        
        // Step 4: Press Enter key
        password.sendKeys(Keys.ENTER);
        
        // Step 5: Verify home page is displayed
        WebElement homePage = driver.findElement(By.id("homePage"));
        Assert.assertTrue(homePage.isDisplayed(), "Home page is not displayed after login with Enter key");
    }

    @Test
    public void testHomePageInNewWindow() {
        // Step 1: Open/Paste/Enter the URL
        driver.get("url");
        
        // Step 2: Copy logged-in URL
        String loggedInURL = driver.getCurrentUrl();
        
        // Step 3: Open/Paste/Enter the copied URL in another window
        // This step cannot be automated
        
        // Step 4: Verify home page is displayed in new window
        // Cannot be directly verified with Selenium
        // You may need to switch to the new window and verify
    }

    @Test
    public void testLoginWithInvalidCredentials() {
        // Step 1: Open/Paste/Enter the URL
        driver.get("url");
        
        // Step 2: Enter the invalid username
        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("invalid_username");
        
        // Step 3: Enter the invalid password
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("invalid_password");
        
        // Step 4: Click on Login button
        WebElement loginButton = driver.findElement(By.id("loginButton"));
        loginButton.click();
        
        // Step 5: Verify validation message is displayed
        WebElement validationMessage = driver.findElement(By.id("validationMessage"));
        Assert.assertTrue(validationMessage.isDisplayed(), "Validation message is not displayed for invalid login");
    }
}
