
public class Methods {
	static String monts[] = { "january", "feburary", "March", "April", "may", "June", "July", "August", "Sepetember",
			"october", "November", "December" };

	public static void main(String[] args) {
		printMonthNames(" ===== Months of the Year ======= ");
	}

	static void printMonthNames(String label) {
		System.out.println(label);
		for (int i = 0; i < monts.length; i++) {
			System.out.println(monts[i]);
		}
	}
}