package data_Driven_Testing;

import java.io.FileNotFoundException;
import java.io.FileReader;

import com.opencsv.CSVReader;

public class ReadTheDataFromCsvFile {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		String filePath = "./resources/csvData.csv" ;
		FileReader fileReader = new FileReader(filePath);
		CSVReader csvReader = new CSVReader(fileReader);
		String[] arr = csvReader.readNext();
		
		for (String data : arr) {
			System.out.println(data);			
		}
		csvReader.close();		

	}

}
