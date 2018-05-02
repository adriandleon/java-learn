
public class HandleStrings1 {

	public static void main(String[] args) {

		String name = "Adrian";

		System.out.println("My name is " + name);

		System.out.println("My name is " + name.length() + " characters long");

		System.out.println("The first character of my name is " + name.charAt(0));

		int lastChar = name.length();

		System.out.println("The last character of my name is " + name.charAt(lastChar - 1));
	}
}
