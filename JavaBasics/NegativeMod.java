
public class NegativeMod {

	final static int asciiCount = 256;

	/**
	 * Returns the result of (newAscii mod asciiCount).
	 * 
	 * @param newAscii ((character's ASCII) - key)
	 * @return (newAscii mod asciiCount)
	 */
	static int decryptInefficiently(final int newAscii) {
		int ascii = newAscii;
		while (ascii < 0) {
			ascii += asciiCount;
		}
		return ascii;
	}

	/**
	 * Returns the result of (newAscii mod asciiCount).
	 * 
	 * @param newAscii ((character's ASCII) - key)
	 * @return (newAscii mod asciiCount)
	 */
	static int decryptEfficiently(final int newAscii) {
		int ascii = newAscii;

		if (ascii < 0) {
			int remainder = (-1 * ascii) % 256;
			ascii = asciiCount - remainder;
		}

		return ascii;
	}

	public static void main(String[] args) {

		// Example: Caesar cipher's decryption using ASCII

		int ascii = 10;
		int key = 1000;

		int newAscii = ascii - key;

		int inefficientResult = decryptInefficiently(newAscii);
		System.out.println(inefficientResult);

		int efficientResult = decryptEfficiently(newAscii);
		System.out.println(efficientResult);

	}

}
