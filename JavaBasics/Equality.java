public class Equality {

	public static void main(String[] args) {

		String myName = "nayeon";
		String myName2 = new String("nayeon");
		String myName3 = "nayeon";

		System.out.println(myName == myName2); // Prints false
		System.out.println(myName.equals(myName2)); // Prints true
		System.out.println(myName == myName3); // Prints true

	}

}
