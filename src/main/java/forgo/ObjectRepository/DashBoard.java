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
	
	@FindBy (xpath = "(//div[@data-testid='/transfers'])[1]")
	private WebElement paymentsLnk;
	
	@FindBy (xpath = "(//div[@data-testid='/cards'])[1]")
	private WebElement cardsLnk;
	
	@FindBy (xpath = "(//div[@data-testid='/statements'])[1]")
	private WebElement statementsLnk;

	@FindBy (xpath = "(//div[@data-testid='/sales'])[1]")
	private WebElement salesLnk;
	
	@FindBy (xpath = "(//div[@data-testid='/purchases'])[1]")
	private WebElement purchasesLnk;
	
	@FindBy (xpath = "(//div[@data-testid='/inventory'])[1]")
	private WebElement inventoryLnk;
	
	@FindBy (xpath = "(//div[@data-testid='/payroll'])[1]")
	private WebElement payrollLnk;
	
	@FindBy (xpath = "(//div[@data-testid='/account'])[1]")
	private WebElement accountsLnk;
	
	@FindBy (xpath = "(//div[@data-testid='/analytics'])[1]")
	private WebElement analyticsLnk;
	
	@FindBy (xpath = "(//div[@data-testid='/settings'])[1]")
	private WebElement settingsLnk;
	
	@FindBy (xpath = "(//div[@data-testid='/expenses'])[1]")
	private WebElement expensesLnk;
	
public DashBoard(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getUserNameDrop() {
		return userNameDrop;
	}

	public WebElement getLogoutBtn() {
		return logoutBtn;
	}
	
	public WebElement getStatementsLnk() {
		return statementsLnk;
	}


	public WebElement getPaymentsLnk() {
		return paymentsLnk;
	}

	public WebElement getCardsLnk() {
		return cardsLnk;
	}

	public WebElement getSalesLnk() {
		return salesLnk;
	}

	public WebElement getPurchasesLnk() {
		return purchasesLnk;
	}

	public WebElement getInventoryLnk() {
		return inventoryLnk;
	}

	public WebElement getPayrollLnk() {
		return payrollLnk;
	}

	public WebElement getAccountsLnk() {
		return accountsLnk;
	}

	public WebElement getAnalyticsLnk() {
		return analyticsLnk;
	}

	public WebElement getSettingsLnk() {
		return settingsLnk;
	}
	
	public WebElement getExpensesLnk() {
		return expensesLnk;
	}

//---------------------------------------------------Click On Modules----------------------------------------------------------------------
	public void clickOnStatementsLnk() {
		 statementsLnk.click();
	}


	public void clickOnPaymentsLnk() {
		 paymentsLnk.click();
	}

	public void clickOnCardsLnk() {
		 cardsLnk.click();
	}

	public void clickOnSalesLnk() {
		 salesLnk.click();
	}

	public void clickOnPurchasesLnk() {
		 purchasesLnk.click();
	}

	public void clickOnInventoryLnk() {
		 inventoryLnk.click();
	}

	public void clickOnPayrollLnk() {
		 payrollLnk.click();
	}

	public void clickOnAccountsLnk() {
		 accountsLnk.click();
	}

	public void clickOnAnalyticsLnk() {
		 analyticsLnk.click();
	}

	public void clickOnSettingsLnk() {
		 settingsLnk.click();
	}
	
	public void clickOnExpensesLnk() {
		 expensesLnk.click();
	}
	
	/**
	 * This method will perform logout 
	 * @throws InterruptedException 
	 */
	public void logout() throws InterruptedException
	
	{
		userNameDrop.click();
		Thread.sleep(1000);
		logoutBtn.click();
	}
}
