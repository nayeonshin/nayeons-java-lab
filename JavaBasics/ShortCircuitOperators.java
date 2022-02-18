public class ShortCircuitOperators {

	public static void main(String[] args) {

		int[] sampleArray = new int[1];

		boolean isA = false;
		boolean isB = true;

//		System.out.println(sampleArray[1]); // Throws java.lang.ArrayIndexOutOfBoundsException

		/*
		 * Short-circuit conditional operators; sampleArray[1] doesn't throw an
		 * ArrayIndexOutOfBoundsException when isA == false && isB == true.
		 */

		// Only isA (false) is evaluated.
		if (isA && sampleArray[1] == 0) {
			// Error: ArrayIndexOutOfBoundsException
			System.out.println("It is A.");
			System.out.println("And sampleArray[1] is 0.");
		} else {
			System.out.println("It is not A.");
			System.out.println("And sampleArray[1] == 0 might or might not be true");
		}

		System.out.println();

		// Only isB (true) is evaluated.
		if (isB || sampleArray[1] == 0) {
			System.out.println("It is B.");
			System.out.println("And sampleArray[1] == 0 might or might not be true.");
		} else {
			// Error: ArrayIndexOutOfBoundsException
			System.out.println("It is not B.");
			System.out.println("And sampleArray[1] == 0 is evaluated.");
		}

		/*
		 * Non-short-circuit bitwise operators
		 */

//		// Error: ArrayIndexOutOfBoundsException
//		if (isA & sampleArray[1] == 0) {
//			System.out.println("It is A");
//			System.out.println("And sampleArray[1] is 0.");
//		}

//		// Error: ArrayIndexOutOfBoundsException
//		if (isB | sampleArray[1] == 0) {
//			System.out.println("It is B");
//			System.out.println("And sampleArray[1] is 0.");
//		}

	}

}
