package expenses;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import forgo.genericUtility.BaseClass;

public class Trips extends BaseClass {
	
	@Test(description = "Create_Trip_With_One_Way_Flight_Details")
	public void TRIP_TC_001() throws InterruptedException {
	
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[6]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Trips']")).click();
		driver.findElement(By.xpath("//span[text()='My Trips']")).click();
		driver.findElement(By.xpath("//span[text()='Add New']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@name='title'])[2]")).sendKeys("Trip For Canada"+" "+jUtil.generateRandomNumber(3));
		driver.findElement(By.id("is_visa_required")).click();
		driver.findElement(By.xpath("//div[text()='No']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//textarea[@class='ant-input']")).sendKeys("Client Meeting");
		driver.findElement(By.id("trip_type")).click();
		driver.findElement(By.xpath("//div[text()='Domestic']")).click();
		//driver.findElement(By.xpath("//div[text()='International']")).click();
		driver.findElement(By.name("destination_country")).sendKeys("India");
		
//-----------------------------------------Flight Reservations-----------------------------------------------------
// one-way	
		driver.findElement(By.xpath("//span[text()='Add Flight Details']")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("fli_from_city_key0")).sendKeys("Hyderabad");
		driver.findElement(By.name("fli_to_city_key0")).sendKeys("Mumbai");
		driver.findElement(By.id("departure_date")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[text()='Now'])[1]")).click();					
			
// Round Trip-------------------
	/*	driver.findElement(By.xpath("//span[text()='Add Flight Details']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='round_trip']")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("fli_from_city_key0")).sendKeys("Hyderabad");
		driver.findElement(By.name("fli_to_city_key0")).sendKeys("Mumbai");
		driver.findElement(By.id("departure_date")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[text()='Now'])[1]")).click();
		driver.findElement(By.name("fli_return_date_key0")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[text()='Now'])[2]")).click();						
		
// Multi City---------------------
		driver.findElement(By.xpath("//span[text()='Add Flight Details']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='multi_city']")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("fli_from_city_key0")).sendKeys("Hyderabad");
		driver.findElement(By.name("fli_to_city_key0")).sendKeys("Mumbai");
		driver.findElement(By.name("fli_departure_date_key0")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[text()='Now'])[1]")).click();
		driver.findElement(By.xpath("//div[text()='Add another line']")).click();
		driver.findElement(By.name("fli_from_city_key1")).sendKeys("Mumbai");
		driver.findElement(By.name("fli_to_city_key1")).sendKeys("Bangaluru");
		driver.findElement(By.name("fli_departure_date_key1")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[text()='Now'])[2]")).click();
		driver.findElement(By.xpath("//div[text()='Add another line']")).click();
		driver.findElement(By.name("fli_from_city_key2")).sendKeys("Bangaluru");
		driver.findElement(By.name("fli_to_city_key2")).sendKeys("Hyderabad");
		driver.findElement(By.name("fli_departure_date_key2")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[text()='Now'])[3]")).click();					*/
		
		driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[text()='Window'])[2]")).click();
		driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[5]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Non Veg']")).click();
		driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[6]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[(text()='Morning')]")).click();
		driver.findElement(By.xpath("//input[@name='description']")).sendKeys("Desc");
		driver.findElement(By.xpath("(//span[text()='Save'])[2]")).click();								
		
//---------------------------------------------Hotel Reservations----------------------------------------------------		
		driver.findElement(By.xpath("//span[text()='Add Hotel Details']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@class='ant-input'])[6]")).sendKeys("Novotel");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@class='ant-input'])[7]")).sendKeys("Mumbai");
		driver.findElement(By.id("check_in")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[text()='Now'])[2]")).click();
		driver.findElement(By.id("check_out")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[text()='Now'])[3]")).click();
		driver.findElement(By.xpath("//textarea[@placeholder='Enter Description']")).sendKeys("Hotel Desc");
		driver.findElement(By.xpath("(//span[text()='Save'])[3]")).click();										
		
//---------------------------------------------Car Rentals----------------------------------------------------		
		driver.findElement(By.xpath("//span[text()='Add Car Details']")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("city_key0")).sendKeys("Mumbai");
		driver.findElement(By.name("hot_duration_from_key0")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[text()='Now'])[4]")).click();
		driver.findElement(By.name("hot_duration_to_key0")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[text()='Now'])[5]")).click();
		driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[7]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Private Transport']")).click();
		driver.findElement(By.name("hot_description_key0")).sendKeys("Hotel Desc");
		driver.findElement(By.xpath("(//span[text()='Save'])[4]")).click();										
		
//-----------------------------------------Other Bookings-----------------------------------------------------		
		driver.findElement(By.xpath("//span[text()='Add Other Bookings']")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("from_city_key0")).sendKeys("Mumbai");
		driver.findElement(By.name("to_city_key0")).sendKeys("Hyderabad");
		driver.findElement(By.name("hot_departure_date_key0")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[text()='Now'])[6]")).click();
		driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[8]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[text()='Bus'])[2]")).click();
		driver.findElement(By.xpath("(//textarea[@name='hot_description_key0'])[2]")).sendKeys("Hotel Desc");
		driver.findElement(By.xpath("(//span[text()='Save'])[5]")).click();
		
		driver.findElement(By.xpath("(//span[text()='Save'])[1]")).click();
		Thread.sleep(1000);
		String message = driver.findElement(By.xpath("//span[@class='messageText']")).getText();
		System.out.println(message);
		
	}
	
	@Test(description = "Edit_Trip")
	public void TRIP_TC_002() throws InterruptedException{
		
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[6]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Trips']")).click();
		driver.findElement(By.xpath("//span[text()='My Trips']")).click();
		driver.findElement(By.xpath("//span[text()='Add Filters']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Unsubmitted']")).click();
		driver.findElement(By.xpath("(//div[@class='status status_unsubmitted'])[1]")).click();
		driver.findElement(By.xpath("//button[text()='Edit']")).click();
		
		WebElement title = driver.findElement(By.xpath("(//input[@name='title'])[2]"));
		Thread.sleep(1000);
		title.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		Thread.sleep(1000);
		title.sendKeys("Trip to chennai");
		WebElement purpose = driver.findElement(By.xpath("//textarea[@class='ant-input']"));
		Thread.sleep(1000);
		purpose.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		Thread.sleep(1000);
		purpose.sendKeys("Edit Trip"+" "+jUtil.generateRandomNumber(3));
		driver.findElement(By.xpath("(//span[text()='Save'])[1]")).click();
		//driver.findElement(By.xpath("//span[text()='Cancel']")).click();
		Thread.sleep(1000);
		String message = driver.findElement(By.xpath("//span[@class='messageText']")).getText();
		System.out.println(message);
		
	}
	
	@Test(description = "Submit_Trip")
	public void TRIP_TC_003() throws InterruptedException{
		
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[6]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Trips']")).click();
		driver.findElement(By.xpath("//span[text()='My Trips']")).click();
		driver.findElement(By.xpath("//span[text()='Add Filters']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Unsubmitted']")).click();
		driver.findElement(By.xpath("(//div[@class='status status_unsubmitted'])[1]")).click();
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		Thread.sleep(1000);
		String message = driver.findElement(By.xpath("//span[@class='messageText']")).getText();
		System.out.println(message);
		
	}
	
	@Test(description = "Recall_Trip")
	public void TRIP_TC_004() throws InterruptedException{
		
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[6]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Trips']")).click();
		driver.findElement(By.xpath("//span[text()='My Trips']")).click();
		driver.findElement(By.xpath("//span[text()='Add Filters']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Pending Approval']")).click();
		driver.findElement(By.xpath("(//div[@class='status status_pending_approval'])[1]")).click();
		Thread.sleep(1000);
		try
		{
			driver.findElement(By.xpath("//button[text()='Recall']")).click();
			Thread.sleep(2000);
		    String message = driver.findElement(By.xpath("//span[@class='messageText']")).getText();
			System.out.println(message);
		}
		catch(NoSuchElementException e) {
			
			System.out.println("Recall button Not found");
		}
		
	}
	
	@Test(description = "Download_Pdf_In_More_My_Trips")
	public void TRIP_TC_005() throws InterruptedException {

		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[6]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Trips']")).click();
		driver.findElement(By.xpath("//span[text()='My Trips']")).click();
		driver.findElement(By.xpath("(//tr[@class='ant-table-row ant-table-row-level-0'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='ant-dropdown-trigger more']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Download PDF']")).click();
		Thread.sleep(1000);
		wUtil.switchToWindow(driver, "amazonaws");
		Thread.sleep(1000);
		driver.close();
		Thread.sleep(1000);
		wUtil.switchToWindow(driver, "expenses");
	}	
	
	@Test(description = "Add_Comments_In_My_Trips")
	public void TRIP_TC_006() throws InterruptedException {
		
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[6]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Trips']")).click();
		driver.findElement(By.xpath("//span[text()='My Trips']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//tr[@class='ant-table-row ant-table-row-level-0'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[text()='Comments']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='ant-input']")).sendKeys("Automation comments");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Send']")).click();
		Thread.sleep(1000);
		String message = driver.findElement(By.xpath("//span[@class='messageText']")).getText();
		System.out.println(message);

	}
	
	
	@Test(description = "Add_To_Report_In_My_Trips")
	public void TRIP_TC_007() throws InterruptedException {
		
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[6]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Trips']")).click();
		driver.findElement(By.xpath("//span[text()='My Trips']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Add Filters']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Approved']")).click();
		driver.findElement(By.xpath("(//div[@class='status status_approved'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Add To']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@class='ant-radio-input'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Add To  Report']")).click();
		Thread.sleep(1000);
		String message = driver.findElement(By.xpath("//span[@class='messageText']")).getText();
		System.out.println(message);

	}
	
	@Test(description = "Change_Report_In_My_Trips")
	public void TRIP_TC_008() throws InterruptedException {
		
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[6]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Trips']")).click();
		driver.findElement(By.xpath("//span[text()='My Trips']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Add Filters']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Approved']")).click();
		driver.findElement(By.xpath("(//div[@class='status status_approved'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Change']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@class='ant-radio-input'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Add To  Report']")).click();
		Thread.sleep(1000);
		String message = driver.findElement(By.xpath("//span[@class='messageText']")).getText();
		System.out.println(message);

	}
	
	@Test(description = "Filters_In_My_Trips")
	public void TRIP_TC_009() throws InterruptedException, IOException {
		
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[6]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Trips']")).click();
		driver.findElement(By.xpath("//span[text()='My Trips']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Add Filters']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Approved']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver, "Approved"+" "+jUtil.getSystemDateInFormat());
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Approved']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Pending Approval']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver, "Pending Approval"+" "+jUtil.getSystemDateInFormat());
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Pending Approval']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Closed']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver, "Recovered"+" "+jUtil.getSystemDateInFormat());
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Closed']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Cancelled']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver, "Pending Recovery"+" "+jUtil.getSystemDateInFormat());
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Cancelled']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Rejected']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver, "Rejected"+" "+jUtil.getSystemDateInFormat());
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Rejected']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Unsubmitted']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver, "Unsubmitted"+" "+jUtil.getSystemDateInFormat());
		Thread.sleep(1000);
	}

	/**
	 * @throws InterruptedException
	 * @throws IOException
	 */
	@Test(description = "My_Trips_Search")
	public void TRIP_TC_010() throws InterruptedException, IOException {

		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[6]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Trips']")).click();
		driver.findElement(By.xpath("//span[text()='My Trips']")).click();
		WebElement search = driver.findElement(By.xpath("//input[@id='search-input']"));
		search.sendKeys("16");
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver, "Search by Trip ID" + " " + jUtil.getSystemDateInFormat());
		search.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		Thread.sleep(1000);
		search.sendKeys("test");
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver, "Search by Trip Name" + " " + jUtil.getSystemDateInFormat());
		search.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		
		
	}

	@Test(description = "My_Trips_Sort")
	public void TRIP_TC_011() throws InterruptedException, IOException {

		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[6]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Trips']")).click();
		driver.findElement(By.xpath("//span[text()='My Trips']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='anticon anticon-ellipsis pp-icon-25']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='purpose']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver, "Sort by purpose" + " " + jUtil.getSystemDateInFormat());
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='anticon anticon-ellipsis pp-icon-25']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='title']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver, "Sort by Trip Name" + " " + jUtil.getSystemDateInFormat());
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='anticon anticon-ellipsis pp-icon-25']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='submitted date']")).click();
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver, "Sort by Submited date" + " " + jUtil.getSystemDateInFormat());

	}
	
	@Test(description = "Delete_Trip")
	public void TRIP_TC_012() throws InterruptedException{
		
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[6]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Trips']")).click();
		driver.findElement(By.xpath("//span[text()='My Trips']")).click();
		driver.findElement(By.xpath("//span[text()='Add Filters']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Unsubmitted']")).click();
		driver.findElement(By.xpath("(//div[@class='status status_unsubmitted'])[1]")).click();
		driver.findElement(By.xpath("//button[text()='Delete']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//textarea[@class='ant-input reasonTextArea']")).sendKeys("Deleting By Selenium");
		Thread.sleep(1000);
		
//		driver.findElement(By.xpath("//span[text()='Confirm']")).click();
//		Thread.sleep(1000);
//		String message = driver.findElement(By.xpath("//span[@class='messageText']")).getText();
//		System.out.println(message);
		driver.findElement(By.xpath("//span[text()='Cancel']")).click();
	}
	
	
	@Test(description = "Cancel_Trip")
	public void TRIP_TC_013() throws InterruptedException{
		
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[6]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Trips']")).click();
		driver.findElement(By.xpath("//span[text()='My Trips']")).click();
		driver.findElement(By.xpath("//span[text()='Add Filters']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Unsubmitted']")).click();
		driver.findElement(By.xpath("(//div[@class='status status_unsubmitted'])[1]")).click();
		driver.findElement(By.xpath("//button[text()='Cancel']")).click();
		Thread.sleep(1000);
		String message = driver.findElement(By.xpath("//span[@class='messageText']")).getText();
		System.out.println(message);
	
	}
	
	@Test(description = "Close_Trip")
	public void TRIP_TC_014() throws InterruptedException{
		
		driver.findElement(By.xpath("(//div[contains(@class,'menu-item')])[6]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Trips']")).click();
		driver.findElement(By.xpath("//span[text()='My Trips']")).click();
		driver.findElement(By.xpath("//span[text()='Add Filters']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Approved']")).click();
		driver.findElement(By.xpath("(//div[@class='status status_approved'])[1]")).click();
		driver.findElement(By.xpath("//button[text()='Mark As Close']")).click();
		Thread.sleep(1000);
		String message = driver.findElement(By.xpath("//span[@class='messageText']")).getText();
		System.out.println(message);
	
	}
	
	

}
