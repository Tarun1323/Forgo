package settings;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import forgo.genericUtility.BaseClass;

public class Users_Controls extends BaseClass{
	
	@Test(description = "Create_User")
	public void SET_UC_TC_001() throws InterruptedException{
		
		Thread.sleep(1000);
		db.clickOnSettingsLnk();
		driver.findElement(By.xpath("//span[text()='Users & Controls']")).click();
		driver.findElement(By.xpath("//span[text()='Add New']")).click();
		driver.findElement(By.id("step1_title")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[text()='Mr'])[2]")).click();
		String empName = "AutoEmp"+jUtil.generateRandomNumber(3);
		driver.findElement(By.id("step1_name")).sendKeys(empName);
		driver.findElement(By.id("step1_email")).sendKeys(empName.toLowerCase()+"@yopmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Enter Number']")).sendKeys(jUtil.generateRandomNumber(10));
		driver.findElement(By.xpath("//div[@class='ant-select-selection-overflow']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@title='Reporting Manager']")).click();
		driver.findElement(By.id("step1_emp_id")).sendKeys("EMP"+jUtil.generateRandomNumber(5));
		WebElement repManager = driver.findElement(By.id("step1_Reporting Manager"));
		repManager.click();
		Thread.sleep(1000);
		repManager.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[text()='Next'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Save']")).click();
		Thread.sleep(1000);
		String message = driver.findElement(By.xpath("//span[@class='messageText']")).getText();
		System.out.println(message);
		
	}
	
	@Test(description = "Update_User")
	public void SET_UC_TC_002() throws InterruptedException{
		
		Thread.sleep(1000);
		db.clickOnSettingsLnk();
		driver.findElement(By.xpath("//span[text()='Users & Controls']")).click();
		driver.findElement(By.xpath("(//tr[@class='ant-table-row ant-table-row-level-0'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Edit']")).click();
		Thread.sleep(1000);
		WebElement title = driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[2]"));
		if(title.getText().contains("Mrs")) {
			driver.findElement(By.xpath("//span[@title='Mrs']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//div[text()='Mr'])[2]")).click();
		}
		else {
			
			driver.findElement(By.xpath("//span[@title='Mr']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//div[text()='Mrs'])[2]")).click();
		}
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[text()='Next'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Save']")).click();
		Thread.sleep(1000);
		String message = driver.findElement(By.xpath("//span[@class='messageText']")).getText();
		System.out.println(message);	
	}
	
	@Test(description = "Delete_User")
	public void SET_UC_TC_003() throws InterruptedException{
		
		Thread.sleep(1000);
		db.clickOnSettingsLnk();
		driver.findElement(By.xpath("//span[text()='Users & Controls']")).click();
		driver.findElement(By.xpath("(//img[@class='action-logo'])[1]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[text()='Cancel']")).click();
//		driver.findElement(By.xpath("//span[text()='Delete']")).click();
//		Thread.sleep(1000);
//		String message = driver.findElement(By.xpath("//span[@class='messageText']")).getText();
//		System.out.println(message);	
	}
	
	@Test(description = "Search_In_Users")
	public void SET_UC_TC_004() throws InterruptedException, IOException{
		
		Thread.sleep(1000);
		db.clickOnSettingsLnk();
		driver.findElement(By.xpath("//span[text()='Users & Controls']")).click();
		WebElement search = driver.findElement(By.id("search-input"));
		Thread.sleep(1000);
		String name = driver.findElement(By.xpath("(//td[@class='ant-table-cell'])[1]")).getText();
		String empId = driver.findElement(By.xpath("(//td[@class='ant-table-cell'])[2]")).getText();
		String email = driver.findElement(By.xpath("(//td[@class='ant-table-cell'])[3]")).getText();
		String mobile = driver.findElement(By.xpath("(//td[@class='ant-table-cell'])[4]")).getText();
		search.sendKeys(name);
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver, "Search by Employee Name" + " " + jUtil.getSystemDateInFormat());
		search.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		Thread.sleep(1000);
		search.sendKeys(empId);
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver, "Search by Employee Id" + " " + jUtil.getSystemDateInFormat());
		search.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		Thread.sleep(1000);
		search.sendKeys(email);
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver, "Search by Employee email" + " " + jUtil.getSystemDateInFormat());
		search.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		Thread.sleep(1000);
		search.sendKeys(mobile);
		Thread.sleep(1000);
		wUtil.takeScreenShot(driver, "Search by Employee Mobile Number" + " " + jUtil.getSystemDateInFormat());	
	}
	
	@Test(description = "Create_Role_With_All_Roles_And_Permissions")
	public void SET_UC_TC_005() throws InterruptedException{
		
		Thread.sleep(1000);
		db.clickOnSettingsLnk();
		driver.findElement(By.xpath("//span[text()='Users & Controls']")).click();
		driver.findElement(By.xpath("//span[text()='Roles & Permissions']")).click();
		driver.findElement(By.xpath("//span[text()='Add New Role']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("role_name")).sendKeys("Automation Role"+" "+jUtil.generateRandomNumber(3));
		driver.findElement(By.id("description")).sendKeys("Desc");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@class='ant-checkbox'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Submit']")).click();
		Thread.sleep(1000);
		String message = driver.findElement(By.xpath("//span[@class='messageText']")).getText();
		System.out.println(message);
	}
	
	@Test(description = "Update_Role_With_All_Roles_And_Permissions")
	public void SET_UC_TC_006() throws InterruptedException{
		
		Thread.sleep(1000);
		db.clickOnSettingsLnk();
		driver.findElement(By.xpath("//span[text()='Users & Controls']")).click();
		driver.findElement(By.xpath("//span[text()='Roles & Permissions']")).click();
		driver.findElement(By.xpath("(//img[@class='action-logo'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("description")).sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		Thread.sleep(1000);
		driver.findElement(By.id("description")).sendKeys("Desc Edit");
		
		driver.findElement(By.xpath("//span[text()='Update']")).click();
		Thread.sleep(1000);
		String message = driver.findElement(By.xpath("//span[@class='messageText']")).getText();
		System.out.println(message);
	}
	
	@Test(description = "Delete_Role")
	public void SET_UC_TC_007() throws InterruptedException{
		
		Thread.sleep(1000);
		db.clickOnSettingsLnk();
		driver.findElement(By.xpath("//span[text()='Users & Controls']")).click();
		driver.findElement(By.xpath("//span[text()='Roles & Permissions']")).click();
		driver.findElement(By.xpath("(//img[@class='action-logo'])[7]")).click();
		Thread.sleep(1000);
		
		//driver.findElement(By.xpath("//span[text()='Cancel']")).click();
		driver.findElement(By.xpath("//span[text()='Delete']")).click();
		Thread.sleep(1000);
		String message = driver.findElement(By.xpath("//span[@class='messageText']")).getText();
		System.out.println(message);
	}
	

	@Test(description = "Create_Department")
	public void SET_UC_TC_008() throws InterruptedException{
		
		Thread.sleep(1000);
		db.clickOnSettingsLnk();
		driver.findElement(By.xpath("//span[text()='Users & Controls']")).click();
		driver.findElement(By.xpath("//span[text()='Departments & Grades']")).click();
		driver.findElement(By.xpath("//span[text()='Add New']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Department Name']")).sendKeys("Automation Department"+" "+jUtil.generateRandomNumber(3));
		driver.findElement(By.xpath("//input[@class='ant-input inlineItem levelInputs']")).sendKeys("Level 1");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Submit']")).click();
		Thread.sleep(1000);
		String message = driver.findElement(By.xpath("//span[@class='messageText']")).getText();
		System.out.println(message);
	}
	
	@Test(description = "Update_Department")
	public void SET_UC_TC_009() throws InterruptedException{
		
		Thread.sleep(1000);
		db.clickOnSettingsLnk();
		driver.findElement(By.xpath("//span[text()='Users & Controls']")).click();
		driver.findElement(By.xpath("//span[text()='Departments & Grades']")).click();
		driver.findElement(By.xpath("(//img[@class='action-logo'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()=' ADD OPTION']")).click();
		driver.findElement(By.xpath("(//input[@class='ant-input inlineItem levelInputs'])[2]")).sendKeys("Level 2");
		
		driver.findElement(By.xpath("//span[text()='Update']")).click();
		Thread.sleep(1000);
		String message = driver.findElement(By.xpath("//span[@class='messageText']")).getText();
		System.out.println(message);	
	}
	
	
	@Test(description = "Delete_Department")
	public void SET_UC_TC_010() throws InterruptedException{
		
		Thread.sleep(1000);
		db.clickOnSettingsLnk();
		driver.findElement(By.xpath("//span[text()='Users & Controls']")).click();
		driver.findElement(By.xpath("//span[text()='Departments & Grades']")).click();
		driver.findElement(By.xpath("(//img[@class='action-logo'])[2]")).click();
		Thread.sleep(1000);
		
		//driver.findElement(By.xpath("//span[text()='Cancel']")).click();
		driver.findElement(By.xpath("//span[text()='Delete']")).click();
		Thread.sleep(1000);
		String message = driver.findElement(By.xpath("//span[@class='messageText']")).getText();
		System.out.println(message);	
	}
	
	@Test(description = "Create_Custom_Field_With_Text_Box")
	public void SET_UC_TC_011() throws InterruptedException{
		
		Thread.sleep(1000);
		db.clickOnSettingsLnk();
		driver.findElement(By.xpath("//span[text()='Users & Controls']")).click();
		driver.findElement(By.xpath("//span[text()='Custom Fields']")).click();
		driver.findElement(By.xpath("//span[text()='Add New']")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("column_name")).sendKeys("Automation Text Box"+jUtil.generateRandomNumber(2));
		driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Text Box']")).click();
		driver.findElement(By.xpath("//span[text()='Save']")).click();
		Thread.sleep(1000);
		String message = driver.findElement(By.xpath("//span[@class='messageText']")).getText();
		System.out.println(message);
	}
	
	@Test(description = "Create_Custom_Field_With_Number_Field")
	public void SET_UC_TC_012() throws InterruptedException{
		
		Thread.sleep(1000);
		db.clickOnSettingsLnk();
		driver.findElement(By.xpath("//span[text()='Users & Controls']")).click();
		driver.findElement(By.xpath("//span[text()='Custom Fields']")).click();
		driver.findElement(By.xpath("//span[text()='Add New']")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("column_name")).sendKeys("Automation Number"+jUtil.generateRandomNumber(2));
		driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Number']")).click();
		driver.findElement(By.xpath("//span[text()='Save']")).click();
		Thread.sleep(1000);
		String message = driver.findElement(By.xpath("//span[@class='messageText']")).getText();
		System.out.println(message);
	}
	
	@Test(description = "Create_Custom_Field_With_Drop_Down")
	public void SET_UC_TC_013() throws InterruptedException{
		
		Thread.sleep(1000);
		db.clickOnSettingsLnk();
		driver.findElement(By.xpath("//span[text()='Users & Controls']")).click();
		driver.findElement(By.xpath("//span[text()='Custom Fields']")).click();
		driver.findElement(By.xpath("//span[text()='Add New']")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("column_name")).sendKeys("Automation Drop down"+jUtil.generateRandomNumber(2));
		driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Drop Down']")).click();
		driver.findElement(By.xpath("(//input[@class='ant-input inlineItem'])[1]")).sendKeys("Option 1");
		driver.findElement(By.xpath("//span[text()='Save']")).click();
		Thread.sleep(1000);
		String message = driver.findElement(By.xpath("//span[@class='messageText']")).getText();
		System.out.println(message);
	}
	
	@Test(description = "Create_Custom_Field_With_Date&_Time")
	public void SET_UC_TC_014() throws InterruptedException{
		
		Thread.sleep(1000);
		db.clickOnSettingsLnk();
		driver.findElement(By.xpath("//span[text()='Users & Controls']")).click();
		driver.findElement(By.xpath("//span[text()='Custom Fields']")).click();
		driver.findElement(By.xpath("//span[text()='Add New']")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("column_name")).sendKeys("Automation Date& Time"+jUtil.generateRandomNumber(2));
		driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Date & Time']")).click();
		driver.findElement(By.xpath("//span[text()='Save']")).click();
		Thread.sleep(1000);
		String message = driver.findElement(By.xpath("//span[@class='messageText']")).getText();
		System.out.println(message);
	}
	
	/*@Test(description = "Create_Custom_Field_With_Document_Field")
	public void SET_UC_TC_015() throws InterruptedException{
		
		Thread.sleep(1000);
		db.clickOnSettingsLnk();
		driver.findElement(By.xpath("//span[text()='Users & Controls']")).click();
		driver.findElement(By.xpath("//span[text()='Custom Fields']")).click();
		driver.findElement(By.xpath("//span[text()='Add New']")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("column_name")).sendKeys("Automation Date& Time"+jUtil.generateRandomNumber(2));
		driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Document']")).click();
		driver.findElement(By.xpath("//div[@class='ant-select-selection-overflow']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='JPG']")).click();
		driver.findElement(By.xpath("//div[text()='JPEG']")).click();
		driver.findElement(By.xpath("//div[text()='PNG']")).click();
		driver.findElement(By.xpath("//div[text()='PDF']")).click();
		driver.findElement(By.xpath("//div[text()='CSV']")).click();
		driver.findElement(By.xpath("//div[text()='XLS']")).click();
		driver.findElement(By.xpath("//div[text()='XLSX']")).click();
		driver.findElement(By.xpath("//div[text()='TIFF']")).click();
		//driver.findElement(By.xpath("//div[text()='PPT']")).click();
		 
		driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[11]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='3 MB']")).click();
		driver.findElement(By.xpath("//span[text()='Save']")).click();
		Thread.sleep(1000);
		String message = driver.findElement(By.xpath("//span[@class='messageText']")).getText();
		System.out.println(message);
	}*/

	@Test(description = "Delete_Custom_Fields")
	public void SET_UC_TC_016() throws InterruptedException{
		
		Thread.sleep(1000);
		db.clickOnSettingsLnk();
		driver.findElement(By.xpath("//span[text()='Users & Controls']")).click();
		driver.findElement(By.xpath("//span[text()='Custom Fields']")).click();
		driver.findElement(By.xpath("(//img[@class='action-logo'])[2]")).click();
		Thread.sleep(1000);
		
		//driver.findElement(By.xpath("//span[text()='Cancel']")).click();
		driver.findElement(By.xpath("//span[text()='Delete']")).click();
		Thread.sleep(1000);
		String message = driver.findElement(By.xpath("//span[@class='messageText']")).getText();
		System.out.println(message);
	}
//-------------------------------------------------Customisation Expenses-------------------------------------------------------------	
	
	/*@Test(description = "Create_Prefix_In_Expenses")
	public void SET_UC_TC_017() throws InterruptedException{
		
		Thread.sleep(1000);
		db.clickOnSettingsLnk();
		driver.findElement(By.xpath("//span[text()='Customisation']")).click();
		driver.findElement(By.xpath("//img[@alt='Expenses Icon']")).click();
		driver.findElement(By.xpath("//span[text()='Edit']")).click();
		driver.findElement(By.name("module_type_prefix")).sendKeys("Auto_EXP_");
		driver.findElement(By.name("module_type_starts_with")).sendKeys("00");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Save']")).click();
		Thread.sleep(1000);
		String message = driver.findElement(By.xpath("//span[@class='messageText']")).getText();
		System.out.println(message);
		
	}    */

	@Test(description = "Create_Text_Box_Field_In_Expenses")
	public void SET_UC_TC_018() throws InterruptedException{
		
		Thread.sleep(1000);
		db.clickOnSettingsLnk();
		driver.findElement(By.xpath("//span[text()='Customisation']")).click();
		driver.findElement(By.xpath("//img[@alt='Expenses Icon']")).click();
		driver.findElement(By.xpath("//div[text()='Fields']")).click();
		driver.findElement(By.xpath("//span[text()='New Field']")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("column_name")).sendKeys("Expense Text Box"+jUtil.generateRandomNumber(2));
		driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Text Box']")).click();
		driver.findElement(By.xpath("//span[text()='Save']")).click();
		Thread.sleep(1000);
		String message = driver.findElement(By.xpath("//span[@class='messageText']")).getText();
		System.out.println(message);	
	}
	
	@Test(description = "Create_Number_Field_In_Expenses")
	public void SET_UC_TC_019() throws InterruptedException{
		
		Thread.sleep(1000);
		db.clickOnSettingsLnk();
		driver.findElement(By.xpath("//span[text()='Customisation']")).click();
		driver.findElement(By.xpath("//img[@alt='Expenses Icon']")).click();
		driver.findElement(By.xpath("//div[text()='Fields']")).click();
		driver.findElement(By.xpath("//span[text()='New Field']")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("column_name")).sendKeys("Expense Number"+jUtil.generateRandomNumber(2));
		driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Number']")).click();
		driver.findElement(By.xpath("//span[text()='Save']")).click();
		Thread.sleep(1000);
		String message = driver.findElement(By.xpath("//span[@class='messageText']")).getText();
		System.out.println(message);	
	}
	
	@Test(description = "Create_Drop_Down_Field_In_Expenses")
	public void SET_UC_TC_020() throws InterruptedException{
		
		Thread.sleep(1000);
		db.clickOnSettingsLnk();
		driver.findElement(By.xpath("//span[text()='Customisation']")).click();
		driver.findElement(By.xpath("//img[@alt='Expenses Icon']")).click();
		driver.findElement(By.xpath("//div[text()='Fields']")).click();
		driver.findElement(By.xpath("//span[text()='New Field']")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("column_name")).sendKeys("Expense Drop down"+jUtil.generateRandomNumber(2));
		driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Drop Down']")).click();
		driver.findElement(By.xpath("(//input[@class='ant-input inlineItem'])[1]")).sendKeys("Option 1");
		driver.findElement(By.xpath("//span[text()='Save']")).click();
		Thread.sleep(1000);
		String message = driver.findElement(By.xpath("//span[@class='messageText']")).getText();
		System.out.println(message);	
	}
	
	@Test(description = "Create_Date&_Time_Field_In_Expenses")
	public void SET_UC_TC_021() throws InterruptedException{
		
		Thread.sleep(1000);
		db.clickOnSettingsLnk();
		driver.findElement(By.xpath("//span[text()='Customisation']")).click();
		driver.findElement(By.xpath("//img[@alt='Expenses Icon']")).click();
		driver.findElement(By.xpath("//div[text()='Fields']")).click();
		driver.findElement(By.xpath("//span[text()='New Field']")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("column_name")).sendKeys("Expense Date Time"+jUtil.generateRandomNumber(2));
		driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='DateTime']")).click();
		driver.findElement(By.xpath("//span[text()='Save']")).click();
		Thread.sleep(1000);
		String message = driver.findElement(By.xpath("//span[@class='messageText']")).getText();
		System.out.println(message);
	}
	
	@Test(description = "Delete_Field_In_Expenses")
	public void SET_UC_TC_022() throws InterruptedException{
		
		Thread.sleep(1000);
		db.clickOnSettingsLnk();
		driver.findElement(By.xpath("//span[text()='Customisation']")).click();
		driver.findElement(By.xpath("//img[@alt='Expenses Icon']")).click();
		driver.findElement(By.xpath("//div[text()='Fields']")).click();
		driver.findElement(By.xpath("(//img[@class='action-logo'])[2]")).click();
		Thread.sleep(1000);
		
		//driver.findElement(By.xpath("//span[text()='Cancel']")).click();
		driver.findElement(By.xpath("//span[text()='Delete']")).click();
		Thread.sleep(1000);
		String message = driver.findElement(By.xpath("//span[@class='messageText']")).getText();
		System.out.println(message);
	}
	
//-------------------------------------------------Customisation Reports-------------------------------------------------------------	
	
	/*	@Test(description = "Create_Prefix_In_Reports")
	public void SET_UC_TC_023() throws InterruptedException{
		
		Thread.sleep(1000);
		db.clickOnSettingsLnk();
		driver.findElement(By.xpath("//span[text()='Customisation']")).click();
		driver.findElement(By.xpath("//img[@alt='Reports Icon']")).click();
		driver.findElement(By.xpath("//span[text()='Edit']")).click();
		driver.findElement(By.name("module_type_prefix")).sendKeys("Auto_REP_");
		driver.findElement(By.name("module_type_starts_with")).sendKeys("00");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Save']")).click();
		Thread.sleep(1000);
		String message = driver.findElement(By.xpath("//span[@class='messageText']")).getText();
		System.out.println(message);
		
	}*/

	@Test(description = "Create_Text_Box_Field_In_Reports")
	public void SET_UC_TC_024() throws InterruptedException{
		
		Thread.sleep(1000);
		db.clickOnSettingsLnk();
		driver.findElement(By.xpath("//span[text()='Customisation']")).click();
		driver.findElement(By.xpath("//img[@alt='Reports Icon']")).click();
		driver.findElement(By.xpath("//div[text()='Fields']")).click();
		driver.findElement(By.xpath("//span[text()=' New Field']")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("column_name")).sendKeys("Report Text Box"+jUtil.generateRandomNumber(2));
		driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Text Box']")).click();
		driver.findElement(By.xpath("//span[text()='Save']")).click();
		Thread.sleep(1000);
		String message = driver.findElement(By.xpath("//span[@class='messageText']")).getText();
		System.out.println(message);
		
	}

	@Test(description = "Create_Number_Field_In_Reports")
	public void SET_UC_TC_025() throws InterruptedException{
		
		Thread.sleep(1000);
		db.clickOnSettingsLnk();
		driver.findElement(By.xpath("//span[text()='Customisation']")).click();
		driver.findElement(By.xpath("//img[@alt='Reports Icon']")).click();
		driver.findElement(By.xpath("//div[text()='Fields']")).click();
		driver.findElement(By.xpath("//span[text()=' New Field']")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("column_name")).sendKeys("Report Number"+jUtil.generateRandomNumber(2));
		driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Number']")).click();
		driver.findElement(By.xpath("//span[text()='Save']")).click();
		Thread.sleep(1000);
		String message = driver.findElement(By.xpath("//span[@class='messageText']")).getText();
		System.out.println(message);
	}
	
	@Test(description = "Create_Drop_Down_Field_In_Reports")
	public void SET_UC_TC_026() throws InterruptedException{
		
		Thread.sleep(1000);
		db.clickOnSettingsLnk();
		driver.findElement(By.xpath("//span[text()='Customisation']")).click();
		driver.findElement(By.xpath("//img[@alt='Reports Icon']")).click();
		driver.findElement(By.xpath("//div[text()='Fields']")).click();
		driver.findElement(By.xpath("//span[text()=' New Field']")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("column_name")).sendKeys("Report Drop down"+jUtil.generateRandomNumber(2));
		driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Drop Down']")).click();
		driver.findElement(By.xpath("(//input[@class='ant-input inlineItem'])[1]")).sendKeys("Option 1");
		driver.findElement(By.xpath("//span[text()='Save']")).click();
		Thread.sleep(1000);
		String message = driver.findElement(By.xpath("//span[@class='messageText']")).getText();
		System.out.println(message);
	}
	
	@Test(description = "Create_Date&_Time_Field_In_Reports")
	public void SET_UC_TC_027() throws InterruptedException{
		
		Thread.sleep(1000);
		db.clickOnSettingsLnk();
		driver.findElement(By.xpath("//span[text()='Customisation']")).click();
		driver.findElement(By.xpath("//img[@alt='Reports Icon']")).click();
		driver.findElement(By.xpath("//div[text()='Fields']")).click();
		driver.findElement(By.xpath("//span[text()=' New Field']")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("column_name")).sendKeys("Report Date Time"+jUtil.generateRandomNumber(2));
		driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='DateTime']")).click();
		driver.findElement(By.xpath("//span[text()='Save']")).click();
		Thread.sleep(1000);
		String message = driver.findElement(By.xpath("//span[@class='messageText']")).getText();
		System.out.println(message);
		
	}
	
	@Test(description = "Delete_Field_In_Reports")
	public void SET_UC_TC_028() throws InterruptedException{
		
		Thread.sleep(1000);
		db.clickOnSettingsLnk();
		driver.findElement(By.xpath("//span[text()='Customisation']")).click();
		driver.findElement(By.xpath("//img[@alt='Reports Icon']")).click();
		driver.findElement(By.xpath("//div[text()='Fields']")).click();
		driver.findElement(By.xpath("(//img[@class='action-logo'])[2]")).click();
		Thread.sleep(1000);
		
		//driver.findElement(By.xpath("//span[text()='Cancel']")).click();
		driver.findElement(By.xpath("//span[text()='Delete']")).click();
		Thread.sleep(1000);
		String message = driver.findElement(By.xpath("//span[@class='messageText']")).getText();
		System.out.println(message);
	}
	
//-------------------------------------------------Customisation Advances-------------------------------------------------------------	
	
	/*	@Test(description = "Create_Prefix_In_Advances")
		public void SET_UC_TC_029() throws InterruptedException{
			
			Thread.sleep(1000);
			db.clickOnSettingsLnk();
			driver.findElement(By.xpath("//span[text()='Customisation']")).click();
			driver.findElement(By.xpath("//img[@alt='Advances Icon']")).click();
			driver.findElement(By.xpath("//span[text()='Edit']")).click();
			driver.findElement(By.name("module_type_prefix")).sendKeys("Auto_ADV_");
			driver.findElement(By.name("module_type_starts_with")).sendKeys("00");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//span[text()='Save']")).click();
			Thread.sleep(1000);
			String message = driver.findElement(By.xpath("//span[@class='messageText']")).getText();
			System.out.println(message);
			
		}	*/
		
		@Test(description = "Create_Text_Box_Field_In_Advances")
		public void SET_UC_TC_030() throws InterruptedException{
			
			Thread.sleep(1000);
			db.clickOnSettingsLnk();
			driver.findElement(By.xpath("//span[text()='Customisation']")).click();
			driver.findElement(By.xpath("//img[@alt='Advances Icon']")).click();
			driver.findElement(By.xpath("//div[text()='Fields']")).click();
			driver.findElement(By.xpath("//span[text()='New Field']")).click();
			Thread.sleep(1000);
			driver.findElement(By.name("column_name")).sendKeys("Advance Text Box"+jUtil.generateRandomNumber(2));
			driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[2]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[text()='Text Box']")).click();
			driver.findElement(By.xpath("//span[text()='Save']")).click();
			Thread.sleep(1000);
			String message = driver.findElement(By.xpath("//span[@class='messageText']")).getText();
			System.out.println(message);
		}
		
		@Test(description = "Create_Number_Field_In_Advances")
		public void SET_UC_TC_031() throws InterruptedException{
			
			Thread.sleep(1000);
			db.clickOnSettingsLnk();
			driver.findElement(By.xpath("//span[text()='Customisation']")).click();
			driver.findElement(By.xpath("//img[@alt='Advances Icon']")).click();
			driver.findElement(By.xpath("//div[text()='Fields']")).click();
			driver.findElement(By.xpath("//span[text()='New Field']")).click();
			Thread.sleep(1000);
			driver.findElement(By.name("column_name")).sendKeys("Advance Number"+jUtil.generateRandomNumber(2));
			driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[2]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[text()='Number']")).click();
			driver.findElement(By.xpath("//span[text()='Save']")).click();
			Thread.sleep(1000);
			String message = driver.findElement(By.xpath("//span[@class='messageText']")).getText();
			System.out.println(message);
			
		}
		
		@Test(description = "Create_Drop_Down_Field_In_Advances")
		public void SET_UC_TC_032() throws InterruptedException{
			
			Thread.sleep(1000);
			db.clickOnSettingsLnk();
			driver.findElement(By.xpath("//span[text()='Customisation']")).click();
			driver.findElement(By.xpath("//img[@alt='Advances Icon']")).click();
			driver.findElement(By.xpath("//div[text()='Fields']")).click();
			driver.findElement(By.xpath("//span[text()='New Field']")).click();
			Thread.sleep(1000);
			driver.findElement(By.name("column_name")).sendKeys("Advance Drop down"+jUtil.generateRandomNumber(2));
			driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[2]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[text()='Drop Down']")).click();
			driver.findElement(By.xpath("(//input[@class='ant-input inlineItem'])[1]")).sendKeys("Option 1");
			driver.findElement(By.xpath("//span[text()='Save']")).click();
			Thread.sleep(1000);
			String message = driver.findElement(By.xpath("//span[@class='messageText']")).getText();
			System.out.println(message);
			
		}
		
		@Test(description = "Create_Date&_Time_Field_In_Advances")
		public void SET_UC_TC_033() throws InterruptedException{
			
			Thread.sleep(1000);
			db.clickOnSettingsLnk();
			driver.findElement(By.xpath("//span[text()='Customisation']")).click();
			driver.findElement(By.xpath("//img[@alt='Advances Icon']")).click();
			driver.findElement(By.xpath("//div[text()='Fields']")).click();
			driver.findElement(By.xpath("//span[text()='New Field']")).click();
			Thread.sleep(1000);
			driver.findElement(By.name("column_name")).sendKeys("Advance Date Time"+jUtil.generateRandomNumber(2));
			driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[2]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[text()='DateTime']")).click();
			driver.findElement(By.xpath("//span[text()='Save']")).click();
			Thread.sleep(1000);
			String message = driver.findElement(By.xpath("//span[@class='messageText']")).getText();
			System.out.println(message);
			
		}
		
		@Test(description = "Delete_Field_In_Advances")
		public void SET_UC_TC_034() throws InterruptedException{
			
			Thread.sleep(1000);
			db.clickOnSettingsLnk();
			driver.findElement(By.xpath("//span[text()='Customisation']")).click();
			driver.findElement(By.xpath("//img[@alt='Advances Icon']")).click();
			driver.findElement(By.xpath("//div[text()='Fields']")).click();
			driver.findElement(By.xpath("(//img[@class='action-logo'])[2]")).click();
			Thread.sleep(1000);
			
			//driver.findElement(By.xpath("//span[text()='Cancel']")).click();
			driver.findElement(By.xpath("//span[text()='Delete']")).click();
			Thread.sleep(1000);
			String message = driver.findElement(By.xpath("//span[@class='messageText']")).getText();
			System.out.println(message);
		}
	
//-------------------------------------------------Customisation Trips-------------------------------------------------------------	
		
		/*		@Test(description = "Create_Prefix_In_Trips")
			public void SET_UC_TC_035() throws InterruptedException{
				
				Thread.sleep(1000);
				db.clickOnSettingsLnk();
				driver.findElement(By.xpath("//span[text()='Customisation']")).click();
				driver.findElement(By.xpath("//img[@alt='Trips Icon']")).click();
				driver.findElement(By.xpath("//span[text()='Edit']")).click();
				driver.findElement(By.name("module_type_prefix")).sendKeys("Auto_TRIP_");
				driver.findElement(By.name("module_type_starts_with")).sendKeys("00");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//span[text()='Save']")).click();
				Thread.sleep(1000);
				String message = driver.findElement(By.xpath("//span[@class='messageText']")).getText();
				System.out.println(message);
				
			}		*/
			
			@Test(description = "Create_Text_Box_Field_In_Tripss")
			public void SET_UC_TC_036() throws InterruptedException{
				
				Thread.sleep(1000);
				db.clickOnSettingsLnk();
				driver.findElement(By.xpath("//span[text()='Customisation']")).click();
				driver.findElement(By.xpath("//img[@alt='Trips Icon']")).click();
				driver.findElement(By.xpath("//div[text()='Fields']")).click();
				driver.findElement(By.xpath("//span[text()='New Field']")).click();
				Thread.sleep(1000);
				driver.findElement(By.name("column_name")).sendKeys("Trip Text Box"+jUtil.generateRandomNumber(2));
				driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[2]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//div[text()='Text Box']")).click();
				driver.findElement(By.xpath("//span[text()='Save']")).click();
				Thread.sleep(1000);
				String message = driver.findElement(By.xpath("//span[@class='messageText']")).getText();
				System.out.println(message);
			}
			
			@Test(description = "Create_Number_Field_In_Trips")
			public void SET_UC_TC_037() throws InterruptedException{
				
				Thread.sleep(1000);
				db.clickOnSettingsLnk();
				driver.findElement(By.xpath("//span[text()='Customisation']")).click();
				driver.findElement(By.xpath("//img[@alt='Trips Icon']")).click();
				driver.findElement(By.xpath("//div[text()='Fields']")).click();
				driver.findElement(By.xpath("//span[text()='New Field']")).click();
				Thread.sleep(1000);
				driver.findElement(By.name("column_name")).sendKeys("Trip Number"+jUtil.generateRandomNumber(2));
				driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[2]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//div[text()='Number']")).click();
				driver.findElement(By.xpath("//span[text()='Save']")).click();
				Thread.sleep(2000);
				String message = driver.findElement(By.xpath("//span[@class='messageText']")).getText();
				System.out.println(message);
			}
			
			@Test(description = "Create_Drop_Down_Field_In_Trips")
			public void SET_UC_TC_038() throws InterruptedException{
				
				Thread.sleep(1000);
				db.clickOnSettingsLnk();
				driver.findElement(By.xpath("//span[text()='Customisation']")).click();
				driver.findElement(By.xpath("//img[@alt='Trips Icon']")).click();
				driver.findElement(By.xpath("//div[text()='Fields']")).click();
				driver.findElement(By.xpath("//span[text()='New Field']")).click();
				Thread.sleep(1000);
				driver.findElement(By.name("column_name")).sendKeys("Trip Drop down"+jUtil.generateRandomNumber(2));
				driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[2]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//div[text()='Drop Down']")).click();
				driver.findElement(By.xpath("(//input[@class='ant-input inlineItem'])[1]")).sendKeys("Option 1");
				driver.findElement(By.xpath("//span[text()='Save']")).click();
				Thread.sleep(1000);
				String message = driver.findElement(By.xpath("//span[@class='messageText']")).getText();
				System.out.println(message);
			}
			
			@Test(description = "Create_Date&_Time_Field_In_Trips")
			public void SET_UC_TC_039() throws InterruptedException{
				
				Thread.sleep(1000);
				db.clickOnSettingsLnk();
				driver.findElement(By.xpath("//span[text()='Customisation']")).click();
				driver.findElement(By.xpath("//img[@alt='Trips Icon']")).click();
				driver.findElement(By.xpath("//div[text()='Fields']")).click();
				driver.findElement(By.xpath("//span[text()='New Field']")).click();
				Thread.sleep(1000);
				driver.findElement(By.name("column_name")).sendKeys("Trip Date Time"+jUtil.generateRandomNumber(2));
				driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[2]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//div[text()='DateTime']")).click();
				driver.findElement(By.xpath("//span[text()='Save']")).click();
				Thread.sleep(1000);
				String message = driver.findElement(By.xpath("//span[@class='messageText']")).getText();
				System.out.println(message);
				
			}
			
			@Test(description = "Delete_Field_In_Trips")
			public void SET_UC_TC_040() throws InterruptedException{
				
				Thread.sleep(1000);
				db.clickOnSettingsLnk();
				driver.findElement(By.xpath("//span[text()='Customisation']")).click();
				driver.findElement(By.xpath("//img[@alt='Trips Icon']")).click();
				driver.findElement(By.xpath("//div[text()='Fields']")).click();
				driver.findElement(By.xpath("(//img[@class='action-logo'])[2]")).click();
				Thread.sleep(1000);
				
				//driver.findElement(By.xpath("//span[text()='Cancel']")).click();
				driver.findElement(By.xpath("//span[text()='Delete']")).click();
				Thread.sleep(1000);
				String message = driver.findElement(By.xpath("//span[@class='messageText']")).getText();
				System.out.println(message);
			}
			
//-------------------------------------------------Customisation Estimates-------------------------------------------------------------	
			
			/*		@Test(description = "Create_Prefix_In_Estimates")
			public void SET_UC_TC_041() throws InterruptedException{
				
				Thread.sleep(1000);
				db.clickOnSettingsLnk();
				driver.findElement(By.xpath("//span[text()='Customisation']")).click();
				driver.findElement(By.xpath("//img[@alt='Estimate Icon']")).click();
				driver.findElement(By.xpath("//span[text()='Edit']")).click();
				driver.findElement(By.name("module_type_prefix")).sendKeys("Auto_EST_");
				driver.findElement(By.name("module_type_starts_with")).sendKeys("00");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//span[text()='Save']")).click();
				Thread.sleep(1000);
				String message = driver.findElement(By.xpath("//span[@class='messageText']")).getText();
				System.out.println(message);
				
			}		*/
			
			@Test(description = "Create_Text_Box_Field_In_Estimates")
			public void SET_UC_TC_042() throws InterruptedException{
				
				Thread.sleep(1000);
				db.clickOnSettingsLnk();
				driver.findElement(By.xpath("//span[text()='Customisation']")).click();
				driver.findElement(By.xpath("//img[@alt='Estimate Icon']")).click();
				driver.findElement(By.xpath("//div[text()='Fields']")).click();
				driver.findElement(By.xpath("//span[text()='New Field']")).click();
				Thread.sleep(1000);
				driver.findElement(By.name("column_name")).sendKeys("Estimate Text Box"+jUtil.generateRandomNumber(2));
				driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[2]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//div[text()='Text Box']")).click();
				driver.findElement(By.xpath("//span[text()='Save']")).click();
				Thread.sleep(1000);
				String message = driver.findElement(By.xpath("//span[@class='messageText']")).getText();
				System.out.println(message);	
			}
			
			@Test(description = "Create_Number_Field_In_Estimates")
			public void SET_UC_TC_043() throws InterruptedException{
				
				Thread.sleep(1000);
				db.clickOnSettingsLnk();
				driver.findElement(By.xpath("//span[text()='Customisation']")).click();
				driver.findElement(By.xpath("//img[@alt='Estimate Icon']")).click();
				driver.findElement(By.xpath("//div[text()='Fields']")).click();
				driver.findElement(By.xpath("//span[text()='New Field']")).click();
				Thread.sleep(1000);
				driver.findElement(By.name("column_name")).sendKeys("Estimate Number"+jUtil.generateRandomNumber(2));
				driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[2]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//div[text()='Number']")).click();
				driver.findElement(By.xpath("//span[text()='Save']")).click();
				Thread.sleep(1000);
				String message = driver.findElement(By.xpath("//span[@class='messageText']")).getText();
				System.out.println(message);	
			}
			
			@Test(description = "Create_Drop_Down_Field_In_Estimates")
			public void SET_UC_TC_044() throws InterruptedException{
				
				Thread.sleep(1000);
				db.clickOnSettingsLnk();
				driver.findElement(By.xpath("//span[text()='Customisation']")).click();
				driver.findElement(By.xpath("//img[@alt='Estimate Icon']")).click();
				driver.findElement(By.xpath("//div[text()='Fields']")).click();
				driver.findElement(By.xpath("//span[text()='New Field']")).click();
				Thread.sleep(1000);
				driver.findElement(By.name("column_name")).sendKeys("Estimate Drop down"+jUtil.generateRandomNumber(2));
				driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[2]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//div[text()='Drop Down']")).click();
				driver.findElement(By.xpath("(//input[@class='ant-input inlineItem'])[1]")).sendKeys("Option 1");
				driver.findElement(By.xpath("//span[text()='Save']")).click();
				Thread.sleep(1000);
				String message = driver.findElement(By.xpath("//span[@class='messageText']")).getText();
				System.out.println(message);
			}
			
			@Test(description = "Create_Date&_Time_Field_In_Estimates")
			public void SET_UC_TC_045() throws InterruptedException{
				
				Thread.sleep(1000);
				db.clickOnSettingsLnk();
				driver.findElement(By.xpath("//span[text()='Customisation']")).click();
				driver.findElement(By.xpath("//img[@alt='Estimate Icon']")).click();
				driver.findElement(By.xpath("//div[text()='Fields']")).click();
				driver.findElement(By.xpath("//span[text()='New Field']")).click();
				Thread.sleep(1000);
				driver.findElement(By.name("column_name")).sendKeys("Estimate Date Time"+jUtil.generateRandomNumber(2));
				driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[2]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//div[text()='DateTime']")).click();
				driver.findElement(By.xpath("//span[text()='Save']")).click();
				Thread.sleep(1000);
				String message = driver.findElement(By.xpath("//span[@class='messageText']")).getText();
				System.out.println(message);
			}
			
			@Test(description = "Delete_Field_In_Estimates")
			public void SET_UC_TC_046() throws InterruptedException{
				
				Thread.sleep(1000);
				db.clickOnSettingsLnk();
				driver.findElement(By.xpath("//span[text()='Customisation']")).click();
				driver.findElement(By.xpath("//img[@alt='Estimate Icon']")).click();
				driver.findElement(By.xpath("//div[text()='Fields']")).click();
				driver.findElement(By.xpath("(//img[@class='action-logo'])[2]")).click();
				Thread.sleep(1000);
				
				//driver.findElement(By.xpath("//span[text()='Cancel']")).click();
				driver.findElement(By.xpath("//span[text()='Delete']")).click();
				Thread.sleep(1000);
				String message = driver.findElement(By.xpath("//span[@class='messageText']")).getText();
				System.out.println(message);
			}

//-------------------------------------------------Customisation SalesOrder-------------------------------------------------------------	
			
			/*		@Test(description = "Create_Prefix_In_SalesOrder")
			public void SET_UC_TC_047() throws InterruptedException{
				
				Thread.sleep(1000);
				db.clickOnSettingsLnk();
				driver.findElement(By.xpath("//span[text()='Customisation']")).click();
				driver.findElement(By.xpath("//img[@alt='SalesOrder Icon']")).click();
				driver.findElement(By.xpath("//span[text()='Edit']")).click();
				driver.findElement(By.name("module_type_prefix")).sendKeys("Auto_SO_");
				driver.findElement(By.name("module_type_starts_with")).sendKeys("00");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//span[text()='Save']")).click();
				Thread.sleep(1000);
				String message = driver.findElement(By.xpath("//span[@class='messageText']")).getText();
				System.out.println(message);
			}		*/
			
			@Test(description = "Create_Text_Box_Field_In_SalesOrder")
			public void SET_UC_TC_048() throws InterruptedException{
				
				Thread.sleep(1000);
				db.clickOnSettingsLnk();
				driver.findElement(By.xpath("//span[text()='Customisation']")).click();
				driver.findElement(By.xpath("//img[@alt='SalesOrder Icon']")).click();
				driver.findElement(By.xpath("//div[text()='Fields']")).click();
				driver.findElement(By.xpath("//span[text()='New Field']")).click();
				Thread.sleep(1000);
				driver.findElement(By.name("column_name")).sendKeys("SalesOrder Text Box"+jUtil.generateRandomNumber(2));
				driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[2]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//div[text()='Text Box']")).click();
				driver.findElement(By.xpath("//span[text()='Save']")).click();
				Thread.sleep(1000);
				String message = driver.findElement(By.xpath("//span[@class='messageText']")).getText();
				System.out.println(message);
			}
			
			@Test(description = "Create_Number_Field_In_SalesOrder")
			public void SET_UC_TC_049() throws InterruptedException{
				
				Thread.sleep(1000);
				db.clickOnSettingsLnk();
				driver.findElement(By.xpath("//span[text()='Customisation']")).click();
				driver.findElement(By.xpath("//img[@alt='SalesOrder Icon']")).click();
				driver.findElement(By.xpath("//div[text()='Fields']")).click();
				driver.findElement(By.xpath("//span[text()='New Field']")).click();
				Thread.sleep(1000);
				driver.findElement(By.name("column_name")).sendKeys("SalesOrder Number"+jUtil.generateRandomNumber(2));
				driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[2]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//div[text()='Number']")).click();
				driver.findElement(By.xpath("//span[text()='Save']")).click();
				Thread.sleep(1000);
				String message = driver.findElement(By.xpath("//span[@class='messageText']")).getText();
				System.out.println(message);	
			}
			
			@Test(description = "Create_Drop_Down_Field_In_SalesOrder")
			public void SET_UC_TC_050() throws InterruptedException{
				
				Thread.sleep(1000);
				db.clickOnSettingsLnk();
				driver.findElement(By.xpath("//span[text()='Customisation']")).click();
				driver.findElement(By.xpath("//img[@alt='SalesOrder Icon']")).click();
				driver.findElement(By.xpath("//div[text()='Fields']")).click();
				driver.findElement(By.xpath("//span[text()='New Field']")).click();
				Thread.sleep(1000);
				driver.findElement(By.name("column_name")).sendKeys("SalesOrder Drop down"+jUtil.generateRandomNumber(2));
				driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[2]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//div[text()='Drop Down']")).click();
				driver.findElement(By.xpath("(//input[@class='ant-input inlineItem'])[1]")).sendKeys("Option 1");
				driver.findElement(By.xpath("//span[text()='Save']")).click();
				Thread.sleep(1000);
				String message = driver.findElement(By.xpath("//span[@class='messageText']")).getText();
				System.out.println(message);	
			}
			
			@Test(description = "Create_Date&_Time_Field_In_SalesOrder")
			public void SET_UC_TC_051() throws InterruptedException{
				
				Thread.sleep(1000);
				db.clickOnSettingsLnk();
				driver.findElement(By.xpath("//span[text()='Customisation']")).click();
				driver.findElement(By.xpath("//img[@alt='SalesOrder Icon']")).click();
				driver.findElement(By.xpath("//div[text()='Fields']")).click();
				driver.findElement(By.xpath("//span[text()='New Field']")).click();
				Thread.sleep(1000);
				driver.findElement(By.name("column_name")).sendKeys("SalesOrder Date Time"+jUtil.generateRandomNumber(2));
				driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[2]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//div[text()='DateTime']")).click();
				driver.findElement(By.xpath("//span[text()='Save']")).click();
				Thread.sleep(1000);
				String message = driver.findElement(By.xpath("//span[@class='messageText']")).getText();
				System.out.println(message);	
			}
			
			
			@Test(description = "Delete_Field_In_SalesOrders")
			public void SET_UC_TC_052() throws InterruptedException{
				
				Thread.sleep(1000);
				db.clickOnSettingsLnk();
				driver.findElement(By.xpath("//span[text()='Customisation']")).click();
				driver.findElement(By.xpath("//img[@alt='SalesOrder Icon']")).click();
				driver.findElement(By.xpath("//div[text()='Fields']")).click();
				driver.findElement(By.xpath("(//img[@class='action-logo'])[2]")).click();
				Thread.sleep(1000);
				
				//driver.findElement(By.xpath("//span[text()='Cancel']")).click();
				driver.findElement(By.xpath("//span[text()='Delete']")).click();
				Thread.sleep(1000);
				String message = driver.findElement(By.xpath("//span[@class='messageText']")).getText();
				System.out.println(message);
			}
//-------------------------------------------------Customisation Invoices-------------------------------------------------------------	
			
			/*		@Test(description = "Create_Prefix_In_Invoices")
			public void SET_UC_TC_053() throws InterruptedException{
				
				Thread.sleep(1000);
				db.clickOnSettingsLnk();
				driver.findElement(By.xpath("//span[text()='Customisation']")).click();
				driver.findElement(By.xpath("//img[@alt='Invoices Icon']")).click();
				driver.findElement(By.xpath("//span[text()='Edit']")).click();
				driver.findElement(By.name("module_type_prefix")).sendKeys("Auto_INV_");
				driver.findElement(By.name("module_type_starts_with")).sendKeys("00");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//span[text()='Save']")).click();
				Thread.sleep(1000);
				String message = driver.findElement(By.xpath("//span[@class='messageText']")).getText();
				System.out.println(message);		
			}		*/		
			
			@Test(description = "Create_Text_Box_Field_In_Invoices")
			public void SET_UC_TC_054() throws InterruptedException{
				
				Thread.sleep(1000);
				db.clickOnSettingsLnk();
				driver.findElement(By.xpath("//span[text()='Customisation']")).click();
				driver.findElement(By.xpath("//img[@alt='Invoices Icon']")).click();
				driver.findElement(By.xpath("//div[text()='Fields']")).click();
				driver.findElement(By.xpath("//span[text()='New Field']")).click();
				Thread.sleep(1000);
				driver.findElement(By.name("column_name")).sendKeys("Invoices Text Box"+jUtil.generateRandomNumber(2));
				driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[2]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//div[text()='Text Box']")).click();
				driver.findElement(By.xpath("//span[text()='Save']")).click();
				Thread.sleep(1000);
				String message = driver.findElement(By.xpath("//span[@class='messageText']")).getText();
				System.out.println(message);		
			}
				
			@Test(description = "Create_Number_Field_In_Invoices")
			public void SET_UC_TC_055() throws InterruptedException{
				
				Thread.sleep(1000);
				db.clickOnSettingsLnk();
				driver.findElement(By.xpath("//span[text()='Customisation']")).click();
				driver.findElement(By.xpath("//img[@alt='Invoices Icon']")).click();
				driver.findElement(By.xpath("//div[text()='Fields']")).click();
				driver.findElement(By.xpath("//span[text()='New Field']")).click();
				Thread.sleep(1000);
				driver.findElement(By.name("column_name")).sendKeys("Invoices Number"+jUtil.generateRandomNumber(2));
				driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[2]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//div[text()='Number']")).click();
				driver.findElement(By.xpath("//span[text()='Save']")).click();
				Thread.sleep(1000);
				String message = driver.findElement(By.xpath("//span[@class='messageText']")).getText();
				System.out.println(message);
			}
			
			@Test(description = "Create_Drop_Down_Field_In_Invoices")
			public void SET_UC_TC_056() throws InterruptedException{
				
				Thread.sleep(1000);
				db.clickOnSettingsLnk();
				driver.findElement(By.xpath("//span[text()='Customisation']")).click();
				driver.findElement(By.xpath("//img[@alt='Invoices Icon']")).click();
				driver.findElement(By.xpath("//div[text()='Fields']")).click();
				driver.findElement(By.xpath("//span[text()='New Field']")).click();
				Thread.sleep(1000);
				driver.findElement(By.name("column_name")).sendKeys("Invoices Drop down"+jUtil.generateRandomNumber(2));
				driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[2]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//div[text()='Drop Down']")).click();
				driver.findElement(By.xpath("(//input[@class='ant-input inlineItem'])[1]")).sendKeys("Option 1");
				driver.findElement(By.xpath("//span[text()='Save']")).click();
				Thread.sleep(1000);
				String message = driver.findElement(By.xpath("//span[@class='messageText']")).getText();
				System.out.println(message);
				
			}
			
			@Test(description = "Create_Date&_Time_Field_In_Invoices")
			public void SET_UC_TC_057() throws InterruptedException{
				
				Thread.sleep(1000);
				db.clickOnSettingsLnk();
				driver.findElement(By.xpath("//span[text()='Customisation']")).click();
				driver.findElement(By.xpath("//img[@alt='Invoices Icon']")).click();
				driver.findElement(By.xpath("//div[text()='Fields']")).click();
				driver.findElement(By.xpath("//span[text()='New Field']")).click();
				Thread.sleep(1000);
				driver.findElement(By.name("column_name")).sendKeys("Invoices Date Time"+jUtil.generateRandomNumber(2));
				driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[2]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//div[text()='DateTime']")).click();
				driver.findElement(By.xpath("//span[text()='Save']")).click();
				Thread.sleep(1000);
				String message = driver.findElement(By.xpath("//span[@class='messageText']")).getText();
				System.out.println(message);
			}	
			
			@Test(description = "Delete_Field_In_Invoices")
			public void SET_UC_TC_058() throws InterruptedException{
				
				Thread.sleep(1000);
				db.clickOnSettingsLnk();
				driver.findElement(By.xpath("//span[text()='Customisation']")).click();
				driver.findElement(By.xpath("//img[@alt='Invoices Icon']")).click();
				driver.findElement(By.xpath("//div[text()='Fields']")).click();
				driver.findElement(By.xpath("(//img[@class='action-logo'])[2]")).click();
				Thread.sleep(1000);
				
				//driver.findElement(By.xpath("//span[text()='Cancel']")).click();
				driver.findElement(By.xpath("//span[text()='Delete']")).click();
				Thread.sleep(1000);
				String message = driver.findElement(By.xpath("//span[@class='messageText']")).getText();
				System.out.println(message);
			}
			
//-------------------------------------------------Customisation PurchaseOrders-------------------------------------------------------------	
			
			/*		@Test(description = "Create_Prefix_In_PurchaseOrders")
			public void SET_UC_TC_059() throws InterruptedException{
				
				Thread.sleep(1000);
				db.clickOnSettingsLnk();
				driver.findElement(By.xpath("//span[text()='Customisation']")).click();
				driver.findElement(By.xpath("//img[@alt='PurchaseOrders Icon']")).click();
				driver.findElement(By.xpath("//span[text()='Edit']")).click();
				driver.findElement(By.name("module_type_prefix")).sendKeys("Auto_PO_");
				driver.findElement(By.name("module_type_starts_with")).sendKeys("00");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//span[text()='Save']")).click();
				Thread.sleep(1000);
				String message = driver.findElement(By.xpath("//span[@class='messageText']")).getText();
				System.out.println(message);	
			}		*/
			
			@Test(description = "Create_Text_Box_Field_In_PurchaseOrders")
			public void SET_UC_TC_060() throws InterruptedException{
				
				Thread.sleep(1000);
				db.clickOnSettingsLnk();
				driver.findElement(By.xpath("//span[text()='Customisation']")).click();
				driver.findElement(By.xpath("//img[@alt='PurchaseOrders Icon']")).click();
				driver.findElement(By.xpath("//div[text()='Fields']")).click();
				driver.findElement(By.xpath("//span[text()='New Field']")).click();
				Thread.sleep(1000);
				driver.findElement(By.name("column_name")).sendKeys("PurchaseOrders Text Box"+jUtil.generateRandomNumber(2));
				driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[2]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//div[text()='Text Box']")).click();
				driver.findElement(By.xpath("//span[text()='Save']")).click();
				Thread.sleep(1000);
				String message = driver.findElement(By.xpath("//span[@class='messageText']")).getText();
				System.out.println(message);		
			}
		
			@Test(description = "Create_Number_Field_In_PurchaseOrders")
			public void SET_UC_TC_061() throws InterruptedException{
				
				Thread.sleep(1000);
				db.clickOnSettingsLnk();
				driver.findElement(By.xpath("//span[text()='Customisation']")).click();
				driver.findElement(By.xpath("//img[@alt='PurchaseOrders Icon']")).click();
				driver.findElement(By.xpath("//div[text()='Fields']")).click();
				driver.findElement(By.xpath("//span[text()='New Field']")).click();
				Thread.sleep(1000);
				driver.findElement(By.name("column_name")).sendKeys("PurchaseOrders Number"+jUtil.generateRandomNumber(2));
				driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[2]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//div[text()='Number']")).click();
				driver.findElement(By.xpath("//span[text()='Save']")).click();
				Thread.sleep(1000);
				String message = driver.findElement(By.xpath("//span[@class='messageText']")).getText();
				System.out.println(message);	
			}
			
			@Test(description = "Create_Drop_Down_Field_In_PurchaseOrders")
			public void SET_UC_TC_062() throws InterruptedException{
				
				Thread.sleep(1000);
				db.clickOnSettingsLnk();
				driver.findElement(By.xpath("//span[text()='Customisation']")).click();
				driver.findElement(By.xpath("//img[@alt='PurchaseOrders Icon']")).click();
				driver.findElement(By.xpath("//div[text()='Fields']")).click();
				driver.findElement(By.xpath("//span[text()='New Field']")).click();
				Thread.sleep(1000);
				driver.findElement(By.name("column_name")).sendKeys("PurchaseOrders Drop down"+jUtil.generateRandomNumber(2));
				driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[2]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//div[text()='Drop Down']")).click();
				driver.findElement(By.xpath("(//input[@class='ant-input inlineItem'])[1]")).sendKeys("Option 1");
				driver.findElement(By.xpath("//span[text()='Save']")).click();
				Thread.sleep(1000);
				String message = driver.findElement(By.xpath("//span[@class='messageText']")).getText();
				System.out.println(message);	
			}
			
			@Test(description = "Create_Date&_Time_Field_In_PurchaseOrders")
			public void SET_UC_TC_063() throws InterruptedException{
				
				Thread.sleep(1000);
				db.clickOnSettingsLnk();
				driver.findElement(By.xpath("//span[text()='Customisation']")).click();
				driver.findElement(By.xpath("//img[@alt='PurchaseOrders Icon']")).click();
				driver.findElement(By.xpath("//div[text()='Fields']")).click();
				driver.findElement(By.xpath("//span[text()='New Field']")).click();
				Thread.sleep(1000);
				driver.findElement(By.name("column_name")).sendKeys("PurchaseOrders Date Time"+jUtil.generateRandomNumber(2));
				driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[2]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//div[text()='DateTime']")).click();
				driver.findElement(By.xpath("//span[text()='Save']")).click();
				Thread.sleep(1000);
				String message = driver.findElement(By.xpath("//span[@class='messageText']")).getText();
				System.out.println(message);
			}	
			
			@Test(description = "Delete_Field_In_PurchaseOrders")
			public void SET_UC_TC_064() throws InterruptedException{
				
				Thread.sleep(1000);
				db.clickOnSettingsLnk();
				driver.findElement(By.xpath("//span[text()='Customisation']")).click();
				driver.findElement(By.xpath("//img[@alt='PurchaseOrders Icon']")).click();
				driver.findElement(By.xpath("//div[text()='Fields']")).click();
				driver.findElement(By.xpath("(//img[@class='action-logo'])[2]")).click();
				Thread.sleep(1000);
				
				//driver.findElement(By.xpath("//span[text()='Cancel']")).click();
				driver.findElement(By.xpath("//span[text()='Delete']")).click();
				Thread.sleep(1000);
				String message = driver.findElement(By.xpath("//span[@class='messageText']")).getText();
				System.out.println(message);
			}
			
//-------------------------------------------------Customisation Bills-------------------------------------------------------------	
			
			/*	@Test(description = "Create_Prefix_In_Bills")
			public void SET_UC_TC_065() throws InterruptedException{
				
				Thread.sleep(1000);
				db.clickOnSettingsLnk();
				driver.findElement(By.xpath("//span[text()='Customisation']")).click();
				driver.findElement(By.xpath("//img[@alt='Bills Icon']")).click();
				driver.findElement(By.xpath("//span[text()='Edit']")).click();
				driver.findElement(By.name("module_type_prefix")).sendKeys("Auto_BIL_");
				driver.findElement(By.name("module_type_starts_with")).sendKeys("00");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//span[text()='Save']")).click();
				Thread.sleep(1000);
				String message = driver.findElement(By.xpath("//span[@class='messageText']")).getText();
				System.out.println(message);	
			}		*/
			
			@Test(description = "Create_Text_Box_Field_In_Bills")
			public void SET_UC_TC_066() throws InterruptedException{
				
				Thread.sleep(1000);
				db.clickOnSettingsLnk();
				driver.findElement(By.xpath("//span[text()='Customisation']")).click();
				driver.findElement(By.xpath("//img[@alt='Bills Icon']")).click();
				driver.findElement(By.xpath("//div[text()='Fields']")).click();
				driver.findElement(By.xpath("//span[text()='New Field']")).click();   
				Thread.sleep(1000);
				driver.findElement(By.name("column_name")).sendKeys("Bills Text Box"+jUtil.generateRandomNumber(2));
				driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[2]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//div[text()='Text Box']")).click();
				driver.findElement(By.xpath("//span[text()='Save']")).click();
				Thread.sleep(1000);
				String message = driver.findElement(By.xpath("//span[@class='messageText']")).getText();
				System.out.println(message);	
			}
			
			@Test(description = "Create_Number_Field_In_Bills")
			public void SET_UC_TC_067() throws InterruptedException{
				
				Thread.sleep(1000);
				db.clickOnSettingsLnk();
				driver.findElement(By.xpath("//span[text()='Customisation']")).click();
				driver.findElement(By.xpath("//img[@alt='Bills Icon']")).click();
				driver.findElement(By.xpath("//div[text()='Fields']")).click();
				driver.findElement(By.xpath("//span[text()='New Field']")).click();
				Thread.sleep(1000);
				driver.findElement(By.name("column_name")).sendKeys("Bills Number"+jUtil.generateRandomNumber(2));
				driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[2]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//div[text()='Number']")).click();
				driver.findElement(By.xpath("//span[text()='Save']")).click();
				Thread.sleep(1000);
				String message = driver.findElement(By.xpath("//span[@class='messageText']")).getText();
				System.out.println(message);	
			}
			
			@Test(description = "Create_Drop_Down_Field_In_Bills")
			public void SET_UC_TC_068() throws InterruptedException{
				
				Thread.sleep(1000);
				db.clickOnSettingsLnk();
				driver.findElement(By.xpath("//span[text()='Customisation']")).click();
				driver.findElement(By.xpath("//img[@alt='Bills Icon']")).click();
				driver.findElement(By.xpath("//div[text()='Fields']")).click();
				driver.findElement(By.xpath("//span[text()='New Field']")).click();
				Thread.sleep(1000);
				driver.findElement(By.name("column_name")).sendKeys("Bills Drop down"+jUtil.generateRandomNumber(2));
				driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[2]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//div[text()='Drop Down']")).click();
				driver.findElement(By.xpath("(//input[@class='ant-input inlineItem'])[1]")).sendKeys("Option 1");
				driver.findElement(By.xpath("//span[text()='Save']")).click();
				Thread.sleep(1000);
				String message = driver.findElement(By.xpath("//span[@class='messageText']")).getText();
				System.out.println(message);
			}
			
			@Test(description = "Create_Date&_Time_Field_In_Bills")
			public void SET_UC_TC_069() throws InterruptedException{
				
				Thread.sleep(1000);
				db.clickOnSettingsLnk();
				driver.findElement(By.xpath("//span[text()='Customisation']")).click();
				driver.findElement(By.xpath("//img[@alt='Bills Icon']")).click();
				driver.findElement(By.xpath("//div[text()='Fields']")).click();
				driver.findElement(By.xpath("//span[text()='New Field']")).click();
				Thread.sleep(1000);
				driver.findElement(By.name("column_name")).sendKeys("Bills Date Time"+jUtil.generateRandomNumber(2));
				driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[2]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//div[text()='DateTime']")).click();
				driver.findElement(By.xpath("//span[text()='Save']")).click();
				Thread.sleep(1000);
				String message = driver.findElement(By.xpath("//span[@class='messageText']")).getText();
				System.out.println(message);
			}	
			 
			@Test(description = "Delete_Field_In_Bills")
			public void SET_UC_TC_070() throws InterruptedException{
				
				Thread.sleep(1000);
				db.clickOnSettingsLnk();
				driver.findElement(By.xpath("//span[text()='Customisation']")).click();
				driver.findElement(By.xpath("//img[@alt='Bills Icon']")).click();
				driver.findElement(By.xpath("//div[text()='Fields']")).click();
				driver.findElement(By.xpath("(//img[@class='action-logo'])[2]")).click();
				Thread.sleep(1000);
				//driver.findElement(By.xpath("//span[text()='Cancel']")).click();
				driver.findElement(By.xpath("//span[text()='Delete']")).click();
				Thread.sleep(1000);
				String message = driver.findElement(By.xpath("//span[@class='messageText']")).getText();
				System.out.println(message);
			}
}
