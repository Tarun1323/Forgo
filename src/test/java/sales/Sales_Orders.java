package sales;

import org.openqa.selenium.By;
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
	driver.findElement(By.xpath("(//input[@class='ant-select-selection-search-input'])[2]")).sendKeys("anil");
	//driver.findElement(By.xpath("(//input[@class='ant-select-selection-search-input'])[1]")).click();
	//driver.findElement(By.xpath("//div[@class='ant-select-dropdown ant-select-dropdown-placement-bottomLeft  ant-select-dropdown-hidden']")).click();
	//driver.findElement(By.xpath("//input[@name='ref_po_no']")).sendKeys("123234");
	//driver.findElement(By.xpath("(//input[@class='ant-select-selection-search-input'])[3]")).sendKeys("123234");
	//driver.findElement(By.xpath("//input[@id=\"rc_select_2\"]")).sendKeys("Custom");
	driver.findElement(By.xpath("(//input[@class='ant-select-selection-search-input'])[4]")).sendKeys("lap");
	driver.findElement(By.xpath("//input[@name='items.0.quantity']")).sendKeys("10");
	driver.findElement(By.xpath("//input[@name='items.0.unit_price']")).sendKeys("10000");
	driver.findElement(By.xpath("//input[@name='items.0.discount_percentage']")).sendKeys("20");
	//driver.findElement(By.xpath("//div[@name='items.0.tax_type']")).sendKeys("GST 10%");
	driver.findElement(By.xpath("(//button[@id='save'])[1]")).click();
	Thread.sleep(10000);
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
}
