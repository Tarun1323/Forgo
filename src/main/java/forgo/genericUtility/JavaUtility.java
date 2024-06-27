package forgo.genericUtility;

import java.util.Date;
import java.util.Random;

/**
 * This class contains all generic methods related to java
 * 
 * @author Nagarjuna,Tarun
 */
public class JavaUtility {
	
	/**
	 * This method will generate randam number of given length and return the valuue
	 * @param length
	 * @return
	 */

	public String generateRandomNumber(int length) {
		if (length <= 0) {
			throw new IllegalArgumentException("Length must be greater than 0");
		}

		Random random = new Random();
		StringBuilder number = new StringBuilder();

		number.append(random.nextInt(9) + 1);

		for (int i = 1; i < length; i++) {
			number.append(random.nextInt(10));
		}

		return number.toString();
	}
	
	/**
	 * This method will generate the system date and it will return the value
	 * @return
	 */
	public String getSystemDate() {
		
		Date date = new Date();
		String d = date.toString();
		return d;
	}
	
	/**
	 * This method will generate the current date and time in specific format 
	 * @return
	 */
	public String getSystemDateInFormat() {
		
		Date d = new Date();
		 String[] dArr = d.toString().split(" ");
		 String date = dArr[2];
		 String month = dArr[1];
		 String year = dArr[5];
		 String time = dArr[3].replace(":", "-");
		 String dateAndTime = date+" "+month+" "+year+" "+time;
		 return dateAndTime;
		
	}
}
