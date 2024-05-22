package forgo.genericUtility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * This class contains all generic methods related to web driver actions
 * 
 * @author Nagarjuna
 * 
 */

public class WebDriverUtility {

	/**
	 * This method will maximise the window
	 * 
	 * @param driver
	 */
	public void maximiseWindow(WebDriver driver) {

		driver.manage().window().maximize();

	}

	/**
	 * This method will wait for 20 seconds for the entire DOM Stucture to load
	 * 
	 * @param driver
	 */

	public void waitForElementsToLoadInDOM(WebDriver driver) {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	/**
	 * This method will wait for perticular element to be visible
	 * 
	 * @param driver
	 * @param element
	 */
	public void waitForElementToLoad(WebDriver driver, WebElement element) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	/**
	 * This method will wait For perticular Element to be Clickable
	 * 
	 * @param driver
	 * @param element
	 */
	public void waitForElementToBeClickable(WebDriver driver, WebElement element) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	/**
	 * This method will handle the dropdown by select class using index
	 * 
	 * @param element
	 * @param index
	 */
	public void handleDropdown(WebElement element, int index) {

		Select s = new Select(element);
		s.selectByIndex(index);
	}

	/**
	 * This method will handle the dropdown by select class using visible Text
	 * 
	 * @param element
	 * @param visibleText
	 */
	public void handleDropdown(WebElement element, String visibleText) {

		Select s = new Select(element);
		s.selectByVisibleText(visibleText);
	}

	/**
	 * This method will handle the dropdown by select class using value
	 * 
	 * @param value
	 * @param element
	 */
	public void handleDropdown(String value, WebElement element) {

		Select s = new Select(element);
		s.selectByValue(value);
	}

	/**
	 * This method will perform double click over a page
	 * 
	 * @param driver
	 */
	public void doubleClickOn(WebDriver driver) {

		Actions act = new Actions(driver);
		act.doubleClick().perform();
	}

	/**
	 * This method will perform double click over a perticular Element
	 * 
	 * @param driver
	 * @param element
	 */
	public void doubleClickOn(WebDriver driver, WebElement element) {

		Actions act = new Actions(driver);
		act.doubleClick(element).perform();
	}

	/**
	 * This method will perform mouse Hover on a perticular Element
	 * 
	 * @param driver
	 * @param element
	 */
	public void mouseHoverOn(WebDriver driver, WebElement element) {

		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
	}

	/**
	 * This method will perform mouse Hover action over the offset
	 * 
	 * @param driver
	 * @param x
	 * @param y
	 */
	public void mouseHoverOn(WebDriver driver, int x, int y) {

		Actions act = new Actions(driver);
		act.moveByOffset(x, y).perform();
	}

	/**
	 * This method will perform right click on the page
	 * 
	 * @param driver
	 */
	public void rightClickOn(WebDriver driver) {

		Actions act = new Actions(driver);
		act.contextClick().perform();
	}

	/**
	 * This method will perform right click on a perticular element
	 * 
	 * @param driver
	 * @param element
	 */
	public void rightClickOn(WebDriver driver, WebElement element) {

		Actions act = new Actions(driver);
		act.contextClick(element).perform();
	}

	/**
	 * This method will accept the alert popup
	 * @param driver
	 */
	public void acceptAlert(WebDriver driver) {

		driver.switchTo().alert().accept();
	}

	/**
	 * This method will dismiss the alert popup
	 * @param driver
	 */
	public void dismissAlert(WebDriver driver) {

		driver.switchTo().alert().dismiss();
	}

	/**
	 * This method will get text from alert popup and return it
	 * @param driver
	 * @return 
	 */
	public String getTextInAlert(WebDriver driver) {

		String alertText = driver.switchTo().alert().getText();
		return alertText;
	}
	
	/**
	 * This method will switch to the window with respect to the window title
	 * @param driver
	 * @param title
	 */
	
	public void switchToWindow(WebDriver driver, String title){
		
		//Step 1: get all window handles
		Set<String> windowIds = driver.getWindowHandles();
		
		//Step 2: Iterate through all windowIds
		Iterator<String> it = windowIds.iterator();
		
		//Step 3: navigate inside the windows
		while(it.hasNext()) //loop until windows exist
		{
			//capture all window ids
			String winId = it.next();
			
			//Switch to window capture the title
			String currentTitle = driver.switchTo().window(winId).getTitle();
			if(currentTitle.contains(title))
			{
				break;
			}
		}
		
	}
	
	
	/**
	 * This method will take screen shot and return the destination path
	 * 
	 * @param driver
	 * @param screenShotName
	 * @return
	 * @throws IOException
	 */
	public String takeScreenShot(WebDriver driver, String screenShotName) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		String path = ".\\ScreenShots\\" + screenShotName + ".png";
		File dst = new File(path);
		FileUtils.copyFile(src, dst);
		return dst.getAbsolutePath();
	}

}
