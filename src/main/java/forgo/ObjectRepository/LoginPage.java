package forgo.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(xpath = "//input[@id='email']")

	private WebElement emailText;

	@FindBy(xpath = "//input[@id='password']")

	private WebElement passwordText;

	@FindBy(className = "loginButton primaryButton")

	private WebElement loginBtn;

	public LoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getEmailText() {
		return emailText;
	}

	public WebElement getPasswordText() {
		return passwordText;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	/**
	 * This method will login to the application with email and password
	 * @param email
	 * @param password
	 * @throws InterruptedException 
	 */
	public void login(String Email, String Password) {
		
		emailText.sendKeys(Email);
		
		passwordText.sendKeys(Password);
		
		loginBtn.click();
	}
}
