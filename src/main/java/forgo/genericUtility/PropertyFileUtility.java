package forgo.genericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * This method contains generic methods to read the data from property file
 * @author Dell
 * 
 */

public class PropertyFileUtility {
	
	/**
	 * This method will read the specific key value From the property file
	 * @param key
	 * @return
	 * @throws IOException
	 */
	
	public String readDataFromPropertyFile(String key) throws IOException
	{
		FileInputStream fis = new FileInputStream(ContantsUtility.PropertyFilePath);
		Properties pObj = new Properties();
		pObj.load(fis);
		String value = pObj.getProperty(key);
		
		return value;
		
	}

}
