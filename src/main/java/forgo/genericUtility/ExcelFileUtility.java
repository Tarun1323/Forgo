package forgo.genericUtility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * This Class contains all generic methods to read data and write data to excel
 * 
 * @author Dell
 */

public class ExcelFileUtility {

	/**
	 * This method will read the data from the Excel sheet and return the value
	 * 
	 * @param sheet
	 * @param row
	 * @param cell
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String readDataFromExcel(String sheet, int row, int cell) throws EncryptedDocumentException, IOException {

		FileInputStream fis = new FileInputStream(ContantsUtility.ExelFilePath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet s = wb.getSheet(sheet);
		Row r = s.getRow(row);
		Cell cel = r.getCell(cell);
		String value = cel.getStringCellValue();
		wb.close();
		return value;

	}
	
	/**
	 * This method will return the lat row number in the perticular sheet
	 * @param sheet
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public int getRowCount(String sheet) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream(ContantsUtility.ExelFilePath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet s = wb.getSheet(sheet);
		int lastRow = s.getLastRowNum();	
		return lastRow;
	}
	
	/**
	 * This method will write the data into the excel sheet
	 * @param sheet
	 * @param row
	 * @param cell
	 * @param value
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public void writeDataIntoExcel(String sheet, int row, int cell, String value) throws EncryptedDocumentException, IOException {

		FileInputStream fis = new FileInputStream(ContantsUtility.ExelFilePath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet s = wb.getSheet(sheet);
		Row r = s.getRow(row);
		Cell cel = r.createCell(cell);
		cel.setCellValue(value);
		
		FileOutputStream fos = new FileOutputStream(ContantsUtility.ExelFilePath);
		wb.write(fos);
		wb.close();

	}
}