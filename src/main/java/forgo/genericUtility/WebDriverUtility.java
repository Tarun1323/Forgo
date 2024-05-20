package forgo.genericUtility;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

/**
 * This class contains all generic methods related to web driver actions
 * 
 * @author Nagarjuna
 * 
 */

public class WebDriverUtility {

	/**
	 * This method will take screen shot and return the destination path
	 * 
	 * @param driver
	 * @param screenShotName
	 * @return
	 * @throws IOException
	 */

	public void maximiseWindow(WebDriver driver) {
		
		driver.manage().window().maximize();
		
	}
	
	public void waitForElementsToLoadInDOM(WebDriver driver) {
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	public String takeScreenShot(WebDriver driver, String screenShotName) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		String path = ".\\ScreenShots\\" + screenShotName + ".png";
		File dst = new File(path);
		FileUtils.copyFile(src, dst);
		return dst.getAbsolutePath();
	}

}
