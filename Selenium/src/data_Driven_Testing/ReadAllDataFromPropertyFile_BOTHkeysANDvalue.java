package data_Driven_Testing;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class ReadAllDataFromPropertyFile_BOTHkeysANDvalue {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String filePath = "./resources/prop.properties";
		// PASS THE PHYSICAL FILE PATH TO THE CONSTRUCTOR OF fileInputStream class
		FileInputStream file = new FileInputStream(filePath);

		// OBJECT OF PROPERTIES CLASS FROM JAVA, TO LOAD THE PHYSICAL FILE
		Properties properties = new Properties();

		// LOAD THE FILE
		properties.load(file);
		Set<Object> keySet = properties.keySet();
		for (Object object : keySet) {
			// FOR PRINTING THE VALUE
			System.out.println(object);
			// FOR PRINTING THE KEY
			System.out.println(properties.get(object));
		}

	}

}
