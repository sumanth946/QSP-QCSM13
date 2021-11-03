package data_Driven_Testing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleDataFromSheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		// TODO Auto-generated method stub
		String filePath= "./resources/excelsheet.xlsx";
		String sheetName = "TC03";
		// CREATE AN OBJECT FOR FileInputStream class of java to pass the physical excel
		// file path
		FileInputStream file = new FileInputStream(filePath);
		// CREATE WORKBOOK OBJECT BY CALLING workbookFactory class of apache poi
		Workbook workbook = WorkbookFactory.create(file);
		Sheet sheet = workbook.getSheet(sheetName);
		int rowNo = sheet.getPhysicalNumberOfRows();
		int cellNo = sheet.getRow(0).getPhysicalNumberOfCells();
		for(int i=0;i<rowNo ; i++)
		{
			for(int j=0; j<cellNo;j++)
			{
				System.out.println(sheet.getRow(i).getCell(j).getStringCellValue());
			}
			
			System.out.println();
		}

	}

}
