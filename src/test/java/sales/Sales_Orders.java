package sales;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import forgo.genericUtility.BaseClass;

public class Sales_Orders extends BaseClass {


@Test(description="SalesOrder")
public void TC36(){
	driver.findElement(By.xpath("//span[text()='Sales Order']")).click();
}

@Test(description="SalesOrder creation")
public void TC37() throws InterruptedException{
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[5]")).click();
	driver.findElement(By.xpath("//span[text()='Sales Order']")).click();
	driver.findElement(By.xpath("//span[text()='My Sales']")).click();
	driver.findElement(By.xpath("//span[text()='Add New']")).click();
	WebElement customerInfoElement = driver.findElement(By.xpath("(//input[@class='ant-select-selection-search-input'])[2]"));
	customerInfoElement.click();
	customerInfoElement.sendKeys("Azad");
	customerInfoElement.sendKeys(Keys.ARROW_DOWN);
	customerInfoElement.sendKeys(Keys.ENTER);
	WebElement deliveryChallanElement=driver.findElement(By.xpath("(//input[@class='ant-input pp-form-input'])[1]"));
	deliveryChallanElement.click();
	Thread.sleep(1000);
	deliveryChallanElement.sendKeys("12121");         
	Thread.sleep(1000);
	WebElement soNumberElement=driver.findElement(By.xpath("(//input[@class='ant-input pp-form-input'])[2]"));
	soNumberElement.click();
	soNumberElement.sendKeys("07667");
	driver.findElement(By.xpath("//input[@name='challan_date']")).click();
	Thread.sleep(1000); 
	driver.findElement(By.xpath("//a[text()='Today']")).click();
	Thread.sleep(1000); 
	JavascriptExecutor js = (JavascriptExecutor) driver;
	WebElement saveElement=driver.findElement(By.xpath("//span[text()='Save']"));
	js.executeScript("arguments[0].scrollIntoView(true);", saveElement);
	Thread.sleep(1000);
	WebElement challanaTypeElement=driver.findElement(By.name("challan_type"));
	challanaTypeElement.click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//div[text()='Supply on Approvals']")).click();
	driver.findElement(By.name("ware_house_detail_id")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//div[text()='amazon']")).click();
	WebElement itemDetailsElement=driver.findElement(By.xpath("(//input[@class='ant-select-selection-search-input'])[5]"));
	itemDetailsElement.click();
	itemDetailsElement.sendKeys("tarun1414");
	itemDetailsElement.sendKeys(Keys.ARROW_DOWN);
	itemDetailsElement.sendKeys(Keys.ENTER);
	driver.findElement(By.name("items.0.quantity")).sendKeys("1");
	driver.findElement(By.name("items.0.discount_percentage")).sendKeys("15");
	driver.findElement(By.xpath("//span[text()='Save']")).click();
	Thread.sleep(1000);
	try {
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile, new File("C:\\Users\\koppu\\Downloads\\Selenium Screen shots\\DC-Creating.jpg"));
		System.out.println("Aprove screenshot saved successfully!");
	} catch (Exception e) {
		System.out.println("Failed to capture screenshot: " + e.getMessage());
	}
}
@Test(description="Add Filter")
public void TC38() throws InterruptedException{
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[5]")).click();
	driver.findElement(By.xpath("//span[text()='Sales Order']")).click();
	driver.findElement(By.xpath("//span[text()='My Sales']")).click();
	//driver.findElement(By.xpath("(//tr[@class='ant-table-row ant-table-row-level-0'])[3]")).click();
	driver.findElement(By.xpath("//span[text()='Add Filters']")).click();

}
@Test(description="Pending Approval")
public void TC39() throws InterruptedException{
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[5]")).click();
	driver.findElement(By.xpath("//span[text()='Sales Order']")).click();
	driver.findElement(By.xpath("//span[text()='My Sales']")).click();
	driver.findElement(By.xpath("//span[text()='Add Filters']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//span[text()='Pending approval'])[1]")).click();

}
@Test(description="Search by id")
public void TC40() throws InterruptedException{
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[5]")).click();
	driver.findElement(By.xpath("//span[text()='Sales Order']")).click();
	driver.findElement(By.xpath("//span[text()='My Sales']")).click();
	driver.findElement(By.xpath("//span[text()='Add Filters']")).click();
	driver.findElement(By.xpath("//input[@class='ant-input ant-input-lg']")).sendKeys("SO_01222");


}
@Test(description="Search by customer")
public void TC41() throws InterruptedException{
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[5]")).click();
	driver.findElement(By.xpath("//span[text()='Sales Order']")).click();
	driver.findElement(By.xpath("//span[text()='My Sales']")).click();
	driver.findElement(By.xpath("//span[text()='Add Filters']")).click();
	driver.findElement(By.xpath("//input[@class='ant-input ant-input-lg']")).sendKeys("anil");
}
@Test(description="Search by estimate")
public void TC42() throws InterruptedException{
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[5]")).click();
	driver.findElement(By.xpath("//span[text()='Sales Order']")).click();
	driver.findElement(By.xpath("//span[text()='My Sales']")).click();
	driver.findElement(By.xpath("//span[text()='Add Filters']")).click();
	driver.findElement(By.xpath("//input[@class='ant-input ant-input-lg']")).sendKeys("asdfgh");

}
@Test(description="Sort")
public void TC43() throws InterruptedException{
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[5]")).click();
	driver.findElement(By.xpath("//span[text()='Sales Order']")).click();
	driver.findElement(By.xpath("//span[text()='My Sales']")).click();
	driver.findElement(By.xpath("//span[@class='anticon anticon-ellipsis pp-icon-25']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//span[text()='Customer Name']")).click();
}
@Test(description="Edit the Existing Sales Order")
public void TC44() throws InterruptedException{
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[5]")).click();
	driver.findElement(By.xpath("//span[text()='Sales Order']")).click();
	driver.findElement(By.xpath("//span[text()='My Sales']")).click();
	driver.findElement(By.xpath("//span[text()='Add Filters']")).click();
	driver.findElement(By.xpath("//input[@class='ant-input ant-input-lg']")).sendKeys("SO_01222");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//tbody[@class='ant-table-tbody']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//span[text()='Edit']")).click();
}


@Test(description="click on submit button Existing Sales Order")
public void TC45() throws InterruptedException{
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[5]")).click();
	driver.findElement(By.xpath("//span[text()='Sales Order']")).click();
	driver.findElement(By.xpath("//span[text()='My Sales']")).click();
	driver.findElement(By.xpath("//span[text()='Add Filters']")).click();
	driver.findElement(By.xpath("//input[@class='ant-input ant-input-lg']")).sendKeys("SO_01222");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//tbody[@class='ant-table-tbody']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//span[text()='Submit']")).click();
}
@Test(description="click on Recall")
public void TC46() throws InterruptedException{
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[5]")).click();
	driver.findElement(By.xpath("//span[text()='Sales Order']")).click();
	driver.findElement(By.xpath("//span[text()='My Sales']")).click();
	driver.findElement(By.xpath("//span[text()='Add Filters']")).click();
	driver.findElement(By.xpath("//input[@class='ant-input ant-input-lg']")).sendKeys("SO_01222");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//tbody[@class='ant-table-tbody']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//span[text()='Recall']")).click();


}

@Test(description="click on more option")
public void TC47() throws InterruptedException{
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[5]")).click();
	driver.findElement(By.xpath("//span[text()='Sales Order']")).click();
	driver.findElement(By.xpath("//span[text()='My Sales']")).click();
	driver.findElement(By.xpath("//span[text()='Add Filters']")).click();
	driver.findElement(By.xpath("//input[@class='ant-input ant-input-lg']")).sendKeys("SO_01222");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//tbody[@class='ant-table-tbody']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//div[text()='More']")).click();

}

@Test(description="click on Send email	")
public void TC48() throws InterruptedException{
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[5]")).click();
	driver.findElement(By.xpath("//span[text()='Sales Order']")).click();
	driver.findElement(By.xpath("//span[text()='My Sales']")).click();
	driver.findElement(By.xpath("//span[text()='Add Filters']")).click();
	driver.findElement(By.xpath("//input[@class='ant-input ant-input-lg']")).sendKeys("SO_01222");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//tbody[@class='ant-table-tbody']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//div[text()='More']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//span[text()='Send Email']")).click();


}
@Test(description="click on more option")
public void TC49() throws InterruptedException{
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[5]")).click();
	driver.findElement(By.xpath("//span[text()='Sales Order']")).click();
	driver.findElement(By.xpath("//span[text()='My Sales']")).click();
	driver.findElement(By.xpath("//span[text()='Add Filters']")).click();
	driver.findElement(By.xpath("//input[@class='ant-input ant-input-lg']")).sendKeys("SO_01222");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//tbody[@class='ant-table-tbody']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//div[text()='More']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//span[text()='Clone']")).click();


}
@Test(description="click on Delete option")
public void TC50() throws InterruptedException{
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[5]")).click();
	driver.findElement(By.xpath("//span[text()='Sales Order']")).click();
	driver.findElement(By.xpath("//span[text()='My Sales']")).click();
	driver.findElement(By.xpath("//span[text()='Add Filters']")).click();
	driver.findElement(By.xpath("//input[@class='ant-input ant-input-lg']")).sendKeys("SO_01222");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//tbody[@class='ant-table-tbody']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//div[text()='More']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//span[text()='Delete']")).click();


}
@Test(description="Details Tab in Sales Order Detail Page")
public void TC51() throws InterruptedException{
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[5]")).click();
	driver.findElement(By.xpath("//span[text()='Sales Order']")).click();
	driver.findElement(By.xpath("//span[text()='My Sales']")).click();
	driver.findElement(By.xpath("//span[text()='Add Filters']")).click();
	driver.findElement(By.xpath("//input[@class='ant-input ant-input-lg']")).sendKeys("SO_01222");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//tbody[@class='ant-table-tbody']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//li[@class='active']")).click();


}
@Test(description="clickon item Tab in Sales Order")
public void TC52() throws InterruptedException{
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[5]")).click();
	driver.findElement(By.xpath("//span[text()='Sales Order']")).click();
	driver.findElement(By.xpath("//span[text()='My Sales']")).click();
	driver.findElement(By.xpath("//span[text()='Add Filters']")).click();
	driver.findElement(By.xpath("//input[@class='ant-input ant-input-lg']")).sendKeys("SO_01222");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//tbody[@class='ant-table-tbody']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//li[@class='active']")).click();
	driver.findElement(By.xpath("//li[text()='Items']")).click();
	Thread.sleep(1000);
	boolean isListElementDisplayed=driver.findElement(By.xpath("//tr[@class='ant-table-row ant-table-row-level-0']")).isDisplayed();
	if (isListElementDisplayed) {
		System.out.println("The list element is displayed.");
	} else {
		System.out.println("The list element is not displayed.");
	}



}
@Test(description="add comment")
public void TC53() throws InterruptedException{
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[5]")).click();
	driver.findElement(By.xpath("//span[text()='Sales Order']")).click();
	driver.findElement(By.xpath("//span[text()='My Sales']")).click();
	driver.findElement(By.xpath("//span[text()='Add Filters']")).click();
	driver.findElement(By.xpath("//input[@class='ant-input ant-input-lg']")).sendKeys("SO_01222");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//tbody[@class='ant-table-tbody']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//li[contains(text(),'Comments')]")).click();
	driver.findElement(By.xpath("//input[@class='ant-input']")).sendKeys("abcd");
	driver.findElement(By.xpath("//span[text()='Send']")).click();	


}
@Test(description="History")
public void TC54() throws InterruptedException{
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[5]")).click();
	driver.findElement(By.xpath("//span[text()='Sales Order']")).click();
	driver.findElement(By.xpath("//span[text()='My Sales']")).click();
	driver.findElement(By.xpath("//span[text()='Add Filters']")).click();
	driver.findElement(By.xpath("//input[@class='ant-input ant-input-lg']")).sendKeys("SO_01222");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//tbody[@class='ant-table-tbody']")).click();
	driver.findElement(By.xpath("//li[contains(text(),'History')]")).click();

}
//approvals for sales order
@Test(description="To Verify pending approval filters")
public void TC81() throws InterruptedException, IOException {
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[5]")).click();
	driver.findElement(By.xpath("//span[text()='Sales Order']")).click();
	driver.findElement(By.xpath("//span[text()='Sales Order']")).click();
	driver.findElement(By.xpath("//span[text()='Add Filters']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//span[text()='Pending approval']")).click();
	Thread.sleep(1000);
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("document.querySelector(\"div[style$='overflow: auto hidden;']\").scrollLeft= 150");
	Thread.sleep(1000);
	wUtil.takeScreenShot(driver, "Pending Approval-Approvals");
	
}
@Test(description="To Verify approval filters")
public void TC82() throws InterruptedException, IOException {
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[5]")).click();
	driver.findElement(By.xpath("//span[text()='Sales Order']")).click();
	driver.findElement(By.xpath("//span[text()='Sales Order']")).click();
	driver.findElement(By.xpath("//span[text()='Add Filters']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//span[text()='Approved']")).click();
	Thread.sleep(1000);
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("document.querySelector(\"div[style$='overflow: auto hidden;']\").scrollLeft= 150");
	Thread.sleep(1000);
	wUtil.takeScreenShot(driver, "Approved-Approvals");
	
}
@Test(description="To Verify overdue filters")
public void TC83() throws InterruptedException, IOException {
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[5]")).click();
	driver.findElement(By.xpath("//span[text()='Sales Order']")).click();
	driver.findElement(By.xpath("//span[text()='Sales Order']")).click();
	driver.findElement(By.xpath("//span[text()='Add Filters']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//span[text()='Overdue']")).click();
	Thread.sleep(1000);
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("document.querySelector(\"div[style$='overflow: auto hidden;']\").scrollLeft= 150");
	Thread.sleep(1000);
	wUtil.takeScreenShot(driver, "Overdue-Approvals");
	
}
@Test(description="To Verify rejected approval filters")
public void TC84() throws InterruptedException, IOException {
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[5]")).click();
	driver.findElement(By.xpath("//span[text()='Sales Order']")).click();
	driver.findElement(By.xpath("//span[text()='Sales Order']")).click();
	driver.findElement(By.xpath("//span[text()='Add Filters']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//span[text()='Rejected']")).click();
	Thread.sleep(1000);
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("document.querySelector(\"div[style$='overflow: auto hidden;']\").scrollLeft= 150");
	Thread.sleep(1000);
	wUtil.takeScreenShot(driver, "Rejected-Approvals");
	
}
@Test(description="To Verify Approval search for Invoices")
public void TC85() throws InterruptedException, IOException{
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[5]")).click();
	driver.findElement(By.xpath("//span[text()='Sales Order']")).click();
	driver.findElement(By.xpath("//span[text()='Sales Order']")).click();
	WebElement searchElement=driver.findElement(By.xpath("//input[@class='ant-input ant-input-lg']"));
	searchElement.sendKeys("07667");
	Thread.sleep(1000);
	wUtil.takeScreenShot(driver,"Search by RF_num");
	searchElement.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
	Thread.sleep(1000);
	searchElement.sendKeys("anil");
	Thread.sleep(1000);
	wUtil.takeScreenShot(driver,"Search by cutomer_name");
	Thread.sleep(1000);
	searchElement.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
	Thread.sleep(1000);
	searchElement.sendKeys("DC_03");
	Thread.sleep(1000);
	wUtil.takeScreenShot(driver,"Search by DC");	
}
@Test(description="To Verify sort invoices")
public void TC86() throws InterruptedException, IOException{
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[5]")).click();
	driver.findElement(By.xpath("//span[text()='Sales Order']")).click();
	driver.findElement(By.xpath("//span[text()='Sales Order']")).click();
	driver.findElement(By.xpath("//span[@class='anticon anticon-ellipsis pp-icon-25']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//span[text()='Date']")).click();
	Thread.sleep(1000);
	wUtil.takeScreenShot(driver,"Approval-sort  by date");
	driver.findElement(By.xpath("//span[@class='anticon anticon-ellipsis pp-icon-25']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//span[text()='Due Date']")).click();
	Thread.sleep(1000);
	wUtil.takeScreenShot(driver,"Approval-sort  by Due Date");
	driver.findElement(By.xpath("//span[@class='anticon anticon-ellipsis pp-icon-25']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//span[text()='Amount']")).click();
	Thread.sleep(1000);
	wUtil.takeScreenShot(driver,"Approval-sort  by amount");
	Thread.sleep(10000);

}


}
