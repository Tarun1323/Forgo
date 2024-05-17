package forgo.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import forgo.genericUtility.WebDriverUtility;

public class DashBoard extends WebDriverUtility {
	
	@FindBy (className = "user-name")
	
	private WebElement userNameDrop;
	
	@FindBy (className = "ant-dropdown-menu-title-content")
	
	private WebElement logoutBtn;

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
