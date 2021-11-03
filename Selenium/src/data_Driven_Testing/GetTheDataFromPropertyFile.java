package data_Driven_Testing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class GetTheDataFromPropertyFile {

	public static void main(String[] args) throws IOException {
		
		
		String filePath="./resources/prop1.properties";
		
		//PASS THE PHYSICAL FILE PATH TO THE CONSTRUCTOR OF FileInputStream class
		FileInputStream file = new FileInputStream(filePath);
		
		//OBJECT OF PROPERTIES CLASS FROM JAVA, TO LOAD THE PHYSICAL FILE
		Properties properties = new Properties();
		
		//LOAD THE FILE
		properties.load(file);
		
		//FETCH ALL THE DATA USING KEY GIVEN IN THE PROPERTY FILE
		String URl = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		
		//SUPPOSE IF THE KEY IS NOT PRESENT IN THE PROPERTY FILE AND IF WE TRY TO PRINT
		//String password1 = properties.getProperty("password1");
		
		//print the value
		System.out.println(URl);
		System.out.println(username);
		System.out.println(password);
		
		//System.out.println(password1);
		

	}

}
