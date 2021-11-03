package data_Driven_Testing;

import java.io.FileReader;

import com.opencsv.CSVReader;

public class ReadTheMultipleDataFromCsvFile {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		String filePath = "./resources/csvData.csv";
		//CREATE THE FileReader object and pass the file path in the constructor
		FileReader fileReader = new FileReader(filePath);
		//CREATE THE CSVReader object and pass the file in the constructor
		CSVReader csvReader = new CSVReader(fileReader);
		String[] arr = csvReader.readNext();

		while (arr != null) {
			for (String data : arr) {
				System.out.println(data);
			}
			System.out.println();
			arr = csvReader.readNext();
		}
		csvReader.close();

	}
}
