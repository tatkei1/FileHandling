package propertyFiles;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class ReadPropertyFile {

	public static void main(String[] args) throws IOException {
		ReadPropertyFile readfile = new ReadPropertyFile();

		readfile.doesFileExist(("user.dir") + "\\data\\definitions.properties");
	}

	void doesFileExist(String string) throws IOException {

		Properties prop = new Properties();
		String filepath = System.getProperty("user.dir") + "\\data\\definitions.properties";
		FileInputStream file = new FileInputStream(filepath);
		prop.load(file);
		file.close();

		// to read values
		String val1 = prop.getProperty("Apple1");
		String val2 = prop.getProperty("Apple2");
		String val3 = prop.getProperty("Table1");
		String val4 = prop.getProperty("Table2");

		System.out.println(val1 + "," + val2 + "," + val3 + "," + val4);

		// to read keys
		Set<String> keys = prop.stringPropertyNames();

		System.out.println(keys);

		// to print keys and values
		for (String x : keys) {
			System.out.println(x + "\n " + prop.getProperty(x) + "\n");

		}

	}
}
