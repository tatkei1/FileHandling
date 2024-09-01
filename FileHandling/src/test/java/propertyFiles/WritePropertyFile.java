package propertyFiles;

import java.io.FileOutputStream;
import java.io.IOException;

import java.util.Properties;

public class WritePropertyFile {

	public static void main(String[] args) throws IOException {
		Properties properties = new Properties();
	    properties.setProperty("Apple1", "fruit");
	    properties.setProperty("Apple2", "a tech company");
		properties.setProperty("Table1", "an object");
		properties.setProperty("Table2", "contains rows and columns");

		String filepath = System.getProperty("user.dir") + "\\data\\definitions.properties";
		FileOutputStream file = new FileOutputStream(filepath);
		properties.store(file, "data in properties file");
		file.close();
		System.out.println("Data written in:" + filepath);

	}

}
