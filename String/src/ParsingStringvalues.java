
public class ParsingStringvalues {
	public static void main(String[] args) {
		String str1 = "Welcome to bangalore";
		System.out.println("Length of String :" + str1.length());
		int position = str1.indexOf("bangalore");
		System.out.println("Position of sub String: " + position);
		String subStr = str1.substring(10);
		System.out.println("Sub String : " + subStr);
		String string2="Welcome   ";
		int len1=string2.length();
		String stringTrim=string2.trim();
		System.out.println(stringTrim.length());
	}
}
