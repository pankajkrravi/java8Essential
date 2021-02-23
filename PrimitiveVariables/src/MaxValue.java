
public class MaxValue {
	public static void main(String[] args) {
		byte b = 127;
		System.out.println("Bytes = " + b);
		if (b < Byte.MAX_VALUE) {
			b++;
		}
		System.out.println("Byte : " + b);
	}
}
