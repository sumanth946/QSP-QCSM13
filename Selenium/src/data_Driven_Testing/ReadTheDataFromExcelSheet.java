package data_Driven_Testing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadTheDataFromExcelSheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		String filePath = "./resources/excelsheet.xlsx";
		String sheetName = "TC01";
		// CREATE AN OBJECT FOR FileInputStream class of java to pass the physical excel
		// file path
		FileInputStream file = new FileInputStream(filePath);
		// CREATE WORKBOOK OBJECT BY CALLING WorkbookFactory class of apache poi
		Workbook workbook = WorkbookFactory.create(file);
		// using workbook object referrence call sheet, row, and cell methods of apache
		// poi to get the data
		String url = workbook.getSheet(sheetName).getRow(1).getCell(0).getStringCellValue();
		String userName = workbook.getSheet(sheetName).getRow(1).getCell(1).getStringCellValue();
		String passWord = workbook.getSheet(sheetName).getRow(1).getCell(2).getStringCellValue();

		
		System.out.println(url);
		System.out.println(userName);
		System.out.println(passWord);

	}

}
