package genericLibrery;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileUtility {
	public static String PropertyReader(String KeyValue) throws IOException {
		FileInputStream file=new FileInputStream("./src/test/resources/Test Data/Property.Properties");
		Properties property=new Properties();
		property.load(file);
		String value = property.getProperty(KeyValue);
		return value;
		
	}
}
