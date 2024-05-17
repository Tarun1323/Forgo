package forgo.genericUtility;

import java.util.Random;

/**
 * This class contains all generic methods related to java
 * 
 * @author Nagarjuna
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
	
}
