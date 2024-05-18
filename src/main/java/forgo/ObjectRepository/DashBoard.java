package forgo.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import forgo.genericUtility.WebDriverUtility;

public class DashBoard extends WebDriverUtility {
	
	@FindBy (className = "user-name")
	
	private WebElement userNameDrop;
	
	@FindBy (xpath = "//span[text()='Logout']")
	
	private WebElement logoutBtn;
	
public DashBoard(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getUserNameDrop() {
		return userNameDrop;
	}

	public WebElement getLogoutBtn() {
		return logoutBtn;
	}
	

	/**
	 * This method will perform logout 
	 */
	public void logout()
	
	{
		userNameDrop.click();
		logoutBtn.click();
	}
}
