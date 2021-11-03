package data_Driven_Testing;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadTheDataFromExcelSheet2  {
	public static void main(String[]args) throws Throwable, IOException {
	String filePath= "./resources/excelsheet.xlsx";
	String sheetName = "TC02";
	// CREATE AN OBJECT FOR FileInputStream class of java to pass the physical excel
	// file path
	FileInputStream file = new FileInputStream(filePath);
	// CREATE WORKBOOK OBJECT BY CALLING workbookFactory class of apache poi
	Workbook workbook = WorkbookFactory.create(file);
	// using workbook object referrence call sheet, row, and cell methods of apache
	// poi to get the data
	String url = workbook.getSheet(sheetName).getRow(1).getCell(0).toString();
	String userName = workbook.getSheet(sheetName).getRow(1).getCell(1).toString();
	String passWord = workbook.getSheet(sheetName).getRow(1).getCell(2).toString();

}
}
